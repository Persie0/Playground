package p000;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class gm1 {

    /* JADX INFO: renamed from: k */
    public static final Pattern f40991k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f40992l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f40993m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n */
    public static final Pattern f40994n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f40995a;

    /* JADX INFO: renamed from: b */
    public final String f40996b;

    /* JADX INFO: renamed from: c */
    public final long f40997c;

    /* JADX INFO: renamed from: d */
    public final String f40998d;

    /* JADX INFO: renamed from: e */
    public final String f40999e;

    /* JADX INFO: renamed from: f */
    public final boolean f41000f;

    /* JADX INFO: renamed from: g */
    public final boolean f41001g;

    /* JADX INFO: renamed from: h */
    public final boolean f41002h;

    /* JADX INFO: renamed from: i */
    public final boolean f41003i;

    /* JADX INFO: renamed from: j */
    public final String f41004j;

    public gm1(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.f40995a = str;
        this.f40996b = str2;
        this.f40997c = j;
        this.f40998d = str3;
        this.f40999e = str4;
        this.f41000f = z;
        this.f41001g = z2;
        this.f41002h = z3;
        this.f41003i = z4;
        this.f41004j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gm1)) {
            return false;
        }
        gm1 gm1Var = (gm1) obj;
        return gm1Var.f40995a.equals(this.f40995a) && gm1Var.f40996b.equals(this.f40996b) && gm1Var.f40997c == this.f40997c && gm1Var.f40998d.equals(this.f40998d) && gm1Var.f40999e.equals(this.f40999e) && gm1Var.f41000f == this.f41000f && gm1Var.f41001g == this.f41001g && gm1Var.f41002h == this.f41002h && gm1Var.f41003i == this.f41003i && fa4.m11650l(gm1Var.f41004j, this.f41004j);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(ux5.m22980c(ux5.m22980c(ux5.m22981d(this.f40997c, ux5.m22980c(ux5.m22980c(527, this.f40995a, 31), this.f40996b, 31), 31), this.f40998d, 31), this.f40999e, 31), 31, this.f41000f), 31, this.f41001g), 31, this.f41002h), 31, this.f41003i);
        String str = this.f41004j;
        return iM12428e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40995a);
        sb.append('=');
        sb.append(this.f40996b);
        if (this.f41002h) {
            long j = this.f40997c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) a12.f54a.get()).format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.f41003i) {
            sb.append("; domain=");
            sb.append(this.f40998d);
        }
        sb.append("; path=");
        sb.append(this.f40999e);
        if (this.f41000f) {
            sb.append("; secure");
        }
        if (this.f41001g) {
            sb.append("; httponly");
        }
        String str2 = this.f41004j;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
