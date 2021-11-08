
//하샤드 수
//class Solution {
//    public boolean solution(int x) {
//        int sum = 0;
//        char[] numbers = Integer.toString(x).toCharArray();
//        for(int i=0;i<numbers.length;i++)
//            sum+=numbers[i]-48;
//        return x%sum==0? true: false;
//    }
//
//    public static void main(String[] args) {
//        Solution Solution = new Solution();
//        int a = 15400;
//        System.out.println(Solution.solution(a));
//    }
//}
//다른 사람이 품
//import java.util.function.IntConsumer;
//
//public class HarshadNumber{
//    private int sum = 0;
//    public boolean isHarshad(int num){
//        sum = 0;
//        Integer.toString(num).chars().forEach(c -> sum += c - '0');
//        return num % sum == 0;
//    }
//
//    // 아래는 테스트로 출력해 보기 위한 코드입니다.
//    public static void  main(String[] args){
//        HarshadNumber sn = new HarshadNumber();
//        System.out.println(sn.isHarshad(18));
//    }
//}
//class Solution {
//    public boolean solution(int x) {
//        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
//        return x % sum == 0;
//    }
//}






//// 정수 내림차순으로 배치하기
//class Solution {
//    public long solution(long n) {
//        int count = 0;
//        long answer = 0;
//        long [] num = new long[11];
//        for (int i=0;n>0;i++){
//            num[i] = n%10;
//            n/=10;
//            count ++;
//        }
//        for(int i=0;i<count-1;i++){
//            long max = num[i];
//            for(int k=i;k<count;k++)
//                if(max < num[k]) {
//                    num[i] = num[k];
//                    num[k] = max;
//                    max = num[i];
//                }
//        }
//        for (int i=0;i<count;i++)
//            answer += (num[i]) * Math.pow(10, (count-i-1));
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution Solution = new Solution();
//        long a = 81258735L;
//        System.out.println(Solution.solution(a));
//    }
//}
// 다른 사람들이 품
//    public int reverseInt(int n){
//        char[] numbers = Integer.toString(n).toCharArray();
//        String strSort = "";
//
//        if(n <= 0) return 0;
//
//        for(int i = 0; i < numbers.length; i++) {
//            for(int j = 0; j < i; j++) {
//                if(numbers[i] - 48 > numbers[j] - 48) {
//                    char temp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//        }
//        strSort = new String(numbers);
//
//        return Integer.parseInt(strSort);
//    }

//public class ReverseInt {
//    String res = "";
//    public int reverseInt(int n){
//        res = "";
//        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
//        return Integer.parseInt(res);
//    }



//import java.util.Arrays;    // 프로그래머스 완주하지 못한 선수
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//       Arrays.sort(participant);Arrays.sort(completion);
//       int i;
//       for(i=0;i<completion.length;i++)
//           if(!participant[i].equals(completion[i]))
//               break;
//        System.out.printf(participant[0]+" "+ completion[0]);
//       return participant[i];
//    }
//
//    public static void main(String[] args) {
//        Solution Solution = new Solution();
//        String[] a = new String[] {"leo", "kiki", "eden"};
//        String[] b = new String[] {"eden", "kiki"};
//        System.out.println(Solution.solution(a,b));
//    }
//}
//  다른 사람이 품
//import java.util.HashMap;
//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
//    }
//}


// 프로그래머스 문자열 내 p와 y의 개수
// class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//        long p = s.chars().filter(c->c == 'p'|| c == 'P' ).count();
//        long y = s.chars().filter(c->c == 'y'|| c == 'Y' ).count();
//        answer = (p == y) ? true : false;
//        return answer;
//    }
//    /*
//    *boolean solution(String s) {
//        s = s.toUpperCase();
//
//        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
//    }
//    */
//
//
//    public static void main(String[] args) {
//        Solution Solution = new Solution();
//        String a = "PYy";
//        System.out.println(Solution.solution(a));
//    }
//}



//// 프로그래머스 부족한 금액 계산하기
//class Solution {
//    public long solution(int price, int money, int count) {
//        long answer = -1, sum = money;
//        for( int i = 1 ; i <= count ; i++)
//            sum -= price * i;
//        if (sum > 0)
//            return 0;
//        else
//            return answer *= sum;
//    }
//
//    /*  // 다른사람 풀이
//     public long solution(long price, long money, long count) {
//        return Math.max(price * (count * (count + 1) / 2) - money, 0);
//    }
//    */
//    public static void main(String[] args) {
//        Solution Solution = new Solution();
//        int price = 1, money = 1, count = 1;
//        System.out.println(Solution.solution(price, money, count));
//    }
//}




/*
// 프로그래머스 배열 평균 구하기
// 내가 한 풀이
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i=0;i < arr.length;i++)
            answer += arr[i];

        return answer/arr.length;
    }
}

                            // 다른 사람들의 풀이 stream활용
import java.util.Arrays;

public class GetMean {
    public int getMean(int[] array) {
        return (int) Arrays.stream(array).average().orElse(0);
    }
}


                            // stream 한줄 표현
public class GetMean {
    public int getMean(int[] array) {
        return java.util.stream.IntStream.of(array).sum() / array.length;
    }
}


                            // for each
public class GetMean {
    public int getMean(int[] array) {
      int sum=0;
          for(int value : array){
            sum = sum+value;
          }
              int mean = sum/array.length;
          return mean;
    }

*/




/*
// 프로그래머스 가운데 글자 가져오기
class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0)
            answer = s.substring(s.length()/2-1 , s.length()/2+1);
        else
            answer = s.substring(s.length()/2, s.length()/2+1);

        return answer;
    }

    public static void main(String[] args) {
        Solution Solution = new Solution();
        String a = "asdfg";
        System.out.println(Solution.solution(a));
    }
}
                        // 다른사람 풀이 .. 조건문 없이 한줄 풀이

class StringExercise{
    String getMiddle(String word){

        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
}
                        // 삼항 연산자
class StringExercise{
    String getMiddle(String word){

      return word != null ? word.substring((word.length()-1)/2,(word.length()+2)/2) : "";
    }
*/

