//class Solution {
//    public int solution(int n, int[] lost, int[] reserve) {
//        int answer = 0;
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.solution());
//    }
//}
// 항해 99 코딩테스트
class Solution {
    static String solution(int number) {
        String answer = "";
        int sum = 0;
        char[] num = Integer.toString(number).toCharArray();    // 받은 number를 char[] 로 치환

        for (int i = num.length - 1; i >= 0; i--) {             // answer에 맨 뒤의 원소와 + 를 함께 더함
            answer += num[i] + "+";
            sum += num[i] - '0';                                // char를 연산식에 넣으면 아스키 코드값으로 변하기 때문에 '0'만큼의 아스키 코드 값을 빼준다
        }

        answer = answer.substring(0, answer.length() - 1) + "=" + sum;      // 마지막에 위치하게된 +를 제거하고 =과 결과값 sum을 더한다. String + int를 하면 int가 자동으로 String으로 바뀐다.

        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(718253));
    }
}



// 포켓몬 문제
//import java.util.*;
//
//class Solution {
//    public int solution(int[] nums) {
//        int answer = 0;
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(nums[0]);
//        for (int i = 0; i < nums.length; i++)
//            if (!list.contains(nums[i]))
//                list.add(nums[i]);
//
//        answer = list.size() < nums.length/2 ? list.size() : nums.length/2;
//        return answer;
//    }
// 내가 했는데 틀림 왜지?
//    public int solution(int[] nums) {
//        int answer = 0;
//        int[] temp = nums;
//        temp = set(nums);
//        answer = nums.length/2 > temp.length ? temp.length : nums.length/2;
//        return answer;
//    }
//    public int[] set(int[] arr) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int current = 10;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != current) {
//                list.add(arr[i]);
//                current = arr[i];
//            }
//        }
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < list.size(); i++)
//            answer[i] = list.get(i);
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] a = {3, 1, 2, 3}, b = {31, 10, 45, 1, 6, 19};
//        String ab = "onetwothree";
//        String[] list = {"sun", "bed", "car"};
//        int[][] aa = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        System.out.println(solution.solution(a));
//    }
//}


// 최대 공약수와 최대 공배수
//import java.util.*;
//class Solution {
//    public static int[] solution(int n, int m) {
//        int[] answer = new int[2];
//        int temp = n;
//        if (n > m) {
//            n = m;
//            m = temp;
//        }
//        if (m % n == 0) answer[0] = n;
//        else {
//            for (int i = n / 2 + 1; i > 0; i -= 1) {
//                if (n % i == 0) {
//                    temp = i;
//                    if (m % temp == 0) {
//                        answer[0] = temp;
//                        break;
//                    }
//                }
//            }
//        }
//        for (int i = 1; ; i++) {
//            if ((m * i) % n == 0) {
//                answer[1] = (m * i);
//                break;
//            }
//        }
//        System.out.println(answer[0] + " " + answer[1]);
//        return answer;
//    }
//    // 다른사람 풀이
//    import java.util.Arrays;
//
//    class TryHelloWorld {
//        public int[] gcdlcm(int a, int b) {
//            int[] answer = new int[2];
//
//            answer[0] = gcd(a,b);
//            answer[1] = (a*b)/answer[0];
//            return answer;
//        }
//
//        public static int gcd(int p, int q)
//        {
//            if (q == 0) return p;
//            return gcd(q, p%q);
//        }
//    }
//}

// K번째 수
//import java.util.*;
//import java.util.Collections;
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];        // commands의 index개수만큼 답안 생성 되는 것이므로 answer크기 == commands의 크기
//        for (int i = 0; i < commands.length; i++) {
//            ArrayList<Integer> temp = new ArrayList<>();
//            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {       // 조건 1
//                temp.add(array[j]);
//            }
//            Collections.sort(temp);                                         // 조건 2
//            answer[i] = temp.get(commands[i][2]-1);                         // 조건 3
//        }
//        return answer;
//    }
//    import java.util.Arrays;
//    class Solution {
//        public int[] solution(int[] array, int[][] commands) {
//            int[] answer = new int[commands.length];
//
//            for(int i=0; i<commands.length; i++){
//                int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
//                Arrays.sort(temp);
//                answer[i] = temp[commands[i][2]-1];
//            }
//
//            return answer;
//        }
//    }
//}

