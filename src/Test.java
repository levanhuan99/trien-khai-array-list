public class Test {
    public static void main(String[] args) {
        MyList <String> array=new MyList<>();

                array.add(0,"1");
                array.add(1,"2");
                array.add(2,"3");
                array.add(3,"4");
                array.add(4,"5");
                System.out.println(array.get(0));
                System.out.println(array.get(1));
                System.out.println(array.get(2));
                System.out.println(array.get(3));
                System.out.println(array.get(4));

        System.out.println(array.indexOf("1"));
    }
}
