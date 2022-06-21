package at.technikum.testsiksen;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestsiksenController {

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
