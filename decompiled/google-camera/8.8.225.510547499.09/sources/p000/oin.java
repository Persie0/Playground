package p000;

import android.content.Context;
import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oin implements oim {

    /* JADX INFO: renamed from: a */
    public static final lqx f46118a;

    static {
        mzx mzxVar = mzx.f41874a;
        mxk mxkVarM17136H = mxk.m17136H("CLIENT_LOGGING_PROD");
        try {
            byte[] bArrDecode = Base64.decode("EAAYAg", 3);
            nxq nxqVarM18123Q = nxq.m18123Q(pas.f47269d, bArrDecode, 0, bArrDecode.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            f46118a = lrb.m15906d("16", (pas) nxqVarM18123Q, lqz.f39039g, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.oim
    /* JADX INFO: renamed from: a */
    public final pas mo18554a(Context context) {
        return (pas) f46118a.m15897b(context);
    }
}
