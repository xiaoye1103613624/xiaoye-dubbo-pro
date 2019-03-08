package open.billy.demo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import open.billy.demo.bean.UserAddress;
import open.billy.demo.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description :
 * @Author : ChenYao
 * @Version : 1.0
 * @Create : 2019/2/28  15:37
 * @Update : 2019/2/28  15:37
 * @see :
 */
//要暴露服务,需要用阿里的@Service注解
@Service
public class UserServiceImpl implements UserService {
    @HystrixCommand
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl_3");
        List<UserAddress> userAddressLists = new ArrayList<>();
        UserAddress userAddress = new UserAddress(1, "苏州吴中石湖东路", "110", "李冬梅", "130651651651");
        UserAddress userAddress1 = new UserAddress(2, "苏州广济南路", "111", "马冬梅", "13066666666");
        if (Math.random() > 0.5) {
            throw new RuntimeException("有异常... ...");
        }
        userAddressLists.add(userAddress);
        userAddressLists.add(userAddress1);
        return userAddressLists;
    }

}
