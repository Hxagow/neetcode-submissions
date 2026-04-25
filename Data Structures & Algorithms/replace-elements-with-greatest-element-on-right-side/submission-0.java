class Solution {
    public int[] replaceElements(int[] arr) {
        int[] buffer = new int[arr.length];
        buffer = arr;

        for (int i = 0; i < arr.length - 1; i++) {
            int greater = buffer[i+1];
            for (int j = i + 1; j < arr.length; j++) {
                if (greater < buffer[j]) greater = buffer[j];
                buffer[i] = greater;
            }
        }
        buffer[buffer.length - 1] = -1;

        return buffer;
    }
}