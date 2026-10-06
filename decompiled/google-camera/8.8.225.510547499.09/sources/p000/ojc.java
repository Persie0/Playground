package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ojc implements ojb {

    /* JADX INFO: renamed from: a */
    public static final lqx f46161a;

    /* JADX INFO: renamed from: b */
    public static final lqx f46162b;

    /* JADX INFO: renamed from: c */
    public static final lqx f46163c;

    static {
        mzx mzxVar = mzx.f41874a;
        mxk mxkVarM17136H = mxk.m17136H("CLIENT_LOGGING_PROD");
        f46161a = lrb.m15905c("45359255", false, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        f46162b = lrb.m15905c("45378726", false, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        f46163c = lrb.m15905c("36", true, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
    }

    @Override // p000.ojb
    /* JADX INFO: renamed from: a */
    public final boolean mo18571a(Context context) {
        return ((Boolean) f46161a.m15897b(context)).booleanValue();
    }

    @Override // p000.ojb
    /* JADX INFO: renamed from: b */
    public final boolean mo18572b(Context context) {
        return ((Boolean) f46162b.m15897b(context)).booleanValue();
    }

    @Override // p000.ojb
    /* JADX INFO: renamed from: c */
    public final boolean mo18573c(Context context) {
        return ((Boolean) f46163c.m15897b(context)).booleanValue();
    }
}
