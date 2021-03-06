/*Given a string, does "xyz" appear in the middle of the string? 
To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. 
This problem is harder than it looks.*/

public boolean xyzMiddle(String str){
  String arr[]=new String[2];
  if(str.length()<=2) return false;
  for(int x=0;x<str.length()-2;x++){
    if(str.substring(x,x+3).equals("xyz")){
      arr[0]=str.substring(0,x);
      arr[1]=str.substring(x+3,str.length());
      if(Math.abs(arr[0].length()-arr[1].length())<=1) return true;
    }
  }
  return false;
}
