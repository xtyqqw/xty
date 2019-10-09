package com.zlk.user.mapper;

import com.zlk.user.entity.Pagination;
import com.zlk.user.entity.User;

import java.util.List;

public interface UserMapper {

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
     *  列表数据查询
     * @param: [pagination]
     * @return: java.util.List<com.zlk.user.entity.User>
     * @auther: lth
     * @date: 2019/9/11 10:59
     */
    List<User> findUserList(Pagination pagination);
    /**
     *
     * 功能描述:
     *      查询总条数
     * @param: []
     * @return: java.lang.Integer
     * @auther: lth
     * @date: 2019/9/11 11:00
     */
    Integer findUserCount(Pagination pagination);
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
