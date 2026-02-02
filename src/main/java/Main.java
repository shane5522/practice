import java.util.Scanner;

public class Main {
    public int sum(int n){
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
         */

        //정수 배열 입력
        /*
        int[] arr = new int[10];

        int evenCount = 0;
        int oddSum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0) {
                evenCount++;
            } else{
                oddSum += arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("짝수 개수: " + evenCount);
        System.out.println("홀수 합: " + oddSum);
        System.out.println("최댓값: " + max);
        */

        //문자 입력
        /*
        String str = sc.nextLine();

        int upper = 0;
        int lower = 0;
        int num = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                upper++;
            }else if(Character.isLowerCase(ch)){
                lower++;
            }else if(Character.isDigit(ch)){
                num++;
            }
        }

        System.out.println("대문자: " + upper);
        System.out.println("소문자: " + lower);
        System.out.println("숫자: " + num);
        */

        //함수 만들기
        /*
        Main m = new Main();
        System.out.println(m.sum(sc.nextInt()));
         */

        //2차원 배열
        int[][] arr = new int[3][3];

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sumAll = 0;

        for(int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);

            for(int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                sumAll += arr[i][j];

                if(i == 0){
                    sum1 += arr[0][j];
                }else if(i == 1){
                    sum2 += arr[1][j];
                }else{
                    sum3 += arr[2][j];
                }
            }
        }

        System.out.println("행1 합: " + sum1);
        System.out.println("행2 합: " + sum2);
        System.out.println("행3 합: " + sum3);
        System.out.println("전체 합: " + sumAll);
    }
}
