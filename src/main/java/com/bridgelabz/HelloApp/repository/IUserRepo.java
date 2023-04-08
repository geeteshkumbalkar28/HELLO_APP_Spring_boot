package com.bridgelabz.HelloApp.repository;

import com.bridgelabz.HelloApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer>{

}
