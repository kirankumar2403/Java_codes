class Student
{
	int rollno,fee;
	String name,course;
	Student(int rollno,String name,String course)
	{	
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	Student getInstance()
	{
		return this;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
}
class ThisKeyword
{
	public static void main(String args[])
	{
		Student s1=new Student(11,"kiran","java");
		System.out.println(s1.getInstance());
		s1.display();
	}
}