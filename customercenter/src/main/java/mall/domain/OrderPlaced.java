package mall.domain;

import mall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productname;
    private Long customerid;
    private Long productid;
    private Integer qty;
    private String status;
}
