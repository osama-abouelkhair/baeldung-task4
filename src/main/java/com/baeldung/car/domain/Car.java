package com.baeldung.car.domain;

public class Car {

    public Car() {

    }

    public Car(Long id, String model, String isDiesel) {
        this.id = id;
        this.model = model;
        this.isDiesel = isDiesel;
    }

    private Long id;

    private String model;

    private String isDiesel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIsDiesel() {
        return isDiesel;
    }

    public void setIsDiesel(String isDiesel) {
        this.isDiesel = isDiesel;
    }
}
