import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * If int argument is annotated with this annotation
 * then argument will be randomly generated
 * via @link{java.util.Random}.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface RandomInt {

    int from() default 0;
    int to();
}
