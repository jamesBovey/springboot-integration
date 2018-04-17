package com.zheng.integration.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wnb on 2018/4/13.
 */
public interface UserRepository extends JpaRepository<User,String>{
}
