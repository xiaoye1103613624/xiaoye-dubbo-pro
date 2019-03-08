package open.billy.demo.service;

import open.billy.demo.bean.UserAddress;

import java.util.List;

/**
 * @Description :
 * @Author : ChenYao
 * @Version : 1.0
 * @Create : 2019/2/28
 * @Update : 2019/2/28
 * @see :
 */
public interface OrderService {
    public List<UserAddress> initOrder(String userId);
}
