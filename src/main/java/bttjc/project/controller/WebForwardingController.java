package bttjc.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebForwardingController {

    @GetMapping("/{path:[^\\.]*}")  // 處理沒有副檔名的路徑
    public String forward() {
        return "forward:/index.html";  // 將請求轉發到 index.html
    }
}