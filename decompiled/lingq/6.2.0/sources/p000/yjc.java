package p000;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class yjc extends sjb {
    public yjc(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: a */
    public final double mo4818a(Object obj, long j) {
        return Double.longBitsToDouble(this.f60943a.getLong(obj, j));
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: c */
    public final float mo4819c(Object obj, long j) {
        return Float.intBitsToFloat(this.f60943a.getInt(obj, j));
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: e */
    public final void mo4820e(Object obj, long j, boolean z) {
        if (lkc.f49790g) {
            lkc.m16334c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            lkc.m16335d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: g */
    public final void mo4821g(Object obj, long j, byte b) {
        if (lkc.f49790g) {
            lkc.m16334c(obj, j, b);
        } else {
            lkc.m16335d(obj, j, b);
        }
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: h */
    public final void mo4822h(Object obj, long j, double d) {
        this.f60943a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: k */
    public final void mo4823k(Object obj, long j, float f) {
        this.f60943a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: m */
    public final boolean mo4824m(Object obj, long j) {
        return lkc.f49790g ? lkc.m16344m(obj, j) : lkc.m16345n(obj, j);
    }
}
