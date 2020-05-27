import java.util.Scanner;
class Main {
  public static void rimvarab(){
    Scanner in = new Scanner(System.in);
    System.out.print("Введите римское число(только заглавные буквы!): ");
    String str = in.nextLine();
    char [] s = str.toCharArray();
    int c = 0;
    for(int i = 0; i < s.length; i++){
      if(s[i] == 'M'){
        c+=1000;
      }
      else if(s[i] == 'D'){
        c+=500;
      }
      else if(s[i] == 'C'){
       if(i+1 < s.length && (s[i + 1] == 'D' || s[i + 1] == 'M' )){
         c-=100;
       }
       else c+=100;
      }
      else if(s[i] == 'L'){
        c+=50;
      }
      else if(s[i] == 'X'){
       if(i+1 < s.length && (s[i + 1] == 'L' || s[i + 1] == 'C' || s[i + 1] == 'M')){
         c-=10;
       }
       else c+=10;
      }
      else if(s[i] == 'V'){
        c+=5;
      }
      else if(s[i] == 'I'){
        if (i+1 < s.length && (s[i + 1] == 'V' || s[i + 1] == 'X' || s[i + 1] == 'C')){
          c-=1;
        }
        else c+=1;
      }
    }
    System.out.print("Арабское число: " + c);
  }
  public static void prpalindrom(){
    Scanner in = new Scanner(System.in);
    System.out.println();
    System.out.println("Введите число для проверки палендрома");
    String s = in.nextLine();
    StringBuffer r = new StringBuffer(s);
    r.reverse();
    String p = r.toString();
    if(s.equals(p)) System.out.print("Палендром");
    else System.out.print("Не палендром");
  }
  public static void main(String[] args) {
    rimvarab();
    prpalindrom();
  }
}