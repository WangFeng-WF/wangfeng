package wf.com.serverfeign;

import org.springframework.stereotype.Component;

@Component
public class ScheduleEurekaClientImpl implements ScheduleEurekaClient {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
