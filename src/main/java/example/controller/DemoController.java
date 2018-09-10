package example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.log4j.Logger;

@Controller
@RequestMapping("/home")
public class DemoController {
    private static Logger logger = Logger.getLogger(DemoController.class);

    @RequestMapping("/index")
    public String index() {
        String s = "ab";
        int k = 11;
        System.out.println(s.hashCode());
        logger.info("eee");


        return "index";
    }
}

