import static org.junit.Assert.*;

import org.junit.Test;

import school.Student;

public class StudentTest {
	
	@Test
	public void testing_name_attribute() {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "Bob";
		s2.name = "Carl";
		assertEquals(false, s1.name == s2.name);
	}

	@Test
	public void testing_email_attribute() {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.email = "bob@uni.edu";
		s2.email = "carl@uni.edu";
		assertEquals(false, s1.email == s2.email);
	}

	@Test
	public void testing_school_id_attribute() {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.school_id = 123;
		s2.school_id = 456;
		assertEquals(true, s1.school_id == s2.school_id);
	}
}
