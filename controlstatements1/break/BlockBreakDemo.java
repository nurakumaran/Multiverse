class BlockBreakDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		boolean b  = true;

		first: {
			second :{
				third : {
							System.out.println("Before the break");
							if (b)
							{
								break second;
							}
							System.out.println("End of third block will not execute");
						} 
						System.out.println("End of third block will not execute");
					}
					System.out.println("This will execute and is inside first block");
				}
	}
}
