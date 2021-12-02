package u6_l3_FRQ2_Fundraiser;

public class Fundraiser_client
{

	public static void main(String[] args)
	{
		Fundraiser f = new Fundraiser(5000.00);
		f.averageDonation();
		f.distanceToTarget();
		f.addDonation(750.00);
		f.averageDonation();
		f.distanceToTarget();
		f.addDonation(1125.00);
		f.addDonation(400.00);
		f.addDonation(1620.00);
		f.averageDonation();
		f.distanceToTarget();
		f.addDonation(124.75);
		f.addDonation(1030.60);
		f.averageDonation();
		f.distanceToTarget();
	}

}
