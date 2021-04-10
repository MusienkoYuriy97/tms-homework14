package by.teachmeskills.entity;

import java.util.Queue;

public class HospitalRegistry {

    public void addPatient(Queue<Patient> patients){
            patients.add(new Patient());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
