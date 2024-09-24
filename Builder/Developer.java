package Builder;

public class Developer {
	private String name;
	private int JSSkills;
	private int JavaSkills;
	private int DSASkills;
	private int KafkaSkills;
	
	Developer(DeveloperBuilder developerBuilder) {
		this.name = developerBuilder.name;
		this.DSASkills = developerBuilder.DSASkills;
		this.JSSkills = developerBuilder.JSSkills;
		this.JavaSkills = developerBuilder.javaSkills;
		this.KafkaSkills = developerBuilder.KafkaSkills;
	}
	
	String getName() {
		return this.name;
	}
	
	int getDSASkills() {
		return this.DSASkills;
	}
	
	int getJSSkills() {
		return this.JSSkills;
	}
	
	int getJavaSkills() {
		return this.JavaSkills;
	}
	
	int getKafkaSkills() {
		return this.KafkaSkills;
	}
	
	public static class DeveloperBuilder {
		private String name;
		private int JSSkills;
		private int javaSkills;
		private int DSASkills;
		private int KafkaSkills;
		
		DeveloperBuilder(String name, int DSASkills) {
			this.name = name;
			this.DSASkills = DSASkills;
		}
		
		DeveloperBuilder setJavaSkills(int javaSkills) {
			this.javaSkills = javaSkills;
			return this;
		}
		
		DeveloperBuilder setJSkills(int jskills) {
			this.JSSkills = jskills;
			return this;
		}
		
		DeveloperBuilder setKafkakills(int kafkakills) {
			this.KafkaSkills = kafkakills;
			return this;
		}
		
		Developer build() {
			return new Developer(this);
		}
	}
}
