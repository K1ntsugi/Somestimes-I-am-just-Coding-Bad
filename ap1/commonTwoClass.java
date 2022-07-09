class commonTwoClass {
    public int commonTwo(String[] a, String[] b) {
        int j = 0;
        int k = 0;
        int count = 0;
        while (true) {
            if (a[j].compareTo(b[k]) == 0) {
                String buffer = a[j];
                count++;
                while (j < a.length && buffer.compareTo(a[j]) == 0)
                    j++;
                while (k < b.length && buffer.compareTo(b[k]) == 0)
                    k++;
            } else {
                while (j < a.length && a[j].compareTo(b[k]) < 0)
                    j++;
                while (k < b.length && a[j].compareTo(b[k]) > 0)
                    k++;
            }
            if (j >= a.length - 1 || k >= b.length - 1) {
                break;
            }
        }
        return count;
    }
}
