public static boolean isPrime(int n){
    if (n <= 3) {
        return n > 1;
    }
    for(int i = 2; i < n; i++){
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
