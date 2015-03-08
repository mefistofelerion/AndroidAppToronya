package webservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.Resource;

@RestController
public class WebServiceController {

    @RequestMapping("/recent")
    public MainWebService greeting() {

        return new MainWebService(new PostNew("news1", "6 ventajas de que AMLO sea presidente",
                "1. El final de los problemas de una mala orientación vocacional. Con el presidente López, el gobierno te asignará un oficio de acuerdo a las necesidades de la comunidad, por lo que te evitarás la difícil decisión de elegir una carrera y, en caso de equivocarte, tener que lidiar con las consecuencias el resto de tu vida. Bajo la nueva política “de cada uno según su capacidad, a cada uno según su necesidad” te ahorrará muchos sinsabores."
                , "http://google.com"));
    }


}