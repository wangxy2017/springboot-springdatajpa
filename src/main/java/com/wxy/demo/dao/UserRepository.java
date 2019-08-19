package com.wxy.demo.dao;

import com.wxy.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author wxy
 * @Date 19-8-19 上午10:02
 * @Description TODO
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}