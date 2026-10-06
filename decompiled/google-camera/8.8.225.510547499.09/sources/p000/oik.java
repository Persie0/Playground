package p000;

import android.content.Context;
import android.util.Base64;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oik implements oij {

    /* JADX INFO: renamed from: a */
    public static final lqx f46114a;

    /* JADX INFO: renamed from: b */
    public static final lqx f46115b;

    static {
        mzx mzxVar = mzx.f41874a;
        mxk mxkVarM17136H = mxk.m17136H("CLIENT_LOGGING_PROD");
        f46114a = lrb.m15905c("45352228", true, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        try {
            byte[] bArrDecode = Base64.decode(xRFdVyfdeve.RZUOexrx, 3);
            nxq nxqVarM18123Q = nxq.m18123Q(oyy.f46889b, bArrDecode, 0, bArrDecode.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            f46115b = lrb.m15906d("45352241", (oyy) nxqVarM18123Q, lqz.f39038f, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.oij
    /* JADX INFO: renamed from: a */
    public final oyy mo18551a(Context context) {
        return (oyy) f46115b.m15897b(context);
    }

    @Override // p000.oij
    /* JADX INFO: renamed from: b */
    public final boolean mo18552b(Context context) {
        return ((Boolean) f46114a.m15897b(context)).booleanValue();
    }
}
