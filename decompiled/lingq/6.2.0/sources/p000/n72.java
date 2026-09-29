package p000;

import androidx.compose.foundation.gestures.C0101i;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.AbstractC0150d;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class n72 implements pj6 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0150d f52427a;

    /* JADX INFO: renamed from: b */
    public final Orientation f52428b;

    public n72(AbstractC0150d abstractC0150d, Orientation orientation) {
        this.f52427a = abstractC0150d;
        this.f52428b = orientation;
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: P */
    public final long mo1183P(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        AbstractC0150d abstractC0150d = this.f52427a;
        float fM1037l = abstractC0150d.m1037l();
        C0101i c0101i = abstractC0150d.f2681k;
        if (Math.abs(fM1037l) <= 1.0E-6d) {
            return 0L;
        }
        Orientation orientation = Orientation.Horizontal;
        Orientation orientation2 = this.f52428b;
        if (Math.abs(Float.intBitsToFloat((int) (orientation2 == orientation ? j >> 32 : j & 4294967295L))) <= 0.0f) {
            return 0L;
        }
        n27 n27VarM1038m = abstractC0150d.m1038m();
        float fM1037l2 = abstractC0150d.m1037l() * abstractC0150d.m1040o();
        float f = ((n27VarM1038m.f52220b + n27VarM1038m.f52221c) * (-Math.signum(abstractC0150d.m1037l()))) + fM1037l2;
        if (abstractC0150d.m1037l() > 0.0f) {
            f = fM1037l2;
            fM1037l2 = f;
        }
        float fM15944g = l70.m15944g(Float.intBitsToFloat((int) (orientation2 == orientation ? j >> 32 : j & 4294967295L)), fM1037l2, f);
        float fMo865e = (orientation2 == orientation && n27VarM1038m.f52226h) ? c0101i.mo865e(fM15944g) : -c0101i.mo865e(-fM15944g);
        float fIntBitsToFloat = orientation2 == orientation ? fMo865e : Float.intBitsToFloat((int) (j >> 32));
        if (orientation2 != Orientation.Vertical) {
            fMo865e = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fMo865e)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: t */
    public final Object mo919t(long j, long j2, Continuation continuation) {
        return new dpa(this.f52428b == Orientation.Vertical ? dpa.m10570a(j2, 0.0f, 0.0f, 2) : dpa.m10570a(j2, 0.0f, 0.0f, 1));
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: u0 */
    public final long mo920u0(int i, long j, long j2) {
        if (i != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.f52428b == Orientation.Horizontal ? j2 >> 32 : 4294967295L & j2)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
