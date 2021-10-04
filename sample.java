class HelloWorld {
  public  static void main (String[] arg) {
    
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
      System.out.prinntIn(x);
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
    
    
    
  }
}
