import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte month = scanner.nextByte();
        switch (month){
            case 2:
                System.out.println("Tháng "+month+"có 28, 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+month+ " tháng có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+month+ "tháng có 30 ngày");
                break;
            default:
                System.out.println("Không tồn tại tháng này");


        }

    }
}
