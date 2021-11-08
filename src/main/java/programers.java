

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
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        else
            answer = s.substring(s.length()/2, s.length()/2+1);

        return answer;
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

