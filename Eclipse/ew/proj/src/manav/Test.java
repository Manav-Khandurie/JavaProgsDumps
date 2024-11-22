package manav;
class Worker{
	int rate=500;
	int salary (int hours) {
		System.out.println("Worker class");
		return hours*rate;
	}
}
class DailyWorker extends Worker{
	//int rate=500;
	int salary (int hours) {
		System.out.println("DailyWorker class");
		return hours*rate;
	}
}
class SalariedWorker extends Worker{
	//int rate=500;
	int salary (int hours) {
		System.out.println("SalariedWorker class");
		return hours*rate;
	}
}
public class Test {

	public static void main(String args[]) {
		System.out.println((new DailyWorker()).salary(100));
		System.out.println((new SalariedWorker()).salary(100));
		System.out.println((new Worker()).salary(100));
	}

}
