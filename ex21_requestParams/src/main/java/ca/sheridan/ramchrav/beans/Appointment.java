package ca.sheridan.ramchrav.beans;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    //Attributes
    private String _firstName;
    private String _email;
    private LocalDate _aDate;
    private LocalTime _aTime;

    //Constructors
    public Appointment(){}

    public Appointment(String firstName, String email, LocalDate aDate, LocalTime aTime){
        this._firstName = firstName;
        this._email = email;
        this._aDate = aDate;
        this._aTime = aTime;
    }

    //Getters and Setters
    public String getFirstName(){
        return this._firstName;
    }

    public void setFirstName(String name){
        this._firstName = name;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public LocalDate getADate() {
        return _aDate;
    }

    public void setADate(LocalDate _aDate) {
        this._aDate = _aDate;
    }

    public LocalTime getATime() {
        return _aTime;
    }

    public void setATime(LocalTime _aTime) {
        this._aTime = _aTime;
    }

    //Print info when toString() is printed out
    @Override
    public String toString(){
        return "First Name: " +this._firstName +", Email: " +this._email +", Date: " +this._aDate
                +", Time: " +this._aTime;
    }
}
