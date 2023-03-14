import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * If any argument is annotated with this annotation
 * then argument will be taken from the map
 * <b>(don't forget to check classes before invoking)</b>.
 * If value is not presented in the map then
 * just provide <b>null</b>.
 * <p>
 * If function() is not empty then it must call method
 * with this name in functionClass(). This method
 * must be static and get exactly one argument
 * (value from the map will be an argument).
 * For example, functionClass=@link{java.util.UUID},
 * function="fromString".
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface MapArgument {

    String value();

    Class<?> functionClass() default Object.class;
    String function() default "";
}
