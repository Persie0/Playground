package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfk {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f3095a = 0;

    /* JADX INFO: renamed from: c */
    private static boolean[] f3097c = new boolean[256];

    /* JADX INFO: renamed from: b */
    private static boolean[] f3096b = new boolean[256];

    static {
        boolean z;
        char c = 0;
        while (true) {
            boolean[] zArr = f3097c;
            int length = zArr.length;
            if (c >= 256) {
                return;
            }
            boolean[] zArr2 = f3096b;
            boolean z2 = true;
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && c != ':' && c != '_' && (c < 192 || c > 214))) {
                z = c >= 216 && c <= 246;
            } else {
                z = true;
            }
            zArr2[c] = z;
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && ((c < '0' || c > '9') && c != ':' && c != '_' && c != '-' && c != '.' && c != 183 && ((c < 192 || c > 214) && (c < 216 || c > 246))))) {
                z2 = false;
            }
            zArr[c] = z2;
            c = (char) (c + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2309a(String str) {
        if ("x-default".equals(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            switch (str.charAt(i2)) {
                case ' ':
                    break;
                case '-':
                case '_':
                    stringBuffer.append('-');
                    i++;
                    break;
                default:
                    if (i != 2) {
                        stringBuffer.append(Character.toLowerCase(str.charAt(i2)));
                    } else {
                        stringBuffer.append(Character.toUpperCase(str.charAt(i2)));
                    }
                    break;
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    static boolean m2310b(char c) {
        if (c > 31) {
            if (c != 127) {
                return false;
            }
            c = 127;
        }
        return (c == '\t' || c == '\n' || c == '\r') ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2311c(char c) {
        return c > 255 || f3097c[c];
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2312d(char c) {
        return c > 255 || f3096b[c];
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2313e(String str) {
        int i;
        if (str.length() <= 0) {
            i = 1;
        } else {
            if (!m2312d(str.charAt(0)) || str.charAt(0) == ':') {
                return false;
            }
            i = 1;
        }
        while (i < str.length()) {
            if (!m2311c(str.charAt(i)) || str.charAt(i) == ':') {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static String[] m2314f(String str) {
        int iIndexOf = str.indexOf(61);
        String strSubstring = str.substring(str.charAt(1) == '?' ? 2 : 1, iIndexOf);
        int i = iIndexOf + 1;
        char cCharAt = str.charAt(i);
        int length = str.length() - 2;
        StringBuffer stringBuffer = new StringBuffer(length - iIndexOf);
        int i2 = i + 1;
        while (i2 < length) {
            stringBuffer.append(str.charAt(i2));
            i2++;
            if (str.charAt(i2) == cCharAt) {
                i2++;
            }
        }
        return new String[]{strSubstring, stringBuffer.toString()};
    }
}
