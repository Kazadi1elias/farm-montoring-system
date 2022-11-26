package com.farm1.farm1.mysqldataaccess;

import com.farm1.farm1.Repositories.SectionRepository;
import com.farm1.farm1.html.Pages;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SectionController {

    private SectionRepository userRepository;

    HttpSession httpSession;

    // STAKEHOLDERS PAGE

    // the page where images of crops will be display according to crop section

    @GetMapping("/viewImages")
    public String viewImages() {

        String viewImagesPage =

                "<div class=\"content\">"+
                        "<h1>Stakeholders</h1>" +
                        "<h2>Maize Image</h2>" +
                        "<div class=\"image-container\"> \n" +
                        "<img alt=\"Image 2\" src=\"maize.jpg\">\n" +
                        "</div>\n" +
                        "\n" +

                        "\t\t\t<h2>Tomato Image</h2>\n" +

                        "\t<div class=\"image-container\"> \n" +
                        "\t\t<img alt=\"Image 3\" src=\"tomato.jpg\">\n" +
                        "\t</div>\n" +
                        "\t\n" +

                        "\t\t\t<h2>Wheet Image</h2>\n" +

                        "\t<div class=\"image-container\"> \n" +
                        "\t\t<img alt=\"Image 4\" src=\"wheet.webp\">\n" +
                        "\t</div>" +

                        "\t\t</div>";

        return Pages.HEADER + Pages.SIDELINK + viewImagesPage + Pages.FOOTER;
    }

}
