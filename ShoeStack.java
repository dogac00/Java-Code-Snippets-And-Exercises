
class Main {
  public static void main(String[] Args) {
    Solution s = new Solution();

    int x = s.solution("LR");

    System.out.print(x);
  }
}

class Solution {
    public int solution(String S) {
      ShoeStack s = new ShoeStack();

      for (int i = 0; i < S.length(); ++i) {
        s.addShoe(S.charAt(i));
      }

      return ShoeStack.getMatchCount();
    }
}

class ShoeStack {
  private int count;
  private static int matchCount;

  public ShoeStack() {
    count = 0;
  }

  public void addShoe(char ch) {
    if (ch == 'R') {
      count++;
    }
    else if (ch == 'L') {
      count--;
    }

    if (count == 0) {
      matchCount++;
    }
  }

  public static int getMatchCount() {
    return matchCount;
  }
}
