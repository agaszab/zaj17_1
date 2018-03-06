package pl.javastart;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class MainController {

    private UsersList usersList;


    public MainController(UsersList usersList){
        this.usersList=usersList;

    }

    @RequestMapping("/users")
    @ResponseBody
    public String displayUsers (){

        List<User> users=usersList.getUsers();

        String result="";

        for(User us: users) {
            result+=us.toString()+"<br>";
        }
     return result;
    }



    @RequestMapping("/add")
    @ResponseBody
    public String addUser(HttpServletRequest request){

        String imie=request.getParameter("imie");
        String nazwisko=request.getParameter("nazwisko");
        int wiek=Integer.parseInt(request.getParameter("wiek"));

        if (imie==null || imie.equals(""))
        {return "/err.html";}  // wejdzie strona jak puste imie



     User user = new  User (imie, nazwisko, wiek);

        usersList.add(user);

     return "redirect:/success.html"; // jak doda




    }


}


