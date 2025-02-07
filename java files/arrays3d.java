class Array3d {
    public static void main(String[] args) {
        int[][][] test = {
            {
              {1,2,3}, 
              {3,4,5}
            }, 
            { 
              {6,7,8}, 
              {1,2}, 
              {10,11,12}
            } 
        };
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}
