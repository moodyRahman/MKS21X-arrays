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
    System.out.print("\n-------------\n");
  }



  public static void main(String[] args){
    int[] dim1 = {3, 4, 0, -1, 234, 5};
    int[][] dim2 = {{2, 4, -3, 1,66},{8, -4, 2, -1, 7, 3},{0, 0, 0, 0, 0},{10, 124, 566, -2341}};
    int[][] dim2alt = {{0, 0, 0},{0, 0, 0}};


    printArray(dim2);
    newLine();
    fill2D(dim2);
    newLine();
    printArray(fill2DCopy(dim2));
    newLine();
    printArray(dim1);
    newLine();
    printArray(dim2);
    newLine();
    System.out.println(countZeros2D(dim2));

  }


}
