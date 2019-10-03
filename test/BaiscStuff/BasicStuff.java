package BaiscStuff;

public class BasicStuff {
    public static void main(String[] args) {
        /*double age0 = 18;
        double age1 = 19;
        System.out.println(age0+age1);
        System.out.println(6/3);
        System.out.println(6.0/4);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE -1);
        */

        System.out.println((1600.0)/24);
        System.out.println(((1600.0)/24)/7);
        double h=5.0, r=2.0,V=0,A=0;
        V=((1.0)/3)*Math.PI*Math.pow(r,2)*h;
        A=Math.PI*Math.pow(r,2)+Math.PI*r*Math.pow((r*r+h*h),0.5);
        System.out.println(V);
        System.out.println(A);
        System.out.println(2*3-7*1);
        System.out.println(1+2-3-4);
        System.out.println(1+2+"hi");
        System.out.println("hi"+1+2);
    }
}
