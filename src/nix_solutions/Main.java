package nix_solutions;

public class Main {

	public static void main(String[] args) {

		Earth earth = new Earth();
		System.out.println((earth.daysOfYear) + " дней в году");
		System.out.println(earth.name);
		earth.gravitation();
		System.out.println("--------------------");

		Uran uran = new Uran();
		System.out.println((uran.daysOfYear) + " дней в году");
		System.out.println(uran.name);
		uran.gravitation();
		System.out.println("--------------------");

		Saturn saturn = new Saturn();
		System.out.println((saturn.daysOfYear) + " дней в году");
		System.out.println(saturn.name);
		saturn.gravitation();
		System.out.println("--------------------");

		Mars mars = new Mars();
		System.out.println((mars.daysOfYear) + " дней в году");
		System.out.println(mars.name);
		mars.gravitation();
		System.out.println("--------------------");

		for (Week week : Week.values()) {
			System.out.println(week + ", " + week.restOrWork);

		}
	}
}
