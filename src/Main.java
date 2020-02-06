import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int option;
		String order = "";
		boolean mainMenuLoop = true;
		int targetPower;

		List<Thruster> thrustersRocket3 = new ArrayList<Thruster>();
		List<Thruster> thrustersRocket6 = new ArrayList<Thruster>();

		Thruster Rocket3_1 = new Thruster(10);
		Thruster Rocket3_2 = new Thruster(30);
		Thruster Rocket3_3 = new Thruster(80);

		thrustersRocket3.add(Rocket3_1);
		thrustersRocket3.add(Rocket3_2);
		thrustersRocket3.add(Rocket3_3);

		Rocket Rocket3 = new Rocket("32WESSDS", 3, thrustersRocket3);

		Thruster Rocket6_1 = new Thruster(30);
		Thruster Rocket6_2 = new Thruster(40);
		Thruster Rocket6_3 = new Thruster(50);
		Thruster Rocket6_4 = new Thruster(50);
		Thruster Rocket6_5 = new Thruster(30);
		Thruster Rocket6_6 = new Thruster(10);

		thrustersRocket6.add(Rocket6_1);
		thrustersRocket6.add(Rocket6_2);
		thrustersRocket6.add(Rocket6_3);
		thrustersRocket6.add(Rocket6_4);
		thrustersRocket6.add(Rocket6_5);
		thrustersRocket6.add(Rocket6_6);

		Rocket Rocket6 = new Rocket("LDSFJA32", 6, thrustersRocket6);

		do {
			ShowMainMenu();
			option = sc.nextInt();

			if (option == 1) {
				System.out.println("Juguem amb el cohet 32WESSDS ");

				ShowRocketMenu();
				order = sc.next().toLowerCase();
				mainMenuLoop = true;
				switch (order) {

				case "start":

					Rocket3.initialize(Rocket3);
					System.out.println(Rocket3.toString());
					mainMenuLoop = true;
					break;

				case "go":

					System.out.println("Indicar potència objectiu dels propulsors: ");
					targetPower = sc.nextInt();
					Rocket3.setPower(Rocket3, targetPower);
					mainMenuLoop = true;
					break;

				case "stop":

					System.out.println("Parant els propulsors ");
					Rocket3.setPower(Rocket3,0);
					mainMenuLoop = true;
					break;

				case "return":

					System.out.println("Tornant a menu cohet!!");
					mainMenuLoop = true;
					break;

				case "exit":
					System.out.println("Sortint de cohets!!");
					mainMenuLoop = false;
					break;

				default:
					System.out.println("Instruccions incorrectes!!!");
					mainMenuLoop = true;
					break;
				}
			}

			else if (option == 2) {
				System.out.println("Juguem amb el cohet LDSFJA32");
				ShowRocketMenu();
				order = sc.next().toLowerCase();

				switch (order) {

				case "start":
					Rocket6.initialize(Rocket6);
					System.out.println(Rocket6.toString());
					mainMenuLoop = true;
					break;

				case "go":

					System.out.println("Indicar potència objectiu dels propulsors: ");
					targetPower = sc.nextInt();
					Rocket6.setPower(Rocket6, targetPower);
					mainMenuLoop = true;
					break;

				case "stop":

					System.out.println("Parant els propulsors ");
					Rocket6.setPower(Rocket6,0);
					mainMenuLoop = true;
					break;

				case "return":
					System.out.println("Tornant a menu cohet!!");
					mainMenuLoop = true;
					break;

				case "exit":
					System.out.println("Sortint de cohets!!");
					mainMenuLoop = false;
					break;

				default:
					System.out.println("Instruccions incorrectes!!!");
					mainMenuLoop = true;
					break;
				}

			}

		} while (mainMenuLoop);
sc.close();
	}

	public static void ShowMainMenu() {
		System.out.println("\nIndica instruccions: ");
		System.out.println("1- Jugar amb cohet 32WESSDS");
		System.out.println("2- Jugar amb cohet LDSFJA32");

	}

	public static void ShowRocketMenu() {

		System.out.println("\nIndica instruccions: ");
		System.out.println("Encendre propulsors 'start'");
		System.out.println("Potencia a propulsors 'go'");
		System.out.println("Parar propulsors 'stop'");
		System.out.println("Tornar a menu cohets 'return'");
		System.out.println("Sortir de cohets 'exit'");
	}

}
