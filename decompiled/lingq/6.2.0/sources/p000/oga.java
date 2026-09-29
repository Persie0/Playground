package p000;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class oga extends wga {
    public oga(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: c */
    public final boolean mo17982c(Object obj, long j) {
        if (zga.f71560g) {
            return zga.m25608h(obj, j) != 0;
        }
        return zga.m25609i(obj, j) != 0;
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: d */
    public final byte mo17983d(Object obj, long j) {
        return zga.f71560g ? zga.m25608h(obj, j) : zga.m25609i(obj, j);
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: e */
    public final double mo17984e(Object obj, long j) {
        return Double.longBitsToDouble(m23937h(obj, j));
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: f */
    public final float mo17985f(Object obj, long j) {
        return Float.intBitsToFloat(m23936g(obj, j));
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: k */
    public final void mo17986k(Object obj, long j, boolean z) {
        if (zga.f71560g) {
            zga.m25612l(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zga.m25613m(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: l */
    public final void mo17987l(Object obj, long j, byte b) {
        if (zga.f71560g) {
            zga.m25612l(obj, j, b);
        } else {
            zga.m25613m(obj, j, b);
        }
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: m */
    public final void mo17988m(Object obj, long j, double d) {
        m23941p(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: n */
    public final void mo17989n(Object obj, long j, float f) {
        m23940o(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: s */
    public final boolean mo17990s() {
        return false;
    }
}
