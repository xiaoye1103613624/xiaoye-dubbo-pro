package open.billy.demo.service;

import open.billy.demo.bean.UserAddress;

import java.util.List;

/**
 * @Description :
 * @Author : ChenYao
 * @Version : 1.0
 * @Create : 2019/2/28  15:37
 * @Update : 2019/2/28  15:37
 * @see :
 */
public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}

