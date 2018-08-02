package com.couchdb.couchdb2.repository;

import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

import com.couchdb.couchdb2.model.User;
@EnableCouchbaseRepositories
@N1qlPrimaryIndexed  
@ViewIndexed(designDoc = "user", viewName = "all") 
public interface UserDao extends CouchbaseRepository<User, String>{

	
   
 
}
