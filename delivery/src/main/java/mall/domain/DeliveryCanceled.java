package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Long productid;
    private Integer qty;
    private String productname;
    private String status;

    public DeliveryCanceled(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryCanceled(){
        super();
    }
}
