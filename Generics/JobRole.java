abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    T role;

    public Resume(T role) {
        this.role = role;
    }
}

class ResumeUtil {
    public static void process(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            System.out.println(r.getClass().getSimpleName());
        }
    }
}