public class StudentProfile {
    String studentFirstName;
    String studentLastName;
    Integer expectedYearGraduate;
    double GPA;
    String declaredMajor;

    public StudentProfile (String studentFirstName,
                           String studentLastName,
                           Integer expectedYearGraduate,
                           double GPA,
                           String declaredMajor) {

        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.expectedYearGraduate = expectedYearGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

   public void incrementGradYear(){
       //this.expectedYearGraduate += 1;
       this.expectedYearGraduate ++;

   }

}
