package p000;

import com.google.android.gms.internal.measurement.zzabo;

/* JADX INFO: loaded from: classes.dex */
public final class pnd {

    /* JADX INFO: renamed from: d */
    public static final long f56538d;

    /* JADX INFO: renamed from: e */
    public static final pnd f56539e;

    /* JADX INFO: renamed from: a */
    public final int f56540a;

    /* JADX INFO: renamed from: b */
    public final int f56541b;

    /* JADX INFO: renamed from: c */
    public final int f56542c;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        f56538d = jCharAt;
        f56539e = new pnd(0, -1, -1);
    }

    public pnd(int i, int i2, int i3) {
        this.f56540a = i;
        this.f56541b = i2;
        this.f56542c = i3;
    }

    /* JADX INFO: renamed from: e */
    public static int m19418e(int i, String str, int i2) {
        if (i == i2) {
            throw zzabo.m5417b("missing precision", i - 1, str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw zzabo.m5417b("invalid precision character", i4, str);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw zzabo.m5416a("precision too large", i, i2, str);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw zzabo.m5416a("invalid precision", i, i2, str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19419a() {
        return this == f56539e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19420b(int i, boolean z) {
        int i2;
        if (m19419a()) {
            return true;
        }
        int i3 = ~i;
        int i4 = this.f56540a;
        if ((i3 & i4) != 0) {
            return false;
        }
        if ((!z && this.f56542c != -1) || (i4 & 9) == 9 || (i2 = i4 & 96) == 96) {
            return false;
        }
        return i2 == 0 || this.f56541b != -1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19421c() {
        return (this.f56540a & 128) != 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m19422d(StringBuilder sb) {
        if (m19419a()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = this.f56540a & (-129);
            int i3 = 1 << i;
            if (i3 > i2) {
                break;
            }
            if ((i2 & i3) != 0) {
                sb.append(" #(+,-0".charAt(i));
            }
            i++;
        }
        int i4 = this.f56541b;
        if (i4 != -1) {
            sb.append(i4);
        }
        int i5 = this.f56542c;
        if (i5 != -1) {
            sb.append('.');
            sb.append(i5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pnd) {
            pnd pndVar = (pnd) obj;
            if (pndVar.f56540a == this.f56540a && pndVar.f56541b == this.f56541b && pndVar.f56542c == this.f56542c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f56540a * 31) + this.f56541b) * 31) + this.f56542c;
    }
}
