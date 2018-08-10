package passwordReset;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.regex.Pattern;

@RestController
public class PasswordController {

    @RequestMapping(method = RequestMethod.POST, value="/reset/password")
    public UserInfoReply resetPassword(@RequestBody UserInfo userInfo) {
    	
    	if(validatePwd(userInfo.getPassword())){
            return new UserInfoReply(userInfo.getId(),
                    "Valid");
    	}
    	return new UserInfoReply(userInfo.getId(),
                "Invalid");
    }
    
    private boolean validatePwd(String pwd) {
    	String pattern1 = "[a-zA-Z]{4,}";
        String pattern2 = "\\d{2,}";
    	String pattern3 = "[^\\w]";
    	return (Pattern.matches(pattern1, pwd) && Pattern.matches(pattern2, pwd) &&!Pattern.matches(pattern3, pwd));
    }
}
