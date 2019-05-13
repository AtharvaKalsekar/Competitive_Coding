//https://practice.geeksforgeeks.org/problems/pair-in-java/1/?track=module-3-classes%20and-biginteger-java&batchId=114
//https://www.journaldev.com/780/comparable-and-comparator-in-java-example
class custom_Compare{
    
    public static Comparator<Pair> comp = new Comparator<Pair>(){
      @Override
      public int compare(Pair a, Pair b)
      {
          return (int)a.x-b.x;
      }
    };
    // Compare function
    static void sortPairs(Pair arr[], int N){
        
        Arrays.sort(arr,comp);
        // Your code here
        for(int i = 0;i<N;i++){
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}