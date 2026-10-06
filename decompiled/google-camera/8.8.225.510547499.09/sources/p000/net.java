package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class net extends ner {

    /* JADX INFO: renamed from: a */
    private static final String f42155a;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
            if (!property.matches("\\n|\\r(?:\\n)?")) {
                property = "\n";
            }
        } catch (SecurityException e) {
        }
        f42155a = property;
    }

    /* JADX INFO: renamed from: b */
    public static int m17427b(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else {
                if (i2 >= str.length()) {
                    throw nes.m17425c("trailing unquoted '%' character", str, i2 - 1);
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i2 - 1;
                }
                i = i2 + 1;
            }
        }
        return -1;
    }

    @Override // p000.ner
    /* JADX INFO: renamed from: a */
    public final void mo17422a(StringBuilder sb, String str, int i, int i2) {
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
                    sb.append((CharSequence) str, i3, i4 - 1);
                    sb.append(f42155a);
                }
                i3 = i4 + 1;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }
}
