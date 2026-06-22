class Secmax {
    public static void main(String[] args) {
        int arr[] = {78,8,67,34,78,90,12,46,87};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int sec_max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sec_max && arr[i] < max)
                sec_max = arr[i];
        }

        System.out.println(sec_max);
    }
}