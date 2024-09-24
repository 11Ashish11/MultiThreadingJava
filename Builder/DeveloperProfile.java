package Builder;

public class DeveloperProfile {
	public static void main(String[] args) {
		Developer Ashish = new Developer.DeveloperBuilder("Ashish", 8).setJavaSkills(7).setJSkills(4).build();
		
		System.out.println("The name of this legendary Developer is  :: " + Ashish.getName());
		System.out.println("The skills is  :: " + Ashish.getName() + " in DSA are " + Ashish.getDSASkills());
		System.out.println("The skills is  :: " + Ashish.getName() + " in Java are " + Ashish.getJavaSkills());
		System.out.println("The skills is  :: " + Ashish.getName() + " in JS are " + Ashish.getJSSkills()) ;
	}
}
