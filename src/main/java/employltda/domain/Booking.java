package employltda.domain;

import java.io.Serializable;


public class Booking implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer bookingID;

    private String startDate;
    private String endDate;
    private String bookingResponsible;
    private String note;

    private Boolean isCoffee;

    private Integer bookingLocalID;
    private Integer bookingRoomID;

    public Booking(){
    }

    //region Constructor
    public Booking(Integer bookingID, String startDate, String endDate, String bookingResponsible,
    String note, Boolean isCoffee, Integer bookingLocalID, Integer bookingRoomID){
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
    //endregion
    //region Getters e Setters
//---------------------------------------------------------------------------------------
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
    public Integer getBookingLocalID() {
        return bookingLocalID;
    }

    /**
     * @param bookingLocalID the bookingLocalID to set
     */
    public void setBookingLocalID(Integer bookingLocalID) {
        this.bookingLocalID = bookingLocalID;
    }

    /**
     * @return the bookingRoomID
     */
    public Integer getBookingRoomID() {
        return bookingRoomID;
    }

    /**
     * @param bookingRoomID the bookingRoomID to set
     */
    public void setBookingRoomID(Integer bookingRoomID) {
        this.bookingRoomID = bookingRoomID;
    }
    //---------------------------------------------------------------------------------------
//endregion
    //region hashCode e equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bookingID == null) ? 0 : bookingID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Booking other = (Booking) obj;
        if (bookingID == null) {
            if (other.bookingID != null)
                return false;
        } else if (!bookingID.equals(other.bookingID))
            return false;
        return true;
    }
    //---------------------------------------------------------------------------------------
//endregion
}