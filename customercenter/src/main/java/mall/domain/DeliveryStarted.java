package mall.domain;

import mall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Long productid;
    private Integer qty;
    private String productname;
    private String status;
}
