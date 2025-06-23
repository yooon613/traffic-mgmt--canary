package trafficmgmtcanary.domain;

import java.util.*;
import lombok.*;
import trafficmgmtcanary.domain.*;
import trafficmgmtcanary.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
}
