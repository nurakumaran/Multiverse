class SwitchCaseDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int a = Integer.parseInt(args[0]);
		switch(a)
		{
			case 1:
				System.out.println("Monday!");
				break;
			case 2:
				System.out.println("Tuesday!");
				break;
			case 3:
			System.out.println("Wednesday!");
				break;
			case 4:
			System.out.println("Thursday!");
				break;
			case 5:
			System.out.println("Firday!");
				break;
			case 6:
			System.out.println("Saturday!");
				break;
			case 7:
			System.out.println("Sunday!");
				break;
			default:
				System.out.println("Invalid Day!");
		}

		System.out.println("End of switch case");

	}
}
