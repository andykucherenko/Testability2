public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // метры
        double weight = 98;   // килограммы
        int index = (int) service.calculate(height, weight);

        System.out.println(index);
    }
}