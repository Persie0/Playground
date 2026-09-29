package p000;

import com.google.android.gms.internal.measurement.zzabo;

/* JADX INFO: loaded from: classes.dex */
public abstract class sgb {

    /* JADX INFO: renamed from: a */
    public static final String f60849a;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
            if (!property.matches("\\n|\\r(?:\\n)?")) {
                property = "\n";
            }
        } catch (SecurityException unused) {
        }
        f60849a = property;
    }

    /* JADX INFO: renamed from: a */
    public static void m21366a(int i, int i2, String str, StringBuilder sb) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char cCharAt = str.charAt(i4);
                if (cCharAt == '%') {
                    sb.append((CharSequence) str, i3, i4);
                } else if (cCharAt == 'n') {
                    sb.append((CharSequence) str, i3, i);
                    sb.append(f60849a);
                }
                i3 = i + 2;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m21367b(int i, String str) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else {
                if (i2 >= str.length()) {
                    throw zzabo.m5418c("trailing unquoted '%' character", i, str);
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i;
                }
                i += 2;
            }
        }
        return -1;
    }
}
