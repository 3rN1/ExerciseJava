public class ArrayInverter {
    public void getArrayInverter(){
        System.out.println("--------- INVIRTIENDO VECTOR ---------");

        int[] values = {1,10,20,30,40,50,60,70,80,90,100};

        System.out.println("Array");
        showArray(values);
        System.out.println('\n'+"New Array");
        invertArray(values);
        showArray(values);
    }
    public void showArray(int[] values){
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]+",");
        }
    }

    public void invertArray(int[] values){
        for (int i = 0; i < values.length/2; i++) {
            int tmp = values[i];
            values[i] = values[values.length-1-i];
            values[values.length-1-i] = tmp;
        }
    }
}
