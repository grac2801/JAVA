package u6_l3_FRQ2_Fundraiser;

public class Fundraiser
{
	private double target_amount;
	private double total;
	private int num_donations;

	public Fundraiser(double target_amount)
	{
		this.target_amount = target_amount;

	}


	public void addDonation(double donation)
	{
		this.num_donations++;
		this.total += donation;

	}


	public double averageDonation()
	{
		if (this.num_donations == 0)
		{
			return 0.0;

		}
		else
		{
			return this.total / num_donations;

		}

	}


	public double distanceToTarget()
	{
		if (target_amount > total)
		{
			return this.target_amount - this.total;

		}
		else
		{
			return 0.0;
		}

	}

}// End of class
