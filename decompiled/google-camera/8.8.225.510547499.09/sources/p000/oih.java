package p000;

import android.content.Context;
import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oih implements oig {

    /* JADX INFO: renamed from: a */
    public static final lqx f46107a;

    /* JADX INFO: renamed from: b */
    public static final lqx f46108b;

    /* JADX INFO: renamed from: c */
    public static final lqx f46109c;

    /* JADX INFO: renamed from: d */
    public static final lqx f46110d;

    /* JADX INFO: renamed from: e */
    public static final lqx f46111e;

    static {
        mzx mzxVar = mzx.f41874a;
        mxk mxkVarM17136H = mxk.m17136H("CLIENT_LOGGING_PROD");
        try {
            byte[] bArrDecode = Base64.decode("CAASNXByaW1lcy9mZWRlcmF0ZWRfcXVlcnkvJVBBQ0tBR0VfTkFNRSUvZGlyZWN0b3J5X3BhdGhzGiEvcHJpbWVzL2FuYWx5dGljc19kaXJlY3RvcnlfcGF0aHM", 3);
            nxq nxqVarM18123Q = nxq.m18123Q(oho.f46021e, bArrDecode, 0, bArrDecode.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            f46107a = lrb.m15906d("45352879", (oho) nxqVarM18123Q, lqz.f39036d, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
            try {
                byte[] bArrDecode2 = Base64.decode("CAASOHByaW1lcy9mZWRlcmF0ZWRfcXVlcnkvJVBBQ0tBR0VfTkFNRSUvZXhjZXB0aW9uX21lc3NhZ2VzGiQvcHJpbWVzL2FuYWx5dGljc19leGNlcHRpb25fbWVzc2FnZXM", 3);
                nxq nxqVarM18123Q2 = nxq.m18123Q(oho.f46021e, bArrDecode2, 0, bArrDecode2.length, nxf.f44904a);
                nxq.m18132ae(nxqVarM18123Q2);
                f46108b = lrb.m15906d("45352881", (oho) nxqVarM18123Q2, lqz.f39036d, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
                try {
                    byte[] bArrDecode3 = Base64.decode("CAASL3ByaW1lcy9mZWRlcmF0ZWRfcXVlcnkvJVBBQ0tBR0VfTkFNRSUvcnBjX3BhdGhzGhsvcHJpbWVzL2FuYWx5dGljc19ycGNfcGF0aHM", 3);
                    nxq nxqVarM18123Q3 = nxq.m18123Q(oho.f46021e, bArrDecode3, 0, bArrDecode3.length, nxf.f44904a);
                    nxq.m18132ae(nxqVarM18123Q3);
                    f46109c = lrb.m15906d("45352880", (oho) nxqVarM18123Q3, lqz.f39036d, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
                    f46110d = lrb.m15905c("45385264", false, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
                    try {
                        f46111e = lrb.m15906d("45385265", obv.f45380b, lqz.f39037e, "com.google.android.libraries.performance.primes", mxkVarM17136H, true, true);
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

    @Override // p000.oig
    /* JADX INFO: renamed from: a */
    public final obv mo18545a(Context context) {
        return (obv) f46111e.m15897b(context);
    }

    @Override // p000.oig
    /* JADX INFO: renamed from: b */
    public final oho mo18546b(Context context) {
        return (oho) f46107a.m15897b(context);
    }

    @Override // p000.oig
    /* JADX INFO: renamed from: c */
    public final oho mo18547c(Context context) {
        return (oho) f46108b.m15897b(context);
    }

    @Override // p000.oig
    /* JADX INFO: renamed from: d */
    public final oho mo18548d(Context context) {
        return (oho) f46109c.m15897b(context);
    }

    @Override // p000.oig
    /* JADX INFO: renamed from: e */
    public final boolean mo18549e(Context context) {
        return ((Boolean) f46110d.m15897b(context)).booleanValue();
    }
}
