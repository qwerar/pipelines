class Test {

    static void main(String[] args) {
        List<Integer> val = Arrays.asList(1, 3, 4, 5)
        println sum(val, 6)

        // println(val.toArray())
    }

    static int sum(List<Integer> list, int condition) {
        int sum = 0;
        for (Integer t : list) {
            sum += t;
        }list.parallelStream()
        return sum;

    }


}
