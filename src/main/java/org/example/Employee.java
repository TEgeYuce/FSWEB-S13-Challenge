package org.example;

public class Employee {

    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public long getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String[] getHealthPlans() {
        return this.healthPlans;
    }

    public Employee(long id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Hata, geçersiz index!");
            return;
        }

        if (healthPlans[index] == null) {
            healthPlans[index] = name;
            System.out.println("Healthplan eklemesi başarılı! -> " + name + " index " + index);
        } else {
            System.out.println("Hata, index zaten dolu! -> " + healthPlans[index]);
        }
    }
}
