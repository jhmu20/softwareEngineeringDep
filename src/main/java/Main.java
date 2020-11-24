import java.util.*;
import java.time.*;

public class Main {

    public static void main(String args[]){
        Main main = new Main();

        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Student> students new ArrayList<Student>();

        Module SoftEngineering = new Module("Software Engineering", "CT404", new ArrayList<Student>(), new ArrayList<Module>());
        Module DataBaseSystems = new Module("Software Engineering", "CT404", new ArrayList<Student>(), new ArrayList<Module>());
        Module MachineLearning = new Module("Software Engineering", "CT404", new ArrayList<Student>(), new ArrayList<Module>());
        Module ArtificialIntelligence = new Module("Software Engineering", "CT404", new ArrayList<Student>(), new ArrayList<Module>());
        Module ImageProcessing = new Module("Software Engineering", "CT404", new ArrayList<Student>(), new ArrayList<Module>());

        Course BCT = new Course("BCT", new ArrayList<Student>(), new ArrayList<Module>(), new LocalDate())
        Course BCS = new Course("BCS", new ArrayList<Student>(), new ArrayList<Module>(), new LocalDate())

        courses.add(BCT);
        courses.add(BCS);

        Student Jarlath = new Student("Jarlath Healy", 21, 17419602, new ArrayList<Course>(), new ArrayList<Module>(), new LocalDate.(1999, 1, 23));
        Student Darren = new Student("Darren Lally", 21, 17419603, new ArrayList<Course>(), new ArrayList<Module>(), new LocalDate.(1999, 5, 14));
        Student Conor = new Student("Conor Kilbane", 21, 17419604, new ArrayList<Course>(), new ArrayList<Module>(), new LocalDate.(1999, 7, 17));


        Jarlath.addStudentToModule(Jarlath, SoftEngineering);
        Jarlath.addStudentToModule(Jarlath, DataBaseSystems);
        Jarlath.addStudentToModule(Jarlath, MachineLearning);
        Darren.addStudentToModule(Darren, ArtificialIntelligence);
        Darren.addStudentToModule(Darren, ImageProcessing);
        Darren.addStudentToModule(Darren, SoftEngineering);
        Conor.addStudentToModule(Conor, SoftEngineering);
        Conor.addStudentToModule(Conor, ImageProcessing);
        Conor.addStudentToModule(Conor, DataBaseSystems);

        SoftEngineering.addModuleToCourses(SoftEngineering, BCT);
        ImageProcessing.addModuleToCourses(ImageProcessing, BCT);
        MachineLearning.addModuleToCourses(MachineLearning, BCS);
        DataBaseSystems.addModuleToCourses(DataBaseSystems, BCS);
        ArtificialIntelligence.addModuleToCourses(ArtificialIntelligence, BCS);


        for (Course course : courses){
            System.out.println("Course: " + course.getName());

            System.out.println("Modules in the course: ");

            for(Module module : course.getModule()){
                System.out.println(module.getName());

                for(Student student : module.getStudents()){

                    if(students.contains(student) == false){
                        students.add(student);
                    }

                }


            }
        }










    }
}
