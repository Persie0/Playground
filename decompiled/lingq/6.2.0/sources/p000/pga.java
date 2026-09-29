package p000;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class pga extends xga {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f56189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pga(Unsafe unsafe, int i) {
        super(unsafe);
        this.f56189b = i;
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: c */
    public final boolean mo19134c(Object obj, long j) {
        switch (this.f56189b) {
            case 0:
                if (aha.f681g) {
                    if (aha.m412h(obj, j) == 0) {
                        return false;
                    }
                } else if (aha.m413i(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (aha.f681g) {
                    if (aha.m412h(obj, j) == 0) {
                        return false;
                    }
                } else if (aha.m413i(obj, j) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: d */
    public final byte mo19135d(Object obj, long j) {
        switch (this.f56189b) {
            case 0:
                return aha.f681g ? aha.m412h(obj, j) : aha.m413i(obj, j);
            default:
                return aha.f681g ? aha.m412h(obj, j) : aha.m413i(obj, j);
        }
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: e */
    public final double mo19136e(Object obj, long j) {
        switch (this.f56189b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m24506h(obj, j));
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: f */
    public final float mo19137f(Object obj, long j) {
        switch (this.f56189b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m24505g(obj, j));
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: k */
    public final void mo19138k(Object obj, long j, boolean z) {
        switch (this.f56189b) {
            case 0:
                if (!aha.f681g) {
                    aha.m417m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    aha.m416l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!aha.f681g) {
                    aha.m417m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    aha.m416l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: l */
    public final void mo19139l(Object obj, long j, byte b) {
        switch (this.f56189b) {
            case 0:
                if (!aha.f681g) {
                    aha.m417m(obj, j, b);
                } else {
                    aha.m416l(obj, j, b);
                }
                break;
            default:
                if (!aha.f681g) {
                    aha.m417m(obj, j, b);
                } else {
                    aha.m416l(obj, j, b);
                }
                break;
        }
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: m */
    public final void mo19140m(Object obj, long j, double d) {
        switch (this.f56189b) {
            case 0:
                m24510p(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m24510p(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: n */
    public final void mo19141n(Object obj, long j, float f) {
        switch (this.f56189b) {
            case 0:
                m24509o(obj, j, Float.floatToIntBits(f));
                break;
            default:
                m24509o(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: s */
    public final boolean mo19142s() {
        switch (this.f56189b) {
        }
        return false;
    }
}
