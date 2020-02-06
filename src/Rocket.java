import java.util.List;

public class Rocket {
	private String name;
	private int thrusterNum;
	private List<Thruster> thrusters;

	public Rocket(String name, int thrusterNum, List<Thruster> thrusters) {
		super();
		this.name = name;
		this.thrusterNum = thrusterNum;
		this.thrusters = thrusters;
	}

	public String getName() {
		return name;
	}

	public int getThrusterNum() {
		return thrusterNum;
	}

	public List<Thruster> getThrusters() {
		return thrusters;
	}

	public void initialize(Rocket oneRocket) {
		for (int i = 0; i < oneRocket.getThrusterNum(); i++) {
			oneRocket.getThrusters().get(i).setLivePower(0);;
		}
	}
	
	public void setPower(Rocket oneRocket, int targetPower) {
		for (int i = 0; i < oneRocket.getThrusterNum(); i++) {
			oneRocket.getThrusters().get(i).setTargetPower(targetPower);
			}
		for (Thruster Thruster : thrusters) {
			Thread a = new Thread(Thruster);
			a.start();
			
		}
	}

	@Override
	public String toString() {
		return "Rocket [name=" + name + ", thrusterNum=" + thrusterNum + "]\nthrusters=" + thrusters + "]";
	}

}