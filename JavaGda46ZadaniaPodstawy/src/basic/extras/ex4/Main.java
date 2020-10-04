package basic.extras.ex4;

public class Main {

    public static void main(String[] args) {
        Email email = new Email.Builder()
                .receiver("sda")
                .title("new course")
                .bodyMsg("hello")
                .attachment("lesson.pdf")
                .build();
        System.out.println(email.toString());

        Email email2 = new Email.Builder()
                .receiver("sda")
                .build();
        System.out.println(email2.toString());
    }
}
