package study_polymorphism;

public class TestPet {

	public static void main(String[] args) {
		Pet [] pets = {new Cat("나비",2,"암컷","흰"),
						new Cat("나비2",22,"암컷2","흰2"),
						
						new Dog("멍멍1",1,"수컷1","리트리버"),
						new Cat("나비3",223,"암컷3","흰3"),
						new Dog("멍멍2",2,"수컷2","허스키")
		};
		for(Pet pet : pets) {
			System.out.println(pet.getPet());
		}
		
		for(Pet pet : pets) {
			if (pet instanceof Cat) {
				Cat c = (Cat)pet;
				System.out.println(c.getPet());
			}
		}
	}

}
