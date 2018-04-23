package LabWork.LabWork2_2_2;

//Write class that create instances
// of class Matrix and execute his methods.

public class Main {
    public static void main(String[] args) {
        MatrixWork matrixWork = new MatrixWork();
        Matrix matrix = new Matrix();
        matrixWork.printMatrix(matrixWork.operationMatrixAdd(matrixWork.createMatrix(3), matrixWork.createMatrix2(3)));
        matrixWork.printMatrix(matrixWork.operationMatriMultiplication(matrixWork.createMatrix(3), matrixWork.createMatrix2(3)));
        matrix.printMatrixvalue(matrixWork.createMatrix(3));
    }
}
