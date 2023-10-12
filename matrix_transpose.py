#O(m*n) | O(m*n)
def transposeMatrix(matrix):
    n_rows = len(matrix)
    n_columns = len(matrix[0])
    transpose = [[0 for _ in range(n_rows)] for _ in range(n_columns)]
    for i in range(n_columns):
      for j in range(n_rows):
        transpose[i][j] = matrix[j][i]
    return transpose
