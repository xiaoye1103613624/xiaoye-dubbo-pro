package open.billy.demo.controller;

import open.billy.demo.bean.UserAddress;
import open.billy.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description :
 * @Author : ChenYao
 * @Version : 1.0
 * @Create : 2019/3/1  15:32
 * @Update : 2019/3/1  15:32
 * @see :
 */
@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("getUserAddressLists")
    @ResponseBody
    public List<UserAddress> getUserAddressLists(String userId) {
        System.out.println("controller.userId:" + userId);
        return orderService.initOrder(userId);
    }

}
