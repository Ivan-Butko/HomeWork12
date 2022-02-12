package com.companyhw12;

public class Box {
    private int length;
    private int width;
    private int height;
    private int volume;
    private String color;
    private String material;

    public Box() {
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(int length, int width, int height, String color) {
        this(length, width, height);
        this.color = color;
    }

    public Box(int length, int width, int height, String color, String material) {
        this(length, width, height, color);
        this.material = material;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Incorrect data entered.");
            System.exit(0);
        }
    }

    public int getLength() {

        return length;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Incorrect data entered.");
            System.exit(0);
        }
    }

    public int getWidth() {

        return width;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Incorrect data entered.");
            System.exit(0);
        }
    }

    public int getHeight() {

        return height;
    }

    public void setColor(String color) {
        if (!color.equals("")) {
            this.color = color;
        } else {
            System.out.println("Incorrect data entered.");
            System.exit(0);
        }
    }

    public String getColor() {

        return color;
    }

    public void setMaterial(String material) {
        if (!material.equals("")) {
            this.material = material;
        } else {
            System.out.println("Incorrect data entered.");
            System.exit(0);
        }
    }

    public String getMaterial() {

        return material;
    }

    public double getVolume() {

        return volume = length * width * height;
    }

    @Override
    public String toString() {
        return "length = " + length +
                " cm, width = " + width +
                "cm, height = " + height +
                "cm, volume = " + volume +
                " cbcm, color = " + color +
                ", material = " + material + ".";
    }
}
