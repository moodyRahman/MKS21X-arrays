public class ArrayDemo{

  public static void printArray(int[]array){
    for( int x = 0; x < array.length; x++){
      System.out.println(array[x]);
    }
  }


  public static void main(String[] args){

    printArray(new int[] {3, 4, 5});

  }


}
