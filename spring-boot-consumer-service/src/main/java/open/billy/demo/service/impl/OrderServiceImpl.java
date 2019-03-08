package open.billy.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import open.billy.demo.bean.UserAddress;
import open.billy.demo.service.OrderService;
import open.billy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

/**
 * @Description :
 * @Author : ChenYao
 * @Version : 1.0
 * @Create : 2019/2/28  15:51
 * @Update : 2019/2/28  15:51
 * @see :
 */
/*@Service
@Component("orderService")*/
@Service
public class OrderServiceImpl implements OrderService {
    //远程引用服务,用这个注解
    // 负载均衡 loadbalance  :http://dubbo.apache.org/zh-cn/docs/user/demos/loadbalance.html
    @Reference(loadbalance = "leastactive")
    private UserService userService;

    @HystrixCommand(fallbackMethod = "hello")
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("userId:" + userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : userAddressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return userAddressList;
    }

    public List<UserAddress> hello(String userId) {
        System.out.println("容错方法:hello");
        return Arrays.asList(new UserAddress(1, "测试地址", "1234", "小明", "110112"));
    }
}
