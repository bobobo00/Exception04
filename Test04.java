package test;
/**
 * 测试自定义异常类
 * @author dell
 *
 */

public class Test04 {
	  static Person p=new Person();
	public static void main(String[] args) {
        p.setAge(-1);   
   }
   
}
class Person{
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) {
			try {
				throw new IllegalAgeException("年龄不能为负数");
			} catch (IllegalAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.age = age;
	}
	
}
class IllegalAgeException extends Exception{//Exception:编译时异常。RuntimeException:运行时异常。
	public IllegalAgeException() {
		
	}
    public IllegalAgeException(String str) {
		super(str);
	}


}