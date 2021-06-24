## Matrices multiplication

You are given two integer matrices represented as *rectangular arrays*. 
The task is to *multiply* given matrices. 
The definition of *matrix multiplication* indicates a row-by-column multiplication, where the entries in the *i-th* row of A are multiplied by the corresponding entries in the *j-th* column of B and then adding the results.

The correctness of the task will be checked using tests.

There are two classes:

1) [`com.epam.rd.autotasks.matrices.MultiplyMatrix`](src/main/java/com/epam/rd/autotasks/matrices/MultiplyMatrix.java) - class for you to write code. Contains methods:
    - `multiply` - takes two rectangular integer arrays (matrices) on input and returns the result of the multiplication of the given matrices integer array (matrix).
    - `main` - method for you to run your code local.
2) [`com.epam.rd.autotasks.matrices.MultiplyMatrixTests`](src/test/java/com/epam/rd/autotasks/matrices/MultiplyMatrixTests.java) - class for testing your code. It contains several tests you can run using:
    ```console
    $ mvn clean test
    ```
    To run particular test go to the [`MultiplyMatrixTests.class`](src/test/java/com/epam/rd/autotasks/matrices/MultiplyMatrixTests.java), choose the test and run command:
    ```console
    $ mvn clean test -Dtest=MultiplyMatrixTests#<test_name>
    ```

> **Note:** 
>- You can use the standart  *.length()* function, but no third party libraries to solve this task;
>- It is guaranteed that the number of columns in the first matrix is equal to the number of rows in the second matrix.
>- To run tests Maven framework must be installed. You can download the release source from [download page][maven-download].

**Example:**

    Input: {
             {1, 2, 3}, 
             {4, 5, 6}
           }, 

           {
              {7, 8}, 
              {9, 10},
              {11, 12}
            }

    Output: {
              {58, 64}, 
              {139, 154}
            }
            
[maven-download]: https://maven.apache.org/download.cgi