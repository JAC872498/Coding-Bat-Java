/*Count the number of words ending in 'y' or 'z', so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow".
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.*/

public int countYZ(String str){
  String[] arr=str.split("");
  int tot=0;
  for(int x=0;x<str.length();x++){
  String s=arr[x+1];
  char c1=s.charAt(0);
   if(arr[x].equals("y")||arr[x].equals("z")||arr[x].equals("Y")||arr[x].equals("Z")){
     if(Character.isLetter(c1)==false){
      tot+=1;
    }
   } 
  }
  if(arr[str.length()].equals("y")||arr[str.length()].equals("Y")||arr[str.length()].equals("z")||arr[str.length()].equals("Z")){
    tot+=1;
  }
  return tot;
}
