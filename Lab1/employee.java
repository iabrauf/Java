public class employee {
	int c;

	public static void main(String[] args) {
		int payAmount = 2000;
		int payPeriod = 12;
		int annualPay;
		employee e1 = new employee();
		annualPay = e1.payPerYear(payAmount, payPeriod);
		System.out.println("your per year salary is:" + " " + annualPay);
	}

	int payPerYear(int a, int b) {
		this.c = a * b;
		return this.c;
	}
}