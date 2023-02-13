package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Long productid;
    private Integer qty;
    private String productname;
    private String status;

    public DeliveryReturned(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryReturned(){
        super();
    }
}
