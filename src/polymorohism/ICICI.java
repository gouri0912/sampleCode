package polymorohism;

public class ICICI extends Bank{
	
	public void getRateOfInterest(float a)
	{
		System.out.println("Get interest from ICICI");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICICI obj = new ICICI();
		obj.getRateOfInterest(21.0f);
	}

}
