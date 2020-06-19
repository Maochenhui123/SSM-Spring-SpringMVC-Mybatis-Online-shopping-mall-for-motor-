import com.maoc.domain.Dealer;
import com.maoc.service.DealerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class DealerTest {
    @Autowired
    DealerService dealerService;

    @Test
    public void test(){
        List<Dealer> dealers= dealerService.findByProvince("Henan");
        for(Dealer dealer:dealers){
            System.out.println("-------------------------------------------------------------");
            System.out.println(dealer);
            System.out.println("-------------------------------------------------------------");
        }
    }
}
