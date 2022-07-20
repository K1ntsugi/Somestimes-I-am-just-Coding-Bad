public int countX(String str) {
  if (str.length() == 0) {
    return 
    0;
  }
  int i = countX(str.substring(1,str.length()));
  if(str.charAt(0) == 'x') {
    i++;
  }
  return i;
}
