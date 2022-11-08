package others;

class Question1 {
    public static void main(String[] args) {
        char[] charArray = Alphabet.randomChar(new char[10]);
    }
}

class Alphabet{
    public static char[] randomChar(char[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (char)(65 + Math.random() * 26);
        }
        return arr;
    }
}
