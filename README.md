## Matrices multiplication

You are given two integer matrices represented as *rectangular arrays*. 
The task is to *multiply* given matrices. 
The definition of *matrix multiplication* indicates a row-by-column multiplication, where the entries in the *i-th* row of A are multiplied by the corresponding entries in the *j-th* column of B and then adding the results.

The main method located in [`com.epam.rd.autotasks.matrices.MultiplyMatrix`](src/main/java/com/epam/rd/autotasks/matrices/MultiplyMatrix.java)
and called `multiply`:
- takes two rectangular integer matrices on input;
- returns the result of the multiplication of the given matrices matrix.

> **Note:** 
>- You can use the standart  *.length()* function, but no third party libraries to solve this task;
>- It is guaranteed that the number of columns in the first matrix is equal to the number of rows in the second matrix.

**Example:**

    Input: {
             {1, 2, 3}, 
             {4, 5, 6}
           }, 

           {
              {7, 8}, 
              {9, 10},
              {11, 12}
            }, 

    Output: {
              {58, 64}, 
              {139, 154}
            }