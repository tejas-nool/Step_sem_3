package week6_assignment;

public class ExamHallTicket {
        String studentName;
        int seatNumber;

        ExamHallTicket(String studentName, int seatNumber) {
            this.studentName = studentName;
            this.seatNumber = seatNumber;
        }

        public static void main(String[] args) {

            ExamHallTicket priya = new ExamHallTicket("Priya", 0);

            ExamHallTicket copy = priya;

            copy.seatNumber = 45;

            ExamHallTicket separate =
                    new ExamHallTicket("Priya", 45);

            System.out.println(
                    "Priya's seatNumber (via first variable): "
                            + priya.seatNumber);

            System.out.println(
                    "copy == priya: " + (copy == priya));

            System.out.println(
                    "separate == priya: " + (separate == priya));
        }
    }

