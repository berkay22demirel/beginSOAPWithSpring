package firstexample;


public class PersonDAOImpl implements PersonDAO {

	@Override
	public Person getPerson() {

		Person person = new Person(1, "Berkay", "Demirel");

		return person;

	}

}
