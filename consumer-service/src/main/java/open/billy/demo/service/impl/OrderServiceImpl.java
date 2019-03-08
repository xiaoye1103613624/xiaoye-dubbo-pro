package open.billy.demo.service.impl;

import open.billy.demo.bean.UserAddress;
import open.billy.demo.service.OrderService;
import open.billy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description :
 * @Author : ChenYao
 * @Version : 1.0
 * @Create : 2019/2/28  15:51
 * @Update : 2019/2/28  15:51
 * @see :
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("userId:" + userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : userAddressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return userAddressList;
    }
}
