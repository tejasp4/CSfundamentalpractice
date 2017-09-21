public class minHeap {
  private int capacity = 0;
  private int size = 0;
  int[] items = new int[capacity];


  private int getLeftChildIndex(int parentIndex) {return 2 * parentIndex + 1;}
  private int getRightChildIndex(int parentIndex) {return 2 * parentIndex + 2;}
  public static int getParentIndex(int childIndex) {return (childIndex-1)/2;}

    public static void main(String[] args) {
    int temp = getParentIndex(2);
    System.out.println(temp);
  }
}

