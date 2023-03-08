package com.semillerogtc.gtcusermanagement.controllers;

import com.semillerogtc.gtcusermanagement.domain.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.semillerogtc.gtcusermanagement.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.*;

@RestController
@RequestMapping("/users")
public class UsersController {
    //@Autowired                                           // inyeccion de dependenci por atributo de clase "Autowired encima del atributo"
    UsersService _user;
    public final Logger logger=LoggerFactory.getLogger(UsersController.class);  // esto se usa para mostrar en consola logs deseados.

   /*UsersController(UsersService userService){        // de esta forma se hace la inyeccion por constructor retirando el @Autowired de arriba y descomentando este codigo
        _user = userService;
    }*/


    UsersController(){   // en este caso solo se invoca al contructor que es lo priero que se ejcuta cuando se instancia la clase
        logger.info("se ejecuta el constructor");
   }

    @Autowired                                      // de esta fomra se hace inyeccion de dependencias por metodo, se coloca el autowired arriba del metodo para inicializar
    public void  inicializar(UsersService user){
        logger.info("se ejecuta el metodo inicializar");
        _user=user;
   }

    @GetMapping("/ping")
    public String ping(){
        return "Hola desde controlador usuarios";
    }

   @PostMapping()
    public boolean registrarUsuario(){
            Usuario user= new Usuario();

               user.name="jaime";
               user.edad=33;
               user.email="jaimegu@mail.com";
               user.fechaNacimiento="26/04/1989";

            return _user.registrarUsuario(user);
    }
}