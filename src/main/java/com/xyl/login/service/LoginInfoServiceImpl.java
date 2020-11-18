package com.xyl.login.service;

import com.xyl.login.entity.LoginInfo;
import com.xyl.login.dao.LoginInfoDao;
import com.xyl.login.service.LoginInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账号密码表(LoginInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-11-12 18:29:13
 */
@Service("loginInfoService")
public class LoginInfoServiceImpl implements LoginInfoService {
    @Resource
    private LoginInfoDao loginInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LoginInfo queryById(String id) {
        return this.loginInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<LoginInfo> queryAllByLimit(Object offset, Object limit) {
        return this.loginInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param loginInfo 实例对象
     * @return 实例对象
     */
    @Override
    public LoginInfo insert(LoginInfo loginInfo) {
        this.loginInfoDao.insert(loginInfo);
        return loginInfo;
    }

    /**
     * 修改数据
     *
     * @param loginInfo 实例对象
     * @return 实例对象
     */
    @Override
    public LoginInfo update(LoginInfo loginInfo) {
        this.loginInfoDao.update(loginInfo);
        return this.queryById(loginInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.loginInfoDao.deleteById(id) > 0;
    }
}