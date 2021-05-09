package ucuncuGunOdev;

public class Main {

	public static void main(String[] args) {
		
		
		UserManager userManager = new UserManager();
		userManager.add(new Student(1,"Cemre","DİŞLİ"));
		
		UserManager userManager1 = new UserManager();
		userManager1.add(new Instructor(2,"Engin","Demiroğ"));
		
	
		

	}

}
