package trananhhien.Lab3.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import trananhhien.Lab3.Validator.annotation.ValidUserId;
import trananhhien.Lab3.entity.User;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user==null){
            return true;
        }
        return user.getId()!=null;
    }
}