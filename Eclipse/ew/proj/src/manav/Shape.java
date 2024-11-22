package manav;
/*
abstract class Shape {
	//we only create refrence variables of these abstract class
	abstract public void area();
	abstract public void circum ();
	void display(){
		System.out.println("IN Shape");
	}
	//cant use default in abstract classes only interfaces
}*/
class Rectangle implements ShapeI{

	int l,b;
	Rectangle(int l,int b){
		this.l=l;this.b=b;
	}
	public void area() {
		System.out.println("Area of rect :- "+(l*b));
	}
	public void circum() {
		System.out.println("Perimeter of rect :- "+2*(l+b));
	}

}
class Square  implements ShapeI{

	int l;
	Square(int l){
		this.l=l;
	}
	public void area() {
		System.out.println("Area of square :- "+(l*l));
	}
	public void circum() {
		System.out.println("Perimeter of square :- "+2*(l+l));
	}

}
class Circle implements ShapeI{

	int r;
	Circle(int r){
		this.r=r;
	}
	public void area() {
		System.out.println("Area of circle :- "+(Math.PI*r*r));
	}
	public void circum() {
		System.out.println("Perimeter of rect :- "+2*(Math.PI*r));
	}

}