// 신규 아이디 추천
//class Solution {
//    public String solution(String new_id) {
//        String answer;
//
//        // 1단계
//        String step1 = new_id.toLowerCase();
//
//        // 2단계
//        char[] step1_arr = step1.toCharArray();
//        StringBuilder step2 = new StringBuilder();
//        for (char c : step1_arr) {
//            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
//                step2.append(c);
//            }
//        }
//
//        // 3단계
//        String step3 = step2.toString().replace("..", ".");
//        while (step3.contains("..")) {
//            step3 = step3.replace("..", ".");
//        }
//
//        // 4단계
//        String step4 = step3;
//        if (step4.length() > 0) {
//            if (step4.charAt(0) == '.') {
//                step4 = step4.substring(1, step4.length());
//            }
//        }
//        if (step4.length() > 0) {
//            if (step4.charAt(step4.length() - 1) == '.') {
//                step4 = step4.substring(0, step4.length() - 1);
//            }
//        }
//
//        // 5단계
//        String step5 = step4;
//        if (step5.equals("")) {
//            step5 = "a";
//        }
//
//        // 6단계
//        String step6 = step5;
//        if (step6.length() >= 16) {
//            step6 = step6.substring(0, 15);
//
//            if (step6.charAt(step6.length() - 1) == '.') {
//                step6 = step6.substring(0, step6.length() - 1);
//            }
//        }
//
//        // 7단계
//        StringBuilder step7 = new StringBuilder(step6);
//        if (step7.length() <= 2) {
//            char last = step7.charAt(step7.length() - 1);
//
//            while (step7.length() < 3) {
//                step7.append(last);
//            }
//        }
//
//        answer = String.valueOf(step7);
//        return answer;
//    }
// 정규식 표현
//    public String solution(String new_id) {
//        String answer = new_id.toLowerCase(); // 1단계
//
//        answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 2단계
//        answer = answer.replaceAll("[.]{2,}", "."); // 3단계
//        answer = answer.replaceAll("^[.]|[.]$", "");    // 4단계
//
//        if (answer.equals("")) {    // 5단계
//            answer += "a";
//        }
//
//        if (answer.length() >= 16) {     // 6단계
//            answer = answer.substring(0, 15);
//            answer = answer.replaceAll("[.]$","");
//        }
//
//        if (answer.length() <= 2) {  // 7단계
//            while (answer.length() < 3) {
//                answer += answer.charAt(answer.length()-1);
//            }
//        }
//
//        return answer;
//    }
//}

//import java.util.*;
//class Solution {
//    public  int solution(int[] arr){
//        int answer = 0;
//        for(int i = 0 ; i < arr.length-2; i++){
//            for(int j = i+1 ; j<arr.length-1; j++){
//                for(int k = j+1; k < arr.length;k++){
//                    if(isPrime(arr[i]+arr[j]+arr[k])) {
//                        answer += 1;
//                    }
//                }
//            }
//        }
//        return answer;
//    }
//
//    public boolean isPrime(int prime){
//        for(int i = 2 ; i < prime/2+1; i++)
//            if(prime % i==0)
//                return false;
//        return true;
//    }
//    // 다른사람이 짠 소수 판별 함수
//    public Boolean isPrime(int num){
//        int cnt = 0;
//        for(int i = 1; i <= (int)Math.sqrt(num); i ++){
//            if(num % i == 0) cnt += 1;
//        }
//        return cnt == 1;
//    }
//}

