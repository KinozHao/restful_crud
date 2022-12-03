package com.controller;

import com.mapper.CRUDMapper;
import com.pojo.Employee;
import com.tools.MybatisTools;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @author kinoz
 * @Date 2022/12/1 20:55
 * @apiNote
 */
@Controller
public class EmpCon {
    SqlSession sqlSession = MybatisTools.openSession(true);
    CRUDMapper mapper = sqlSession.getMapper(CRUDMapper.class);

    //获取全部用户信息
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getEmployeeList(Model model){

        Collection<Employee> employeeList = mapper.QueryAllUser();

        model.addAttribute("employeeList",employeeList);
        return "employee_list";

        //never mind this
    }
}
