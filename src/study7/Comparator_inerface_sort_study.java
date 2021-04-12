package study7;
import java.util.Arrays;
import java.util.Comparator;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+ " "+ age;
	}
}

class PersonComp implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		//내림차순
		int result = 1;
		if(o1.age >= o2.age) result = -1;
		return result;
		
		//오차순
//		int result = -1;
//		if(o1.age >= o2.age) result = 1;
//		return result;
	}
}

public class Comparator_inerface_sort_study  {

	public static void main(String[] args) {
		Person p = new Person("김영현",25);
		Person p2 = new Person("김영현2",24);
		Person p3 = new Person("김영현3",26);
		Person p4 = new Person("김영현4",21);
		Person [] ps = {p,p2,p3,p4};
		
		Arrays.sort(ps, new PersonComp());
		for (Person person : ps) {
			System.out.println(person);
		}
	}

}
