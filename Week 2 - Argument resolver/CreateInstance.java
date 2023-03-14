import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * If any <b>non-primitive</b> argument is annotated
 * with this annotation then argument will be
 * created if it is possible (there must exist
 * public constructor with zero arguments).
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface CreateInstance {
}
