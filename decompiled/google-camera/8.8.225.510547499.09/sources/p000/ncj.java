package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ncj {

    /* JADX INFO: renamed from: a */
    public static final ncj f42004a;

    /* JADX INFO: renamed from: e */
    private static final long f42005e;

    /* JADX INFO: renamed from: b */
    public final int f42006b;

    /* JADX INFO: renamed from: c */
    public final int f42007c;

    /* JADX INFO: renamed from: d */
    public final int f42008d;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        f42005e = jCharAt;
        f42004a = new ncj(0, -1, -1);
    }

    public ncj(int i, int i2, int i3) {
        this.f42006b = i;
        this.f42007c = i2;
        this.f42008d = i3;
    }

    /* JADX INFO: renamed from: a */
    public static int m17331a(char c) {
        return ((int) ((f42005e >>> ((c - ' ') * 3)) & 7)) - 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m17332b(String str, int i, int i2) {
        if (i == i2) {
            throw nes.m17423a("missing precision", str, i - 1);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw nes.m17423a("invalid precision character", str, i4);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw nes.m17424b("precision too large", str, i, i2);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw nes.m17424b("invalid precision", str, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17333c() {
        return this == f42004a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17334d() {
        return (this.f42006b & 128) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17335e(int i, boolean z) {
        int i2;
        if (m17333c()) {
            return true;
        }
        int i3 = this.f42006b;
        if (((i ^ (-1)) & i3) != 0) {
            return false;
        }
        if (!z && this.f42008d != -1) {
            return false;
        }
        int i4 = this.f42007c;
        if ((i3 & 9) == 9 || (i2 = i3 & 96) == 96) {
            return false;
        }
        return i2 == 0 || i4 != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ncj) {
            ncj ncjVar = (ncj) obj;
            if (ncjVar.f42006b == this.f42006b && ncjVar.f42007c == this.f42007c && ncjVar.f42008d == this.f42008d) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m17336f(StringBuilder sb) {
        if (m17333c()) {
            return;
        }
        int i = this.f42006b & (-129);
        int i2 = 0;
        while (true) {
            int i3 = 1 << i2;
            if (i3 > i) {
                break;
            }
            if ((i3 & i) != 0) {
                sb.append(" #(+,-0".charAt(i2));
            }
            i2++;
        }
        int i4 = this.f42007c;
        if (i4 != -1) {
            sb.append(i4);
        }
        if (this.f42008d != -1) {
            sb.append('.');
            sb.append(this.f42008d);
        }
    }

    public final int hashCode() {
        return (((this.f42006b * 31) + this.f42007c) * 31) + this.f42008d;
    }
}