// 모의고사
//import java.util.*;
//class Solution {
//    public int[] solution(int[] answers) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int[] first = {1, 2, 3, 4, 5};
//        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};       // 규칙들을 배열에 담는다
//        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//        int[] scores = {0, 0, 0};                 // 세명의 점수를 담을 배열이다
//
//        for (int i = 0; i < answers.length; i++) {
//            if (first[i % 5] == answers[i]) {
//                scores[0]++;
//            }
//            if (second[i % 8] == answers[i]) {
//                scores[1]++;
//            }      // 해당 규칙과 일치하면 점수를 증가시키다
//            if (third[i % 10] == answers[i]) {
//                scores[2]++;
//            }
//        }
//
//        int[] arr = new int[scores.length];
//        for (int i = 0; i < scores.length; i++) {
//            arr[i] = scores[i];                     // 배열을 하나 복제하고
//        }
//        Arrays.sort(arr);                           // 정렬한다.(오름차순으로 정렬되었기에 마지막에 있는 사람이 1등)
//
//        for (int i = 0; i < arr.length; i++) {         // 마지막에 있는 점수와 일치하면 그 점수가 있는 배열의 index값을 list에 대입한다
//            if (scores[i] == arr[2]) {
//                list.add(i + 1);
//            }
//        }
//
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {           // list배열을 int[] 배열로 바꿔 담는다.
//            answer[i] = list.get(i);
//        }
//
//        return answer;
//
//    }
//
//    // 다른사람 풀이
//    import java.util.*;
//
//    class Solution {
//        public static int[] solution(int[] answers) {
//            int[][] patterns = {
//                    {1, 2, 3, 4, 5},
//                    {2, 1, 2, 3, 2, 4, 2, 5},
//                    {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
//            };
//
//            int[] hit = new int[3];
//            for(int i = 0; i < hit.length; i++) {
//                for(int j = 0; j < answers.length; j++) {
//                    if(patterns[i][j % patterns[i].length] == answers[j]) hit[i]++;
//                }
//            }
//
//            int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
//            List<Integer> list = new ArrayList<>();
//            for(int i = 0; i < hit.length; i++)
//                if(max == hit[i]) list.add(i + 1);
//
//            int[] answer = new int[list.size()];
//            int cnt = 0;
//            for(int num : list)
//                answer[cnt++] = num;
//            return answer;
//        }
//    }
//}
//// 문자열 내 마음대로 정렬하기
//import java.util.*;
//class Solution {
//    public String[] solution(String[] strings, int n) {
//        String[] answer = {};
//        ArrayList<String> list = new ArrayList<>();   // 동적 배열 list 선언
//
//        for (int i = 0; i < strings.length; i++)
//            list.add(strings[i].charAt(n) + strings[i]);  // 특정 index n번째의 문자열을 맨 앞으로 가져옴
//
//        Collections.sort(list);                           // 새롭게 만든 list 정렬
//
//        answer = new String[list.size()];
//
//        for (int i = 0; i < list.size(); i++)
//            answer[i] = list.get(i).substring(1, list.get(i).length()); // 문자열 맨 앞으로 가져왔던 문자를 제외한 문자열열를 answer에 대입
//
//        return answer;
//    }
//}
//    // 다른사람 풀이
//    import java.util.Arrays;
//    import java.util.Comparator;
//
//    class Solution {
//        public String[] solution(String[] strings, int n) {
//            Arrays.sort(strings);
//            Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
//            return strings;
//        }
//    }
//}

// 숫자 문자열과 영단어
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        s = s.replace("zero", "0");
//        s = s.replace("one", "1");
//        s = s.replace("two", "2");
//        s = s.replace("three", "3");
//        s = s.replace("four", "4");
//        s = s.replace("five", "5");
//        s = s.replace("six", "6");
//        s = s.replace("seven", "7");
//        s = s.replace("eight", "8");
//        s = s.replace("nine", "9");
//        System.out.println(Integer.parseInt(s));
//        answer = Integer.parseInt(s);
//        return answer;
//    }
//    // 다른사람 풀이
//    public int solution(String s) {
//        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        for(int i = 0; i < strArr.length; i++) {
//            s = s.replaceAll(strArr[i], Integer.toString(i));
//        }
//        return Integer.parseInt(s);
//    }
//
//}


//// 내림차수으로 배치하기
//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        char list[] = s.toCharArray();        // 문자열 s를 char[]로 나눠준다
//        for(int i = 0 ; i < list.length-1; i++){
//            char max = list[i];               // max에 큰 값이 들어가야할 list[i]를 할당 받는다
//            for(int j = i+1 ; j < list.length;j++){
//                if(max<list[j]){              // max보다 list[j]의 값이 더 크면 list[j] 와 list[i]의 값을 교환한다
//                    max=list[j];
//                    list[j] = list[i];
//                    list[i] = max;
//                }
//            }
//        }
//        for(int i = 0 ; i<list.length;i++)    // 내림차순으로 정렬한 list를 answer에 하나씩 더해서 넣는다
//            answer += list[i];
//        return answer;
//    }
//}
//    // 다른사람 풀이
//    import java.util.Arrays;
//
//    public class ReverseStr {
//        public String reverseStr(String str){
//            char[] sol = str.toCharArray();
//            Arrays.sort(sol);
//            return new StringBuilder(new String(sol)).reverse().toString();
//        }
//    // 다른사람 풀이 2
//    import java.util.stream.Stream;
//    import java.util.stream.Collectors;
//    import java.util.Comparator;
//
//    public class ReverseStr {
//        public String reverseStr(String str){
//            return Stream.of(str.split(""))
//                    .sorted(Comparator.reverseOrder())
//                    .collect(Collectors.joining());
//        }
//    public static void main(String[] args) {
//        Solution Solution = new Solution();
//        int[] a = {2, 1, 3, 4, 1}, b = {31, 10, 45, 1, 6, 19};
//        String ab = "bcZefg";
//        int[][] aa = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
//        System.out.println(Solution.solution(ab));
//    }
//}

//// 두 개 뽑아서 더하기
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.*;
//class Solution {
//    public int[] solution(int[] numbers) {
//        ArrayList<Integer>list = new ArrayList<>();
//        Arrays.sort(numbers);
//        for(int i =0 ; i < numbers.length -1 ;i++)
//            for (int j = i + 1; j < numbers.length; j++)
//                list.add(numbers[j] + numbers[i]);
//        Collections.sort(list);
//        int[] answer = list.stream().mapToInt(i->i).toArray();
//        return set(answer);
//    }
//    public int[] set(int[] arr){
//        int[] answer ;
//            int count = 1;
//            for(int i=1; i<arr.length; i++){
//                if(arr[i-1] != arr[i])
//                    count++;
//            }
//            answer = new int[count];
//            count=1;
//            answer[0] = arr[0];
//            for(int i=1; i<arr.length; i++){
//                if(arr[i-1] != arr[i]){
//                    answer[count] = arr[i];
//                    count++;
//                }
//            }
//            return answer;
//    }
//    // 다른사람 풀이
//    import java.util.Iterator;
//    import java.util.Set;
//    import java.util.TreeSet;
//
//    class Solution {
//        public int[] solution(int[] numbers) {
//            Set<Integer> sumNumber = new TreeSet();
//
//            for(int i = 0; i < numbers.length-1; i++){
//                for(int j = i+1; j < numbers.length; j++){
//                    sumNumber.add(numbers[i] + numbers[j]);
//                }
//            }
//
//            int[] answer = new int[sumNumber.size()];
//            int index = 0;
//            Iterator itor = sumNumber.iterator();
//            while(itor.hasNext()){
//                answer[index] = (int)itor.next();
//                index++;
//            }
//
//            return answer;
//        }
//    }
//
//}

//// 같은 숫자는 싫어
//import java.util.*;
//class Solution {
//    public int[] solution(int[] arr) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int current = 10;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != current) {
//                list.add(arr[i]);
//                current = arr[i];
//            }
//        }
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < list.size(); i++)
//            answer[i] = list.get(i);
//        return answer;
//    }
//    // 다른 사람 풀이
//    public class Solution {
//        public int[] solution(int []arr) {
//            int[] answer ;
//            int count = 1;
//            for(int i=1; i<arr.length; i++){
//                if(arr[i-1] != arr[i])
//                    count++;
//            }
//            answer = new int[count];
//            count=1;
//            answer[0] = arr[0];
//            for(int i=1; i<arr.length; i++){
//                if(arr[i-1] != arr[i]){
//                    answer[count] = arr[i];
//                    count++;
//                }
//            }
//            return answer;
//        }
//    }
//}


