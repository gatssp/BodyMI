public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(55, 1.67);

        System.out.println(bodyMassIndex);

    }
}
