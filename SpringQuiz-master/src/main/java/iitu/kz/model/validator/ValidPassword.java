package iitu.kz.model.validator;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = PasswordConstraintValidator.class)
@Retention(RUNTIME)
@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE })
public @interface ValidPassword {
	
	String message() default "Invalid Password";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
