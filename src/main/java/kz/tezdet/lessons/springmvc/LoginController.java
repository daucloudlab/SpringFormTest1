package kz.tezdet.lessons.springmvc;

import kz.tezdet.lessons.springmvc.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class) ;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main(){
        logger.debug("Main method!!!");

        return new ModelAndView("login", "user", new User()) ;
    }

    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public ModelAndView check_user(@ModelAttribute("user") User user){
        ModelAndView model = new ModelAndView() ;
        model.setViewName("main");
        model.addObject("user",user) ;
        return model ;
    }

    @RequestMapping(value = "/failed", method = RequestMethod.GET)
    public ModelAndView failed(){
        return new ModelAndView("login-failed", "message", "Login Failed!") ;
    }
}
