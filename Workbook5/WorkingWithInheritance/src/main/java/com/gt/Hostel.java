package com.gt;
// extends, super, @override
public class Hostel extends Hotel{
    private int peoplePerRoom;
    private float bedRate;
    public Hostel(int numberOfRooms){
        super(numberOfRooms);
    }

    public Hostel(int numberOfRooms, int peoplePerRoom, float bedRate) {
        super(numberOfRooms);
        this.peoplePerRoom = peoplePerRoom;
        this.bedRate = bedRate;
    }

    public int getPeoplePerRoom() {
        return peoplePerRoom;
    }

    public void setPeoplePerRoom(int peoplePerRoom) {
        this.peoplePerRoom = peoplePerRoom;
    }

    public float getBedRate() {
        return bedRate;
    }

    public void setBedRate(float bedRate) {
        this.bedRate = bedRate;
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "peoplePerRoom=" + peoplePerRoom +
                ", bedRate=" + bedRate +
                '}';
    }
}
