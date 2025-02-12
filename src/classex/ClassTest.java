package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, 
	                             IllegalAccessException, NoSuchMethodException, SecurityException, 
	                             IllegalArgumentException, InvocationTargetException {
	
		Class c1 = Class.forName("classex.Person");
		
		Person person1 = (Person)c1.newInstance();
		System.out.println(person1);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"������"};
		Person personLee = (Person)cons.newInstance(initargs);
		
		System.out.println(personLee);
	}
}
