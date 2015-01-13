
public class testConnect {

	public static void main(String[] args) //garbage connection testing class, please delete 
	{
		System.out.println("Filmoholics DB: " + sqlMethods.filmConnectTest());
		System.out.println("GameConvert DB: " + sqlMethods.gameConnectTest());
		System.out.println("WebGameConvert DB: " + sqlMethods.webGameConnectTest());
	}

}
