package com.love.springboot_jpa.repository;

import com.love.springboot_jpa.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.jws.soap.SOAPBinding;

public interface UserRepository extends JpaRepository<UserBean,Integer>{




}
