package com.farm1.farm1.mysqldataaccess;

import com.farm1.farm1.Repositories.UserRepository;
import com.farm1.farm1.entities.User;
import com.farm1.farm1.html.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    HttpSession httpSession;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String index() {


        String indexContent =

                    "<div class=\"content\">" +
                            "<h1 style=\"color: aliceblue;\"> WELCOME TO THE FARM MANAGEMENT SYSTEM </h1>" +
                            "</div>";


        return Pages.HEADER +
                Pages.SIDELINK +
                indexContent +
                Pages.FOOTER;

    }
    @PostMapping("/farmManager")
    public String farmManager(){
        String farmManagerPage =
                "<div class=\"content\">"+
                        "<a href=\"uploadImage\"> <b style=\"color:white\"> Click to Upload Image</b>"+
                        "<button class=\"btn btn-primary btn-lg\" > Upload Image</button>"+
                        "</a><br><br>"+
                        "<div class=\"container-forms\">"+
                        "<div class=\"container-info\">"+
                        "<div class=\"info-item\">"+
                        "<div class=\"table\">"+
                        "<div class=\"table-cell\">"+
                        "</div>"+
                        "</div>"+
                        "</div>"+
                        "</div>"+
                        "</div>"+
                        "<div class=\"register container\">"+
                        "<div class=\"register-container\">"+
                        "<h2 style=\"text-align: center;\" >Create A User</h2>"+
                        "</b>"+


                        "<!-- Register Form -->"+
                        "<form:form class=\"register-form\" action=\"\" method=\"POST\">"+
                        "<p>email</p>"+
                        "<form:input types=\"email\" name=\"email\" id=\"\" placeholder=\"yourmail@gmail.com\" required><br><br>"+
                        "<p>fName</p>"+
                        "<br>"+
                        "<form:input type=\"text\" name=\"fName\" id=\"\" placeholder=\"First Name\" required><br><br>"+
                        "<p>lName</p>"+
                        "<br>"+
                        "<form:input type=|\"text\" name=\"lName\" id=\"\" placeholder=\"Last Name\" required><br><br>"+
                        "<br>"+
                        "<p>Password</p>"+
                        "<form:input type=\"password\" name=\"password\" id=\"\" placeholder=\"********\" required><br>"+
                        "<p>phone</p>"+
                        "<br>"+
                        "<form:input type=\"tel\" name=\"phone\" id=\"\" placeholder=\"Enter your number\" required><br><br>"+
                        "<p>user_role</p>"+
                        "<br>"+
                        "<select>" +
                        "<form:option>Farm Manager</option>" +
                        "<form:option>Data Collector</option>" +
                        "<form:option>Stakeholder</option>" +
                        "</select>" +
                        "<p>Submit</p>" +
                        "<form:input type=\"submit\">" +
                        "</form>"+
                        "</div>" +
                        "<br><br>"+
                        "<div class=\"section-container\">"+
                        "<h3>Create Section</h3>" +
                        "<form class=\"farm-section-form\">" +
                        "<p>Crop Section</p>" +
                        "<input type=\"text\">" +
                        "</form>" +
                        "<h3>Create Subsection</h3>" +
                        "<form class=\"farm-forms\">" +
                        "<p>Crop Subsection</p>" +
                        "<input type=\"text\">" +
                        "<p>Under Section</p>" +
                        "<select>" +
                        "<option></option>" +
                        "</select>" +
                        "<p>Submit</p>" +
                        "<input type=\"submit\">" +
                        "</form>" +

                        "</div>"+
                        "</div>"+

                        "</div> "+
                        "</div>";




        return Pages.HEADER + Pages.SIDELINK + farmManagerPage + Pages.FOOTER;
    }
    public String formHandling(@ModelAttribute Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "form";
    }

}
