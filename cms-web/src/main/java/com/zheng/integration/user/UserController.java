package com.zheng.integration.user;

import com.zheng.integration.common.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wnb on 2018/4/13.
 */
@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("list")
    public R list(){
        try {
            return R.isOk().data(userService.list());
        }catch(Exception e){
            return R.isFail(e);
        }
    }

}
