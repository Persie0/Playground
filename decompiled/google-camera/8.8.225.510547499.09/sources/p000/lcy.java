package p000;

import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcy extends lcf {
    private lcy(lby lbyVar, kzx kzxVar) {
        super(lbyVar, kzxVar);
    }

    /* JADX INFO: renamed from: b */
    public static lcy m15192b(lby lbyVar, EGLImage eGLImage) {
        kzh kzhVarM4707b = eGLImage.m4707b();
        lcy lcyVar = new lcy(lbyVar, lcf.m15165d(lbyVar, new ldy(lbyVar, new lbm(kzhVarM4707b), kzhVarM4707b, 1)));
        lcyVar.m15166e(new lbt(lcyVar, 1), new kzc(eGLImage, 3)).mo15109h(kzj.f37771a);
        return lcyVar;
    }

    /* JADX INFO: renamed from: g */
    public final lbl m15193g() {
        return ((ldv) m15167f()).f38003f;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        int iHashCode = hashCode();
        m15193g();
        return simpleName + "@" + iHashCode + "[layout=" + BcwGDRhrTsnlj.ZgjZoBm + "]";
    }
}
