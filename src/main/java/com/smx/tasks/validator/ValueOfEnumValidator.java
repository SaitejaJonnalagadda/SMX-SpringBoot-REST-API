package com.smx.tasks.validator;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

@Component
public class ValueOfEnumValidator implements ConstraintValidator<ValueOfEnum, CharSequence> {
    private List<String> acceptedValues;
 
    @Override
    public void initialize(ValueOfEnum annotation) {
        acceptedValues.add("MANUAL");
        acceptedValues.add("AUTO");
    }


	@Override
	public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
		if (value == null) {
            return true;
        }
 
        return acceptedValues.contains(value.toString());
	}
}

