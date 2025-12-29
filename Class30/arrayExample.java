class Test {
    int[] eids;

    {
        eids = new int[4];
        System.out.println(eids[0]);
    }

    public static void main(String[] args) {
        new Test();   // object creation triggers instance block
    }
}
