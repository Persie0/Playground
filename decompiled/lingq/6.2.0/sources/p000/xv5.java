package p000;

import java.nio.charset.Charset;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class xv5 {

    /* JADX INFO: renamed from: e */
    public static final Regex f68845e = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f */
    public static final Regex f68846f = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f68847a;

    /* JADX INFO: renamed from: b */
    public final String f68848b;

    /* JADX INFO: renamed from: c */
    public final String f68849c;

    /* JADX INFO: renamed from: d */
    public final String[] f68850d;

    public xv5(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.f68847a = str;
        this.f68848b = str2;
        this.f68849c = str3;
        this.f68850d = strArr;
    }

    /* JADX INFO: renamed from: a */
    public static Charset m24709a(xv5 xv5Var) {
        String str;
        String[] strArr = xv5Var.f68850d;
        int i = 0;
        int iM23507r = AbstractC3695vr.m23507r(0, strArr.length - 1, 2);
        if (iM23507r < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!cl9.m4834Q(strArr[i], "charset", true)) {
                if (i == iM23507r) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xv5) && fa4.m11650l(((xv5) obj).f68847a, this.f68847a);
    }

    public final int hashCode() {
        return this.f68847a.hashCode();
    }

    public final String toString() {
        return this.f68847a;
    }
}
