public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(57, 1.67);

        System.out.println(bodyMassIndex);

    }
}
