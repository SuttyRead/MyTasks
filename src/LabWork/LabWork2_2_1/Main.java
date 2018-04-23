package LabWork.LabWork2_2_1;

//Create a Matrix class that contains the methods
//of addition and multiplication of matrices
//(work with two-dimensional arrays);

public class Main {
    public static void main(String[] args) {
        MatrixWork matrixWork = new MatrixWork();
        matrixWork.printMatrix(matrixWork.operationMatrixAdd(matrixWork.createMatrix(3), matrixWork.createMatrix2(3)));
        matrixWork.printMatrix(matrixWork.operationMatriMultiplication(matrixWork.createMatrix(3), matrixWork.createMatrix2(3)));
    }
}
