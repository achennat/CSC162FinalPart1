package finalpackage;
import java.util.UUID;


public class Person {
	private String FirstName;
	private String LastName;
	private UUID PersonId;
	private String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public UUID getPersonId() {
		return PersonId;
	}
	public void setPersonId() {
		UUID personid = UUID.randomUUID();
		PersonId = personid;
	}
	
}
