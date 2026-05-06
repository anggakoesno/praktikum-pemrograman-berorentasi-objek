package Pertemuan_9;

class JobType {
    String jobName;
}

class Person {
    String name;
    int age;
    JobType job;
}

public class NullPointerException {
    public static void main(String[] args) {
        Person p = new Person();
//        System.out.println(p.job.jobName);

        try {
            System.out.println(p.job.jobName);
        } catch (java.lang.NullPointerException e) {
            System.out.println("Object job belum diinisialisasi.");
        }
    }
}
