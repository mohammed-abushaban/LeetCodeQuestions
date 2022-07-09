/**
 * IsSameAfterReversals
 */
public class IsSameAfterReversals {

    public static boolean isSameAfterReversals(int num) {
        if ((num < 10 && num >= 0) || (num > -10 && num < 0))
            return true;
        if (num % 10 == 0)
            return false;
        int temp = num;
        int reverse1 = 0;
        while (temp != 0) {
            reverse1 = reverse1 * 10 + temp % 10;
            temp = temp / 10;
        }
        int reverse2 = 0;
        while (reverse1 != 0) {
            reverse2 = reverse2 * 10 + reverse1 % 10;
            reverse1 = reverse1 / 10;
        }
        return reverse2 == num;
    }
}