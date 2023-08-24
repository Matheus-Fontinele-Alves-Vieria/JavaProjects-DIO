import com.math.core.Bootcamp;
import com.math.entities.Course;
import com.math.entities.Instructor;
import com.math.entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course();
        course1.setTitle("Cálculo Diferencial e Integral");
        course1.setDescription("Conteúdos da disciplina de Cálculo.");
        course1.setWorkload(60);

        Course course2 = new Course();
        course2.setTitle("Java");
        course2.setDescription("Formação Java Developer.");
        course2.setWorkload(76);

        Instructor instructor1 = new Instructor("Padilha");
        instructor1.addContent(course1);

        Instructor instructor2 = new Instructor("Eduarda");
        instructor2.addContent(course1);

        Bootcamp bootcamp = new Bootcamp("Bootcamp de Cálculo");
        bootcamp.setDescription("Cálculo");
        bootcamp.addContent(course1);
        bootcamp.addInstructor(instructor1);
        bootcamp.addContent(course2);
        bootcamp.addInstructor(instructor2);

        Student matheus = new Student("Matheus");
        matheus.subscribeToBootcamp(bootcamp);
        System.out.println();
        System.out.println("// ------------------------------ //");
        System.out.println("Conteúdos inscritos por Matheus:" +
                            matheus.getSubscribeContents());
        matheus.progress();
        // matheus.progress();
        System.out.println("-");
        System.out.println("Conteúdos inscritos por Matheus:" +
                            matheus.getSubscribeContents());
        System.out.println("Conteúdos concluídos por Matheus:" +
                            matheus.getCompletedContents());
        System.out.println("XP:" + matheus.calculateTotalXP());
        System.out.println("// ------------------------------ //");
        System.out.println();

        Student camila = new Student("Camila");
        camila.subscribeToBootcamp(bootcamp);

        System.out.println(bootcamp.getFormattedInstructors());
    }
}
