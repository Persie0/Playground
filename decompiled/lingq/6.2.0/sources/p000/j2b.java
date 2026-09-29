package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class j2b implements i2b {

    /* JADX INFO: renamed from: a */
    public final jy2 f44973a;

    /* JADX INFO: renamed from: b */
    public final n8a f44974b;

    /* JADX INFO: renamed from: c */
    public final l47 f44975c;

    /* JADX INFO: renamed from: d */
    public final C0713b f44976d;

    /* JADX INFO: renamed from: e */
    public final int f44977e;

    /* JADX INFO: renamed from: f */
    public long f44978f;

    /* JADX INFO: renamed from: g */
    public int f44979g;

    /* JADX INFO: renamed from: h */
    public long f44980h;

    public j2b(jy2 jy2Var, n8a n8aVar, l47 l47Var, String str, int i) throws ParserException {
        this.f44973a = jy2Var;
        this.f44974b = n8aVar;
        this.f44975c = l47Var;
        int i2 = l47Var.f49038a;
        int i3 = l47Var.f49039b;
        int i4 = (l47Var.f49041d * i2) / 8;
        int i5 = l47Var.f49040c;
        if (i5 != i4) {
            throw ParserException.m2516a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.f44977e = iMax;
        lc3 lc3Var = new lc3();
        lc3Var.f49452m = ez5.m11402l("audio/wav");
        lc3Var.f49453n = ez5.m11402l(str);
        lc3Var.f49447h = i7;
        lc3Var.f49448i = i7;
        lc3Var.f49454o = iMax;
        lc3Var.f49430F = i2;
        lc3Var.f49431G = i3;
        lc3Var.f49432H = i;
        this.f44976d = new C0713b(lc3Var);
    }

    @Override // p000.i2b
    /* JADX INFO: renamed from: a */
    public final void mo13011a(long j) {
        this.f44978f = j;
        this.f44979g = 0;
        this.f44980h = 0L;
    }

    @Override // p000.i2b
    /* JADX INFO: renamed from: b */
    public final boolean mo13012b(iy2 iy2Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f44979g) < (i2 = this.f44977e)) {
            int iMo2533c = this.f44974b.mo2533c(iy2Var, (int) Math.min(i2 - i, j2), true);
            if (iMo2533c == -1) {
                j2 = 0;
            } else {
                this.f44979g += iMo2533c;
                j2 -= (long) iMo2533c;
            }
        }
        l47 l47Var = this.f44975c;
        int i3 = l47Var.f49040c;
        int i4 = this.f44979g / i3;
        if (i4 > 0) {
            long j3 = this.f44978f;
            long j4 = this.f44980h;
            long j5 = l47Var.f49039b;
            String str = uma.f64080a;
            long jM22803H = j3 + uma.m22803H(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.f44979g - i5;
            this.f44974b.mo2531a(jM22803H, 1, i5, i6, null);
            this.f44980h += (long) i4;
            this.f44979g = i6;
        }
        return j2 <= 0;
    }

    @Override // p000.i2b
    /* JADX INFO: renamed from: c */
    public final void mo13013c(int i, long j) {
        l2b l2bVar = new l2b(this.f44975c, 1, i, j);
        this.f44973a.mo2558q(l2bVar);
        C0713b c0713b = this.f44976d;
        n8a n8aVar = this.f44974b;
        n8aVar.mo2537g(c0713b);
        n8aVar.mo2534d(l2bVar.f48948e);
    }
}
