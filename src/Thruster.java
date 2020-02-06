
public class Thruster implements Runnable {

	private int livePower;
	private int maxPower;
	private int targetPower;

	public Thruster(int maxPower) {
		super();

		this.maxPower = maxPower;

	}

	public int getLivePower() {
		return livePower;
	}

	public void setLivePower(int livePower) {
		this.livePower = livePower;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public int getTargetPower() {
		return targetPower;
	}

	public void setTargetPower(int targetPower) {
		this.targetPower = targetPower;
	}

	@Override
	public String toString() {
		return "Thruster [livePower=" + livePower + ", maxPower=" + maxPower + ", targetPower=" + targetPower + "]";
	}

	@Override
	public void run() {

		if (targetPower != 0) {
			if (targetPower > maxPower) {
				for (int i = 0; i < maxPower; i++) {
					this.livePower = this.livePower + 1;
					System.out.println(Thread.currentThread().getName() + " Thruster [livePower=" + livePower
							+ ", maxPower=" + maxPower + ", targetPower=" + targetPower + "]");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			} else {
				for (int i = 0; i < targetPower; i++) {
					this.livePower = this.livePower + 1;
					System.out.println(Thread.currentThread().getName() + " Thruster [livePower=" + livePower
							+ ", maxPower=" + maxPower + ", targetPower=" + targetPower + "]");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}

			}
		} else {
			for (int i = livePower; i > 0; i--) {
				this.livePower = this.livePower - 1;
				System.out.println(Thread.currentThread().getName() + " Thruster [livePower=" + livePower
						+ ", maxPower=" + maxPower + ", targetPower=" + targetPower + "]");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}

	}

}
