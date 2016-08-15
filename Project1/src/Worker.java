
public class Worker {
	
	private int age;
	private String name;
	private int salr ;
	
	
	public void setage (int age){
		if (cheackage(age)== true){
			this.age= age;
			System.out.println("THE AGE IS :" + age);
		}else System.out.println("Not Vlid Age.");
	
		
	}
	
	public boolean cheackage (int newage){
		return (newage < 65&&newage >0);
			
		
	}
	
}
