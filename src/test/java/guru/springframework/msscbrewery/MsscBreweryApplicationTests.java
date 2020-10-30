package guru.springframework.msscbrewery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class MsscBreweryApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void myNoteBookTest(){
		Pattern p = Pattern.compile("[a-zA-Z]*");
		Matcher m = p.matcher("ali");
		boolean b = m.matches();
		Assertions.assertTrue(b);
	}

}
