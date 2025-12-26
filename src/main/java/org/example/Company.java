package org.example;

public class Company {

    private long id ;
    private String name;
    private double giro;
    private String[] developerNames;

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getGiro() {
        return this.giro;
    }

    public String[] getDeveloperNames() {
        return this.developerNames;
    }

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        if (giro < 0) {
            giro = 0;
        } else {
            this.giro = giro;
        }
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Hata, geçersiz index!");
            return;
        }

        if (developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println("Çalışan eklemesi başarılı! -> " + name + " index " + index);
        } else {
            System.out.println("Hata, index zaten dolu! -> " + developerNames[index]);
        }
    }
}
