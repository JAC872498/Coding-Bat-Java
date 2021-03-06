/*Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.*/

public String endX(String str) {
  if(str.length()<1){
    return("");
  }
  if(str.substring(0,1).equals("x")){
    return(endX(str.substring(1,str.length()))+"x");
  }else{
    return(str.substring(0,1)+endX(str.substring(1,str.length())));
  }
}
