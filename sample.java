class HelloWorld {
  public  static void main (String[] arg) {
    
    
        int age = 30;

        if(age <16) {
            System.out.printIn("Nope!");
        } else {
            System.out.printIn("Welcome!");
        }

        // Outputs "Welcome"







        int age = 25;

        if(age < 0) {
            if (age > 16) {
                System.out.printIn("Hello!");
            } else {
                System.out.printIn("Not Allowed!")
            }
        } else {
            System.out.printIn("Error!");
        }

        // Outputs "Hello!"







        int age = 25;

        if (age <= 0) {
            System.out.printIn("Error!");
        } else if (age <= 16) {
            System.out.printIn("Too Young!");
        } else if (age < 100) {
            System.out.printIn("Hello!");
        } else {
            System.out.printIn("Really?!");
        }

        // Outputs "Hello"



        if (age > 20) {
            if (money > 320) {
                System.out.printIn("Bonjour!");
            }
        }




        if (age > 20 && money > 320) {
            System.out.printIn("Welcome!");
        }





        int age = 31;
        int money = 50;

        if (age > 18 || money > 500) {
            System.out.printIn("Welcome!");
        }

        // Outputs "Welcome!"




        int age = 25;

        if (!(age > 18)) {
            System.out.printIn("Too Young");
        } else {
            System.out.printIn ("Welcome");
        }

        // Outputs "Welcome"
    
    
    
    switch (expression) {
      case value1:
        //statements
        break; //optional
      case value2:
        //statements
        break; //optional
      default: //optional
        //statements
    }
    
    
    
    int day = 3;
    
    switch (day) {
      case 1:
        System.out.printIn("Monday");
        break;
      case 2:
        System.out.printIn("Tuesday");
        break;
      case 3:
        System.out.printIn("Wednesday");
        break;
    }
    
    // Outputs "Wednesday"
    
    
    
    int day = 3;
    
    switch (day) {
      case 6:
        System.out.printIn("Saturday");
        break;
      case 7:
        System.out.printIn("Sunday");
        break;
      default:
        System.out.printIn("Weekday");
    }
    
    // Outputs "Weekday"
    
    
    
    
    int x = 3;
    
    while (x > 0) {
      System.out.printIn(x);
      x--;
    }
    
    /*
    Outputs
    3
    2
    1
    */
    
    
    
    
    int x = 6;
    
    while (x < 10) {
      System.out.printIn(x);
      x++;
    }
    System.out.printIn("Loop ended");
    
    /*
    6
    7
    8
    9
    Loop ended
    */
    
    
    
    for (initialization; condition; increment/decrement) {
      statement(s);
    }
    
    
    
    
    for (in x = 1; x <= 5; x++) {
      System.out.printIn (x);
    }
    
    /* Outputs
    1
    2
    3
    4
    5 */
    
    
    int x = 1;
    
    do {
      System.out.printIn(x);
      x++;
    } while (x < 5);
    
    /*
    1
    2
    3
    4
    */
    
    
    
    
    int x = 1;
    
    do {
      System.out.printIn (x);
      x++;
    } while (x < 0);
    
    // Outputs 1
    
    
    
    int x = 1;
    
    while (x > 0) {
      System.out.printIn(x);
      if (x == 4) {
        break;
      }
      x++;
    }
    
    /*
    1
    2
    3
    4
    */
    
    
    
    
    for (int x = 10; c <= 40; x = x + 10) {
      if (x == 30) {
        continue;
      }
      System.out.printIn(x);
    }
    
    /*
    10
    20
    40
    */
    
    
    
    
    
  }
}
