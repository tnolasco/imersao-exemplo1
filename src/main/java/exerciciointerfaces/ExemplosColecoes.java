package exerciciointerfaces;

import java.util.*;

public class ExemplosColecoes {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(3);
        list.add("aa");

        if(list.get(0) instanceof Integer){
//            System.out.println(list.get(0));
        }

        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,2,1,4,5,6,6,5));
        //list2.add(10);

        for (Integer integer : list2) {
            System.out.println(integer);
        }

        HashSet<String> set=new HashSet<String>();//LinkedHashSet /TreeSet
        set.add("Java");
        set.add("PHP");
        set.add("C#");
        set.add("JS");
        set.add("Java");
        set.add(null);

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("------------------");
        Vector<Integer> v = new Vector();
        v.addElement(1);
        v.addElement(2);
        System.out.println(v.elementAt(0));

        System.out.println("------------------");
        HashMap<Integer, String> h = new HashMap();
        h.put(1,"imersao");
        h.put(2,"java");
        h.put(2,"PHP");
//        h.put(null, "C#");

        for (Map.Entry e : h.entrySet()) {
            System.out.println(e.getKey() +" -> "+e.getValue());
        }

        int arr[] = new int[] {1, 2, 3, 4};
        System.out.println(arr[0]);

//        List<String> list = Arrays.asList("A", "B");
//
//        List<String> anotherList = new ArrayList<>();
//        anotherList.add("C");
//        anotherList.add("D");
//
//        list.forEach(System.out::println);
//        anotherList.forEach(System.out::println);
//
//        Collections.copy(destList, sourceList);
//
//        List<String> listNames = Arrays.asList("Tom", "John", "Mary", "Peter", "David", "Alice");
//        System.out.println("Original list: " + listNames);
//        List<String> subList = listNames.subList(2, 5);
//        System.out.println("Sub list: " + subList);
    }
}
