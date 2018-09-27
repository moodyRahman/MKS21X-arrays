public class ArrayDemo{

  public static void printArray(int[] array){
    for( int x = 0; x < array.length; x++){
      System.out.println(array[x]);
    }
  }

  public static void printArray(int [][] array){
    for( int x = 0; x < array.length; x++){
      for( int y = 0; y < array[x].length;y++){
        System.out.println(array[x][y]);
      }
    }
  }

  public static void main(String[] args){

    printArray(new int[] {3, 4, 5});
    System.out.println("-----");
    printArray(new int[][] {{0, 1, 2},{3, 4, 5},{6, 7, 8}});

  }


}
