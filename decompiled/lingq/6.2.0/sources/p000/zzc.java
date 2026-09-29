package p000;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc extends b0d {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f72438b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzc(Unsafe unsafe, int i) {
        super(unsafe);
        this.f72438b = i;
    }

    @Override // p000.b0d
    /* JADX INFO: renamed from: a */
    public final byte mo25a(Object obj, long j) {
        switch (this.f72438b) {
            case 0:
                return f0d.f38164g ? f0d.m11447n(obj, j) : f0d.m11448o(obj, j);
            default:
                return f0d.f38164g ? f0d.m11447n(obj, j) : f0d.m11448o(obj, j);
        }
    }

    @Override // p000.b0d
    /* JADX INFO: renamed from: c */
    public final void mo26c(Object obj, long j, byte b) {
        switch (this.f72438b) {
            case 0:
                if (!f0d.f38164g) {
                    f0d.m11443j(obj, j, b);
                } else {
                    f0d.m11442i(obj, j, b);
                }
                break;
            default:
                if (!f0d.f38164g) {
                    f0d.m11443j(obj, j, b);
                } else {
                    f0d.m11442i(obj, j, b);
                }
                break;
        }
    }

    @Override // p000.b0d
    /* JADX INFO: renamed from: d */
    public final void mo27d(Object obj, long j, double d) {
        switch (this.f72438b) {
            case 0:
                m3151f(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m3151f(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // p000.b0d
    /* JADX INFO: renamed from: e */
    public final void mo28e(Object obj, long j, float f) {
        switch (this.f72438b) {
            case 0:
                m3150b(j, obj, Float.floatToIntBits(f));
                break;
            default:
                m3150b(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // p000.b0d
    /* JADX INFO: renamed from: g */
    public final void mo29g(Object obj, long j, boolean z) {
        switch (this.f72438b) {
            case 0:
                if (!f0d.f38164g) {
                    f0d.m11443j(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    f0d.m11442i(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!f0d.f38164g) {
                    f0d.m11443j(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    f0d.m11442i(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // p000.b0d
    /* JADX INFO: renamed from: h */
    public final boolean mo30h(Object obj, long j) {
        switch (this.f72438b) {
            case 0:
                if (f0d.f38164g) {
                    if (f0d.m11447n(obj, j) == 0) {
                        return false;
                    }
                } else if (f0d.m11448o(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (f0d.f38164g) {
                    if (f0d.m11447n(obj, j) == 0) {
                        return false;
                    }
                } else if (f0d.m11448o(obj, j) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // p000.b0d
    /* JADX INFO: renamed from: i */
    public final float mo31i(Object obj, long j) {
        switch (this.f72438b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m3152k(obj, j));
    }

    @Override // p000.b0d
    /* JADX INFO: renamed from: j */
    public final double mo32j(Object obj, long j) {
        switch (this.f72438b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m3153l(obj, j));
    }
}