//// 진법 뒤집기
//class Solution {
//    public int solution(int n) {
//        int answer = 0, count = 0;
//        int[] th = new int[100];
//        for (int i = 0; n > 0; i++) {
//            th[i] = n % 3;
//            n = (n - th[i]) / 3;
//            count+=1;
//        }
//        for (int i = count; i > 0; i--)
//            answer += th[i-1]*Math.pow(3,count-i);
//        return answer;
//    }
//
//    // 다른사람 풀이
//    public int solution(int n) {
//        String a = "";
//        while(n > 0){
//            a =a+ (n % 3);
//            n /= 3;
//        }
//        return Integer.parseInt(a,3);
//    }
//}
//
//// 시저 암호
//class Solution {
//    public String solution(String s, int n) {
//        String answer ="";
//        char[] word = s.toCharArray();
//        for( char wd : word){
//            if((96<wd && wd<123) && wd+n>'z') {
//                answer += (char) ('a' + wd + n - 123);
//                continue;
//            }
//            if((64<wd &&wd<91 )&& wd+n>90) {
//                answer += (char) ('A' + wd + n - 91);
//                continue;
//            }
//            if(wd == ' ')
//                answer += " ";
//            else
//                answer += (char) (wd + n);
//
//        }
//        return answer;
//    }
//    //다른 사람 풀이
//    String caesar(String s, int n) {
//        String result = "";
//        n = n % 26;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (Character.isLowerCase(ch)) {
//                ch = (char) ((ch - 'a' + n) % 26 + 'a');
//            } else if (Character.isUpperCase(ch)) {
//                ch = (char) ((ch - 'A' + n) % 26 + 'A');
//            }
//            result += ch;
//        }
//        return result;
//    }
//
//}

// 로또의 최고 순위와 최저 순위
//class Solution {
//    public int[] solution(int[] lottos, int[] win_nums) {
//        int[] answer = {};
//        int count = 0, zero = 0;
//        for (int i = 0; i < lottos.length; i++) {
//            if (lottos[i] == 0) {       // 0이 있으면 맞은걸로 처리,  0의 개수 카운트
//                count += 1;
//                zero += 1;
//            } else {
//                for (int j = 0; j < lottos.length; j++)
//                    if (lottos[i] == win_nums[j])       // 숫자가 일치하면 갯수 ++
//                        count += 1;
//            }
//
//        }
//        zero = count - zero;                        // 0이 다 틀렸을때를 체크
//        answer = new int[]{count, zero};
//        for (int i = 0; answer.length > i; i++) {       // 등수 책정
//            if (answer[i] == 6) answer[i] = 1;
//            else if (answer[i] == 5) answer[i] = 2;
//            else if (answer[i] == 4) answer[i] = 3;
//            else if (answer[i] == 3) answer[i] = 4;
//            else if (answer[i] == 2) answer[i] = 5;
//            else answer[i] = 6;
//        }
//        return answer;
//    }
//    // 다른 사람 풀이
//    import java.util.HashMap;
//    import java.util.Map;
//    public int[] solution(int[] lottos, int[] win_nums) {
//        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
//        int zeroCount = 0;
//
//        for (int lotto : lottos) {
//            if (lotto == 0) {
//                zeroCount++;
//                continue;
//            }
//            map.put(lotto, true);
//        }
//
//
//        int sameCount = 0;
//        for (int winNum : win_nums) {
//            if (map.containsKey(winNum)) sameCount++;
//        }
//
//        int maxRank = 7 - (sameCount + zeroCount);
//        int minRank = 7 - sameCount;
//        if (maxRank > 6) maxRank = 6;
//        if (minRank > 6) minRank = 6;
//
//        return new int[]{maxRank, minRank};
//    }
//    // 다른사람 풀이 2
//    public int[] solution(int[] lottos, int[] win_nums) {
//        int zero = 0;
//        int matched = 0;
//        for (int l : lottos) {
//            if (l == 0) {
//                zero++;
//            } else {
//                for (int w : win_nums) {
//                    if (l == w) {
//                        matched++;
//                        break;
//                    }
//                }
//            }
//        }
//        int min = matched;
//        int max = matched + zero;
//        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
//        return answer;
//    }
//
//}

