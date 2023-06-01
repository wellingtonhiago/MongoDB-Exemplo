package com.cadastro.GIP.repo;

import com.cadastro.GIP.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    @Query("{id:'?0'}")
    User findByIdGip(String id);

}
