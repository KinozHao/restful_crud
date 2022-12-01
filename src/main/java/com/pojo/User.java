package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Repository;

/**
 * @author kinoz
 * @Date 2022/12/1 20:30
 * @apiNote
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class User {
    private String username;
    private String password;
    private String usertype;
    private String gender;
    private String email;
    private String birthdate;
    private String introduction;
    //private String[] hobbies;
    private String hobby;
}
