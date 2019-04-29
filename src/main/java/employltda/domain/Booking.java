package employltda.domain;

import java.util.ArrayList;
import java.util.List;


public class Booking{

    private Integer bookingID;

    private String startDate;
    private String endDate;
    private String bookingResponsible;
    private String note;

    private Boolean isCoffee;

    private List bookingLocalID;
    private List bookingRoomID;

    public Booking(){
    }

    public Booking(Integer bookingID, String startDate, String endDate, String bookingResponsible,
    String note, Boolean isCoffee, List bookingLocalID, List bookingRoomID){
        super();
        this.bookingID = bookingID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bookingResponsible = bookingResponsible;
        this.note = note;
        this.isCoffee = isCoffee;
        this.bookingLocalID = bookingLocalID;
        this.bookingRoomID = bookingRoomID;
    }

    /**
     * @return the bookingID
     */
    public Integer getBookingID() {
        return bookingID;
    }

    /**
     * @param bookingID the startDate to set
     */
    public void setBookingID(Integer bookingID) {
        this.bookingID = bookingID;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the bookingResponsible
     */
    public String getBookingResponsible() {
        return bookingResponsible;
    }

    /**
     * @param bookingResponsible the bookingResponsible to set
     */
    public void setBookingResponsible(String bookingResponsible) {
        this.bookingResponsible = bookingResponsible;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the isCoffee
     */
    public Boolean getIsCoffee() {
        return isCoffee;
    }

    /**
     * @param isCoffee the isCoffee to set
     */
    public void setIsCoffee(Boolean isCoffee) {
        this.isCoffee = isCoffee;
    }

    /**
     * @return the bookingLocalID
     */
    public List getBookingLocalID() {
        return bookingLocalID;
    }

    /**
     * @param bookingLocalID the bookingLocalID to set
     */
    public void setBookingLocalID(List bookingLocalID) {
        this.bookingLocalID = bookingLocalID;
    }

    /**
     * @return the bookingRoomID
     */
    public List getBookingRoomID() {
        return bookingRoomID;
    }

    /**
     * @param bookingRoomID the bookingRoomID to set
     */
    public void setBookingRoomID(List bookingRoomID) {
        this.bookingRoomID = bookingRoomID;
    }

    



}