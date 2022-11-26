package com.farm1.farm1.mysqldataaccess;

import com.farm1.farm1.html.Pages;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class ImagesController {

    HttpSession httpSession;

    @GetMapping(path = "/uploadImage")
    public String uploadImage(){

        String uploadImagePage =

                "<div class=\"content\">"+
                        "<div class=\"box\"></div>"+
                        "<div class=\"container-forms\">"+
                        "<div class=\"container-info\">"+
                        "<div class=\"info-item\" >"+
                        "</div>"+
                        "<div class=\"info-item\">"+
                        "<div class=\"table\">"+
                        "<div class=\"table-cell\">"+
                        "</div>"+
                        "</div>"+
                        "</div>"+
                        "</div>"+
                        "<div class=\"container-form\">"+
                        "<div class=\"form-item log-in\">"+
                        "<div class=\"table\">"+
                        "<div class=\"table-cell\">"+
                        "<div style=\"overflow-y:scroll;height:500px;\">"+
                        "<label for=\"date\"><h3 style=\"color: antiquewhite;\">Date</h3></label>"+
                        "<input type=\"date\" date=\"date\" id=\"date\" required><br>"+
                        "<label for=\"time\"><h3 style=\"color: antiquewhite;\">Time</h3></label>"+
                        "<input type=\"time\" time=\"time\" id=\"time\" required><br>"+
                        "<label for=\"device\"><h3 style=\"color: antiquewhite;\">Device</h3></label>"+
                        "<input type=\"device\" device=\"device\" id=\"device\" required><br>"+
                        "<label for=\"temprature\"><h3 style=\"color: antiquewhite;\">Temprature</h3></label>"+
                        "<input type=\"number\" temprature=\"temprature\" id=\"temprature\" required><br>"+
                        "<label for=\"humidity\"><h3 style=\"color: antiquewhite;\">Humidity</h3></label>"+
                        "<input type=\"number\" humidity=\"humidity\" id=\"humidity\" required><br>"+
                        "<label for=\"other_requirements\"><h3 style=\"color: antiquewhite;\">Other Requirements</h3></label>"+
                        "<input type=\"other_requirements\" other_requirements=\"other_requirements\" id=\"other_requirements\" required><br>"+
                        "<label for=\"upload_images\"><h3 style=\"color: antiquewhite;\">Upload Images Here</h3></label> <br>"+
                        "<form action=\"collectors\" method=\"get\" >"+
                        "<input style=\"color: antiquewhite;\" type=\"file\" name=\"image_upload\">"+
                        "<input type=\"submit\" name=\"submit\">"+
                        "</form>"+
                        "<button type=\"submit\" class=\"btn\">Submit</button>"+
                        "<button type=\"reset\" class=\"btn\">Reset</button>"+
                        "</div>"+
                        "</div>"+
                        "</div>"+
                        "</div>"+
                        "</div>"+
                        "</div>"+
                        "</div>"+
                        "</div>";


        return Pages.HEADER + Pages.SIDELINK + uploadImagePage + Pages.FOOTER;
    }
}
