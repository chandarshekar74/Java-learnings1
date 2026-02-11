import java.util.Scanner;

class Array1DBasic {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Last element: " + numbers[4]);
    }
}

class Array1DPrint {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

class Array1DEnhanced {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

class Array1DSum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum: " + sum);
    }
}

class Array1DMax {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 40, 20};
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("Maximum: " + max);
    }
}


class Array1DMin {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 40, 20};
        int min = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.println("Minimum: " + min);
    }
}



class Array1DInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
        }
        
        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}


class Array1DSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Not found");
        }
    }
}
