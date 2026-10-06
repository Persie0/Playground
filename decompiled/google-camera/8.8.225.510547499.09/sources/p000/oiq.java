package p000;

import android.content.Context;
import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oiq implements oip {

    /* JADX INFO: renamed from: a */
    public static final lqx f46121a;

    static {
        mzx mzxVar = mzx.f41874a;
        mxk mxkVarM17136H = mxk.m17136H("CLIENT_LOGGING_PROD");
        try {
            byte[] bArrDecode = Base64.decode("EAAYAg", 3);
            nxq nxqVarM18123Q = nxq.m18123Q(pas.f47269d, bArrDecode, 0, bArrDecode.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            f46121a = lrb.m15906d("15", (pas) nxqVarM18123Q, lqz.f39040h, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
            try {
                byte[] bArrDecode2 = Base64.decode("CAASABgAIAAoADAAOABAAA", 3);
                nxq nxqVarM18123Q2 = nxq.m18123Q(ljp.f38408a, bArrDecode2, 0, bArrDecode2.length, nxf.f44904a);
                nxq.m18132ae(nxqVarM18123Q2);
                try {
                    byte[] bArrDecode3 = Base64.decode("CAASABgAIAAoADAAOABAAA", 3);
                    nxq nxqVarM18123Q3 = nxq.m18123Q(ljp.f38408a, bArrDecode3, 0, bArrDecode3.length, nxf.f44904a);
                    nxq.m18132ae(nxqVarM18123Q3);
                } catch (Exception e) {
                    throw new AssertionError(e);
                }
            } catch (Exception e2) {
                throw new AssertionError(e2);
            }
        } catch (Exception e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // p000.oip
    /* JADX INFO: renamed from: a */
    public final pas mo18556a(Context context) {
        return (pas) f46121a.m15897b(context);
    }
}
