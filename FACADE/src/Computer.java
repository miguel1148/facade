
public class Computer {
	
	private CPU cpu;
	  private Memory memory;
	  private HardDrive hardDrive;
	  private Monitor monitor;

	  public Computer() {
	    this.cpu = new CPU();
	    this.memory = new Memory();
	    this.hardDrive = new HardDrive();
	    this.monitor = new Monitor();
	  }

	  public void startComputer() {
	    cpu.freeze();
	    memory.load(11111, hardDrive.read(101010, 10110011));
	    cpu.jump(111000);
	    cpu.execute();
	    monitor.start();
	  }

}
