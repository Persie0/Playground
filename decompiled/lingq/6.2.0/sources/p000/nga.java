package p000;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class nga extends vga {
    public nga(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.vga
    /* JADX INFO: renamed from: c */
    public final boolean mo17420c(Object obj, long j) {
        if (yga.f69830g) {
            return yga.m25132h(obj, j) != 0;
        }
        return yga.m25133i(obj, j) != 0;
    }

    @Override // p000.vga
    /* JADX INFO: renamed from: d */
    public final byte mo17421d(Object obj, long j) {
        return yga.f69830g ? yga.m25132h(obj, j) : yga.m25133i(obj, j);
    }

    @Override // p000.vga
    /* JADX INFO: renamed from: e */
    public final double mo17422e(Object obj, long j) {
        return Double.longBitsToDouble(m23275h(obj, j));
    }

    @Override // p000.vga
    /* JADX INFO: renamed from: f */
    public final float mo17423f(Object obj, long j) {
        return Float.intBitsToFloat(m23274g(obj, j));
    }

    @Override // p000.vga
    /* JADX INFO: renamed from: k */
    public final void mo17424k(Object obj, long j, boolean z) {
        if (yga.f69830g) {
            yga.m25136l(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            yga.m25137m(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.vga
    /* JADX INFO: renamed from: l */
    public final void mo17425l(Object obj, long j, byte b) {
        if (yga.f69830g) {
            yga.m25136l(obj, j, b);
        } else {
            yga.m25137m(obj, j, b);
        }
    }

    @Override // p000.vga
    /* JADX INFO: renamed from: m */
    public final void mo17426m(Object obj, long j, double d) {
        m23279p(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.vga
    /* JADX INFO: renamed from: n */
    public final void mo17427n(Object obj, long j, float f) {
        m23278o(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.vga
    /* JADX INFO: renamed from: s */
    public final boolean mo17428s() {
        return false;
    }
}
