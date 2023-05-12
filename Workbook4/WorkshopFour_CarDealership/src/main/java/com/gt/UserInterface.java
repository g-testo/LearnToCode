package com.gt;

// UserInterface will be responsible for all output to the screen, reading of
// user input, and "dispatching" of the commands to the Dealership as needed.
// (ex:  when the user selects "List all Vehicles", UserInterface would call the
// appropriate Dealership method and then display the vehicles it returns.)

public class UserInterface {
    private Dealership dealership;

    public UserInterface(){
        this.dealership = new Dealership("", "", "");
    }

    public void display(){

    }

    public void processGetVehiclesByPriceRequest() {

    }

    public void processGetVehiclesByMakeModelRequest() {

    }

    public void processGetVehiclesByYearRequest() {

    }

    public void processGetVehiclesByColorRequest() {

    }

    public void processGetVehiclesByMileageRequest() {

    }

    public void processGetVehiclesByTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {

    }

    public void processAddVehicleRequest(){

    }

    public void processRemoveVehicleRequest(){

    }
}
