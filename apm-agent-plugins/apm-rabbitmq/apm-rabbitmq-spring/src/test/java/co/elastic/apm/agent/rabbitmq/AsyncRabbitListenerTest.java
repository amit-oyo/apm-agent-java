package co.elastic.apm.agent.rabbitmq;

import co.elastic.apm.agent.rabbitmq.config.ReplyRabbitListenerConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {ReplyRabbitListenerConfiguration.class}, initializers = {AbstractRabbitMqTest.Initializer.class})
public class AsyncRabbitListenerTest extends AbstractAsyncRabbitMqTest {

}