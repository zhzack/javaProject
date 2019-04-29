
public abstract class EntertainmentEquipment {

	abstract void playMusic();

	abstract void watchTV();

	abstract void surfOnLine();

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.playMusic();
		computer.watchTV();
		computer.surfOnLine();
		computer.chat();
		computer.sendMessage();
		computer.receiveMessage();
		System.out.println("-----------");

		SmartMobilePhone mobile = new SmartMobilePhone();
		mobile.playMusic();
		mobile.watchTV();
		mobile.surfOnLine();
		mobile.chat();
		mobile.sendMessage();
		mobile.receiveMessage();
		System.out.println("-----------");
	}
}
