public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmiWholeNumber = service.calculateBmi(77, 170);
        System.out.println(bmiWholeNumber);

    }
}

