import java.io.*;
import java.util.Scanner;
public class Lab1_420 {
  public static String [] keywords = new String[50];
  public static String [] idfr = new String[500];
  public static String [] mathOperators = new String[50];
  public static String [] logicalOperators = new String[50];
  public static String [] neumericalValues = new String[50];
  public static String [] others = new String[50];
  public static int k = 0;
  public static int id = 0;
  public static int m = 0;
  public static int l = 0;
  public static int n = 0;
  public static int o = 0;
  public static String [] key = new String [32];
  public static void main(String args[]) throws FileNotFoundException {
    Scanner  scnr = new Scanner (new File("C:\\Users\\15101027\\Desktop\\420Lab\\input.txt") );
    //Scanner  scnr = new Scanner (new File("C:\\Users\\jsc\\Desktop\\420Lab\\input.txt") );

    initializeKey();
    while(scnr.hasNextLine()){
      String line=scnr.nextLine().trim();
      String[] arr=line.split("\\ |\\,|\\;|\\{|\\}|\\(|\\)"); 
      String[] arr2=line.split(" ");
      for(int i=0;i<arr2.length;i++){  
        identify(arr2[i]);
        //System.out.println(arr2[i]);
      } 
    }
    printList();
  }
  public static void identify(String s){
    for(int i = 0;i<key.length;i++){
      if(key[i].equals(s)){
        keywords[k] = s;
        k++;
        break;
      } else if(s.equals("=")||s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
        mathOperators[m] = s;
        m++;
        break;
      } else if(s.equals("<")||s.equals(">")){
        logicalOperators[l] = s;
        l++;
        break;
      } else if(s.equals(".")||s.equals(",")||s.equals(";")||s.equals("(")||s.equals(")")||s.equals("{")||s.equals("}")||s.equals("[")||s.equals("]")){
        others[o] = s;
        o++;
        break;
      } else if ((isNumeric(s))){
//        System.out.println(isNumeric(s));
        neumericalValues[n] = s;
        n++;
        //System.out.println(neumericalValues[n-1]);
        break;
      } else {
//        idfr[id] = s;
//        id++;
//        System.out.println(id + idfr[id-1]);
      }
    }
  }
  public static void initializeKey(){
    key[0]= "auto";
    key[1]= "break";
    key[2]= "case";
    key[3]= "char";
    key[4]= "const";
    key[5]= "continue";
    key[6]= "default";
    key[7]= "do";
    key[8]= "double";
    key[9]= "enum";
    key[10]= "extern";
    key[11]= "else";
    key[12]= "float";
    key[13]= "for";
    key[14]= "goto";
    key[15]= "if";
    key[16]= "int";
    key[17]= "long";
    key[18]= "register";
    key[19]= "return";
    key[20]= "short";
    key[21]= "signed";
    key[22]= "sizeof";
    key[23]= "static";
    key[24]= "struct";
    key[25]= "switch";
    key[26]= "typedef";
    key[27]= "union";
    key[28]= "unsigned";
    key[29]= "void";
    key[30]= "volatile";
    key[31]= "while";
  }
  public static boolean isNumeric(String str)  
{  
  try  
  {  
    double d = Double.parseDouble(str);  
  }  
  catch(NumberFormatException nfe)  
  {  
    return false;  
  }  
  return true;  
}
  public static void printList(){
    System.out.println("Output");
    System.out.print("Keywords ");
    for(int i =0;i<k;i++){
        System.out.print(keywords[i]+" ");
    }
    System.out.println();
    System.out.print("Identifiers ");
//    for(int i =0;i<id;i++){
//      if(!(keywords[id]).equals("")){
//        System.out.print(idfr[i]+" ");
//      }
 //   }
    System.out.println();
    System.out.print("Math Operations ");
    for(int i =0;i<m;i++){

        System.out.print(mathOperators[i]+" ");
      
    }
    System.out.println();
    System.out.print("Logical Operations ");
    for(int i =0;i<l;i++){
        System.out.print(logicalOperators[i]+" ");
    }
    System.out.println();
    System.out.print("Neumerical value ");
    for(int i =0;i<n;i++){
        System.out.print(neumericalValues[i]+" ");
    }
    System.out.println();
    System.out.print("Others ");
    for(int i =0;i<0;i++){
        System.out.print(others[i]+" ");
    }
    System.out.println();
  }
}
