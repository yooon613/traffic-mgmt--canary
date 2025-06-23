package trafficmgmtcanary.domain;

import java.util.*;
import lombok.*;
import trafficmgmtcanary.domain.*;
import trafficmgmtcanary.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
}
