import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @FileName : GenericTest.java
 * @Project : IncrossSpring
 * @Date : 2012. 12. 27.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
public class GenericTest {

	private static Logger log = LoggerFactory.getLogger(GenericTest.class);

	public static void main(String[] args) {
		GenericDAO<Integer> userDAO = new GenericDAO<Integer>();
		userDAO.add(111);

		GenericDAO<String> userDAO1 = new GenericDAO<String>();
		userDAO1.add("1234");

		log.info("test");
	}

}

class GenericDAO<T> {

	public T add(T param) {
		System.out.println(param);
		return param;
	}
}
