package manav;

public interface ShapeI {

	public void area();
	public void circum();
	default void display() {
		System.out.println("In Interface SHape I");
	}
}
