package p000;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class s3b {

    /* JADX INFO: renamed from: c */
    public static final Pattern f60246c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f60247d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final k47 f60248a = new k47();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f60249b = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public static String m21054a(k47 k47Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = k47Var.f46701b;
        int i2 = k47Var.f46702c;
        while (i < i2 && !z) {
            char c = (char) k47Var.f46700a[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        k47Var.m14819N(i - k47Var.f46701b);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m21055b(k47 k47Var, StringBuilder sb) {
        m21056c(k47Var);
        if (k47Var.m14820a() == 0) {
            return null;
        }
        String strM21054a = m21054a(k47Var, sb);
        if (!strM21054a.isEmpty()) {
            return strM21054a;
        }
        return "" + ((char) k47Var.m14842z());
    }

    /* JADX INFO: renamed from: c */
    public static void m21056c(k47 k47Var) {
        while (true) {
            for (boolean z = true; k47Var.m14820a() > 0 && z; z = false) {
                int i = k47Var.f46701b;
                byte[] bArr = k47Var.f46700a;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    k47Var.m14819N(1);
                } else {
                    int i2 = k47Var.f46702c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            k47Var.m14819N(i2 - k47Var.f46701b);
                        }
                    }
                }
            }
            return;
        }
    }
}
