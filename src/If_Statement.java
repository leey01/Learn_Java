public class If_Statement {
    public static void main(String[] args) {
        int nilai = 75;
        String grade;
        if (nilai >= 70) {
            System.out.println("Lulus");
        }else{
            System.out.println("Tidak Lulus");
        }

        if (nilai >= 80) {
            grade = "A";
        } else if (nilai >= 70 && nilai < 80) {
            grade = "B";
        } else if (nilai >= 50 && nilai < 70) {
            grade = "C";
        } else {
            grade = "D";
        }

        switch (grade) {
            case "A":
                System.out.println("Grade A - LULUS");
                break;
            case "B":
                System.out.println("Grade B - LULUS");
                break;
            case "C":
                System.out.println("Grade C - TIDAK LULUS");
                break;
            default:
                System.out.println("Tidak Ikut Ujian");
                break;
        }
    }
}
