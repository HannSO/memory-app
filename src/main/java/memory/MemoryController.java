package memory;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MemoryController {

    @RequestMapping("/")
    public String index() {
        return "Hello. Memories are not here yet";
    }

}
