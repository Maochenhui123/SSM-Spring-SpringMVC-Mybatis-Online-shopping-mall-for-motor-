import com.maoc.domain.Orders;
import com.maoc.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class OrderTest {

    @Autowired
    OrderService orderService;

    @Test
    public void test() throws Exception{
        Orders orders = new Orders();
        orders.setOrderId(Thread.currentThread().getName()+System.currentTimeMillis());
        orders.setFirstName("CCC");
        orders.setLastName("DDD");
        orders.setTelephone("123456789");
        orders.setCredit("123");
        orders.setDealerId("0404");
        orders.setName("Ninja 1000 ABS");
        orderService.insertOrder(orders);
    }
}
