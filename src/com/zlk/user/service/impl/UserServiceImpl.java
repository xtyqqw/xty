package com.zlk.user.service.impl;

import com.zlk.user.entity.Pagination;
import com.zlk.user.entity.User;
import com.zlk.user.mapper.UserMapper;
import com.zlk.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm
 * @description: 用户实现类
 * @author: lth
 * @create: 2019-09-11 10:31
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByNameAndPwd(User user) {
        return userMapper.findUserByNameAndPwd(user);
    }

    @Override
    public Pagination findUserLimit(Pagination pagination) {
        Integer currentPage = pagination.getCurrentPage();
        if(currentPage ==null || currentPage <=0){
            currentPage =1;
        }
        Integer pageSize = pagination.getPageSize();
        if(pageSize == null || pageSize <=0){
            pageSize = 2;
        }
        //起始页
        Integer startPage = (currentPage-1)*pageSize;
        Pagination pb = new Pagination();
        pb.setCurrentPage(currentPage);
        pb.setPageSize(pageSize);
        pb.setStartPage(startPage);
        //查询数据
        List<User> userList = userMapper.findUserList(pb);
        pb.setList(userList);
        //查询总条数
        Integer totalCount = userMapper.findUserCount(pb);
        pb.setTotalCount(totalCount);
        //计算总页数
        Integer totalPage = null;
        if(totalCount % pageSize == 0){
            totalPage = totalCount  / pageSize;
        }else{
            totalPage = totalCount / pageSize+1;
        }
        pb.setTotalPage(totalPage);

        return pb;
    }

    @Override
    public User findUserById(String uid) {
        return userMapper.findUserById(uid);
    }

    @Override
    public Integer updateUserById(User user) {
        return userMapper.updateUserById(user);
    }
}
