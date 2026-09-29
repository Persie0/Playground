package p000;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class u4c extends w4c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f63408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4c(Unsafe unsafe, int i) {
        super(unsafe);
        this.f63408b = i;
    }

    @Override // p000.w4c
    /* JADX INFO: renamed from: c */
    public final void mo22459c(Object obj, long j, double d) {
        switch (this.f63408b) {
            case 0:
                m23755e(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m23755e(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // p000.w4c
    /* JADX INFO: renamed from: d */
    public final void mo22460d(Object obj, long j, float f) {
        switch (this.f63408b) {
            case 0:
                m23754b(j, obj, Float.floatToIntBits(f));
                break;
            default:
                m23754b(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // p000.w4c
    /* JADX INFO: renamed from: f */
    public final void mo22461f(Object obj, long j, boolean z) {
        switch (this.f63408b) {
            case 0:
                if (!b5c.f7986h) {
                    b5c.m3314e(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    b5c.m3312c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!b5c.f7986h) {
                    b5c.m3314e(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    b5c.m3312c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // p000.w4c
    /* JADX INFO: renamed from: i */
    public final boolean mo22462i(Object obj, long j) {
        switch (this.f63408b) {
            case 0:
                if (b5c.f7986h) {
                    if (b5c.m3321l(obj, j) == 0) {
                        return false;
                    }
                } else if (b5c.m3322m(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (b5c.f7986h) {
                    if (b5c.m3321l(obj, j) == 0) {
                        return false;
                    }
                } else if (b5c.m3322m(obj, j) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // p000.w4c
    /* JADX INFO: renamed from: j */
    public final float mo22463j(Object obj, long j) {
        switch (this.f63408b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m23756g(obj, j));
    }

    @Override // p000.w4c
    /* JADX INFO: renamed from: k */
    public final double mo22464k(Object obj, long j) {
        switch (this.f63408b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m23757h(obj, j));
    }

    @Override // p000.w4c
    /* JADX INFO: renamed from: l */
    public final byte mo22465l(Object obj, long j) {
        switch (this.f63408b) {
            case 0:
                return b5c.f7986h ? b5c.m3321l(obj, j) : b5c.m3322m(obj, j);
            default:
                return b5c.f7986h ? b5c.m3321l(obj, j) : b5c.m3322m(obj, j);
        }
    }
}
