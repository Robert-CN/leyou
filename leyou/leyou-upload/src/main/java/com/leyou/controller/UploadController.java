package com.leyou.controller;

import com.leyou.result.Result;
import com.leyou.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author Robert
 * @Create 2020/6/19
 * @Desc TODO
 **/
@RestController
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @PostMapping("/image")
    public Result uploadImage(@RequestParam(value = "file")MultipartFile file){
        return uploadService.uploadImage(file);
    }
}
