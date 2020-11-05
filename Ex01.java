
class Ex01 {
    public static void main(String[] args) {

        // 名前を入れる変数
        String name;
        // 生年月日（年）を入れる変数
        int birth_y;
        // 生年月日（月）を入れる変数
        int birth_m;
        // 生年月日（日）を入れる変数
        int birth_d;
        
        name = "ikkei miyata";
        birth_y = 1995;
        birth_m = 8;
        birth_d = 12;

        // 私000000000の誕生日は0000年00月00日です。と表示
        System.out.println("私" + name + "の誕生日は\n"+birth_y+ "年"+birth_m+ "月"+birth_d+ "日です。");

    }
}