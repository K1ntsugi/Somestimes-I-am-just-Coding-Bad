public class ap1Class {

    /* Merge Two
    Start with two arrays of strings, A and B, each with its elements
    in alphabetical order and without duplicates.
    Return a new array containing the first N elements from the two arrays.
    The result array should be in alphabetical order and without duplicates.
    A and B will both have a length which is N or more.
    The best "linear" solution makes a single pass over A and B,
    taking advantage of the fact that they are in alphabetical order,
    copying elements directly to the new array.
    */

    /*
    mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
    mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
    mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
 */

    public String[] mergeTwo(String[] a, String[] b, int n) {
  
        int i = 0;
        int j = 0;
        int k = 0;
        
        String[] out = new String[n];
        
        while (true) {

            if( a[i].compareToIgnoreCase(b[j]) < 0 ) {
                out[k++] = a[i++];
                if(b[j].compareTo(out[k-1]) == 0) {
                    j++;
                }
            } else {
                out[k++] = b[j++];
                if(a[i].compareTo(out[k-1]) == 0) {
                    i++;
                }
            }
            if(k == n) {
                break;
            }
        }
        
        return out;
    }

    //@TODO: CommonTwo fix

    /*
     * Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
     * Return the count of the number of strings which appear in both arrays. The best "linear" solution makes
     * a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.
     * 
     * commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
     * commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
     * commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
     */

    public int commonTwo(String[] a, String[] b) {
        int j = 0;
        int k = 0;
        int count = 0;
        while (true) {
            if (a[j].compareTo(b[k]) == 0) {
                String buffer = a[j];
                count++;
                while (j < a.length && buffer.compareTo(a[j]) == 0)
                    j++;
                while (k < b.length && buffer.compareTo(b[k]) == 0)
                    k++;
            } else {
                while (j < a.length && a[j].compareTo(b[k]) < 0)
                    j++;
                while (k < b.length && a[j].compareTo(b[k]) > 0)
                    k++;
            }
            if (j >= a.length - 1 || k >= b.length - 1) {
                break;
            }
        }
        return count;
    }

    // another dry try
    public int commonTwo2(String[] a, String[] b) {
  
      int aCount = 0;
      int bCount = 0;
      int counter = 0;
      
      while (aCount < a.length  && bCount < b.length ) {
        
        if (a[aCount].compareTo(b[bCount]) == 0) {
          counter++;
          String compVal = a[aCount];
          while (0 == compVal.compareTo(a[aCount]) && aCount < a.length-1) {
            aCount++;
          }
          while (0 == compVal.compareTo(b[bCount]) && bCount < b.length-1) {
            bCount++;
          }
        } else {
        if(a[aCount].compareTo(b[bCount]) < 0 && aCount < a.length) {
          aCount++;
        }
        if(a[aCount].compareTo(b[bCount]) > 0 && bCount < b.length) {
          bCount++;
        }
    
      }
    }
      return counter;
    }
    

    // that same "igitt" by Bene
    public int commonTwoBene(String[] a, String[] b) {
        int i = 0;
        int j = 0;
        int count = 0;
      
        while(i < a.length && j < b.length){
          if(a[i].compareTo(b[j]) == 0){
            if(i == 0 || j == 0){
              count++;
              i++;
              j++;
            }else if(a[i] != a[i-1] && b[j] != b[j-1]){
              count++;
              i++;
              j++;
            }else{
              break;
            }
          }else{
            if(a[i].compareTo(b[j]) < 0){
              i++;
            }else if(a[i].compareTo(b[j]) > 0){
              j++;
            }
          }
        }
        return count;
      }


    /* 
     * 
     * Given two arrays, A and B, of non-negative int scores. 
     * A "special" score is one which is a multiple of 10, such as 40 or 90.
     * Return the sum of largest special score in A and the largest special score in B.
     * To practice decomposition, write a separate helper method which finds the largest
     * special score in an array. Write your helper method after your scoresSpecial()
     * method in the JavaBat text area.
     * scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
     * scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
     * scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
     * 
     */

    public int scoresSpecial(int[] a, int[] b) {
        
    }    


}
