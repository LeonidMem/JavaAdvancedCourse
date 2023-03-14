/**
 * If list of classes argument is annotated
 * with this annotation then argument will be
 * replaced with all interfaces that are
 * implemented by class from value()
 */
public @interface Interfaces {

    Class<?> value();
}
