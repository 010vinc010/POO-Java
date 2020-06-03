public class TestArray {
    public static double max(double[] tab){
        double max;
        if (tab.length != 0.0){
            max = tab[0];
            for (int i=1;i<tab.length;i++){
                if (tab[i]>max)
                    max=tab[i];
            }
        }
        else
            return Double.NEGATIVE_INFINITY;
        return max;
    }
}