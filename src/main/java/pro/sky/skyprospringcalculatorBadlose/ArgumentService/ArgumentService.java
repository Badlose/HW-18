package pro.sky.skyprospringcalculatorBadlose.ArgumentService;

public interface ArgumentService {
    default boolean checkArgument(Integer num1, Integer num2) {
        return true;
    }

    boolean checkDivide(Integer num);
}
