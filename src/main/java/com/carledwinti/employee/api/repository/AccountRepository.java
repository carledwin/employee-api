package com.carledwinti.employee.api.repository;

import com.carledwinti.employee.api.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, Integer> {

    Account findByUsername(String username);
}
