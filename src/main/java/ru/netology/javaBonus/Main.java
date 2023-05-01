public class Main {

    public static void main(String[] args) {

        RestScheme service = new RestScheme();

        int count = service.calculate(10_000, 3_000, 20_000);
        System.out.println("1. " + count + " раз(а) отдыхал за год");

        count = service.calculate(100_000, 60_000, 150_000);
        System.out.println("2. " + count + " раз(а) отдыхал за год");

    }
}