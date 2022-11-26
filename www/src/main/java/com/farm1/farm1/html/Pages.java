package com.farm1.farm1.html;

public class Pages {

    public final static String HEADER =

            "<html>" +
                    "<head>" +
                    "<title>Farm-management-system</title>" +
                    "<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">"+
                    " <style>" +
                    " </style>" +
                    "</head>" +
                    " <body>" +
                    "<div class=\"grids\">"+
                    "<div class=\"main-header\"> " +
                    " <h1>" +
                    "<a href=\"/\" style=\"color:aliceblue\">MUKAYA FARM MANAGEMENT SYSTEM</a>" +
                    "</h1>" +
                    "</div> " +
                    " <div class=\"logo\">" +
                    "<img src=\"logo.jpg\" alt=\"Farm logo\" style=\"width:60px; height:60px; \">" +
                    "</div> ";



    public final static String SIDELINK =
            " <div class=\"side-links\">"+
                    " <h2>"+
                    "<a href=\"cropImages\"   style=\"color: white\">Crop Sections</a>"+
                    "<br></br>"+
                    "<a href=\"farmManager\"  style=\"color:white\">Farm Manager</a>"+
                    "<br></br>"+
                    "<a href=\"dataCollector\" style=\"color:white\" >Data Collector</a>"+
                    "<br></br>"+
                    "<a href=\"viewImages\" style=\"color:white\" >View Images </a>"+
                    "</h2>"+
                    "</div>";

    public final static String FOOTER =
            "<div class=\"footer\">"+
                    "<a href=\"aboutUs\" style=\"color:black\" style=\"text-decoration-line: none\">About Us</a> <br>"+
                    "@Copyright Mukaya Farm 2022 - All rights Reserved"+
                    "</div>"+
                    "</div>"+
                    "</body>"+
                    "</html>";
}
