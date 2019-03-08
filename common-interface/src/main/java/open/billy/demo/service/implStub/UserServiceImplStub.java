package open.billy.demo.service.implStub;

import open.billy.demo.bean.UserAddress;
import open.billy.demo.service.UserService;

import java.util.List;

/**
 * @Description :
 * @Author : ChenYao
 * @Version : 1.0
 * @Create : 2019/3/2  10:19
 * @Update : 2019/3/2  10:19
 * @see :
 */
public class UserServiceImplStub implements UserService {
    private final UserService userService;

    public UserServiceImplStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId){
        //http://dubbo.apache.org/zh-cn/docs/user/demos/local-stub.html
        //可以加验证,如果验证不通过,则不通过Dubbo调用远程服务;减少开销;]
        System.out.println("进入本地存根方法... ...");
        if (userId == null) {
            return null;
        }
        return userService.getUserAddressList(userId);
    }

}
