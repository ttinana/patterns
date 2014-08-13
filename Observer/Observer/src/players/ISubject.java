package players;
public interface ISubject {

	public void attachObserver(IObserver observer);

	public void detachObserver(IObserver observer);

	public void note();

}
