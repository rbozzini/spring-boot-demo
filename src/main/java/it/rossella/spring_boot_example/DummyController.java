package it.rossella.spring_boot_example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	@RequestMapping("/")
    public String index() {
        return "Ciao da <b>Rossella</b> con <b>SpringBoot</b>!!!";
    }
}
