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
        if(y == array[x].length -1){
          System.out.print("\n");      //helps with formatting
        }                             // new line at the end of each "mini array"
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



  public static void fill2D(int[][] vals){
    for( int x = 0; x < vals.length; x++){
      for( int y = 0; y < vals[x].length;y++){
        vals[x][y] = 1;
        if(x == y){
          vals[x][y] = 3;
        }
        System.out.print(vals[x][y] + ", ");
        if(y == 2){
          System.out.print("\n");
        }
      }
    }
  }



  public static int[][] fill2DCopy(int[][] vals){
    int [][] output;
    output = new int[vals.length][];
    for( int x = 0; x < vals.length;x++){
      output[x] = new int[vals[x].length];
    }

    for( int x = 0; x < vals.length; x++){
      for(int y = 0; y < vals[x].length; y++){
        output [x][y] = 1;
        if( vals[x][y] < 0){
          output [x][y] = 3;
        }
      }
    }

    return output;
  }



  public static void newLine(){
    System.out.print("-------------\n");
  }



  public static void main(String[] args){
      fill2D(new int [][]{{3, 4, 5}, {4, 5, 21}, {3, 3, 3}});
      newLine();
      printArray(fill2DCopy(new int[][] {{3, 4, 5},{2, -1},{0, 0, -4, 5, 6, 3}}));
      newLine();
      printArray(new int[] {3, 4, 5});
      newLine();
      printArray(new int[][] {{0, 1, 2},{3, 4, 5},{6, 7, 8}});
      newLine();
      System.out.print(countZeros2D(new int[][] {{0, 3, 4}, {0, 0, 1}, {4, 5, 0}}));

  }


}
