package java.lang;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2020/11/16 下午9:31
 * @Description:
 */
public class String {

    @Override
    public String toString(){
        return "Hello";
    }

    public static void main(String[] args) {
        System.out.println("1");
        String str = new String();
        System.out.println(str.getClass().getClassLoader());
        str.toString();
    }
}
