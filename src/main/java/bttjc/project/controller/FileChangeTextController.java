package bttjc.project.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import bttjc.project.service.FileChangeTextService;

@RestController
@RequestMapping("/upload")
public class FileChangeTextController {
	
    private final FileChangeTextService fileChangeTextService;

    public FileChangeTextController(FileChangeTextService fileChangeTextService) {
        this.fileChangeTextService = fileChangeTextService;
    }
	
	  // 定義一個接受 POST 請求的 API
	@PostMapping
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
		  String extractedText = null;
	        return ResponseEntity.ok(extractedText);
      
    }
}
