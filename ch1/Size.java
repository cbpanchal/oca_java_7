public enum Size 
{
	LARGE(16),
	MEDIUM(10),
	SMALL(8)
	{
		// Overriding the enum method for only this SMALL type
		public String getCupCode()
		{
			return "AAA";
		}
	};

	Size(int ounces)
	{
		this.ounces = ounces;
	}
	private int ounces;

	public int getOunces()
	{
		return ounces;
	}
	// All types will use thsi method except SMALL
	public String getCupCode()
	{
		return "AA";
	}
}