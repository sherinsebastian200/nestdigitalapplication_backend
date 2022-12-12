package com.example.nestdigitalapplication_backend.dao;

import com.example.nestdigitalapplication_backend.model.Employee;
import com.example.nestdigitalapplication_backend.model.Security;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SecurityDao extends CrudRepository<Security,Integer> {




    @Query(value = "SELECT `id`, `empcode`, `password`, `secname`, `username` FROM `security_guard` WHERE `username`=:username AND `password`=:password",nativeQuery = true)

    List<Security>SecurityLogin(@Param("username") String username, @Param("password") String password);

    @Query(value = "SELECT `id`, `empcode`, `password`, `secname`, `username` FROM `security_guard` WHERE `id`=:id",nativeQuery = true)
    List<Security> SecViewByID(@Param("id") Integer id);

}
