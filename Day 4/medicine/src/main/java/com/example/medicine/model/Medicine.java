package com.example.medicine.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int medicineId;
    private String medicineName;
    private String medicineFor;
    private String medicineBrand;
    private String manufacturedIn;
    private double medicinePrice;
    private String expiryDate;
    public Medicine(){

    }
    public Medicine(int medicineId,String medicineName,String medicineFor,String medicineBrand,String manufacturedIn,double medicinePrice,String expiryDate){
        this.medicineId=medicineId;
        this.medicineName=medicineName;
        this.medicineFor=medicineFor;
        this.medicineBrand=medicineBrand;
        this.manufacturedIn=manufacturedIn;
        this.medicinePrice=medicinePrice;
        this.expiryDate=expiryDate;
    }
    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    public void setManufacturedIn(String manufacturedIn) {
        this.manufacturedIn = manufacturedIn;
    }
    public void setMedicineBrand(String medicineBrand) {
        this.medicineBrand = medicineBrand;
    }
    public void setMedicineFor(String medicineFor) {
        this.medicineFor = medicineFor;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public String getManufacturedIn() {
        return manufacturedIn;
    }
    public String getMedicineBrand() {
        return medicineBrand;
    }
    public String getMedicineFor() {
        return medicineFor;
    }
    public int getMedicineId() {
        return medicineId;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public double getMedicinePrice() {
        return medicinePrice;
  }
}