import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        CustomClassLoader loader = new CustomClassLoader();
        Thread.currentThread().setContextClassLoader(loader);
        Class employeeClass = loader.findClass("Employee");
        Object dynamic =  employeeClass.getDeclaredConstructor().newInstance();
        Employee employee = (Employee) dynamic;
        System.out.println(dynamic.getClass().getClassLoader());
    }
}
