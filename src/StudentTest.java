import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {
	
	@Test
	public void testing_sum_with_array1() {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "Bob";
		s2.name = "Carl";
		assertEquals(false, s1.name == s2.name);
	}

	@Test
	public void testing_sum_with_array2() {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.email = "bob@uni.edu";
		s2.email = "carl@uni.edu";
		assertEquals(false, s1.email == s2.email);
	}

	@Test
	public void testing_sum_with_array3() {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.school_id = 123;
		s2.school_id = 456;
		assertEquals(true, s1.school_id == s2.school_id);
	}
}