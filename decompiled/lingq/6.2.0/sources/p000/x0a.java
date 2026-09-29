package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x0a {

    /* JADX INFO: renamed from: a */
    public Object f67599a;

    /* JADX INFO: renamed from: b */
    public Object f67600b;

    /* JADX INFO: renamed from: c */
    public int f67601c;

    /* JADX INFO: renamed from: d */
    public long f67602d;

    /* JADX INFO: renamed from: e */
    public long f67603e;

    /* JADX INFO: renamed from: f */
    public boolean f67604f;

    /* JADX INFO: renamed from: g */
    public C3175k8 f67605g = C3175k8.f46839c;

    static {
        AbstractC3393o1.m17746u(0, 1, 2, 3, 4);
    }

    /* JADX INFO: renamed from: a */
    public final long m24223a(int i, int i2) {
        C3103i8 c3103i8M14950a = this.f67605g.m14950a(i);
        if (c3103i8M14950a.f43665a != -1) {
            return c3103i8M14950a.f43670f[i2];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public final int m24224b(long j) {
        C3103i8 c3103i8M14950a;
        int i;
        C3175k8 c3175k8 = this.f67605g;
        long j2 = this.f67602d;
        int i2 = c3175k8.f46841a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                c3175k8.m14950a(i3).getClass();
                c3175k8.m14950a(i3).getClass();
                if (0 > j && ((i = (c3103i8M14950a = c3175k8.m14950a(i3)).f43665a) == -1 || c3103i8M14950a.m13715a(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                if (j2 != -9223372036854775807L) {
                    c3175k8.m14950a(i3).getClass();
                    if (0 <= j2) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m24225c(long j) {
        C3175k8 c3175k8 = this.f67605g;
        int i = c3175k8.f46841a;
        int i2 = i - 1;
        if (i2 == i - 1) {
            c3175k8.m14950a(i2).getClass();
        }
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            c3175k8.m14950a(i2).getClass();
            if (j >= 0) {
                break;
            }
            i2--;
        }
        if (i2 >= 0) {
            C3103i8 c3103i8M14950a = c3175k8.m14950a(i2);
            int i3 = c3103i8M14950a.f43665a;
            if (i3 != -1) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = c3103i8M14950a.f43669e[i4];
                    if (i5 != 0 && i5 != 1) {
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final long m24226d(int i) {
        this.f67605g.m14950a(i).getClass();
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final int m24227e(int i) {
        return this.f67605g.m14950a(i).m13715a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !x0a.class.equals(obj.getClass())) {
            return false;
        }
        x0a x0aVar = (x0a) obj;
        return Objects.equals(this.f67599a, x0aVar.f67599a) && Objects.equals(this.f67600b, x0aVar.f67600b) && this.f67601c == x0aVar.f67601c && this.f67602d == x0aVar.f67602d && this.f67603e == x0aVar.f67603e && this.f67604f == x0aVar.f67604f && Objects.equals(this.f67605g, x0aVar.f67605g);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m24228f(int i) {
        C3175k8 c3175k8 = this.f67605g;
        int i2 = c3175k8.f46841a;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        c3175k8.m14950a(i).getClass();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m24229g(int i) {
        this.f67605g.m14950a(i).getClass();
        return false;
    }

    public final int hashCode() {
        Object obj = this.f67599a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f67600b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f67601c) * 31;
        long j = this.f67602d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f67603e;
        return this.f67605g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f67604f ? 1 : 0)) * 31);
    }
}
