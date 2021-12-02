package u6_l3_FRQ1_Position;

public class Position
{

	private double ew;
	private double ns;
	private double distance;

	public Position(double ew, double ns)
	{
		this.ew = ew;
		this.ns = ns;
		distance = 0;
	}


	public void move(double distance, String dir)
	{
		this.distance += distance;
		if (dir.equals("N"))
		{
			this.ns += distance;
		}
		else if (dir.equals("S"))
		{
			this.ns -= distance;
		}
		else if (dir.equals("E"))
		{
			this.ew += distance;
		}
		else if (dir.equals("W"))
		{
			this.ew -= distance;
		}


	}


	public void toString1()
	{
		System.out.printf("(%-3.1f, %-3.1f)%n", ew, ns);
		// return "(" + ew + ", " + ns + ")";
	}


	public double totalDistance()
	{
		return distance;
	}

}
