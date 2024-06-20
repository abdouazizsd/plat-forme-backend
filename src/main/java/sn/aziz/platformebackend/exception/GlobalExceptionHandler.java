package sn.aziz.platformebackend.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import sn.aziz.platformebackend.services.implementations.dtos.messages.responses.Response;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = InterruptedException.class)
    public void handleInterruptedException(InterruptedException ex) {
        System.out.println("Le mail n'a pas été envoyé");
    }

    //pour les accès non autorisés
    @ExceptionHandler(value = AccessDeniedException.class)
    public Response handleAccessDeniedException(AccessDeniedException ex) {
        return Response.accessDenied().builder().message("Vous n'avez pas la permission d'accéder à cette ressource").build();
    }

    //pour les contraintes de validations
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Response handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());

        return Response.badRequest().builder().message(errors).build();
    }

    //pour le blockage du nombre de tentatives
    @ExceptionHandler(value = InternalAuthenticationServiceException.class)
    public Response handleAuthenticationServiceException(InternalAuthenticationServiceException blogAlreadyExistsException) {
        return Response.badRequest().builder().message(blogAlreadyExistsException.getMessage()).build();
    }

    //exception par défaut
    @ExceptionHandler(Exception.class)
    public Response exceptionHandler(Exception exception){
        exception.printStackTrace();
        return Response.badRequest().builder().message("Une erreur inconnue est survenue lors du traitement !").build();
    }
}
