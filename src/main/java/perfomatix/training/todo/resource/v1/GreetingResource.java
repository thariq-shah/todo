package perfomatix.training.todo.resource.v1;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/v1/greeting")
@Slf4j
@RestController
public class GreetingResource {

    @GetMapping("/hello")
    public String helloGreet(@RequestParam String name) {
        log.info("Rest request for {}",name);
        return "Hello " + name;
    }

}
