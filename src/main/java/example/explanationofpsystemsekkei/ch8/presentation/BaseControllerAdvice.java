package example.explanationofpsystemsekkei.ch8.presentation;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice(basePackageClasses = BaseControllerAdvice.class)
public class BaseControllerAdvice {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.initDirectFieldAccess();
        binder.setAllowedFields(""); //どのフィールドも許可しない
    }
}