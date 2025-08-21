class Solution {
    public int romanToInt(String s) {
       char[] a = s.toCharArray();
       int num = 0;
       for(int i = a.length - 1; i >= 0; i--){
        char b = a[i];
        switch(b){
            case 'I' :
                num = num + 1;
                break;
            
            case 'V' :
                if(i > 0 && a[i-1] == 'I'){
                    num = num + 4;
                    i--;
                } else {
                    num = num + 5;
                }
                break;

            case 'X' :
                if(i > 0 && a[i-1] == 'I'){
                    num = num + 9;
                    i--;
                } else {
                    num = num + 10;
                }
                break;

            case 'L' :
                if(i > 0 && a[i-1] == 'X'){
                    num = num + 40;
                    i--;
                } else {
                    num = num + 50;
                }
                break;

            case 'C':
                if(i > 0 && a[i-1] == 'X'){
                    num = num + 90;
                    i--;
                } else {
                    num = num + 100;
                }
                break;

            case 'D' :
                if(i > 0 && a[i-1] == 'C'){
                    num = num + 400;
                    i--;
                } else {
                    num = num + 500;
                }
                break;

            case 'M':
                if(i > 0 && a[i-1] == 'C'){
                    num = num + 900;
                    i--;
                } else {
                    num = num + 1000;
                }
                break;

        }
       }
       return num;         
    }
}