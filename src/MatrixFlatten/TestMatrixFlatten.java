package MatrixFlatten;
import org.junit.Assert;
import org.junit.Test;

/** A test matrix flatten class which is responsible to test MatrixFlatten class. */
public class TestMatrixFlatten {

    @Test
    public void simpleMatrixTest() {
        int n = 2;
        int m = 2;
        int p = 3;
        int matrix[][][] = {
            {
                {1, 2, 3},{4, 5, 6}
            },
            {
                {7, 8, 9},
                {10 ,11, 12}
            }
        };
        MatrixFlatten matrixFlatten = new MatrixFlatten(matrix, 2, 2, 3);
        int[] expectedFlattenedArray = {1, 0, 3, 0, 5, 6, 7, 8, 0, 0, 11, 12};
        matrixFlatten.convertIndex(0 ,0 , 0);
        matrixFlatten.convertIndex(0, 0, 2);
        matrixFlatten.convertIndex(0, 1, 1);
        matrixFlatten.convertIndex(0, 1, 2);
        matrixFlatten.convertIndex(1, 0, 1);
        matrixFlatten.convertIndex(1, 0, 0);
        matrixFlatten.convertIndex(1, 1, 2);
        matrixFlatten.convertIndex(1, 1, 1);
        Assert.assertArrayEquals(expectedFlattenedArray, matrixFlatten.getFlattenedArray());
    }

    @Test
    public void complexMatrixTest() {
        int n = 3;
        int m = 2;
        int p = 5;
        int matrix[][][] = {
                {
                        {20, 12, 30, 1, 3}, {4, 5, 6, 9, 8}
                },
                {
                        {-9, 1, 0, 19, 30}, {4, 5, 6, 98, 80}
                },
                {
                        {412, 9, 7, 8, 0}, {4, 900, 3, 2, 83}
                }
        };
        MatrixFlatten matrixFlatten = new MatrixFlatten(matrix, 3, 2, 5);
        int[] expectedFlattenedArray = {20 ,0 ,30 ,0 ,0, 0, 0, 0, 9, 0, -9, 0, 0, 0,
                                         30, 0, 0, 0, 98, 0, 412, 0, 0, 0, 0, 0, 0, 0, 0, 83};
        matrixFlatten.convertIndex(1 ,0 , 0);
        matrixFlatten.convertIndex(1, 0, 4);
        matrixFlatten.convertIndex(1, 1, 3);
        matrixFlatten.convertIndex(2, 0, 0);
        matrixFlatten.convertIndex(2, 1, 4);
        matrixFlatten.convertIndex(0, 0, 0);
        matrixFlatten.convertIndex(0, 1, 3);
        matrixFlatten.convertIndex(0, 0, 2);
        Assert.assertArrayEquals(expectedFlattenedArray, matrixFlatten.getFlattenedArray());
    }

    @Test
    public void convertAllMatrixTest() {
        int n = 2;
        int m = 2;
        int p = 3;
        int matrix[][][] = {
                {
                        {1, 2, 3},{4, 5, 6}
                },
                {
                        {7, 8, 9}, {10 ,11, 12}
                }
        };
        MatrixFlatten matrixFlatten = new MatrixFlatten(matrix, 2, 2, 3);
        int[] expectedFlattenedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        matrixFlatten.convertIndex(0 ,0 , 0);
        matrixFlatten.convertIndex(0, 0, 1);
        matrixFlatten.convertIndex(0, 0, 2);
        matrixFlatten.convertIndex(0, 1, 0 );
        matrixFlatten.convertIndex(0, 1, 1);
        matrixFlatten.convertIndex(0, 1, 2);
        matrixFlatten.convertIndex(1 ,0 , 0);
        matrixFlatten.convertIndex(1, 0, 1);
        matrixFlatten.convertIndex(1, 0, 2);
        matrixFlatten.convertIndex(1, 1, 0 );
        matrixFlatten.convertIndex(1, 1, 1);
        matrixFlatten.convertIndex(1, 1, 2);
        Assert.assertArrayEquals(expectedFlattenedArray, matrixFlatten.getFlattenedArray());
    }
}
