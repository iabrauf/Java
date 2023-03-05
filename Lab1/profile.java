import java.util.*;

public class profile {
	String name, sureName, contactNo, address;

	profile() {
	}

	profile(String n, String sn, String cn, String a) {
		this.name = n;
		this.sureName = sn;
		this.contactNo = cn;
		this.address = a;
	}

	void displayData() {
		System.out.println(this.name + "  " + this.sureName + "  " + this.contactNo + " " + this.address);
	}

	public static void main(String[] args) {

		String name, sureName, contactNo, address;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name");
		name = in.nextLine();
		System.out.println("Surename.");
		sureName = in.nextLine();
		System.out.println("Enter Contact Number");
		contactNo = in.nextLine();
		System.out.println("Enter address");
		address = in.nextLine();
		profile p1 = new profile(name, sureName, contactNo, address);
		profile p2 = new profile();
		p1.displayData();
	}

}