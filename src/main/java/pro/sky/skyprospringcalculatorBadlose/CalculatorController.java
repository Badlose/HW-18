package pro.sky.skyprospringcalculatorBadlose;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringcalculatorBadlose.CalculationService.CalculationService;
import pro.sky.skyprospringcalculatorBadlose.GreetingService.GreetingService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final GreetingService greetingService;
    private final CalculationService calculationService;

    public CalculatorController(GreetingService greetingService, CalculationService calculationService) {
        this.greetingService = greetingService;
        this.calculationService = calculationService;
    }

    @GetMapping
    public String hello() {
        return greetingService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculationService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculationService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculationService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculationService.divide(num1, num2);
    }
}
