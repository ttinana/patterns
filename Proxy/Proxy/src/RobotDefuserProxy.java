public class RobotDefuserProxy implements IRobot {

	private RobotBombDefuser bombDefuser;

	public RobotDefuserProxy() {
		bombDefuser = new RobotBombDefuser();
	}

	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return bombDefuser.isConnected();
	}

	@Override
	public void walkStreight(int steps) {
		bombDefuser.walkStreight(steps);
		
	}

	@Override
	public void turnLeft() {
		bombDefuser.turnLeft();
		
	}

	@Override
	public void turnRight() {
		bombDefuser.turnRight();
		
	}

	@Override
	public void defuseBomb() {
		bombDefuser.defuseBomb();
		
	}

}
