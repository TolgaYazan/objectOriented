package com.uniyaz.objectOriented2;

public abstract class Transporter {

    private int price ;
    private  int id;

    public  abstract  void hareketeder();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}

