package by.teachmeskills;

import by.teachmeskills.entity.*;

public class MainHospital {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Doctor doctor1 = new Doctor("Andrey",DoctorLevel.HEAD_DOCTOR,hospital);
        Doctor doctor2 = new Doctor("John", DoctorLevel.DOCTOR, hospital);
        Doctor doctor3 = new Doctor("Zack", DoctorLevel.INTERN_DOCTOR, hospital);

        new Thread(hospital).start();
        new Thread(doctor1).start();
        new Thread(doctor2).start();
        new Thread(doctor3).start();
    }
}
