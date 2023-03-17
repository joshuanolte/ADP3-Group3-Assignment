package za.ac.cput.domain;

public class ClassRoom {

    private String classNumber;
    private String classLocation;

    public ClassRoom(){

    }

    public ClassRoom(String classNumber, String classLocation) {
        this.classNumber = classNumber;
        this.classLocation = classLocation;
    }

    @Override
    public String toString() {
        return "classRoom{" +
                "classNumber='" + classNumber + '\'' +
                ", classLocation='" + classLocation + '\'' +
                '}';
    }
}
