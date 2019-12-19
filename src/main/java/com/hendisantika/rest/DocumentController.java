package com.hendisantika.rest;

import com.hendisantika.entity.Document;
import com.hendisantika.service.DocumentService;
import com.hendisantika.service.ResponseMetadata;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
 * Time: 06.48
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping(value = "/doc")
public class DocumentController {

    private static final Logger LOG = LogManager.getLogger(DocumentController.class);

    @Autowired
    DocumentService documentService;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody
    ResponseMetadata handleFileUpload(@RequestParam(value = "file") MultipartFile file) throws IOException {
        return documentService.save(file);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public HttpEntity<byte[]> getDocument(@PathVariable Long id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.IMAGE_JPEG);
        return new ResponseEntity<byte[]>(documentService.getDocumentFile(id), httpHeaders, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<Document> getDocument() {
        return documentService.findAll();
    }

}
