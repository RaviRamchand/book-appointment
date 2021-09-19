package ca.sheridan.ramchrav.controllers;

import ca.sheridan.ramchrav.beans.Appointment;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class HomeController {

    //Links to Home/Index.html page
    @GetMapping("/")
    public String getIndex(){
        //return whats on the index.html page
        return "index";
    }

    //Gets user input from the form action and saves it to the Application class attributes
    @PostMapping("/formPost")
    public String formPost(@RequestParam String fName, @RequestParam String email,
                           @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)@RequestParam LocalDate aDate,
                           @DateTimeFormat(iso=DateTimeFormat.ISO.TIME)@RequestParam LocalTime aTime){
        Appointment app = new Appointment();
        app.setFirstName(fName);
        app.setEmail(email);
        app.setATime(aTime);
        app.setADate(aDate);
        System.out.println(app);
        //return whats on the working.html page
        return "working";
    }
}
