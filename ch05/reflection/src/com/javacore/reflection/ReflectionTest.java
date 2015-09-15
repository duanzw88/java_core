package com.javacore.reflection;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ReflectionTest
{

	public static void main(String[] args)
	{
		/*
		String name = "java.lang.Double";
		
		try
		{
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			String modifiers = Modifier.toString(cl.getModifiers());
			if(modifiers.length() > 0)
			{
				System.out.print(modifiers + " ");
			}
			System.out.print("class " + cl.getName());
			
			if(supercl !=null && supercl != Object.class)
			{
				System.out.print(" extends " + supercl.getName());
			}
			System.out.print("\n{\n");
			
			printConstructors(cl);
			System.out.println();
			printMethods(cl);
			System.out.println();
			printFields(cl);
			System.out.print("\n}\n");
			
			
			
		} 
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
//		int[] array = new int[3];
//		for (int i = 0; i < array.length; i++)
//		{
//			array[i] = i;
//		}
//		System.out.println(new ObjectAnalyzer().toString(array));
//		ArrayList<Integer> lists = new ArrayList<Integer>();
//		for(int i = 2;i <= 5;i++)
//		{
//			lists.add(i * i);
//		}
//		
//		ObjectAnalyzer analyzer = new ObjectAnalyzer();
//		System.out.println(analyzer.toString(lists));
				
		Employee ee = new Employee("staff",100,1988,1,1);
		
		Class cl = ee.getClass();
		try
		{
			Field field = cl.getDeclaredField("name");
			field.setAccessible(true);
			Object name = field.get(ee);
			System.out.println(name+"");
		} 
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
		System.out.println("---------");
		Field[] fields = cl.getDeclaredFields();
		AccessibleObject.setAccessible(fields,true);
		
		for(Field f : fields)
		{
			System.out.println(Modifier.toString(f.getModifiers()) + " "+f.getName());
			try
			{
				Class t = f.getType();
				Object val = f.get(ee);
				System.out.println(val.toString());
			} 
			catch (Exception e)
			{
				// TODO: handle exception
			}
			
		}

	}
	
	/**
	 * 打印类的构造函数
	 * @param cl
	 */
	public static void printConstructors(Class cl)
	{
		//获取构造函数 存储到数组中
		
		Constructor[] constructors = cl.getConstructors();//cl.getDeclaredConstructors();
		
		for(Constructor c : constructors)
		{
			
			String name = c.getName();
			System.out.print("\t");
			String modifiers = Modifier.toString(c.getModifiers());
			if(modifiers.length() > 0)
			{
				System.out.print(modifiers + " ");
			}
			System.out.print(name + "(");
			Class[] paramTypes = c.getParameterTypes();
			for(int i = 0;i < paramTypes.length;i++)
			{
				if(i > 0)
				{
					System.out.print(", ");
				}
				System.out.print(paramTypes[i].getName());
			}
			System.out.print(");" + "\n");
			
		}
	}
	
	/**
	 * 打印方法
	 * @param cl
	 */
	public static void printMethods(Class cl)
	{
		Method[] methods = cl.getDeclaredMethods();//cl.getMethods();
		for(Method m : methods)
		{
			String name = m.getName();
			System.out.print("\t");
			//获取方法的修饰符
			String modifier = Modifier.toString(m.getModifiers());
			if(modifier.length() > 0)
			{
				System.out.print(modifier + " ");
			}
			//获取方法返回值
			String returnType = m.getReturnType().getSimpleName();//.getName();
			System.out.print(returnType + " ");
			//打印方法名
			System.out.print(name + "(");
			//获取参数类型
			Class[] params = m.getParameterTypes();
			for(int i = 0;i < params.length;i++)
			{
				if(i == 0)
				{
					System.out.print(params[i].getName());
				}
				else
				{
					System.out.print(", "+ params[i].getName());
				}
			}
//			for(Class p : params)
//			{
//				System.out.print(p.getName());
//			}
			
			System.out.print(");" + "\n");
			
		}
	}
	
	public static void printFields(Class cl)
	{
		
		Field[] fields = cl.getDeclaredFields();//cl.getFields();
		for(Field f : fields)
		{
			System.out.print("\t");
			//获取属性修饰符
			String modifiers = Modifier.toString(f.getModifiers());
			if(modifiers.length() > 0)
			{
				System.out.print(modifiers + " ");
			}
			System.out.print(f.getName() + ";\n");
			
			
		}
	}

}
