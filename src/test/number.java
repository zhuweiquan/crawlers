public class number {
    public static void main(String[] args){
        number test = new number();
        int res = test.pcb(12,18);
        System.out.print(res);
    }

    /**
     * @desc 求最大公约数
     *
     * @param a,b
     * @return int
     */
    private int pcb(int a, int b){
        return b == 0? a: pcb(b, a%b);
    }

    /**
     * @desc 求最小公倍数
     *
     * @param a,b
     * @return int
     */

}
