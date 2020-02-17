package emailApp;

public class EmailApp {
//This app creates email accounts for new employees

	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		System.out.println(em1.showInfo());
		
//		em1.changePassword("haz.kass@methodist.edu");
//		System.out.println(em1.getPassword());
		
	}

}
