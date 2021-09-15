public class BmiService {
    public int calculateBmi(int weightKg, int heightCm) {

        int bmi = (weightKg * 10000) / (heightCm * heightCm);
        return bmi;

    }
}

