public String getSandwich(String str){
  String[] arr=str.split("");
  int lastBread=-1;
  int firstBread=-1;
  if(str.length()<=10) return "";
  for(int x=0;x<arr.length-4;x++){
    if(arr[x].equals("b")&&arr[x+1].equals("r")&&arr[x+2].equals("e")&&arr[x+3].equals("a")&&arr[x+4].equals("d")){
      firstBread=x+4;
      break;
    }
  }
  for(int x=arr.length-1;x>=0;x--){
    if(arr[x].equals("d")&&arr[x-1].equals("a")&&arr[x-2].equals("e")&&arr[x-3].equals("r")&&arr[x-4].equals("b")){
      lastBread=x-4;
      break;
    }
  }
  if(lastBread==firstBread) return "";
  return 
}
