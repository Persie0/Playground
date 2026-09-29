package p453w9;

import p261m9.C7504e;
import p479xa.C10130a0;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.v */
/* JADX INFO: loaded from: classes.dex */
public final class C9871v {

    /* JADX INFO: renamed from: c */
    public boolean f50384c;

    /* JADX INFO: renamed from: d */
    public boolean f50385d;

    /* JADX INFO: renamed from: e */
    public boolean f50386e;

    /* JADX INFO: renamed from: a */
    public final C10130a0 f50382a = new C10130a0(0);

    /* JADX INFO: renamed from: f */
    public long f50387f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f50388g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f50389h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final C10151t f50383b = new C10151t();

    /* JADX INFO: renamed from: b */
    public static int m18367b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static long m18368c(C10151t c10151t) {
        int i10 = c10151t.f51439b;
        if (c10151t.f51440c - i10 < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z10 = false;
        c10151t.m19127b(bArr, 0, 9);
        c10151t.m19124E(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z10 = true;
        }
        if (!z10) {
            return -9223372036854775807L;
        }
        long j10 = b10;
        long j11 = ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20);
        long j12 = bArr[2];
        return j11 | (((j12 & 248) >> 3) << 15) | ((j12 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* JADX INFO: renamed from: a */
    public final void m18369a(C7504e c7504e) {
        byte[] bArr = C10134c0.f51359f;
        C10151t c10151t = this.f50383b;
        c10151t.getClass();
        c10151t.m19122C(bArr, bArr.length);
        this.f50384c = true;
        c7504e.f41479f = 0;
    }
}
