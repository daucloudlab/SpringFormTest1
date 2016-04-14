package kz.tezdet.lessons.springmvc;

import kz.tezdet.lessons.springmvc.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;


@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class) ;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main(){
        logger.debug("Main method!!!");

        return new ModelAndView("login", "user", new User()) ;
    }

    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public String check_user(@Valid @ModelAttribute("user") User user,
                                   BindingResult result, Map<String, Object> model){
        if (result.hasErrors())
            return "login" ;
        else{
            model.put("user", user) ;
            return "main" ;
        }

    }

    @RequestMapping(value = "/failed", method = RequestMethod.GET)
    public ModelAndView failed(){
        return new ModelAndView("login-failed", "message", "Login Failed!") ;
    }

    @RequestMapping(value = "/get-json-user/{name}", method = RequestMethod.GET)
    public ResponseEntity<User> getJsonUser(@PathVariable("name")String name){
        User user = new User() ;
        user.setUsername(name);
        return new ResponseEntity<User>(user, HttpStatus.OK) ;
    }

    @RequestMapping(value="put-json-user", method = RequestMethod.POST,
            consumes="application/json")
    public ResponseEntity<Void> setJsonUser(@RequestBody User user){
        return  new ResponseEntity<Void>(HttpStatus.ACCEPTED) ;
    }
}
