package by.teachmeskills.entity;

import java.util.LinkedList;
import java.util.Queue;

public class Hospital implements Runnable{
    private HospitalRegistry hospitalRegistry = new HospitalRegistry();
    private volatile Queue<Patient> patientQueue = new LinkedList<>();
    private boolean isStart = true;

    public synchronized Queue<Patient> getPatientQueue() {
        return patientQueue;
    }

    @Override
    public void run(){
        while (patientQueue.size() < 10) {
            hospitalRegistry.addPatient(patientQueue);
            System.out.printf("Пришел пациент - %d больных в очереди %s\n",
                    patientQueue.size(),
                    patientQueue);
        }
        isStart = false;
    }

    public boolean isStart() {
        return isStart;
    }
}
