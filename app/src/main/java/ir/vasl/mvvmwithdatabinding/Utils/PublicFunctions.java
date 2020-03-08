package ir.vasl.mvvmwithdatabinding.Utils;

public class PublicFunctions {

    public static boolean isNullOrEmpty(String text) {
        return (text == null || text.trim().equals("null") || text.trim().length() <= 0);
    }
}
