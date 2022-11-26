package com.farm1.farm1.mysqldataaccess;

import com.farm1.farm1.Repositories.UserRepository;
import com.farm1.farm1.entities.User;
import com.farm1.farm1.html.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class WebController {

    @Autowired
    private UserRepository userRepository;

    HttpSession httpSession;


    @GetMapping("/farmManager")
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
                "<form class=\"register-form\" action=\"Use\" method=\"POST\">"+
                "<p>email</p>"+
                "<input types=\"email\" name=\"email\" id=\"\" placeholder=\"yourmail@gmail.com\" required><br><br>"+
                "<p>fName</p>"+
                "<br>"+
                "<input type=\"text\" name=\"fName\" id=\"\" placeholder=\"First Name\" required><br><br>"+
                "<p>lName</p>"+
                "<br>"+
                "<input type=|\"text\" name=\"lName\" id=\"\" placeholder=\"Last Name\" required><br><br>"+
                "<br>"+
                "<p>Password</p>"+
                "<input type=\"password\" name=\"password\" id=\"\" placeholder=\"********\" required><br>"+
                "<input type=\"submit\" name=\"\" values=\"\" class=\"button\">"+
                "<p>phone</p>"+
                "<br>"+
                "<input type=\"tel\" name=\"phone\" id=\"\" placeholder=\"Enter your number\" required><br><br>"+
                "<p>user_role</p>"+
                "<br>"+
                "<select>\n" +
                "<option>Farm Manager</option>" +
                "<option>Data Collector</option>" +
                "<option>Stakeholder</option>" +
                "</select>" +
                "<p>Submit</p>" +
                "<input type=\"submit\">" +
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
    @GetMapping("/dataCollector")
    public String dataCollector(){

        String dataCollectorsPage =
                "<div class=\"content\">"+
                "<a href=\"uploadImage\">"+
                "<button class=\"btn btn-primary btn-lg\" > Upload Image</button>"+
                "</a>"+
                "</div>";

        return Pages.HEADER + Pages.SIDELINK + dataCollectorsPage + Pages.FOOTER;
    }



        @GetMapping("/aboutUs")
    public String aboutUs(){

        String aboutUsPage =
                "<div class=\"content\">"+
                "<h1 style=\"color:rgba(19, 13, 3, 0.733)\">What's this website about?</h1>"+
                "<summary> <h2 style=\"color: rgb(124, 61, 61);\"> This website is a Remote Farm Monitoring system that displays the ongoing activities at the Mukaya Farm. Stakeholders are able to see the crops, the data collectors take pictures of the crops and insert their details.</h2></summary>"+
                "</div>";

        return Pages.HEADER + Pages.SIDELINK + aboutUsPage + Pages.FOOTER;
    }
    @GetMapping("/imagesSection1")
    public String imagesSection1(){

        String imagesSection1 =
                "<div class=\"content\">"+
                "<h1 style=\"color: white;\"> Section 1 </h1>"+
                "<a href=\"uploadImage\">"+
                "<button class=\"btn btn-primary btn-lg\" > Upload Image</button>"+
                "</a>"+
                "</div>";
        return Pages.HEADER + Pages.SIDELINK + imagesSection1 + Pages.FOOTER;
    }
    @GetMapping("/imagesSection2")
    public String imagesSection2(){
        String imagesSection2 =
                "<div class=\"content\">"+
                        "<h1 style=\"color: white;\"> Section 2 </h1>"+
                        "<a href=\"uploadImage\">"+
                        "<button class=\"btn btn-primary btn-lg\" > Upload Image</button>"+
                        "</a>"+
                        "</div>";
        return Pages.HEADER + Pages.SIDELINK + imagesSection2 + Pages.FOOTER;
    }

}
