package p000;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: loaded from: classes2.dex */
public final class y31 extends xc3 {

    /* JADX INFO: renamed from: c */
    public final long f69203c;

    /* JADX INFO: renamed from: d */
    public final long f69204d;

    /* JADX INFO: renamed from: e */
    public final long f69205e;

    /* JADX INFO: renamed from: f */
    public final boolean f69206f;

    public y31(z0a z0aVar, long j, long j2) throws ClippingMediaSource$IllegalClippingException {
        super(z0aVar);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new ClippingMediaSource$IllegalClippingException(2, j, j2);
        }
        boolean z = false;
        if (z0aVar.mo17286h() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        y0a y0aVarMo39m = z0aVar.mo39m(0, new y0a(), 0L);
        long jMax = Math.max(0L, j);
        if (!y0aVarMo39m.f69072i && jMax != 0 && !y0aVarMo39m.f69069f) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? y0aVarMo39m.f69074k : Math.max(0L, j2);
        long j3 = y0aVarMo39m.f69074k;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f69203c = jMax;
        this.f69204d = jMax2;
        this.f69205e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (y0aVarMo39m.f69070g && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.f69206f = z;
    }

    @Override // p000.xc3, p000.z0a
    /* JADX INFO: renamed from: f */
    public final x0a mo16393f(int i, x0a x0aVar, boolean z) {
        this.f68058b.mo16393f(0, x0aVar, z);
        long j = x0aVar.f67603e - this.f69203c;
        long j2 = this.f69205e;
        long j3 = j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L;
        Object obj = x0aVar.f67599a;
        Object obj2 = x0aVar.f67600b;
        C3175k8 c3175k8 = C3175k8.f46839c;
        x0aVar.f67599a = obj;
        x0aVar.f67600b = obj2;
        x0aVar.f67601c = 0;
        x0aVar.f67602d = j3;
        x0aVar.f67603e = j;
        x0aVar.f67605g = c3175k8;
        x0aVar.f67604f = false;
        return x0aVar;
    }

    @Override // p000.xc3, p000.z0a
    /* JADX INFO: renamed from: m */
    public final y0a mo39m(int i, y0a y0aVar, long j) {
        this.f68058b.mo39m(0, y0aVar, 0L);
        long j2 = y0aVar.f69077n;
        long j3 = this.f69203c;
        y0aVar.f69077n = j2 + j3;
        y0aVar.f69074k = this.f69205e;
        y0aVar.f69070g = this.f69206f;
        long j4 = y0aVar.f69073j;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            y0aVar.f69073j = jMax;
            long j5 = this.f69204d;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            y0aVar.f69073j = jMax - j3;
        }
        long jM22805J = uma.m22805J(j3);
        long j6 = y0aVar.f69066c;
        if (j6 != -9223372036854775807L) {
            y0aVar.f69066c = j6 + jM22805J;
        }
        long j7 = y0aVar.f69067d;
        if (j7 != -9223372036854775807L) {
            y0aVar.f69067d = j7 + jM22805J;
        }
        return y0aVar;
    }
}
