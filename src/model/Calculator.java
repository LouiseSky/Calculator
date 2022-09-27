package model;
import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Var god välj vilken operator du vill använda: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraktion");
            System.out.println("3. Division ");
            System.out.println("4. Multiplikation");
            System.out.println("5. Modulus");
            System.out.println("6. Större än");
            System.out.println("7. Mindre än");
            System.out.println("9. Avsluta programmet");

            int choiceOfOperator = input.nextInt();

            if (choiceOfOperator == 9) {
                System.out.println("Programmet avslutas");
                break;
            }
            if (choiceOfOperator == 1 || choiceOfOperator == 2 || choiceOfOperator == 4) {
                ArrayList<Integer> numbers = new ArrayList<>();
                System.out.println("Hur många siffror vill du använda i din uträkning?");
                int choice = input.nextInt();
                System.out.println("Skriv vilka heltal du vill räkna med.");

                for (int i = 1; i <= choice; i++) {
                    numbers.add(input.nextInt());
                }
                    if (choiceOfOperator == 1) {
                        System.out.println(Operator.addition(numbers));
                    } else if (choiceOfOperator == 2) {
                        System.out.println(Operator.subtract(numbers));
                    } else {
                        System.out.println(Operator.multiply(numbers));
                    }
                }

            if (choiceOfOperator == 3 || choiceOfOperator == 5 || choiceOfOperator == 6 || choiceOfOperator == 7) {
                System.out.println("Skriv vilka två heltal du vill räkna med.");
                int choiceOfNumberOne = input.nextInt();
                int choiceOfNumberTwo = input.nextInt();
                    if (choiceOfOperator == 3) {
                        System.out.println(Operator.division(choiceOfNumberOne,choiceOfNumberTwo));
                    } else if (choiceOfOperator == 5) {
                        System.out.println(Operator.modulus(choiceOfNumberOne, choiceOfNumberTwo));
                    } else if (choiceOfOperator == 6) {
                        Operator.biggerThan(choiceOfNumberOne, choiceOfNumberTwo);
                    } else {
                        Operator.smallerThan(choiceOfNumberOne, choiceOfNumberTwo);
                    }
                }
            else {
                System.out.println("Var god välj en siffra mellan 1-7 för att välja operator. " +
                            "Välj 9 för att avsluta programmet");
                }
            } while (true);
        }
    }



