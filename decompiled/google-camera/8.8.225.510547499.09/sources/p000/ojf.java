package p000;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ojf implements oje {

    /* JADX INFO: renamed from: a */
    public static final lqx f46166a;

    static {
        mzx mzxVar = mzx.f41874a;
        String str = JrxsYuVZZqnFC.MGvqSsWdCJd;
        mxk mxkVarM17136H = mxk.m17136H("CLIENT_LOGGING_PROD");
        try {
            byte[] bArrDecode = Base64.decode("EAAYAg", 3);
            nxq nxqVarM18123Q = nxq.m18123Q(pas.f47269d, bArrDecode, 0, bArrDecode.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            f46166a = lrb.m15906d("12", (pas) nxqVarM18123Q, lqz.f39047o, str, mxkVarM17136H, true, true);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.oje
    /* JADX INFO: renamed from: a */
    public final pas mo18575a(Context context) {
        return (pas) f46166a.m15897b(context);
    }
}
