package p470x1;

import p338qd.C8573r0;

/* JADX INFO: renamed from: x1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10020h {

    /* JADX INFO: renamed from: b */
    public static final long f50973b = C8573r0.m16752r(0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f50974c = 0;

    /* JADX INFO: renamed from: a */
    public final long f50975a;

    public /* synthetic */ C10020h(long j10) {
        this.f50975a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final int m18625a(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public static String m18626b(long j10) {
        return "(" + ((int) (j10 >> 32)) + ", " + m18625a(j10) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10020h) {
            return this.f50975a == ((C10020h) obj).f50975a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f50975a);
    }

    public final String toString() {
        return m18626b(this.f50975a);
    }
}
