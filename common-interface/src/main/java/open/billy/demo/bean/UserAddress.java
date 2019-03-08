package open.billy.demo.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description :
 * @Author : ChenYao
 * @Version : 1.0
 * @Create : 2019/2/28  15:39
 * @Update : 2019/2/28  15:39
 * @see :
 */
@Data
public class UserAddress implements Serializable {

    private static final long serialVersionUID = -6878053406541100993L;

    private Integer id;
    //地址
    private String userAddress;
    //用户id
    private String userId;
    //收货人
    private String consignee;
    //手机号
    private String phoneNum;

    public UserAddress() {
    }

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
    }
}
