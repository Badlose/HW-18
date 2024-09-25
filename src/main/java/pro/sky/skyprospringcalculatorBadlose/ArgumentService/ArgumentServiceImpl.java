package pro.sky.skyprospringcalculatorBadlose.ArgumentService;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringcalculatorBadlose.ViewService.ViewServiceImpl;

@Service
public class ArgumentServiceImpl extends ViewServiceImpl implements ArgumentService {
    public boolean checkArgument(Integer num1, Integer num2) {
        return num1 == null || num2 == null;
    }

    public boolean checkDivide(Integer num) {
        return num != 0;
    }
}
