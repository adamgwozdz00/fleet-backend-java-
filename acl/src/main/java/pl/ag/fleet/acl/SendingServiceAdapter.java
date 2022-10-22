package pl.ag.fleet.acl;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Component;
import pl.ag.fleet.event.EventDTO;
import pl.ag.fleet.event.SendingService;
import pl.ag.fleet.kafka.producer.Event;
import pl.ag.fleet.kafka.producer.EventProducer;

@Component
@RequiredArgsConstructor
public class SendingServiceAdapter implements SendingService {

  private final EventProducer eventProducer;

  @Override
  public void send(EventDTO dto) {
    val event = new Event(dto.getData());
    this.eventProducer.send(event);
  }
}