package mx.uam.cua.agenciaautos.Controller;

import mx.uam.cua.agenciaautos.Service.impl.ClienteServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Luis_Prueba")
public class luiscontroll {
    private final ClienteServiceImpl userService;
    public luiscontroll(ClienteServiceImpl userService){
        this.userService = userService;
    }
}
