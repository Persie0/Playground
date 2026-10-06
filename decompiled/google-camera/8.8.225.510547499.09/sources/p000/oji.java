package p000;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oji implements ojh {

    /* JADX INFO: renamed from: a */
    public static final lqx f46169a;

    /* JADX INFO: renamed from: b */
    public static final lqx f46170b;

    /* JADX INFO: renamed from: c */
    public static final lqx f46171c;

    static {
        mzx mzxVar = mzx.f41874a;
        mxk mxkVarM17136H = mxk.m17136H("CLIENT_LOGGING_PROD");
        f46169a = lrb.m15905c(rmwTRjObXLGH.VeHJIsyIAO, false, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        f46170b = lrb.m15904b(HEePJw.GdiMw, 1L, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        try {
            byte[] bArrDecode = Base64.decode("EAAYAg", 3);
            nxq nxqVarM18123Q = nxq.m18123Q(pas.f47269d, bArrDecode, 0, bArrDecode.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            f46171c = lrb.m15906d("19", (pas) nxqVarM18123Q, lqz.f39048p, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.ojh
    /* JADX INFO: renamed from: a */
    public final long mo18577a(Context context) {
        return ((Long) f46170b.m15897b(context)).longValue();
    }

    @Override // p000.ojh
    /* JADX INFO: renamed from: b */
    public final pas mo18578b(Context context) {
        return (pas) f46171c.m15897b(context);
    }

    @Override // p000.ojh
    /* JADX INFO: renamed from: c */
    public final boolean mo18579c(Context context) {
        return ((Boolean) f46169a.m15897b(context)).booleanValue();
    }
}
