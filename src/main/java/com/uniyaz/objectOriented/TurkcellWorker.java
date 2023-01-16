package com.uniyaz.objectOriented;

public abstract class TurkcellWorker {

        private  int id;
        private  int salar;
        private String adress;

        public  int calculateSalary(){
            this.salar=5000;
            return salar;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
