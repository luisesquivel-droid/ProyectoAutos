package mx.uam.cua.agenciaautos.Controller;

import mx.uam.cua.agenciaautos.Service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Luis_Prueba")
public class luiscontroll {
    private final UserServiceImpl userService;
    public luiscontroll(UserServiceImpl userService){
        this.userService = userService;
    }
}
