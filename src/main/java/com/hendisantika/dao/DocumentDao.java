package com.hendisantika.dao;

import com.hendisantika.entity.Document;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-angular-fileupload
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/12/17
 * Time: 06.41
 * To change this template use File | Settings | File Templates.
 */

@Repository
public interface DocumentDao extends CrudRepository<Document, Long> {

}
