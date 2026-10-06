package p000;

import android.content.Context;
import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oiw implements oiv {

    /* JADX INFO: renamed from: a */
    public static final lqx f46130a;

    /* JADX INFO: renamed from: b */
    public static final lqx f46131b;

    /* JADX INFO: renamed from: c */
    public static final lqx f46132c;

    /* JADX INFO: renamed from: d */
    public static final lqx f46133d;

    /* JADX INFO: renamed from: e */
    public static final lqx f46134e;

    static {
        mzx mzxVar = mzx.f41874a;
        mxk mxkVarM17136H = mxk.m17136H("CLIENT_LOGGING_PROD");
        f46130a = lrb.m15905c("45374182", false, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        f46131b = lrb.m15905c("25", false, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
        try {
            byte[] bArrDecode = Base64.decode("Ci1jb20uZ29vZ2xlLmFuZHJvaWQucHJpbWVzLWphbmstJVBBQ0tBR0VfTkFNRSUSIwgCEh9KPCVFVkVOVF9OQU1FJT4jbWlzc2VkQXBwRnJhbWVzEh8IAxIbSjwlRVZFTlRfTkFNRSU+I3RvdGFsRnJhbWVzEiYIBRIiSjwlRVZFTlRfTkFNRSU+I21heEZyYW1lVGltZU1pbGxpcw", 3);
            nxq nxqVarM18123Q = nxq.m18123Q(llg.f38566d, bArrDecode, 0, bArrDecode.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            f46132c = lrb.m15906d("40", (llg) nxqVarM18123Q, lqz.f39044l, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
            try {
                byte[] bArrDecode2 = Base64.decode("EAAYAg", 3);
                nxq nxqVarM18123Q2 = nxq.m18123Q(pas.f47269d, bArrDecode2, 0, bArrDecode2.length, nxf.f44904a);
                nxq.m18132ae(nxqVarM18123Q2);
                f46133d = lrb.m15906d("13", (pas) nxqVarM18123Q2, lqz.f39045m, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
                f46134e = lrb.m15905c("45351799", false, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // p000.oiv
    /* JADX INFO: renamed from: a */
    public final llg mo18563a(Context context) {
        return (llg) f46132c.m15897b(context);
    }

    @Override // p000.oiv
    /* JADX INFO: renamed from: b */
    public final pas mo18564b(Context context) {
        return (pas) f46133d.m15897b(context);
    }

    @Override // p000.oiv
    /* JADX INFO: renamed from: c */
    public final boolean mo18565c(Context context) {
        return ((Boolean) f46130a.m15897b(context)).booleanValue();
    }

    @Override // p000.oiv
    /* JADX INFO: renamed from: d */
    public final boolean mo18566d(Context context) {
        return ((Boolean) f46131b.m15897b(context)).booleanValue();
    }

    @Override // p000.oiv
    /* JADX INFO: renamed from: e */
    public final boolean mo18567e(Context context) {
        return ((Boolean) f46134e.m15897b(context)).booleanValue();
    }
}
