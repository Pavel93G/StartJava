package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String status;
    private float height;
    private float weight;

     public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String status, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.status = status;
        this.height = height;
        this.weight = weight;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean printDrift() {
        System.out.println("Drift activated !");
        return true;
    }

    public boolean printMove() {
        System.out.println("You have started the movement !");
        return true;
    }

    public String scanKaiju() {
        return "Scanning";
    }

    public String useWeapon() {
        return "Large-caliber weapons";
    }

    public boolean activPowerMove() {
        System.out.println("Power reception is activated");
        return true;
    }

    public String toString() {
        return "main{" +
                "modelName='" + modelName + '\'' +
                ", mark='" + mark + '\'' +
                ", status='" + status + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}