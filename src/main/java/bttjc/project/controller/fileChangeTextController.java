package bttjc.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fileChangeTextController {
	
	  // 定義一個接受 POST 請求的 API
    @PostMapping("/hello")
    public String hello(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
}
