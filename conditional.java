class IfExample {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult");
        }
    }
}

class IfElseExample {
    public static void main(String[] args) {
        int number = 7;
        
        if (number % 2 ==0) {
            System.out.println(number + "is even");
        }else {
            System.out.println(number + "is odd");
        }
    }
}

class GradeExample {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade: A");
        }else if (marks >= 80) {
            System.out.println("Grade: B");
        }else if (marks >= 70) {
            System.out.println("Grade: C");
        }else if (marks >= 60) {
            System.out.println("Grade: D");
        }else {
            System.out.println("Grade: F");
        }
    }
}

class NestedIfExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicense = true;
        
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive");
            } else {
                System.out.println("You need a license");
            }
        } else {
            System.out.println("You are too young to drive");
        }
    }
}


class LogicalOperatorsExample {
    public static void main(String[] args) {
        int age = 25;
        boolean hasTicket = true;
        
        // AND operator
        if (age >= 18 && hasTicket) {
            System.out.println("You can enter the movie");
        }
        
        // OR operator
        boolean isWeekend = true;
        boolean isHoliday = false;
        
        if (isWeekend || isHoliday) {
            System.out.println("You can relax!");
        }
        
        // NOT operator
        boolean isRaining = false;
        
        if (!isRaining) {
            System.out.println("You don't need an umbrella");
        }
    }
}


class SwitchDayExample {
    public static void main(String[] args) {
        int day = 3;
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}