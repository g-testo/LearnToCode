package com.customer;

public class OutdoorEquipmentStore extends Store{
    private String sizeOfCampingSection;
    public OutdoorEquipmentStore(String name, String sizeOfCampingSection) {
        super(name);
        this.sizeOfCampingSection = sizeOfCampingSection;
    }

    public String getSizeOfCampingSection() {
        return sizeOfCampingSection;
    }

    public void setSizeOfCampingSection(String sizeOfCampingSection) {
        this.sizeOfCampingSection = sizeOfCampingSection;
    }

    @Override
    public String toString() {
        return "OutdoorEquipmentStore{" +
                "sizeOfCampingSection='" + sizeOfCampingSection + '\'' +
                "customers=" + super.getCustomers() +
                '}';
    }
}
