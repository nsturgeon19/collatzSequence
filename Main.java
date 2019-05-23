public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    int longestChainNum = 2;
    for (double collTarget = 3.0; collTarget < 1000000.0; collTarget++) {
      boolean isTwoPower = findIfTwoPower(collTarget);
      boolean isCollatzTwoPower = findIfCollatzTwoPower(collTarget);
      if (!isTwoPower&&!isCollatzTwoPower){
        System.out.println(collTarget);
      }
    }
    System.out.println("done");
  }

  public static boolean findIfTwoPower (double num) {
    for (double power = 2; power <= num; power *= 2){
      if (num/power == 1.0){
        return true;
      }
    }
    return false;
  }

  public static boolean findIfCollatzTwoPower (double num) {
    double collatzNum = (num*3)+1;
    return findIfTwoPower(num);
  }
}
