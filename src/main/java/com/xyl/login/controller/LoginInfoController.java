package com.xyl.login.controller;

import com.xyl.login.entity.LoginInfo;
import com.xyl.login.service.LoginInfoService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 账号密码表(LoginInfo)表控制层
 *
 * @author makejava
 * @since 2020-11-12 18:40:36
 */
@RestController
@RequestMapping("/loginInfo")
public class LoginInfoController {
    /**
     * 服务对象
     */
    @Resource
    private LoginInfoService loginInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LoginInfo selectOne(String id) {
        return this.loginInfoService.queryById(id);
    }

    @GetMapping("queryAll")
    public List<LoginInfo> queryAll() {
        return this.loginInfoService.queryAllByLimit(null, null);
    }

    @RequestMapping("/test")
    public String toIndex(HttpServletRequest request, Model model){
//        int userId = Integer.parseInt(request.getParameter("id"));
        String userId = request.getParameter("id");
        LoginInfo user = this.loginInfoService.queryById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}