//// 최소직사각형
//class Solution {
//    public int solution(int[][] sizes) {
//        int  temp = 0;
//        for(int i =0 ; i<sizes.length;i++){
//            if(sizes[i][0]<sizes[i][1]){
//                temp = sizes[i][0];
//                sizes[i][0] = sizes[i][1];
//                sizes[i][1] = temp;
//            }
//        }
//        int r_num = sizes[0][0], c_num = sizes[0][1];
//        for(int i =0;i<sizes.length;i++){
//            if(r_num < sizes[i][0])
//                r_num = sizes[i][0];
//            if(c_num < sizes[i][1])
//                c_num = sizes[i][1];
//        }
//        return r_num*c_num;
//    }
//    // 다른사람 풀이
//    public int solution(int[][] sizes) {
//        return Arrays.stream(sizes).reduce((a, b) -> new int[]{
//                Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
//        }).map(it -> it[0] * it[1]).get();
//    } //다른사람 풀이 2
//    public int solution(int[][] sizes) {
//        int length = 0, height = 0;
//        for (int[] card : sizes) {
//            length = Math.max(length, Math.max(card[0], card[1]));
//            height = Math.max(height, Math.min(card[0], card[1]));
//        }
//        int answer = length * height;
//        return answer;
//    }
//}

//// 콜라츠 추측
//class Solution {
//    public long solution(long num) {
//        for(int count = 0 ; ;count++) {
//            if(num == 1)
//                return count;
//            if (num % 2 == 0)
//                num = num / 2;
//            else
//                num = num * 3 + 1;
//            if(count >= 500)
//                break;
//        }
//
//        return -1;
//    }
//    // 다른 사람 풀이
//    public int collatz(int num) {
//        long n = (long)num;
//        for(int i =0; i<500; i++){
//            if(n==1) return i;
//            n = (n%2==0) ? n/2 : n*3+1;
//        }
//        return -1;
//    }
//
//}

//// 제일작은 수 하나 제거하기
//class Solution {
//    public int[] solution(int[] arr) {
//        if (arr.length == 1) {
//            int[] answer = {-1};
//            return answer;
//        } else {
//            int[] answer = new int[arr.length - 1];
//            int temp = arr[0];
//            for (int i = 0; i < arr.length; i++)
//                if (temp > arr[i])
//                    temp = arr[i];
//            for (int i = 0, j = 0; i < arr.length; i++) {
//                if (temp == arr[i])
//                    continue;
//                answer[j] = arr[i];
//                j++;
//            }
//            return answer;
//        }
//    }
////    //다른사람 코드
////    import java.util.Arrays;
////    import java.util.stream.Stream;
////    import java.util.List;
////    import java.util.ArrayList;
////
////    class Solution {
////        public int[] solution(int[] arr) {
////            if (arr.length <= 1) return new int[]{-1};
////            int min = Arrays.stream(arr).min().getAsInt();
////            return Arrays.stream(arr).filter(i -> i != min).toArray();
////        }
////    }
//}


// 제곱근 판별
//import static java.lang.Math.*;
//class Solution {
//    public long solution(long n) {
//        long sq = (long)sqrt(n);
//        return (long)pow(sq, 2) == n? (long)pow(sq+1,2): -1;
//    }
//    // 다른사람이 짠 코드
////    class Solution {
////        public long solution(long num) {
////            double sqrt = Math.sqrt(num);
////            return (long) ((sqrt % 1) == 0 ? (sqrt + 1) * (sqrt + 1) : -1);
////        }
////    }
//}

