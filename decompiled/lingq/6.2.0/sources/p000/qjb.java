package p000;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class qjb extends sjb {
    public qjb(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: b */
    public final void mo20004b(Object obj, long j, byte b) {
        if (tjb.f62432f) {
            tjb.m22154b(obj, j, b);
        } else {
            tjb.m22155c(obj, j, b);
        }
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: d */
    public final boolean mo20005d(Object obj, long j) {
        return tjb.f62432f ? tjb.m22166n(obj, j) : tjb.m22167o(obj, j);
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: e */
    public final void mo4820e(Object obj, long j, boolean z) {
        if (tjb.f62432f) {
            tjb.m22154b(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            tjb.m22155c(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: f */
    public final float mo20006f(Object obj, long j) {
        return Float.intBitsToFloat(this.f60943a.getInt(obj, j));
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: i */
    public final void mo20007i(Object obj, long j, float f) {
        this.f60943a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: j */
    public final double mo20008j(Object obj, long j) {
        return Double.longBitsToDouble(this.f60943a.getLong(obj, j));
    }

    @Override // p000.sjb
    /* JADX INFO: renamed from: l */
    public final void mo20009l(Object obj, long j, double d) {
        this.f60943a.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
