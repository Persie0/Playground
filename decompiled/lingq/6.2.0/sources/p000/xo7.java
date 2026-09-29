package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class xo7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68435a;

    /* JADX INFO: renamed from: b */
    public final g1a f68436b;

    /* JADX INFO: renamed from: c */
    public final k47 f68437c;

    /* JADX INFO: renamed from: d */
    public boolean f68438d;

    /* JADX INFO: renamed from: e */
    public boolean f68439e;

    /* JADX INFO: renamed from: f */
    public boolean f68440f;

    /* JADX INFO: renamed from: g */
    public long f68441g;

    /* JADX INFO: renamed from: h */
    public long f68442h;

    /* JADX INFO: renamed from: i */
    public long f68443i;

    public xo7(int i) {
        this.f68435a = i;
        switch (i) {
            case 1:
                this.f68436b = new g1a(0L);
                this.f68441g = -9223372036854775807L;
                this.f68442h = -9223372036854775807L;
                this.f68443i = -9223372036854775807L;
                this.f68437c = new k47();
                break;
            default:
                this.f68436b = new g1a(0L);
                this.f68441g = -9223372036854775807L;
                this.f68442h = -9223372036854775807L;
                this.f68443i = -9223372036854775807L;
                this.f68437c = new k47();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m24626b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static long m24627c(k47 k47Var) {
        int i = k47Var.f46701b;
        if (k47Var.m14820a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        k47Var.m14827k(bArr, 0, 9);
        k47Var.m14818M(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m24628a(iy2 iy2Var) {
        int i = this.f68435a;
        k47 k47Var = this.f68437c;
        switch (i) {
            case 0:
                byte[] bArr = uma.f64081b;
                k47Var.getClass();
                k47Var.m14816K(bArr.length, bArr);
                this.f68438d = true;
                iy2Var.mo13080i();
                break;
            default:
                byte[] bArr2 = uma.f64081b;
                k47Var.getClass();
                k47Var.m14816K(bArr2.length, bArr2);
                this.f68438d = true;
                iy2Var.mo13080i();
                break;
        }
    }
}
