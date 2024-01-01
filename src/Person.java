public class Person {
    private String name = null;
    private int age = 0;
//  privateに変更したことでアクセスの許可範囲がpublicの全てクラスから
//    自分のクラスのみなる
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
//        get は値を取得すること。
//        getの後の1文字は大文字になる。 getの時は必ずreturnします。
//        今回だと getName でフィールドの値の取得を して呼び出し元に返します。
    }

    public void setName(String name) {
        this.name = name;
//        set は登録すること。
//        setの後の1文字も大文字になるので注意。
//        set の時は戻り値の型の位置に voidと書きます。
//        今回だとsetNameで名前を書き換える「処理」を行うだけなので戻り値なしの void になる。
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//3  カプセル化・・・隠しておきたい値(データ)の隠蔽をすること。そのなかで、必要な 情報を書き込んだり取得したりすることが出来きます。  
