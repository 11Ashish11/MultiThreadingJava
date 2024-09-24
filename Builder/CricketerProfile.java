package Builder;

public class CricketerProfile {
	public static void main(String[] args) {
		
		Cricketer Virat = new Cricketer.CricketBuilder("Virat",29)
				.setRuns(10000)
				.setWickets(10)
				.setAudi(3)
				.build();
		
		System.out.println("The age of Virat is :: " + Virat.getAge());
		System.out.println("The number of Audis with Virat is :: " + Virat.getAudi());
		System.out.println("The age of wickets of Virat is :: " + Virat.getWicket());
		
		Cricketer Dhobi = new Cricketer.CricketBuilder("Dhobi", 40)
				.setAudi(0)
				.setRuns(1000)
				.build();
		
		System.out.println("The age of Dhobi is :: " + Dhobi.getAge());
		System.out.println("The number of Audis with Dhobi is :: " + Dhobi.getAudi());
		System.out.println("The age of wickets of Dhobi is :: " + Dhobi.getWicket());
		
	}
}
