package test;
/**
 * �����Զ����쳣��
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
				throw new IllegalAgeException("���䲻��Ϊ����");
			} catch (IllegalAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.age = age;
	}
	
}
class IllegalAgeException extends Exception{//Exception:����ʱ�쳣��RuntimeException:����ʱ�쳣��
	public IllegalAgeException() {
		
	}
    public IllegalAgeException(String str) {
		super(str);
	}


}