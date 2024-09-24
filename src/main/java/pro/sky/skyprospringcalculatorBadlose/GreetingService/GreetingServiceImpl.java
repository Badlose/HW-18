package pro.sky.skyprospringcalculatorBadlose.GreetingService;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }


}
