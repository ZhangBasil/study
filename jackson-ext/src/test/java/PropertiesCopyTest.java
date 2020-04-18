import com.zhangbin.jackson.utils.ObjectUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author <a href="mailto:hbsy_zhb@163.com">zhangbin</a>
 */
public class PropertiesCopyTest {

    public static void main(String[] args) {


        Customer customer = Customer.builder()
                .id(1000L)
                .name("阿三")
                .sex('男')
                .deleted(false)
                .gmtCreated(new Date())
                .gmtModified(LocalDate.now())
                .bornTime(LocalDateTime.now())
                .build();

        Customer customer1 = Customer.builder()
                .id(9999L)
                .name("😝😝")
                .sex('女')
                .deleted(false)
                .gmtCreated(new Date())
                .gmtModified(LocalDate.now())
                .bornTime(LocalDateTime.now())
                .build();

        customer.setOther(customer1);

        CustomerDTO customerDTO = ObjectUtils.copyBean(customer, CustomerDTO.class);
        System.out.println("customerDTO = " + customerDTO);

    }

}
