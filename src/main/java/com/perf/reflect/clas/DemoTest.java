package com.perf.reflect.clas;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DemoTest {

	public static void main(String[] args) {
		DemoClass dc = new DemoClass(); // 점검 대상 클래스 객체

		DemoTest dt = new DemoTest();
		dt.getClassInfos(dc);
	}

	public void getClassInfos(Object clazz){
		Class demoClass = clazz.getClass();
		getClassInfo(demoClass);
		getFieldInfo(demoClass);
		getMethodInfo(demoClass);

	}

	public void getClassInfo(Class demoClass){
		String className = demoClass.getName();
		System.out.println("ClassName : " + className);

		String classCanonicalName = demoClass.getCanonicalName();
		System.out.println("ClassCanonicalName : " + classCanonicalName);

		String classSimpleName = demoClass.getSimpleName();
		System.out.println("ClassSimpleName : " + classSimpleName);

		String packageName = demoClass.getPackage().getName();
		System.out.println("ClassPackageName :" + packageName);

		String toString = demoClass.toString();
		System.out.println("toString : " + toString);

	}

	public void getFieldInfo(Class demoClass) {
		System.out.println("-----------------------");
		// 필드 전부
		Field[] field1 = demoClass.getDeclaredFields();
		// public 필드만
		Field[] field2 = demoClass.getFields();

		System.out.println("Declared Fields : " + field1.length);
		System.out.println("Fields : " + field2.length);

		for(Field field : field1){
			String fieldName = field.getName();
			int modifier = field.getModifiers();
			String modifierStr = Modifier.toString(modifier);
			String type = field.getType().getSimpleName();
			System.out.println("modifierStr : " + modifierStr);
			System.out.println("type : " + type);
			System.out.println("field name : " + fieldName);
		}
	}

	public void getMethodInfo(Class demoClass) {
		System.out.println("-----------------------");
		Method[] method1 = demoClass.getDeclaredMethods();
		Method[] method2 = demoClass.getMethods();

		System.out.println("Declared Methods : " + method1.length);
		System.out.println("Methods : " + method2.length);

		for(Method method : method1){
			// method name info
			String methodName = method.getName();
			// method modifier info
			int modifier = method.getModifiers();
			String modifierStr = Modifier.toString(modifier);
			// method return type info
			String returnType = method.getReturnType().getSimpleName();
			// method parameter info
			Class params[] = method.getParameterTypes();
			StringBuilder paramStr = new StringBuilder();
			int paramLen = params.length;
			if(paramLen != 0){
				paramStr.append(params[0].getSimpleName()).append(" arg");
				for(int i = 1; i < paramLen; i++){
					paramStr.append(",").append(params[i].getName()).append(" arg").append(i);
				}
			}

			// method Exception info
			Class exceptions[] = method.getExceptionTypes();
			StringBuilder exceptionStr = new StringBuilder();
			int exceptionLen = exceptions.length;
			if(exceptionLen != 0){
				exceptionStr.append(exceptions[0].getSimpleName()).append(" arg");
				for(int i = 1; i < exceptionLen; i++){
					exceptionStr.append(",").append(exceptions[i].getName()).append(" arg").append(i);
				}
			}

			System.out.println("modifierStr : " + modifierStr);
			System.out.println("returnType : " + returnType);
			System.out.println("methodName : " + methodName);
			System.out.println("paramStr : " + paramStr);
			System.out.println("exceptionStr : " + exceptionStr);
		}
	}
}
