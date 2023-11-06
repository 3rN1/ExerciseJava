public class ChangePosArray {
    public void changePosArrayValues(){
        System.out.println("------- Movimiento de Valores en un Vector -------");

        int[] values = new int[]{6,16,45,55,93,103,31,41,14,24,73};

        System.out.println("Array");
        showArray(values);
        shiftArray(values);
        System.out.println("New Array");
        showArray(values);
    }

    public void showArray(int[] values){
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]+",");
        }
        System.out.println('\t');
    }

    public void shiftArray(int[]values){
        int tmp = values[0];
        for (int i = 1; i < values.length; i++) {
            values[i-1] = values[i];
        }
        values[values.length-1] = tmp;
    }
}
