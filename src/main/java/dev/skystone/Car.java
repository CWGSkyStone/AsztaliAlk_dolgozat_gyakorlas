package dev.skystone;

import java.time.LocalDate;

public class Car {
    private String licensePlate;
    private String brand;
    private Integer year;
    private String fuelType;
    private Integer price;
    private Boolean airConditioning;
    private LocalDate permitDate;


    public Car() {}
    public Car(String licensePlate, String brand, Integer year, String fuelType, Integer price, Boolean airConditioning,
            LocalDate permitDate) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.fuelType = fuelType;
        this.price = price;
        this.airConditioning = airConditioning;
        this.permitDate = permitDate;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Boolean getAirConditioning() {
        return airConditioning;
    }
    public void setAirConditioning(Boolean airConditioning) {
        this.airConditioning = airConditioning;
    }
    public LocalDate getPermitDate() {
        return permitDate;
    }
    public void setPermitDate(LocalDate permitDate) {
        this.permitDate = permitDate;
    }
    @Override
    public String toString() {
        return "Car [licensePlate=" + licensePlate + ", brand=" + brand + ", year=" + year + ", fuelType=" + fuelType
                + ", price=" + price + ", airConditioning=" + airConditioning + ", permitDate=" + permitDate + "]";
    }

        

}
