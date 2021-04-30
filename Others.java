package JAVA;

public class Others {

    int [][] arr1 = { {1,2,3},
                      {4,5,6},
                      {7,8,9}
    };

    String [][] arr2 = new String[3][3];

    public Others( ) {

        System.out.println("-------------------------");
        for (int i=0; i<3; i++) {

            for(int j=0; j<3; j++) {
                System.out.print(arr1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");
        for (int i=2; i>=0; i--) {

            for(int j=2; j>=0; j--) {
                System.out.print(arr2[i][j] = arr1[i][j]+"");
                System.out.print(" ");
            }
            System.out.println();
        }



    }
}
