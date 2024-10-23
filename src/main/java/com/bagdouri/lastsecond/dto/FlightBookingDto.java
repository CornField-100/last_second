package com.bagdouri.lastsecond.dto;

import java.time.LocalDateTime;

public class FlightBookingDto {

    private Long id;
    private String customerFirstName;
    private String customerLastName;
    private String customerIdNumber;
    private String departureAirport;
    private LocalDateTime departureDateTime;
    private String arrivalAirport;
    private LocalDateTime arrivalDateTime;
    private double price;

    public FlightBookingDto(Long id, String customerFirstName, String customerLastName, String customerIdNumber, String departureAirport, LocalDateTime departureDateTime, String arrivalAirport, LocalDateTime arrivalDateTime, double price) {
        this.id = id;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerIdNumber = customerIdNumber;
        this.departureAirport = departureAirport;
        this.departureDateTime = departureDateTime;
        this.arrivalAirport = arrivalAirport;
        this.arrivalDateTime = arrivalDateTime;
        this.price = price;
    }

    public FlightBookingDto() {
    }

    public Long getId() {
        return this.id;
    }

    public String getCustomerFirstName() {
        return this.customerFirstName;
    }

    public String getCustomerLastName() {
        return this.customerLastName;
    }

    public String getCustomerIdNumber() {
        return this.customerIdNumber;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public LocalDateTime getDepartureDateTime() {
        return this.departureDateTime;
    }

    public String getArrivalAirport() {
        return this.arrivalAirport;
    }

    public LocalDateTime getArrivalDateTime() {
        return this.arrivalDateTime;
    }

    public double getPrice() {
        return this.price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public void setCustomerIdNumber(String customerIdNumber) {
        this.customerIdNumber = customerIdNumber;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FlightBookingDto)) return false;
        final FlightBookingDto other = (FlightBookingDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$customerFirstName = this.getCustomerFirstName();
        final Object other$customerFirstName = other.getCustomerFirstName();
        if (this$customerFirstName == null ? other$customerFirstName != null : !this$customerFirstName.equals(other$customerFirstName))
            return false;
        final Object this$customerLastName = this.getCustomerLastName();
        final Object other$customerLastName = other.getCustomerLastName();
        if (this$customerLastName == null ? other$customerLastName != null : !this$customerLastName.equals(other$customerLastName))
            return false;
        final Object this$customerIdNumber = this.getCustomerIdNumber();
        final Object other$customerIdNumber = other.getCustomerIdNumber();
        if (this$customerIdNumber == null ? other$customerIdNumber != null : !this$customerIdNumber.equals(other$customerIdNumber))
            return false;
        final Object this$departureAirport = this.getDepartureAirport();
        final Object other$departureAirport = other.getDepartureAirport();
        if (this$departureAirport == null ? other$departureAirport != null : !this$departureAirport.equals(other$departureAirport))
            return false;
        final Object this$departureDateTime = this.getDepartureDateTime();
        final Object other$departureDateTime = other.getDepartureDateTime();
        if (this$departureDateTime == null ? other$departureDateTime != null : !this$departureDateTime.equals(other$departureDateTime))
            return false;
        final Object this$arrivalAirport = this.getArrivalAirport();
        final Object other$arrivalAirport = other.getArrivalAirport();
        if (this$arrivalAirport == null ? other$arrivalAirport != null : !this$arrivalAirport.equals(other$arrivalAirport))
            return false;
        final Object this$arrivalDateTime = this.getArrivalDateTime();
        final Object other$arrivalDateTime = other.getArrivalDateTime();
        if (this$arrivalDateTime == null ? other$arrivalDateTime != null : !this$arrivalDateTime.equals(other$arrivalDateTime))
            return false;
        if (Double.compare(this.getPrice(), other.getPrice()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FlightBookingDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $customerFirstName = this.getCustomerFirstName();
        result = result * PRIME + ($customerFirstName == null ? 43 : $customerFirstName.hashCode());
        final Object $customerLastName = this.getCustomerLastName();
        result = result * PRIME + ($customerLastName == null ? 43 : $customerLastName.hashCode());
        final Object $customerIdNumber = this.getCustomerIdNumber();
        result = result * PRIME + ($customerIdNumber == null ? 43 : $customerIdNumber.hashCode());
        final Object $departureAirport = this.getDepartureAirport();
        result = result * PRIME + ($departureAirport == null ? 43 : $departureAirport.hashCode());
        final Object $departureDateTime = this.getDepartureDateTime();
        result = result * PRIME + ($departureDateTime == null ? 43 : $departureDateTime.hashCode());
        final Object $arrivalAirport = this.getArrivalAirport();
        result = result * PRIME + ($arrivalAirport == null ? 43 : $arrivalAirport.hashCode());
        final Object $arrivalDateTime = this.getArrivalDateTime();
        result = result * PRIME + ($arrivalDateTime == null ? 43 : $arrivalDateTime.hashCode());
        final long $price = Double.doubleToLongBits(this.getPrice());
        result = result * PRIME + (int) ($price >>> 32 ^ $price);
        return result;
    }

    public String toString() {
        return "FlightBookingDto(id=" + this.getId() + ", customerFirstName=" + this.getCustomerFirstName() + ", customerLastName=" + this.getCustomerLastName() + ", customerIdNumber=" + this.getCustomerIdNumber() + ", departureAirport=" + this.getDepartureAirport() + ", departureDateTime=" + this.getDepartureDateTime() + ", arrivalAirport=" + this.getArrivalAirport() + ", arrivalDateTime=" + this.getArrivalDateTime() + ", price=" + this.getPrice() + ")";
    }
}
