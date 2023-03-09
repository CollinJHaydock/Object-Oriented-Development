package Week9;

import java.util.List;
    public class RunHibernate {
        public static void main(String[] args) {

            TestHibernate test = TestHibernate.getInstance();

            Customer collin = test.getCustomer(1);
            System.out.println(collin);

            List<Customer> c = test.getCustomers();
            for (Customer i : c) {
                System.out.println(i);
            }

            System.out.println(test.getCustomer(1));
        }
    }
