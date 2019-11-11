package com.bjsxt.dao;

import com.bjsxt.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository:一个是实体类型，一个是主键类型
 * 在这接口中就提供了对数据库的一些基本操作
 */
public interface UsersDao extends JpaRepository<Users,Integer> {

}
