package sn.aziz.platformebackend.entities.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import sn.aziz.platformebackend.security.services.UserPrinciple;

import java.util.Optional;

@Component
public class AuditAwareImpl implements AuditorAware<Long> {

    @Override
    public Optional<Long> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext()
                .getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            return Optional.empty();
        }

        //System.out.println("auth " +  authentication.getPrincipal());

        if(authentication.getPrincipal() instanceof String){
            return null;
        }
        UserPrinciple userPrincipal = (UserPrinciple) authentication.getPrincipal();

        return Optional.of(userPrincipal.getId());
    }
}
