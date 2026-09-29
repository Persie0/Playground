package p470x1;

import p338qd.C8584v;

/* JADX INFO: renamed from: x1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10019g {

    /* JADX INFO: renamed from: a */
    public static final long f50970a;

    /* JADX INFO: renamed from: b */
    public static final long f50971b = C8584v.m16787l(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f50972c = 0;

    static {
        float f3 = 0;
        f50970a = C8584v.m16787l(f3, f3);
    }

    /* JADX INFO: renamed from: a */
    public static final float m18623a(long j10) {
        if (j10 != f50971b) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* JADX INFO: renamed from: b */
    public static final float m18624b(long j10) {
        if (j10 != f50971b) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }
}
