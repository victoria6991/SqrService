import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int start = 200;
        int end = 300;
        int counter = service.countSquares(start, end);
        System.out.println(counter);
            }
}
