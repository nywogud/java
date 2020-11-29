package jhl;
public class BinarySearch {
    public static void main(String[] args) {
 
        /* ã���� �ϴ� ���ҵ� */
        int[] arr = { 105, 273, 345, 401, 753 };
 
        /* ã���� �ϴ� KEY�� */
        int key = 273;
 
        binarySearch(arr, key);
    }
 
    private static void binarySearch(int[] arr, int key) {
 
        /* �迭�� ù��° �ε��� �� */
        int left = 0;
 
        /* �迭�̶� -1�� */
        int right = arr.length - 1;
        int mid;
 
        while (left <= right) {
 
            /* �߾Ӱ��� ����Ѵ� */
            mid = (left + right) / 2;
            System.out.println(mid);
 
            if (key == arr[mid]) {
                System.out.println(key + "���� Array Index ��ġ : " + mid);
                break;
            }
 
            /* ã���� �ϴ� KEY���� �迭�� �߾Ӱ����� ������� */
            if (key < arr[mid]) {
 
                /* �����ʹ� ���ʿ� ��ġ������ right�� mid���� 1�� �� ������ ���� */
                right = mid - 1;
            }
 
            /* ã���� �ϴ� KEY���� �迭�� �߾Ӱ����� Ŭ ��� */
            else {
 
                /* �����ʹ� �����ʿ� ��ġ������ left���� mid���� 1�� ���� ������ ���� */
                left = mid + 1;
            }
        }
    }
}
 
