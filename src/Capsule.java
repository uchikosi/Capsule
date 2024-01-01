
public class Capsule {
    public static void main(String[] args) {

        Person taro = new Person("山田太郎", 20);
        System.out.println(taro.getName());
        System.out.println(taro.getAge());

        taro.setName("花子");
//        personeクラスのpublic void setName(String name) {this.name = name;}
//        のコードのthis.name部分に花子がsetされる
        System.out.println(taro.getName( ));
//        getName(get の後は大 文字)に変更することで読み取る(name を get)ことが出来るようになります。
//        Personクラスのpublic String getName() {return this.name;}を読み取ってgetする
//        setで変更された変数の花子が表示される
        taro.setAge(30);
        System.out.println(taro.getAge());
    }
}
