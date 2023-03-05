import java.util.*;
import javax.swing.*;
class Student{
	int id=0;
	String name=null;
	int age=0;
	String gender=null;
	Double cgpa = 0.0;
	
	
	Student(){
	this(0,null,0,null,0.0);
	}
	Student(int i,String n,int a,String g,Double c){
	this.name =n;
	this.id=i;
	this.age=a;
	this.gender=g;
	this.cgpa=c;
	
	}
	int getId(){
		return id;
	}
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	String getGender(){
		return gender;
	}

	


	void setName(String n){
	this.name=n;
	return;
	}
	void setId(int i){
	this.id=i;
	return;
	}
	void setDegree(String n){
	this.name=n;
	return;
	}
	
	int addStudent(int i,String n,int a,String g,Double c){
	this.name =n;
	this.id=i;
	this.age=a;
	this.gender=g;
	this.cgpa=c;
	return this.id;
	}
	
	void deleteStudent(){
	this.name =null;
	this.id=0;
	this.age=0;
	this.gender=null;
	this.cgpa=0.0;
	
	}
	void updateStudent(String n,int a,String g,Double c){
	this.name =n;
	this.age=a;
	this.gender=g;
	this.cgpa=c;
	
	}
	void Display(){
	

	JOptionPane.showMessageDialog(null,"Your Name is "+this.name+" Your ROLLNO is "+(this.id+1) +" Your age is "+this.age);

	}

	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a Number of Students");
	int x = in.nextInt();
	int current_Student=0;
	Student Stud[]=new Student[x];
	int ex=0;
	while(ex!=-1){
	System.out.println("Select Option");
	ex = in.nextInt();
	switch(ex){
	
	case 1:
		if(current_Student<x){
		String cage =JOptionPane.showInputDialog("Age");
		int ccage= new Integer(cage);
		String name =JOptionPane.showInputDialog("Name");
		String Gender =JOptionPane.showInputDialog("Gender");
		String cgpa =JOptionPane.showInputDialog("cgpa");
		double gpa = new Double(cgpa );		
		Stud[current_Student]= new Student();
		int userid=Stud[current_Student].addStudent(current_Student,name,x,Gender,gpa);
		JOptionPane.showMessageDialog(null,"Your Name is "+ (userid+1));
		
		current_Student++;
		}
		else{
		JOptionPane.showMessageDialog(null,"Your Arrey is out of bounds");
		}
		
	break;
	case 2:
		String cr =JOptionPane.showInputDialog("Roll");
		int crr= new Integer(cr);
		crr= crr-1;
		if(crr<current_Student){
		Stud[crr].Display();
		}
		else{
		JOptionPane.showMessageDialog(null,"Your Roll no is not added");
		}
	break;
	case 3:
		String cs =JOptionPane.showInputDialog("Roll");
		int css= new Integer(cs);
		css= css-1;
		if(css<current_Student){
		Stud[css].deleteStudent();
		}
		else{
		JOptionPane.showMessageDialog(null,"Your Roll no is not added");
		}
	
	break;
	case 4:
		String csx =JOptionPane.showInputDialog("Roll");
		int cssx= new Integer(csx);
		cssx= cssx-1;
		if(cssx<current_Student){
		String cagex =JOptionPane.showInputDialog("Age");
		 int ccagex= new Integer(cagex);
		 String namex =JOptionPane.showInputDialog("Name");
		 String Genderx =JOptionPane.showInputDialog("Gender");
		 String cgpax =JOptionPane.showInputDialog("cgpa");
		 Double gpax = new Double(cgpax );		
		Stud[cssx].updateStudent(namex,ccagex,Genderx,gpax);
		}
		else{
		JOptionPane.showMessageDialog(null,"Your Roll no is not added");
		}
		
	break;
	}
	}	

	
	
    	}


}
		



