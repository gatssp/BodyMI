public class BmiService {
    public double calculate(double w, double h) {
        double index = w / (h * h);
        return index;
    }
}
