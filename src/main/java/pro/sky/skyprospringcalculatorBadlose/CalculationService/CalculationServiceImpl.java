package pro.sky.skyprospringcalculatorBadlose.CalculationService;

import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService {

    public String plus(Integer num1, Integer num2) {
        int result;
        if (num1 == null || num2 == null) {
            return "Вы ввели неверный аргумент";
        } else {
            result = num1 + num2;
        }
        return "Результат " + result;
    }

    public String minus(Integer num1, Integer num2) {
        int result;
        if (num1 == null || num2 == null) {
            return "Вы ввели неверный аргумент";
        } else {
            result = num1 - num2;
        }
        return "Результат " + result;
    }

    public String multiply(Integer num1, Integer num2) {
        int result;
        if (num1 == null || num2 == null) {
            return "Вы ввели неверный аргумент";
        } else {
            result = num1 * num2;
        }
        return "Результат " + result;
    }

    public String divide(Integer num1, Integer num2) {
        int result;
        if (num1 == null || num2 == null) {
            return "Вы ввели неверный аргумент";
        } else if (num2 != 0) {
            result = num1 / num2;
        } else return "На 0 делить нельзя";
        return "Результат " + result;
    }
}