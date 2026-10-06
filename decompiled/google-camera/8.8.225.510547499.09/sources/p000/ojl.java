package p000;

import android.content.Context;
import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ojl implements ojk {

    /* JADX INFO: renamed from: a */
    public static final lqx f46174a;

    static {
        mzx mzxVar = mzx.f41874a;
        mxk mxkVarM17136H = mxk.m17136H("CLIENT_LOGGING_PROD");
        try {
            byte[] bArrDecode = Base64.decode("EOgHGAM", 3);
            nxq nxqVarM18123Q = nxq.m18123Q(pas.f47269d, bArrDecode, 0, bArrDecode.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            f46174a = lrb.m15906d("17", (pas) nxqVarM18123Q, lqz.f39049q, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.ojk
    /* JADX INFO: renamed from: a */
    public final pas mo18581a(Context context) {
        return (pas) f46174a.m15897b(context);
    }
}
