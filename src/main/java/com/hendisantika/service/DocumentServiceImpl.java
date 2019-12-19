package com.hendisantika.service;

import com.hendisantika.dao.DocumentDao;
import com.hendisantika.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
 * Time: 06.45
 * To change this template use File | Settings | File Templates.
 */

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    private DocumentDao documentDao;

    @Override
    public ResponseMetadata save(MultipartFile file) throws IOException {

        Document doc = new Document();
        doc.setDocName(file.getOriginalFilename());
        doc.setFile(file.getBytes());
        documentDao.save(doc);
        ResponseMetadata metadata = new ResponseMetadata();
        metadata.setMessage("success");
        metadata.setStatus(200);
        return metadata;
    }

    @Override
    public byte[] getDocumentFile(Long id) {
        return documentDao.findById(id).get().getFile();
    }

    @Override
    public List<Document> findAll() {
        return (List<Document>) documentDao.findAll();
    }

}
