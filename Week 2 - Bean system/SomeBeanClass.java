import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class SomeBeanClass {

    public SomeBeanClass() {

    }

    /**
     * @param methodName Name of the method of this class that must be called
     * @param arguments Map of arguments
     * @return null if method is void, otherwise result of this method
     */
    public Object callMethod(String methodName, Map<String, Object> arguments) {
        // Get method
        Method method;

        Object[] args = new Object[method.getParameterCount()];

        AnnotatedType[] annotatedArgTypes = method.getAnnotatedParameterTypes();
        Class<?>[] argClasses = method.getParameterTypes();

        for (int i = 0; i < args.length; i++) {
            // Fill args
        }

        // Invoke method with check for static: if it is static, provide null as object, otherwise this
    }

    private String checkStatus(@MapArgument("expectedStatus") String status,
                               @MapArgument(value = "uuid", functionClass = UUID.class, function = "fromString") UUID uuid,
                               @CreateInstance Random random,
                               @RandomInt(to = 100) int randomValue) {
        return status + random.nextBoolean() + randomValue;
    }

    // Add more methods!
}
