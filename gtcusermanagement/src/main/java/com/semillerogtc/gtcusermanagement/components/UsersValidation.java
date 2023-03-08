package com.semillerogtc.gtcusermanagement.components;
import com.semillerogtc.gtcusermanagement.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsersValidation {

    public boolean execute(Usuario user) {
        return (user.name == "jaime");
    }
}