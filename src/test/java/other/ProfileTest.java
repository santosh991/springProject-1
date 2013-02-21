package other;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @FileName : ProfileTest.java
 * @Project : springProject
 * @Date : 2013. 2. 19.
 * @작성자 : 이남규
 * @프로그램설명 :
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/profile-test.xml"})
@ActiveProfiles("test")
public class ProfileTest {

	@Resource
	private String namkyu;
	@Resource
	private String profile;

	@Test
	public void profileTest() {
		assertThat(namkyu, is("namkyu"));
		assertThat(profile, is("test"));
	}
}
