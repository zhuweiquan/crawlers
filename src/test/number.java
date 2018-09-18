public class number {
    public static void main(String[] args){
        number test = new number();
        int res = test.pcb(12,18);
        int lcm = test.lcm(12,18);
        System.out.println(res + "," +lcm);

        System.out.println(test.toHex(-1));
        System.out.println(test.toBinary(13));
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
     * @param a,b
     * @return int
     */
    private int lcm(int a, int b){
        return a * b / pcb(a ,b);
    }

    /**
     * @desc 转16进制
     * @param num
     * @return int
     */
    private String toHex(int num){
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            sb.append(map[num & 0b1111]);
            num >>>= 4; // 因为考虑的是补码形式，因此符号位就不能有特殊的意义，需要使用无符号右移，左边填 0
        }
        return sb.reverse().toString();
    }

    /**
     * @desc 转16进制
     * @param num
     * @return int
     */
    private String toBinary(int num){
        char[] map = {'0', '1'};
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            sb.append(map[num & 0b1]);
            num >>>= 1; // 因为考虑的是补码形式，因此符号位就不能有特殊的意义，需要使用无符号右移，左边填 0
        }
        return sb.reverse().toString();
    }

}
