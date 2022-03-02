class Benchmark {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 60000;
        long i = 0;
        while (true) {
            double x = Math.sqrt(i);
            long now = System.currentTimeMillis();
            if (now > endTime) {
                break;
            }
            i++;
        }
        System.out.println(i + " loops in one minute.");
    }
}