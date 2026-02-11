class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}


class ForLoopCountDown {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

class evenNumber {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
}

class oddNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i += 2) {
          System.out.println(i); 
        }
    }
}


class evenNumbers2 {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 50) {
        System.out.println(i);
        i += 2; 
        }
    }
}

// Example 3: for loop with step 2
class ForLoopStep2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

// Example 3: for loop with step 2
class ForLoopStep3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
        } 
    }
}

// Example 8: do-while executes at least once
class DoWhile {
    public static void main(String[] args) {
        int i = 10;
        
        do {
            System.out.println("This prints once even though condition is false");
        } while (i <= 5);
    }
}

// Example 7: do-while loop
class DoWhileExample {
    public static void main(String[] args) {
        int i = 10;
        
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}