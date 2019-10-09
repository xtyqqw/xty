package com.zlk.user.service;

import com.zlk.user.entity.Pagination;
import com.zlk.user.entity.User;

public interface UserService {

    /**
     *
     * 功能描述:
     *      检验用户
     * @param: [user]
     * @return: com.zlk.user.entity.User
     * @auther: lth
     * @date: 2019/9/11 10:30
     */
    User findUserByNameAndPwd(User user);
    /**
     *
     * 功能描述:
     *      列表数据
     * @param: [currentPage]
     * @return: com.zlk.user.entity.Pagination
     * @auther: lth
     * @date: 2019/9/11 11:03
     */
    Pagination findUserLimit(Pagination pagination);

    /**
     *
     * 功能描述:
     *      通过id查询用户
     * @param: [uid]
     * @return: com.zlk.user.entity.User
     * @auther: lth
     * @date: 2019/9/11 11:29
     */
    User findUserById(String uid);
    /**
     *
     * 功能描述:
     *   通过id修改
     * @param: [user]
     * @return: java.lang.Integer
     * @auther: lth
     * @date: 2019/9/11 11:36
     */
    Integer updateUserById(User user);
}
