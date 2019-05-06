package jsd1809;

public abstract class Role {
	private String name;
	private int age;
	private char sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public abstract void play();
	public Role(){
		
	}
	public Role(String name,int age){
		this();
		this.name=name;
		this.age=age;
	}
	
//	1定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量
//	要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)，
//再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法，该方法不返回任何值，
	//同时至少定义两个构造方法。Role类中要体现出this的几种用法。
//	从Role类派生出一个"Employee"类，该类具有Role类的所有成员（构造方法除外），
	//并扩展salary成员变量，同时增加一个静态成员变量“职工编号（ID）”。
	//同样要有至少两个构造方法，要体现出this和super的几种用法，
	//还要求覆盖play()方法，并提供一个final sing()方法。
//	"Manager"类继承"Employee"类，
	//有一个final成员变量"vehicle"
//	在main()方法中制造Manager和Employee对象,并测试这些对象的方法

}
