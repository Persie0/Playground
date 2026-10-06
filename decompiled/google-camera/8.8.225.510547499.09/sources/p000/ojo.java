package p000;

import android.content.Context;
import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ojo implements ojn {

    /* JADX INFO: renamed from: a */
    public static final lqx f46177a;

    static {
        mzx mzxVar = mzx.f41874a;
        mxk mxkVarM17136H = mxk.m17136H("CLIENT_LOGGING_PROD");
        try {
            byte[] bArrDecode = Base64.decode("EOgHGAQ", 3);
            nxq nxqVarM18123Q = nxq.m18123Q(pas.f47269d, bArrDecode, 0, bArrDecode.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            f46177a = lrb.m15906d("9", (pas) nxqVarM18123Q, lqz.f39050r, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.ojn
    /* JADX INFO: renamed from: a */
    public final pas mo18583a(Context context) {
        return (pas) f46177a.m15897b(context);
    }
}
