package practices.annotations;

import java.lang.annotation.*;

//@Inherited // созданная аннотация "MyAnn" применяется ко всем классам наследникам
//@Retention(RetentionPolicy.RUNTIME) // видны при запуске все аннотации
//RetentionPolicy.SOURCE после компеляции будет удалена (только сейчас)
//RetentionPolicy.CLASS после компеляции в классе будет видна аннотация
//@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE}) FIELD ограничивает приминение(только внутри методов)

public @interface MyAnn {
    boolean run() default true;

    int i() default 1;

    String value(); //спец имя хранящееся в анотации
}


