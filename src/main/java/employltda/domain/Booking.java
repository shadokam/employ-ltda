package employltda.domain;

import java.util.ArrayList;
import java.util.List;


public class Booking{

    private String startDate;
    private String endDate;
    private String bookingResponsible;
    private String note;

    private Boolean isCoffee;

    private List bookingLocalID;
    private List bookingRoomID;

    public Booking(){

        startDate = " ";
        endDate = " ";
        bookingResponsible = " ";
        note = " ";

        isCoffee = false;

        bookingLocalID = new ArrayList<>();
        bookingRoomID = new ArrayList<>();
    }



}