package Abstraction;

public  class Rectangle extends AbstractClassShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle();
		obj.calculateArea();
		obj.calculatePerimeter();
		
	}
	
	public  void calculateArea()
	{
		System.out.println("Area of Rectangle is : l*b");
		
	}
	
	public void calculatePerimeter() 
	{
		System.out.println("Perimeter of Rectangle is : 2(l+b)");
	}

}
