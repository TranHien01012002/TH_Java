package trananhhien.Lab3.Validator;
import trananhhien.Lab3.repository.IUserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import trananhhien.Lab3.Validator.annotation.ValidUsername;

public class ValidUsernameValidator  implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context){
        if(userRepository==null){
            return true;
        }
        return userRepository.findByUsername(username)==null;
    }
}
