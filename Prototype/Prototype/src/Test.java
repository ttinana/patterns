import java.io.Serializable;
import java.io.SerializablePermission;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Sheep sheep = new Sheep();

		CloneFactory f = new CloneFactory();

		Sheep sally = (Sheep) f.getClone(sheep);

		System.out.println("Original: " + sheep + " hash code: "
				+ sheep.hashCode());
		System.out.println("Original: " + sally + " hash code: "
				+ sally.hashCode());
	
	}
}
