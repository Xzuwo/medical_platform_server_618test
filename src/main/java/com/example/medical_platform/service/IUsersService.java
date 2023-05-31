package com.example.medical_platform.service;

import com.example.medical_platform.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xzw
 * @since 2023-06-01
 */
public interface IUsersService extends IService<Users> {
    public List<Users> SelectUsersAll();

}