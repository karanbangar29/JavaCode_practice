package com.coffeeshop.oops;

public class SingletonAllInOne {

    // 1. Eager Initialization
    static class EagerSingleton {
        private static final EagerSingleton INSTANCE = new EagerSingleton();

        private EagerSingleton() {}

        public static EagerSingleton getInstance() {
            return INSTANCE;
        }
    }

    // 2. Lazy Initialization
    static class LazySingleton {
        private static LazySingleton instance;

        private LazySingleton() {}

        public static LazySingleton getInstance() {
            if (instance == null) {
                instance = new LazySingleton();
            }
            return instance;
        }
    }

    // 3. Synchronized Method
    static class SyncSingleton {
        private static SyncSingleton instance;

        private SyncSingleton() {}

        public static synchronized SyncSingleton getInstance() {
            if (instance == null) {
                instance = new SyncSingleton();
            }
            return instance;
        }
    }

    // 4. Double Checked Locking
    static class DoubleCheckSingleton {
        private static volatile DoubleCheckSingleton instance;

        private DoubleCheckSingleton() {}

        public static DoubleCheckSingleton getInstance() {
            if (instance == null) {
                synchronized (DoubleCheckSingleton.class) {
                    if (instance == null) {
                        instance = new DoubleCheckSingleton();
                    }
                }
            }
            return instance;
        }
    }

    // 5. Bill Pugh Singleton
    static class BillPughSingleton {

        private BillPughSingleton() {}

        private static class Helper {
            private static final BillPughSingleton INSTANCE = new BillPughSingleton();
        }

        public static BillPughSingleton getInstance() {
            return Helper.INSTANCE;
        }
    }


    // 6. Enum Singleton
    enum EnumSingleton {
        INSTANCE;

        public void show() {
            System.out.println("Enum Singleton Working");
        }
    }

    // 🔥 TEST METHODS

    // Basic Test
    public static void basicTest(Object obj1, Object obj2, String name) {
        System.out.println("---- " + name + " ----");
        System.out.println("Same instance: " + (obj1 == obj2));
        System.out.println("Hash1: " + obj1.hashCode());
        System.out.println("Hash2: " + obj2.hashCode());
    }

    // Multithreading Test
    public static void threadTest(Runnable task, String name) {
        System.out.println("---- Thread Test: " + name + " ----");
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }


    // MAIN METHOD
    public static void main(String[] args) {

        //  Basic Tests
        basicTest(EagerSingleton.getInstance(), EagerSingleton.getInstance(), "Eager");
        basicTest(LazySingleton.getInstance(), LazySingleton.getInstance(), "Lazy");
        basicTest(SyncSingleton.getInstance(), SyncSingleton.getInstance(), "Synchronized");
        basicTest(DoubleCheckSingleton.getInstance(), DoubleCheckSingleton.getInstance(), "DoubleCheck");
        basicTest(BillPughSingleton.getInstance(), BillPughSingleton.getInstance(), "BillPugh");

        // Enum test
        System.out.println("---- Enum ----");
        EnumSingleton.INSTANCE.show();

        //  Thread Tests
        threadTest(() -> {
            System.out.println("Lazy: " + LazySingleton.getInstance().hashCode());
        }, "Lazy (Not Thread Safe )");

        threadTest(() -> {
            System.out.println("DoubleCheck: " + DoubleCheckSingleton.getInstance().hashCode());
        }, "DoubleCheck (Thread Safe )");

        threadTest(() -> {
            System.out.println("BillPugh: " + BillPughSingleton.getInstance().hashCode());
        }, "BillPugh (Thread Safe )");
    }
}