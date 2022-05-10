public class Main{

public static void main(String[]args)
{
	Dog dog1=new Dog("Tom","Husky","White","Max",5.5,4);
	System.out.println(dog1.getName());
	dog1.Dogbarking();
	dog1.run(15.2);
	dog1.setName("Hound");
	System.out.println(dog1.getName());
	dog1.Dogbarking();
	dog1.run(25.2);
}
}