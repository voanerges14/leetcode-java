class Solution {

    public int romanToInt(String s) {
        short sum = 0;
        char[] romeNums = s.toCharArray();

        for (int i = 0; i < romeNums.length; i++) {
            if (romeNums[i] == 'M') { sum += 1000; }
            else if (romeNums[i] == 'D') { sum += 500; }
            else if (romeNums[i] == 'L') { sum += 50; }
            else if (romeNums[i] == 'V') { sum += 5; }
            else if (romeNums[i] == 'C') {
                if (i+1 >= romeNums.length) {
                    sum+=100;
                } else if (romeNums[i+1] == 'M') {
                    sum+=900; i++;
                } else if (romeNums[i+1] == 'D') {
                    sum+=400; i++;
                } else {
                    sum+=100;
                }
            } else if (romeNums[i] == 'X') {
                if (i+1 >= romeNums.length) {
                    sum+=10;
                } else if (romeNums[i+1] == 'C') {
                    sum+=90; i++;
                } else if (romeNums[i+1] == 'L') {
                    sum+=40; i++;
                } else {
                    sum+=10;
                }
            } else if (romeNums[i] == 'I') {
                if (i+1 >= romeNums.length) {
                    sum+=1;
                } else if (romeNums[i+1] == 'X') {
                    sum+=9; i++;
                } else if (romeNums[i+1] == 'V') {
                    sum+=4; i++;
                } else {
                    sum+=1;
                }
            }

        }
        return sum;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "IVI";
        System.out.println(solution.romanToInt(s));
    }
}
