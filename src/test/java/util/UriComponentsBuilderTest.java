package util;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @FileName : UriComponentsBuilderTest.java
 * @Project : myProject
 * @Date : 2013. 1. 24.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
public class UriComponentsBuilderTest {

	@Test
	public void test() {
		UriComponents uriComponentsBuilder = UriComponentsBuilder.fromUriString("http://localhost/{userId}/{age}")
				.build()
				.expand("lng1982", 32)
				.encode();

		String test = uriComponentsBuilder.toString();
		assertThat(test, is("http://localhost/lng1982/32"));
	}
}
