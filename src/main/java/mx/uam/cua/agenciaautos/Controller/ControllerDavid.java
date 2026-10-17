package mx.uam.cua.agenciaautos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerDavid {
    @GetMapping("/david")
    public String david()
    {
        return "David";
    }
}
