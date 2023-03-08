package com.semillerogtc.gtcusermanagement.services;



import com.semillerogtc.gtcusermanagement.domain.Usuario;
import org.springframework.stereotype.Service;
import com.semillerogtc.gtcusermanagement.components.UsersValidation;

@Service
public class UsersService {

    UsersValidation _usersValidation;

    UsersService(UsersValidation usersValidation){
        _usersValidation =usersValidation;
    }

    public boolean registrarUsuario(Usuario user){
        var resultado=_usersValidation.execute(user);
        return resultado;
    }

    public boolean consultarUsuario(){
        return true;
    }
}