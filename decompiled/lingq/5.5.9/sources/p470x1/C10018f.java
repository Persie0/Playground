package p470x1;

import p338qd.C8584v;

/* JADX INFO: renamed from: x1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10018f {

    /* JADX INFO: renamed from: b */
    public static final long f50967b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f50968c = 0;

    /* JADX INFO: renamed from: a */
    public final long f50969a;

    static {
        float f3 = 0;
        C8584v.m16786k(f3, f3);
        f50967b = C8584v.m16786k(Float.NaN, Float.NaN);
    }

    public /* synthetic */ C10018f(long j10) {
        this.f50969a = j10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final float m18620a(long j10) {
        if (j10 != f50967b) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static final float m18621b(long j10) {
        if (j10 != f50967b) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    /* JADX INFO: renamed from: c */
    public static String m18622c(long j10) {
        if (!(j10 != f50967b)) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C10017e.m18619f(m18620a(j10))) + ", " + ((Object) C10017e.m18619f(m18621b(j10))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10018f) {
            return this.f50969a == ((C10018f) obj).f50969a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f50969a);
    }

    public final String toString() {
        return m18622c(this.f50969a);
    }
}
