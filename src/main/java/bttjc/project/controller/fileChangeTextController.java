package bttjc.project.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class fileChangeTextController {
	
	  // 定義一個接受 POST 請求的 API
	@PostMapping
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            // 儲存圖片到本地目錄（或處理你的圖片）
            String filePath = "path/to/save/" + file.getOriginalFilename();
            file.transferTo(new File(filePath));

            // 返回 HTML 字串
            String htmlContent = "<p>圖片已成功上傳！</p><img src='" + filePath + "' />";
            return ResponseEntity.ok(htmlContent); // 返回 HTML
        } catch (IOException e) {
            return ResponseEntity.status(500).body("<p>上傳失敗！</p>");
        }
    }
}
