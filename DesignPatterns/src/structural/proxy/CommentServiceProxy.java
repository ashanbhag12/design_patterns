package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CommentServiceProxy implements InvocationHandler {
	
	private Object obj;
	
	private CommentServiceProxy(Object obj) {
		this.obj = obj;
	}
	
	public static Object newInstance(Object object) {
		
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new CommentServiceProxy(object));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		if(method.getName().contains("post"))
			throw new IllegalAccessException("Post Comments functionality is not built yet.");
		return method.invoke(obj, args);
		
	}
	
}
