package p021j$.time.temporal;

import java.io.Serializable;
import p021j$.time.C0417b;

/* JADX INFO: renamed from: j$.time.temporal.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C0488q implements Serializable {

    /* JADX INFO: renamed from: a */
    private final long f33068a;

    /* JADX INFO: renamed from: b */
    private final long f33069b;

    /* JADX INFO: renamed from: c */
    private final long f33070c;

    /* JADX INFO: renamed from: d */
    private final long f33071d;

    private C0488q(long j, long j2, long j3, long j4) {
        this.f33068a = j;
        this.f33069b = j2;
        this.f33070c = j3;
        this.f33071d = j4;
    }

    /* JADX INFO: renamed from: c */
    private String m12446c(long j, InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l == null) {
            return "Invalid value (valid values " + String.valueOf(this) + "): " + j;
        }
        return "Invalid value for " + String.valueOf(interfaceC0483l) + " (valid values " + String.valueOf(this) + "): " + j;
    }

    /* JADX INFO: renamed from: i */
    public static C0488q m12447i(long j, long j2) {
        if (j <= j2) {
            return new C0488q(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* JADX INFO: renamed from: j */
    public static C0488q m12448j(long j, long j2, long j3) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j2 > j3) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 <= j3) {
            return new C0488q(j, 1L, j2, j3);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* JADX INFO: renamed from: k */
    public static C0488q m12449k(long j, long j2) {
        return m12448j(1L, j, j2);
    }

    /* JADX INFO: renamed from: a */
    public final int m12450a(long j, InterfaceC0483l interfaceC0483l) {
        if (m12455g() && m12456h(j)) {
            return (int) j;
        }
        throw new C0417b(m12446c(j, interfaceC0483l));
    }

    /* JADX INFO: renamed from: b */
    public final void m12451b(long j, InterfaceC0483l interfaceC0483l) {
        if (!m12456h(j)) {
            throw new C0417b(m12446c(j, interfaceC0483l));
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m12452d() {
        return this.f33071d;
    }

    /* JADX INFO: renamed from: e */
    public final long m12453e() {
        return this.f33068a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0488q)) {
            return false;
        }
        C0488q c0488q = (C0488q) obj;
        return this.f33068a == c0488q.f33068a && this.f33069b == c0488q.f33069b && this.f33070c == c0488q.f33070c && this.f33071d == c0488q.f33071d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12454f() {
        return this.f33068a == this.f33069b && this.f33070c == this.f33071d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12455g() {
        return this.f33068a >= -2147483648L && this.f33071d <= 2147483647L;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12456h(long j) {
        return j >= this.f33068a && j <= this.f33071d;
    }

    public final int hashCode() {
        long j = this.f33069b;
        long j2 = this.f33068a + (j << 16) + (j >> 48);
        long j3 = this.f33070c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.f33071d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) ((j6 >>> 32) ^ j6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.f33068a;
        sb.append(j);
        long j2 = this.f33069b;
        if (j != j2) {
            sb.append('/');
            sb.append(j2);
        }
        sb.append(" - ");
        long j3 = this.f33070c;
        sb.append(j3);
        long j4 = this.f33071d;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        return sb.toString();
    }
}
