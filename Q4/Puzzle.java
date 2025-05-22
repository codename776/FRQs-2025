// FRQ 4A

// initialize a 2d array with random ints 1-9

// the name of the constructor didn't correlate with the code at all so I don't remember it

private int[][] matrix;

public SumofPre(int numRows, int numCols) {

matrix = new int\[numRows\]\[numCols\]; 

for (int i = 0; i < numRows; i++) { 

	for (int j = 0; j < numCols; j++) { 

		matrix\[i\]\[j\] = ((int)  (Math.random() \* 9) + 1);

	}

}
