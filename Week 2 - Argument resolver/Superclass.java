/**
 * If class argument is annotated
 * with this annotation then argument will be
 * replaced with superclass of class from value()
 */
public @interface Superclass {

    Class<?> value();
}
