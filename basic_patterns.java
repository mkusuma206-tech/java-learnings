//pattern 1: Rectangle
class RectanglePattern {
    public static void main(String[] args ) {
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=5;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Inverted triangle
class InvertedTriangle {
    public static void main(String[] args ) {
        for(int i=5;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class HollowSquare {
    public static void main(String[] args ) {
        int n=5;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(i==1 || i==n ||j==1 ||j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }

}

class DiamondPattern {
    public static void main(String[] args ) {
        //upper half
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      //lower half
      for(int i=n-1;i>=1;i--) {
        for(int j=1;j<=n-i;j++) {
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++) {
            System.out.print("*");
        }
        System.out.println();
      }
    }
}

//pattern 3 : pascals triangle
class PascalsTriangle {
    public static void main(String[] args ) {
        int n=5;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(" ");
            }
            int num=1;
            for(int j=0;j<=i;j++) {
                System.out.print(num+" ");
                num=num*(i-1)/(j+1);
            }
            System.out.println();
        }
    }
}

