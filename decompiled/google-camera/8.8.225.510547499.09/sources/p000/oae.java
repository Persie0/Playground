package p000;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class oae extends oaf {
    public oae(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.oaf
    /* JADX INFO: renamed from: a */
    public final byte mo18338a(long j) {
        return Memory.peekByte(j);
    }

    @Override // p000.oaf
    /* JADX INFO: renamed from: b */
    public final double mo18339b(Object obj, long j) {
        return Double.longBitsToDouble(m18348k(obj, j));
    }

    @Override // p000.oaf
    /* JADX INFO: renamed from: c */
    public final float mo18340c(Object obj, long j) {
        return Float.intBitsToFloat(m18347j(obj, j));
    }

    @Override // p000.oaf
    /* JADX INFO: renamed from: d */
    public final void mo18341d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // p000.oaf
    /* JADX INFO: renamed from: e */
    public final void mo18342e(Object obj, long j, boolean z) {
        if (oag.f45124d) {
            oag.m18367o(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            oag.m18368p(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.oaf
    /* JADX INFO: renamed from: f */
    public final void mo18343f(Object obj, long j, byte b) {
        if (oag.f45124d) {
            oag.m18367o(obj, j, b);
        } else {
            oag.m18368p(obj, j, b);
        }
    }

    @Override // p000.oaf
    /* JADX INFO: renamed from: g */
    public final void mo18344g(Object obj, long j, double d) {
        m18350m(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.oaf
    /* JADX INFO: renamed from: h */
    public final void mo18345h(Object obj, long j, float f) {
        m18349l(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.oaf
    /* JADX INFO: renamed from: i */
    public final boolean mo18346i(Object obj, long j) {
        return oag.f45124d ? oag.m18376x(obj, j) : oag.m18377y(obj, j);
    }
}
