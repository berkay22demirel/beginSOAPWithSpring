package firstexample;

import javax.jws.WebService;

@WebService(endpointInterface = "firstexample.PersonWebService")
public class PersonWebServiceImpl implements PersonWebService {

	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	public Person getPerson() {

		return personDAO.getPerson();

	}

}
