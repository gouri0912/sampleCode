package Abstraction;

public  class circle  extends AbstractClassShape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle obj = new circle();
		obj.calculateArea();
		obj.calculatePerimeter();
		
	}

	
	public  void calculateArea()
	{
		System.out.println("Area of circle is : 3.14*r*r");
		
	}
	
	public void calculatePerimeter() 
	{
		System.out.println("Perimeter of circle is : 2*3.14*r");
	}
}
