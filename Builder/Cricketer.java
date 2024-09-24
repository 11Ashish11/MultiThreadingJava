package Builder;

public class Cricketer {
	private String name;
	private int age;
	private int runs;
	private int wickets;
	private int Audi;
	
	public Cricketer(CricketBuilder cricketer) {
		this.name = cricketer.name;
		this.age = cricketer.age;
		this.runs = cricketer.runs;
		this.wickets = cricketer.wickets;
		this.Audi = cricketer.Audi;
	}
	
	void setname(String name) {
		this.name = name;
	}
	
	void setage(int age) {
		this.age = age;
	}
	
	void setruns(int runs) {
		this.runs = runs;
	}
	
	void setwicket(int wickets) {
		this.wickets = wickets;
	}
	
	void setAudi(int Audi) {
		this.Audi = Audi;
	}
	
	String getName() {
		return this.name;
	}
	
	Integer getAge() {
		return this.age;
	}
	
	Integer getRuns() {
		return this.runs;
	}
	
	Integer getWicket() {
		return this.wickets;
	}
	
	Integer getAudi() {
		return this.Audi;
	}
	
	
	
	public static class CricketBuilder {
		private String name;
		private int age;
		private int runs;
		private int wickets;
		private int Audi;
		
		
		CricketBuilder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		CricketBuilder setRuns(int runs) {
			this.runs = runs;
			return this;
		}
		
		CricketBuilder setWickets(int wickets) {
			this.wickets = wickets;
			return this;
		}
		
		CricketBuilder setAudi(int Audis) {
			this.Audi = Audis;
			return this;
		}
		
		public Cricketer build() {
			return new Cricketer(this);
		}
	}
	
}