/**
 * //// 자연수 뒤집어 배열로 만들기
 * //import java.util.stream.Stream;
 * //class Solution {
 * //    public int[] solution(long n) {
 * //        int[] answer = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
 * //        for( int i =0;i<answer.length/2;i++){
 * //            int temp = answer[i];
 * //            answer[i]=answer[answer.length-i -1];
 * //            answer[answer.length-i-1]=temp;
 * //        }
 * //        return answer;
 * //    }
 * // 다른 사람 풀이
 * //class Solution {
 * //  public int[] solution(long n) {
 * //      String a = "" + n;
 * //        int[] answer = new int[a.length()];
 * //        int cnt=0;
 * //
 * //        while(n>0) {
 * //            answer[cnt]=(int)(n%10);
 * //            n/=10;
 * //            System.out.println(n);
 * //            cnt++;
 * //        }
 * //      return answer;
 * //  }
 * //}
 * //class Solution {
 * //    public int[] solution(long n) {
 * //        String s = String.valueOf(n);
 * //        StringBuilder sb = new StringBuilder(s);
 * //        sb = sb.reverse();
 * //        String[] ss = sb.toString().split("");
 * //
 * //        int[] answer = new int[ss.length];
 * //        for (int i=0; i<ss.length; i++) {
 * //            answer[i] = Integer.parseInt(ss[i]);
 * //        }
 * //        return answer;
 * //    }
 * }
 * //}
 * <p>
 * <p>
 * // 자릿수 더하기
 * //class Solution {
 * //    public int solution(int n) {
 * //        int answer = 0;
 * //        for (int i = 0; n > 0; i++) {
 * //            answer += n%10;
 * //            n = n/10;
 * //        }
 * //        return answer;
 * //    }
 * //}
 * //// 이상한 문자 만들기
 * //class Solution {
 * //    public String solution(String s) {
 * //        char[] words = s.toCharArray();
 * //        String answer = "";
 * //        int num = 0;
 * //        for (int i = 0; i < words.length; i++) {
 * //            if (words[i] != ' ') {
 * //                if (num % 2 == 0) {
 * //                    if(words[i] >96 ) words[i]= (char)(words[i]-32);
 * //                    else;
 * //                    System.out.println(words[i]);
 * //                    answer+= words[i];
 * //                } else {
 * //                    if(words[i] < 97 )words[i]+=32;
 * //                    else ;
 * //                    answer+= words[i];
 * //                }
 * //                num++;
 * //            } else {
 * //                answer+=words[i];
 * //                num = 0;
 * //            }
 * //        }
 * //        System.out.println();
 * //        return answer;
 * //    }
 * //
 * //}
 * //// 다른 사람 풀이
 * //class Solution {
 * //    public String solution(String s) {
 * //
 * //        String answer = "";
 * //        int cnt = 0;
 * //        String[] array = s.split("");
 * //
 * //        for(String ss : array) {
 * //            cnt = ss.contains(" ") ? 0 : cnt + 1;
 * //            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
 * //        }
 * //        return answer;
 * //    }
 * //}
 * //class Solution {
 * //    public String solution(String s) {
 * //        char[] chars = s.toCharArray();
 * //        int idx = 0;
 * //
 * //        for (int i = 0; i < chars.length; i++) {
 * //            if (chars[i] == ' ')
 * //                idx = 0;
 * //            else
 * //                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
 * //        }
 * //
 * //        return String.valueOf(chars);
 * //    }
 * //}
 * <p>
 * ////문자열 다루기 기본
 * //class Solution {
 * //    public boolean solution(String s) {
 * //        if( s.length() == 4 ||s.length() == 6){
 * //            long p = s.chars().filter(c->c >= '0'&& c <= '9' ).count();
 * //            return p==s.length();
 * //        }
 * //        else
 * //            return false;
 * //    }
 * //}
 * //// 다른사람 풀이
 * //class Solution {
 * //    public boolean solution(String s) {
 * //        if(s.length() == 4 || s.length() == 6){
 * //            try{
 * //                int x = Integer.parseInt(s);
 * //                return true;
 * //            } catch(NumberFormatException e){
 * //                return false;
 * //            }
 * //        }
 * //        else return false;
 * //    }
 * //}
 * //import java.util.*;
 * //
 * //class Solution {
 * //    public boolean solution(String s) {
 * //        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
 * //        return false;
 * //    }
 * //}
 * <p>
 * <p>
 * // 내적
 * //class Solution {
 * //    public int solution(int[] a, int[] b) {
 * //        int answer = 0;
 * //        for(int i = 0;i<a.length;i++){
 * //            answer += a[i] * b[i];
 * //        }
 * //        return answer;
 * //    }
 * //}
 * <p>
 * <p>
 * //// 수박수박수박수박?
 * //class Solution {
 * //    public String solution(int n) {
 * //        String answer = "";
 * //        for(int i = 0 ; i < n ; i++){
 * //            if(i%2==0){
 * //                answer +="수";
 * //            }
 * //            else
 * //                answer += "박";
 * //        }
 * //        return answer;
 * //    }
 * //}
 * //// 다른사람 풀이
 * //public class WaterMelon {
 * //    public String watermelon(int n){
 * //
 * //        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
 * //    }
 * <p>
 * <p>
 * //  나누어 떨어지는 숫자 배열
 * //import java.util.*;
 * //import java.util.Arrays;
 * //class Solution {
 * //    public int[] solution(int[] arr, int divisor) {
 * //       int[] answer = Arrays.stream(arr).sorted().filter(element -> element% divisor==0).toArray();
 * //       if(answer.length==0) return new int[]{-1};
 * //       else return answer;
 * //    }
 * //}
 * <p>
 * //// 2016년
 * //class Solution {
 * //    public String solution(int a, int b) {
 * //        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
 * //        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
 * //        int sum =b -1;
 * //        for(int i=0;i<a-1;i++)
 * //            sum+=month[i];
 * //        String answer = day[sum%7];
 * //        return answer;
 * //    }
 * //}
 * //
 * //import java.time.*;
 * //class Solution {
 * //    public String solution(int a, int b) {
 * //        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
 * //    }
 * //}
 * <p>
 * <p>
 * //// 서울에서 김서방 찾기
 * //import java.util.Arrays;
 * //
 * //class Solution {
 * //    public String solution(String[] seoul) {
 * //        String answer="";
 * //        for(int i =0 ; i < seoul.length;i++){
 * //            if(seoul[i].equals("Kim")) {
 * //                answer = "김서방은 " + i + "에 있다";
 * //            }
 * //        }
 * //        return answer;
 * //    }
 * //
 * //}
 * ////다른사람 풀이
 * //import java.util.Arrays;
 * //
 * //public class FindKim {
 * //    public String findKim(String[] seoul){
 * //        //x에 김서방의 위치를 저장하세요.
 * //        int x = Arrays.asList(seoul).indexOf("Kim");
 * //
 * //        return "김서방은 "+ x + "에 있다";
 * //    }
 * <p>
 * <p>
 * // import java.util.Arrays;
 * //
 * //class Solution { // 행열의 합
 * //    public int[][] solution(int[][] arr1, int[][] arr2) {
 * //        int[][] answer = new int [arr1.length][arr1[0].length];
 * //        for(int i = 0 ; i < arr1.length; i++){
 * //            for(int j=0;j<arr1[i].length;j++){
 * //                answer[i][j] = arr1[i][j]+arr2[i][j];
 * //            }
 * //        }
 * //        return answer;
 * //    }
 * //}
 * <p>
 * <p>
 * /*
 * //// 핸드폰 번호 가리기
 * //class Solution {
 * //    public String solution(String phone_number) {
 * //        char[] arr = phone_number.toCharArray();
 * //        for(int i =0 ; i < arr.length -4; i++)
 * //            arr[i] = '*';
 * //        String answer = new String(arr);
 * //        return answer;
 * //    }
 * //
 * //}
 * //// 다른 사람들 코드
 * //class Solution {
 * //    public String solution(String phone_number) {
 * //        String answer = "";
 * //
 * //        for (int i = 0; i < phone_number.length() - 4; i++)
 * //            answer += "*";
 * //
 * //        answer += phone_number.substring(phone_number.length() - 4);
 * //
 * //        return answer;
 * //    }
 * //}
 * //
 * //class Solution {
 * //    public String solution(String phone_number) {
 * //        return phone_number.replaceAll(".(?=.{4})", "*");
 * //    }
 * //}
 * <p>
 * <p>
 * //하샤드 수
 * //class Solution {
 * //    public boolean solution(int x) {
 * //        int sum = 0;
 * //        char[] numbers = Integer.toString(x).toCharArray();
 * //        for(int i=0;i<numbers.length;i++)
 * //            sum+=numbers[i]-48;
 * //        return x%sum==0? true: false;
 * //    }
 * //
 * //}
 * //다른 사람이 품
 * //import java.util.function.IntConsumer;
 * //
 * //public class HarshadNumber{
 * //    private int sum = 0;
 * //    public boolean isHarshad(int num){
 * //        sum = 0;
 * //        Integer.toString(num).chars().forEach(c -> sum += c - '0');
 * //        return num % sum == 0;
 * //    }
 * //
 * //    // 아래는 테스트로 출력해 보기 위한 코드입니다.
 * //    public static void  main(String[] args){
 * //        HarshadNumber sn = new HarshadNumber();
 * //        System.out.println(sn.isHarshad(18));
 * //    }
 * //}
 * <p>
 * //class Solution {
 * //    public boolean solution(int x) {
 * //        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
 * //        return x % sum == 0;
 * //    }
 * //}
 * <p>
 * <p>
 * //// 정수 내림차순으로 배치하기
 * //class Solution {
 * //    public long solution(long n) {
 * //        int count = 0;
 * //        long answer = 0;
 * //        long [] num = new long[11];
 * //        for (int i=0;n>0;i++){
 * //            num[i] = n%10;
 * //            n/=10;
 * //            count ++;
 * //        }
 * //        for(int i=0;i<count-1;i++){
 * //            long max = num[i];
 * //            for(int k=i;k<count;k++)
 * //                if(max < num[k]) {
 * //                    num[i] = num[k];
 * //                    num[k] = max;
 * //                    max = num[i];
 * //                }
 * //        }
 * //        for (int i=0;i<count;i++)
 * //            answer += (num[i]) * Math.pow(10, (count-i-1));
 * //        return answer;
 * //    }
 * //
 * //}
 * // 다른 사람들이 품
 * //    public int reverseInt(int n){
 * //        char[] numbers = Integer.toString(n).toCharArray();
 * //        String strSort = "";
 * //
 * //        if(n <= 0) return 0;
 * //
 * //        for(int i = 0; i < numbers.length; i++) {
 * //            for(int j = 0; j < i; j++) {
 * //                if(numbers[i] - 48 > numbers[j] - 48) {
 * //                    char temp = numbers[i];
 * //                    numbers[i] = numbers[j];
 * //                    numbers[j] = temp;
 * //                }
 * //            }
 * //        }
 * //        strSort = new String(numbers);
 * //
 * //        return Integer.parseInt(strSort);
 * //    }
 * //
 * //public class ReverseInt {
 * //    String res = "";
 * //    public int reverseInt(int n){
 * //        res = "";
 * //        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
 * //        return Integer.parseInt(res);
 * //    }
 * <p>
 * <p>
 * //import java.util.Arrays;    // 프로그래머스 완주하지 못한 선수
 * //class Solution {
 * //    public String solution(String[] participant, String[] completion) {
 * //       Arrays.sort(participant);Arrays.sort(completion);
 * //       int i;
 * //       for(i=0;i<completion.length;i++)
 * //           if(!participant[i].equals(completion[i]))
 * //               break;
 * //        System.out.printf(participant[0]+" "+ completion[0]);
 * //       return participant[i];
 * //    }
 * //
 * //}
 * //  다른 사람이 품
 * //import java.util.HashMap;
 * //
 * //class Solution {
 * //    public String solution(String[] participant, String[] completion) {
 * //        String answer = "";
 * //        HashMap<String, Integer> hm = new HashMap<>();
 * //        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
 * //        for (String player : completion) hm.put(player, hm.get(player) - 1);
 * //
 * //        for (String key : hm.keySet()) {
 * //            if (hm.get(key) != 0){
 * //                answer = key;
 * //            }
 * //        }
 * //        return answer;
 * //    }
 * //}
 * <p>
 * <p>
 * // 프로그래머스 문자열 내 p와 y의 개수
 * // class Solution {
 * //    boolean solution(String s) {
 * //        boolean answer = true;
 * //        long p = s.chars().filter(c->c == 'p'|| c == 'P' ).count();
 * //        long y = s.chars().filter(c->c == 'y'|| c == 'Y' ).count();
 * //        answer = (p == y) ? true : false;
 * //        return answer;
 * //    }
 * //    /*
 * //    *boolean solution(String s) {
 * //        s = s.toUpperCase();
 * //
 * //        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
 * //    }
 * //
 * //
 * //
 * //}
 * <p>
 * <p>
 * //// 프로그래머스 부족한 금액 계산하기
 * //class Solution {
 * //    public long solution(int price, int money, int count) {
 * //        long answer = -1, sum = money;
 * //        for( int i = 1 ; i <= count ; i++)
 * //            sum -= price * i;
 * //        if (sum > 0)
 * //            return 0;
 * //        else
 * //            return answer *= sum;
 * //    }
 * //
 * //    /*  // 다른사람 풀이
 * //     public long solution(long price, long money, long count) {
 * //        return Math.max(price * (count * (count + 1) / 2) - money, 0);
 * //    }
 * //
 * //}
 * <p>
 * /*
 * // 프로그래머스 배열 평균 구하기
 * // 내가 한 풀이
 * class Solution {
 * public double solution(int[] arr) {
 * double answer = 0;
 * for (int i=0;i < arr.length;i++)
 * answer += arr[i];
 * <p>
 * return answer/arr.length;
 * }
 * }
 * <p>
 * // 다른 사람들의 풀이 stream활용
 * import java.util.Arrays;
 * <p>
 * public class GetMean {
 * public int getMean(int[] array) {
 * return (int) Arrays.stream(array).average().orElse(0);
 * }
 * }
 * <p>
 * // stream 한줄 표현
 * public class GetMean {
 * public int getMean(int[] array) {
 * return java.util.stream.IntStream.of(array).sum() / array.length;
 * }
 * }
 * <p>
 * <p>
 * // for each
 * public class GetMean {
 * public int getMean(int[] array) {
 * int sum=0;
 * for(int value : array){
 * sum = sum+value;
 * }
 * int mean = sum/array.length;
 * return mean;
 * }
 * <p>
 * /*
 * // 프로그래머스 가운데 글자 가져오기
 * class Solution {
 * public String solution(String s) {
 * String answer = "";
 * if(s.length()%2==0)
 * answer = s.substring(s.length()/2-1 , s.length()/2+1);
 * else
 * answer = s.substring(s.length()/2, s.length()/2+1);
 * <p>
 * return answer;
 * }
 * <p>
 * }
 * // 다른사람 풀이 .. 조건문 없이 한줄 풀이
 * <p>
 * class StringExercise{
 * String getMiddle(String word){
 * <p>
 * return word.substring((word.length()-1) / 2, word.length()/2 + 1);
 * }
 * }
 * // 삼항 연산자
 * class StringExercise{
 * String getMiddle(String word){
 * <p>
 * return word != null ? word.substring((word.length()-1)/2,(word.length()+2)/2) : "";
 * }
 */