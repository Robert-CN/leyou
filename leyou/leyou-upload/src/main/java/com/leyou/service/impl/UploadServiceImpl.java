package com.leyou.service.impl;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.leyou.config.UploadConfig;
import com.leyou.result.Result;
import com.leyou.result.Results;
import com.leyou.result.Tips;
import com.leyou.service.UploadService;
import com.leyou.util.FastDFSUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author Robert
 * @Create 2020/6/19
 * @Desc TODO
 **/
@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    private FastFileStorageClient storageClient;

    @Override
    public Result uploadImage(MultipartFile file) {
        try {
            Boolean isFlag = FastDFSUtils.checkFileType(file);
            if (!isFlag) {
                return Results.failure(Tips.INVALID_FILE_TYPE.msg);
            }
            String suffix = StringUtils.substringAfterLast(file.getOriginalFilename(), ".");
            StorePath storePath = storageClient.uploadFile(file.getInputStream(), file.getSize(), suffix, null);
            return Results.success(UploadConfig.BASE_URL + storePath.getFullPath());
        } catch (Exception e) {
            return Results.failure(Tips.FILE_UPLOAD_ERROR.msg);
        }
    }
}
