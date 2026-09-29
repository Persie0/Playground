package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class nc3 {

    /* JADX INFO: renamed from: a */
    public static final double f52590a = Math.log(10.0d);

    /* JADX INFO: renamed from: a */
    public static void m17345a(Appendable appendable, int i, int i2) {
        int iLog;
        if (i < 0) {
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
            return;
        }
        if (i < 100) {
            while (i2 > 2) {
                appendable.append('0');
                i2--;
            }
            int i3 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i3 + 48));
            appendable.append((char) (((i - (i3 << 3)) - (i3 << 1)) + 48));
            return;
        }
        if (i < 1000) {
            iLog = 3;
        } else {
            iLog = i < 10000 ? 4 : ((int) (Math.log(i) / f52590a)) + 1;
        }
        while (i2 > iLog) {
            appendable.append('0');
            i2--;
        }
        appendable.append(Integer.toString(i));
    }

    /* JADX INFO: renamed from: b */
    public static void m17346b(int i, StringBuilder sb) {
        if (i < 0) {
            sb.append('-');
            if (i == Integer.MIN_VALUE) {
                sb.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            sb.append((char) (i + 48));
        } else {
            if (i >= 100) {
                sb.append((CharSequence) Integer.toString(i));
                return;
            }
            int i2 = ((i + 1) * 13421772) >> 27;
            sb.append((char) (i2 + 48));
            sb.append((char) (((i - (i2 << 3)) - (i2 << 1)) + 48));
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m17347c(int i, String str) {
        String strConcat = str.length() <= i + 35 ? str : str.substring(0, i + 32).concat("...");
        if (i <= 0) {
            return ux5.m22986i('\"', "Invalid format: \"", strConcat);
        }
        if (i >= str.length()) {
            return wq1.m24118n("Invalid format: \"", strConcat, "\" is too short");
        }
        StringBuilder sbM17742q = AbstractC3393o1.m17742q("Invalid format: \"", strConcat, "\" is malformed at \"");
        sbM17742q.append(strConcat.substring(i));
        sbM17742q.append('\"');
        return sbM17742q.toString();
    }

    /* JADX INFO: renamed from: d */
    public static int m17348d(CharSequence charSequence, int i) {
        int iCharAt = charSequence.charAt(i) - '0';
        return (charSequence.charAt(i + 1) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
    }
}
