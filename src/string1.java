public class string1 {
    public static void main(String[] args) {
        String name = " ajay KUMAR ";
        String name2= "";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(6));
        System.out.println(name.contains("kumar"));
        System.out.println(name.contentEquals("ajay"));
        System.out.println(name.endsWith("y"));
        System.out.println(name.isBlank());
        System.out.println(name.concat("pc"));
        System.out.println(name.lastIndexOf('r'));
        System.out.println(name.replace("kumar", "yadhav"));
        System.out.println(name.substring(5,8));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.repeat(5));
        System.out.println(name2.isEmpty());
    }
}
