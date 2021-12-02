package u6_l3_FRQ1_Position;

public class Position_client
{
	public static void main(String[] args)
	{
		Position p = new Position(1.5, -5.0);
		p.toString1();
		System.out.println(p.totalDistance());
		p.move(3.5, "E");
		p.move(1, "S");
		p.toString1();
		p.totalDistance();
		p.move(8.2, "N");
		p.move(3.7, "W");
		p.move(0.6, "W");
		p.toString1();
		p.totalDistance();
	}
}
