package customgenerictypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){

//        Account acc1 = new Account(1234, 5000);
//
//        System.out.println(acc1.getId());
/*

        Account[] accs = new Account[3];

        accs[0] = new Account(1, 5000);
        accs[1] = new Account(2, 5000);
        accs[2] = new Account(3, 5000);

        System.out.println(Arrays.toString(accs));


    ArrayList<Account> accList = new ArrayList<>();

    for(Account acc : accs){

        accList.add(acc);
    }

    accList.add(new Account(4, 4444));
    accList.remove(accs[0]);
    accList.remove(1);

    System.out.println(accList.toString());

    accList.set(0, new Account(4, 4444));

    accList.add(0, new Account(4, 4444));

    Account acc = accList.get(0);

    System.out.println(accList.toString());
    System.out.println(acc.toString());

    System.out.println(accList.size());

        LinkedList<String> listBio = new LinkedList<>();
        listBio.add(new String ("str1"));
        listBio.add(new String ("str2"));
        listBio.add(new String ("str3"));

        System.out.println(listBio);

        listBio.remove(1);

        System.out.println(listBio);
*/

        List<Integer> list = new LinkedList<>();

        for(int i = 0; i<5000000; i++){

            list.add(new Integer(i));
        }

        long start = System.currentTimeMillis();

        for(int i = 0; i<100; i++){

            list.add(2000000,Integer.MAX_VALUE);
        }

        System.out.println("Время работы LinkedList "+ (System.currentTimeMillis()-start));

        list = new ArrayList<>();

        for(int i = 0; i<5000000; i++){

            list.add(new Integer(i));
        }

       start = System.currentTimeMillis();

        for(int i = 0; i<100; i++){

            list.add(2000000,Integer.MAX_VALUE);
        }

        System.out.println("Время работы ArrayList "+ (System.currentTimeMillis()-start));

    }


}
