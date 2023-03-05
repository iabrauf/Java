
import java.util.*;

class NegativeArray extends Exception {
	NegativeArray() {
	}

	public String toString() {
		return "Array size should be in positive integer";
	}
}

class indexOccupiedException extends Exception {

	indexOccupiedException() {

	}

	public String toString() {
		return "index is already occupied";
	}
}

class Health {
	String name;
	int weight;
	int height;
	int BMI;

	Health() {
	}

	Health(String n, int w, int h) {
		this.name = n;
		this.weight = w;
		this.height = h;
		BMI = weight / height;
	}

	void savedata(String n, int h, int w) {
		this.name = n;
		this.weight = w;
		this.height = h;
		BMI = weight / height;

	}

	public String toString() {
		return name + " " + BMI;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Enter Array Size");
			int s;
			Scanner in = new Scanner(System.in);
			s = in.nextInt();
			if (s < 0) {
				throw new NegativeArray();
			} else {
				Health arr[] = new Health[s];
				for (int i = 0; i < s && s > 0; i++) {
					Scanner inp = new Scanner(System.in);
					System.out.println("Enter user name");
					String uname = inp.nextLine();
					System.out.println("Enter user weight");
					int uweight = inp.nextInt();
					System.out.println("Enter user Height");
					int uheight = inp.nextInt();
					try {
						System.out.println("Enter index for object");
						Scanner sc = new Scanner(System.in);
						int ind = sc.nextInt();
						try {
							if (ind >= s) {
								throw new ArrayIndexOutOfBoundsException();
							}
						} catch (ArrayIndexOutOfBoundsException e) {
							System.out.println("Array Index Out of boundry");
						}

						if (arr[ind] != null) {
							throw new indexOccupiedException();
						} else {
							arr[ind] = new Health();
							arr[ind].savedata(uname, uweight, uheight);
							System.out.println(arr[ind]);
						}

					} catch (indexOccupiedException e) {
						System.out.println(e);
					}
				}
			}
		} catch (NegativeArray e) {
			System.out.println("Exception:" + e);
		}
	}
}
