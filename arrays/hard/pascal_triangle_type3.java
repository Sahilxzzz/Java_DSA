package arrays.hard;

import java.util.*;

public class pascal_triangle_type3 {
   
    private static List<Integer> generateRow(int row){
        int col;

        List <Integer> generateRow = new ArrayList<>();
        int ans =1;
        generateRow.add(1);
        for(col=1;col<row;col++){
            ans = ans*(row-col);
            ans = ans/col;
            generateRow.add(ans);
        }
        return generateRow ;
    }

    public List<List<Integer>> generate(int numRows) {
        int row, col ; 
        List<List<Integer>> generate = new ArrayList<>();

        for (int i=1;i<=numRows;i++){
            generate.add(generateRow(i));
        }
        return generate;
    }
}

