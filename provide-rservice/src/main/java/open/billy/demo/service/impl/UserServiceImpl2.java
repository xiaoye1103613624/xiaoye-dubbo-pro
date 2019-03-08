package open.billy.demo.service.impl;

import open.billy.demo.bean.UserAddress;
import open.billy.demo.service.UserService;

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
public class UserServiceImpl2 implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl_new");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<UserAddress> userAddressLists = new ArrayList<>();
        UserAddress userAddress = new UserAddress(1, "苏州吴中石湖东路", "110", "李冬梅", "130651651651");
        UserAddress userAddress1 = new UserAddress(2, "苏州广济南路", "111", "马冬梅", "13066666666");
        userAddressLists.add(userAddress);
        userAddressLists.add(userAddress1);
        return userAddressLists;
    }
}
