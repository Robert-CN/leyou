package com.leyou.service;

import com.leyou.result.Result;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author Robert
 * @Create 2020/6/19
 * @Desc TODO
 **/
public interface UploadService {
    Result uploadImage(MultipartFile file);
}
