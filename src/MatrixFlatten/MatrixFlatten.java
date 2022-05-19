package MatrixFlatten;

/** A matrix flatten class which is responsible to convert 3d matrix into 1d array
 * The 1d array changes gradually by calling convertIndex(i, j, k) on the desirable index
 * of the 3d matrix.
 */
public class MatrixFlatten {
    private int[][][] threeDMatrix;
    private int[] flattenedArray; // the array which is suitable for storing the 3D matrix
                                  // This array changes gradually by calling convertIndex(i, j,k)
    private int n; // depth of the 3d matrix
    private int m; // no of rows in the 3d matrix
    private int p; // no of cols in the 3d matrix

    public MatrixFlatten(int[][][] threeDMatrix, int n, int m, int p) {
        this.n = n;
        this.m = m;
        this.p = p;
        this.threeDMatrix = threeDMatrix;
        this.flattenedArray = new int[n * m * p];
    }

    public int[] getFlattenedArray() {
        return flattenedArray;
    }

    /* convert the 3D matrix index (i, j, k) to a suitable flattenedArray index (y). */
    public void convertIndex(int i, int j, int k) {
        validateInputs(i, j , k);
        int depth = i * m * p;
        int row = j * p;
        int column = k;
        int y = depth + row + column;
        flattenedArray[y] = threeDMatrix[i][j][k];
    }

    /* check that no index is out of bound. */
    private void validateInputs(int i, int j, int k) {
        if (i > n - 1) {
            throw new IndexOutOfBoundsException("i should be less than or equal to n - 1");
        } else if (j > m - 1) {
            throw new IndexOutOfBoundsException("j should be less than or equal to m - 1");
        } else if (k > p - 1) {
            throw new IndexOutOfBoundsException("k should be less than or equal to p - 1");
        }
    }


}
