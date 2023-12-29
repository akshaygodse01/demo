package topic17_22june_interfaces;

public interface SavetoDB {

	void save();

	default void saveToCloudDB() {
		System.out.println("SaveToCloudDB default method");
	}
}
