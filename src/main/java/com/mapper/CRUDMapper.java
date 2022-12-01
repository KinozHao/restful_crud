package com.mapper;

import com.pojo.Employee;
import com.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/12/1 20:34
 * @apiNote
 */
@Component
public interface CRUDMapper {

    int insertUser(User user);

    List<Employee> QueryAllUser();
}
