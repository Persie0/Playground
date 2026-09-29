package p397ta;

import java.util.regex.Pattern;
import p479xa.C10151t;

/* JADX INFO: renamed from: ta.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9235c {

    /* JADX INFO: renamed from: c */
    public static final Pattern f47877c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f47878d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final C10151t f47879a = new C10151t();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f47880b = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public static String m17591a(C10151t c10151t, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = c10151t.f51439b;
        int i11 = c10151t.f51440c;
        while (i10 < i11 && !z10) {
            char c10 = (char) c10151t.f51438a[i10];
            if ((c10 < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z')) {
                if ((c10 < '0' || c10 > '9') && c10 != '#' && c10 != '-' && c10 != '.' && c10 != '_') {
                    z10 = true;
                }
            }
            i10++;
            sb2.append(c10);
        }
        c10151t.m19125F(i10 - c10151t.f51439b);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m17592b(C10151t c10151t, StringBuilder sb2) {
        m17593c(c10151t);
        if (c10151t.f51440c - c10151t.f51439b == 0) {
            return null;
        }
        String strM17591a = m17591a(c10151t, sb2);
        if (!"".equals(strM17591a)) {
            return strM17591a;
        }
        return "" + ((char) c10151t.m19145t());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX INFO: renamed from: c */
    public static void m17593c(C10151t c10151t) {
        boolean z10;
        boolean z11;
        while (true) {
            while (true) {
                boolean z12 = true;
                while (true) {
                    int i10 = c10151t.f51440c;
                    int i11 = c10151t.f51439b;
                    if (i10 - i11 <= 0 || !z12) {
                        return;
                    }
                    char c10 = (char) c10151t.f51438a[i11];
                    if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                        c10151t.m19125F(1);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        int i12 = c10151t.f51439b;
                        int i13 = c10151t.f51440c;
                        byte[] bArr = c10151t.f51438a;
                        if (i12 + 2 <= i13) {
                            int i14 = i12 + 1;
                            if (bArr[i12] == 47) {
                                int i15 = i14 + 1;
                                if (bArr[i14] == 42) {
                                    while (true) {
                                        int i16 = i15 + 1;
                                        if (i16 >= i13) {
                                            break;
                                        }
                                        if (((char) bArr[i15]) == '*' && ((char) bArr[i16]) == '/') {
                                            i13 = i16 + 1;
                                            i15 = i13;
                                        } else {
                                            i15 = i16;
                                        }
                                    }
                                    c10151t.m19125F(i13 - c10151t.f51439b);
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            z12 = false;
                        }
                    }
                }
            }
        }
    }
}
