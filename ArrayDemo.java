public class ArrayDemo{

  public static void printArray(int[] array){
    for( int x = 0; x < array.length; x++){
      System.out.print(array[x] + ", ");
    }
    System.out.print("\n");
  }

  public static void printArray(int[][] array){
    for( int x = 0; x < array.length; x++){
      for( int y = 0; y < array[x].length;y++){
        System.out.print(array[x][y] + ", ");
      }
    }
    System.out.print("\n");
  }

  public static int countZeros2D(int[][] array){
    int output = 0;
    for( int x = 0; x < array.length; x++){
      for( int y = 0; y < array[x].length;y++){
        if (array[x][y] == 0){
          output++;
        }
      }
    }
    return output;
  }


  public static void main(String[] args){

    printArray(new int[] {3, 4, 5});
    printArray(new int[][] {{0, 1, 2},{3, 4, 5},{6, 7, 8}});
    System.out.print(countZeros2D(new int[][] {{0, 3, 4}, {0, 0, 1}, {4, 5, 0}}));
  }


}
