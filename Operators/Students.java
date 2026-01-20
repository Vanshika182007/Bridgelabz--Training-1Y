class Students{
  int id;
  String name;
  int age;
  void display(){
  String status="Active";
  System.out.println("id is "+id);
  System.out.println("name is "+name);
  System.out.println("age is "+age);
  System.out.println("Status "+status);
  }
  public static void main(String[]args){
    Students s=new Students();
	s.id=100;
	s.name="uttkarsh";
	s.age=20;
	s.display();
	}
	}