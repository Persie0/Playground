package p000;

import android.content.Context;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.Base64;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oit implements ois {

    /* JADX INFO: renamed from: a */
    public static final lqx f46124a;

    /* JADX INFO: renamed from: b */
    public static final lqx f46125b;

    /* JADX INFO: renamed from: c */
    public static final lqx f46126c;

    /* JADX INFO: renamed from: d */
    public static final lqx f46127d;

    static {
        mzx mzxVar = mzx.f41874a;
        mxk mxkVarM17136H = mxk.m17136H("CLIENT_LOGGING_PROD");
        try {
            byte[] bArrDecode = Base64.decode("CAAQAxgGIJBOLQrXIzw", 3);
            nxq nxqVarM18123Q = nxq.m18123Q(lju.f38431f, bArrDecode, 0, bArrDecode.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            f46124a = lrb.m15906d("45390627", (lju) nxqVarM18123Q, lqz.f39041i, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
            try {
                byte[] bArrDecode2 = Base64.decode("EAAYAg", 3);
                nxq nxqVarM18123Q2 = nxq.m18123Q(pas.f47269d, bArrDecode2, 0, bArrDecode2.length, nxf.f44904a);
                nxq.m18132ae(nxqVarM18123Q2);
                try {
                    byte[] bArrDecode3 = Base64.decode(NptsKnlVczSZ.VhOIXmi, 3);
                    nxq nxqVarM18123Q3 = nxq.m18123Q(lkd.f38475e, bArrDecode3, 0, bArrDecode3.length, nxf.f44904a);
                    nxq.m18132ae(nxqVarM18123Q3);
                    f46125b = lrb.m15906d("45376983", (lkd) nxqVarM18123Q3, lqz.f39042j, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
                    f46126c = lrb.m15905c(voNZjxiJou.UBlroK, false, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
                    try {
                        byte[] bArrDecode4 = Base64.decode(pIeXJQLZLfgIN.GQaIRwIMsDgxl, 3);
                        nxq nxqVarM18123Q4 = nxq.m18123Q(lkc.f38470c, bArrDecode4, 0, bArrDecode4.length, nxf.f44904a);
                        nxq.m18132ae(nxqVarM18123Q4);
                        f46127d = lrb.m15906d("45371370", (lkc) nxqVarM18123Q4, lqz.f39043k, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
                    } catch (Exception e) {
                        throw new AssertionError(e);
                    }
                } catch (Exception e2) {
                    throw new AssertionError(e2);
                }
            } catch (Exception e3) {
                throw new AssertionError(e3);
            }
        } catch (Exception e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // p000.ois
    /* JADX INFO: renamed from: a */
    public final lju mo18558a(Context context) {
        return (lju) f46124a.m15897b(context);
    }

    @Override // p000.ois
    /* JADX INFO: renamed from: b */
    public final lkc mo18559b(Context context) {
        return (lkc) f46127d.m15897b(context);
    }

    @Override // p000.ois
    /* JADX INFO: renamed from: c */
    public final lkd mo18560c(Context context) {
        return (lkd) f46125b.m15897b(context);
    }

    @Override // p000.ois
    /* JADX INFO: renamed from: d */
    public final boolean mo18561d(Context context) {
        return ((Boolean) f46126c.m15897b(context)).booleanValue();
    }
}
