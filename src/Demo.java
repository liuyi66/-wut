public class Demo {
    public static void main(String[] args) {
        int[][]arr=new int[100][25];
        for(int i=0;i<100;i++){
            for(int j=0;j<25;j++) {
               arr[i][j]=new java.util.Random().nextBoolean() ? 1 : 0;
            }
        }
        int count = 0;
        Solution s=new Solution();


        for(int k=0;k<50;k++) {
            s.gameOfLife(arr);
            System.out.print("|");
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 25; j++) {
                    if (arr[i][j] == 1) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                    count++;
                    if (count >99 && count % 100 == 0) {
                        System.out.print("|");
                        System.out.print("\n");
                        System.out.print("|");
                    }
                }
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int m=0;m<30;m++)
                System.out.print("\n");
        }

    }
}


