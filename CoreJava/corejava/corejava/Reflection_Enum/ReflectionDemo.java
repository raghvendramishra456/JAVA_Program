import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;


public class ReflectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      Employee employee = new Employee();
	      
	      Class klass = employee.getClass();
	      
	      System.out.println( "Class name: " + klass.getName());
	      System.out.println( 
	            "Class super class: " + klass.getSuperclass());
	      
	      int mods = klass.getModifiers();
	      System.out.println( 
	            "Class is public: " + Modifier.isPublic(mods));
	      System.out.println( 
	            "Class is final: " +  Modifier.isFinal(mods));
	      System.out.println( 
	            "Class is abstract: " + Modifier.isAbstract(mods)); 

   
	      
	      Constructor[] theConstructors = klass.getConstructors();
	      Class[] types = theConstructors[0].getParameterTypes();
	      Object[] params = new Object[types.length];

	      for (int i = 0; i < theConstructors.length; i++) {
	          System.out.print("( ");
	          Class[] parameterTypes = 
	             theConstructors[i].getParameterTypes();
	          for (int k = 0; k < parameterTypes.length; k ++) {
	               String parameterString = parameterTypes[k].getName();
	               System.out.print(parameterString + " ");
	             }
	          System.out.println(")");
	          }     
	
	}
	

}
