package by.teachmeskills.entity;

public class Doctor implements Runnable {
    private String name;
    private DoctorLevel doctorLevel;
    private Hospital hospital;

    public Doctor(String name, DoctorLevel doctorLevel, Hospital hospital) {
        this.name = name;
        this.doctorLevel = doctorLevel;
        this.hospital = hospital;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true){
            //пауза на время лечения доктором
            System.out.printf("%s %s лечит пациента - %s\n",
                    doctorLevel.getDescription(),
                    name,
                    hospital.getPatientQueue().poll());

            try {
                Thread.sleep(doctorLevel.getTime()*1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!hospital.isStart() && hospital.getPatientQueue().peek() == null){
                System.out.printf("Доктор %s ушел домой\n",name);
                break;
            }


        }
    }
}
