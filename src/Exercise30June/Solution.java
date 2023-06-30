package Exercise30June;

public class Solution {

    public void drawSquare(int n){
        String square = "";
        String canh = "";
        String ruot = "";
        for(int i = 0; i< n; i++){
            canh += " * ";
            if (i == 0 || i == n-1) {
                ruot += " * ";
            } else {
                ruot += "   ";
            }
            if(i == n-1) {
                canh += "\n";
                ruot += "\n";
            }
        }
        for(int i = 0; i < n; i++){
            if (i == 0 || i == n-1) {
                square += canh;
            } else {
                square += ruot;
            }
        }

        System.out.println(square);
    }

    private void drawRectangle (int width, int height){
     }

    private void drawTriangle(int n){

    }
}
