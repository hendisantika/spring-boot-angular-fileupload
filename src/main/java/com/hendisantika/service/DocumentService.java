package com.hendisantika.service;

import com.hendisantika.entity.Document;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-angular-fileupload
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/12/17
 * Time: 06.43
 * To change this template use File | Settings | File Templates.
 */

public interface DocumentService {

    ResponseMetadata save(MultipartFile multipartFile) throws IOException;

    byte[] getDocumentFile(Long id);

    List<Document> findAll();
}
