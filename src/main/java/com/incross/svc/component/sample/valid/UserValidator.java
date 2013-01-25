package com.incross.svc.component.sample.valid;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.incross.svc.component.user.domain.User;

/**
 * @FileName : UserValid.java
 * @Project : myProject
 * @Date : 2013. 1. 24.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@Component
public class UserValidator implements Validator {

	/**
	 * <pre>
	 * supports
	 *
	 * <pre>
	 * @param clazz
	 * @return
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	/**
	 * <pre>
	 * validate
	 *
	 * <pre>
	 * @param target
	 * @param errors
	 */
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "userId", "id.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "name.required");

		User user = (User) target;
		if (user.getAge() > 20) {
			errors.rejectValue("age", "old.age", new Object[]{"1", "2"}, null);
		}
	}

}
