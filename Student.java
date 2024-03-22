class Student {
	
    int rollno;
    String name;
    String dept;
    double cgpa;
    static String collegeName = "SRM";

    // Constructors
    Student() {}

    Student(int rollno) {
        this.rollno = rollno;
    }

    Student(int rollno, String name) {
        this.rollno =rollno;
        this.name = name;
    }

    Student(int rollno, String name, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
    }
	Student (int rollno, String name, String dept, double cgpa){
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}
    // toString() method
    @Override
    public String toString() {
        return rollno + " " + name + " " + dept + " " + cgpa + " " + collegeName;
    }
}
