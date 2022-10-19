 
  class Politician1
{
	 String name = "Poltcian1";
	 void innocent()
	 {
		 System.out.println("innocent");
	 }
	 void promice()
	 {
		 System.out.println("promice");
	 }
	public void moneylaundering()
 {
		System.out.println("moneylaundering");
		
	}
	 
}

class Politician2 extends Politician1
   {
	void moneylaundering()
	{
	 System.out.println("moneylaundering");
	}
   
 void cheating() 
 {
	  System.out.println("cheating public money"); 
 }

 void speaklieing()
 {
	  System.out.println("publicly speak lieing");
 }

public class Upcasting
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		 Politician1 ref = new Politician2();
		System.out.println(ref.name);
		
		ref.innocent();
		ref.promice();
		ref.moneylaundering();
		ref.cheating();
		ref.speaklieing();
		
		
		
	}
}
   }

