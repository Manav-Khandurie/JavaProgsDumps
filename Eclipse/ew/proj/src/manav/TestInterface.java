package manav;

public class TestInterface {
	public static void main(String args[]) {
		
		ShapeI obj[]=new ShapeI[4];
		obj[0]=new Rectangle(10,20);
		obj[1]=new Square(10);
		obj[2]=new Circle(5);
		obj[0].display();//In class shape 
		obj[0].area();obj[0].circum();
		//rectangle
		obj[1].area();obj[1].circum();
		//square
		obj[2].area();obj[2].circum();
		//circle
		//obj[4]=new Shape(); gives error as abstract classs cant have objects created
	}
}
