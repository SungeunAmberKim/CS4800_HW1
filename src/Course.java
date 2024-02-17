public class Course {
    private String courseName;
    private Instructor[] instructors = new Instructor[2];
    private Textbook[] textbooks = new Textbook[2];

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public void setTextbooks(Textbook[] textbooks) {
        this.textbooks = textbooks;
    }

    public void print(){
        System.out.println("Course Name: " + courseName);
        for (Instructor instructor : instructors) {
            System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        }
        for (Textbook textbook : textbooks) {
            System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
        }

    }
}
