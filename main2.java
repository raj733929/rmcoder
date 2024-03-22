class main2{
	static
	{
		System.out.println("static block");
	}
	static void add (int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	void nul(int a, int b)
	{
		int c = a*b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Student student1 = new Student(100,"Raj");
		Student student2 = new Student(100,"Aathish");
		Student student3 = new Student(100,"Choka");
		Student student4 = new Student(100,"Boomer","CSE");
		Student student5 = new Student(100,"Gopi","ECE");
		
		System.out.println (student1);
		System.out.println (student2);
		System.out.println (student3);
		System.out.println (student4);
		System.out.println (student5);
	}
}