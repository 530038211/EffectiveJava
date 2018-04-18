package rule23;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 泛型
 * @author Use
 * @param <A>
 *
 */
public class ListTest<E extends Number> {
    public static void main(String args){
    	List<Number> list = new ArrayList<Number>();
    	list.add(3);
    	
    	Stack<String> stack = new Stack<String>();
    	stack.push("1");
    }
    
    public <T extends Annotation> T getInstance(Class<T> annotationType) throws NoSuchFieldException, SecurityException{
		Field field = getClass().getSuperclass().getDeclaredField("or");
		field.setAccessible(true);
		return null;
		
    }
}
