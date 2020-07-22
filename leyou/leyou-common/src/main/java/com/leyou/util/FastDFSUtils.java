package com.leyou.util;

import com.leyou.config.UploadConfig;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.Objects;

/**
 * @Author Robert
 * @Create 2020/6/19
 * @Desc TODO FastDFS 工具类
 **/
@Component
public class FastDFSUtils {

    public static Boolean checkFileType(MultipartFile file) {
        try {
            // 校验文件类型
            if (!UploadConfig.ALLOW_TYPE.contains(file.getContentType())) {
                return false;
            }
            // 校验文件内容
            BufferedImage read = ImageIO.read(file.getInputStream());
            if (Objects.isNull(read)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
