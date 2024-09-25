package pro.sky.skyprospringcalculatorBadlose.CalculationService;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringcalculatorBadlose.ArgumentService.ArgumentServiceImpl;

@Service
public class CalculationServiceImpl extends ArgumentServiceImpl implements CalculationService {

    public String plus(Integer num1, Integer num2) {
        int result;
        if (checkArgument(num1, num2)) {
            return showWrongArgument();
        } else {
            result = num1 + num2;
        }
        return showResult(result);
    }

    public String minus(Integer num1, Integer num2) {
        int result;
        if (checkArgument(num1, num2)) {
            return showWrongArgument();
        } else {
            result = num1 - num2;
        }
        return showResult(result);
    }

    public String multiply(Integer num1, Integer num2) {
        int result;
        if (checkArgument(num1, num2)) {
            return showWrongArgument();
        } else {
            result = num1 * num2;
        }
        return showResult(result);
    }

    public String divide(Integer num1, Integer num2) {
        int result;
        if (checkArgument(num1, num2)) {
            return showWrongArgument();
        } else if (!checkDivide(num2)) {
            return showZeroArgument();
        } else {
            result = num1 / num2;
        }
        return showResult(result);
    }
}