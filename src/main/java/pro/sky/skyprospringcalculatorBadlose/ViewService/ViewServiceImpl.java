package pro.sky.skyprospringcalculatorBadlose.ViewService;

import org.springframework.stereotype.Service;

@Service
public class ViewServiceImpl implements ViewService {
    public String showResult(Integer result) {
            return "Результат " + result;
    }

    public String showWrongArgument() {
        return "Вы ввели неверный аргумент";
    }

    public String showZeroArgument() {
        return "На 0 делить нельзя";
    }
}
