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
	
//	1����һ�������"Role"�࣬�����������䣬�Ա�ȳ�Ա����
//	Ҫ�󾡿����������б���(�ܹ�˽�о�˽��,�ܹ������Ͳ�Ҫ����)��
//��ͨ��GetXXX()��SetXXX()�����Ը��������ж�д������һ�������play()�������÷����������κ�ֵ��
	//ͬʱ���ٶ����������췽����Role����Ҫ���ֳ�this�ļ����÷���
//	��Role��������һ��"Employee"�࣬�������Role������г�Ա�����췽�����⣩��
	//����չsalary��Ա������ͬʱ����һ����̬��Ա������ְ����ţ�ID������
	//ͬ��Ҫ�������������췽����Ҫ���ֳ�this��super�ļ����÷���
	//��Ҫ�󸲸�play()���������ṩһ��final sing()������
//	"Manager"��̳�"Employee"�࣬
	//��һ��final��Ա����"vehicle"
//	��main()����������Manager��Employee����,��������Щ����ķ���

}
