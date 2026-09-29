package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ica {

    /* JADX INFO: renamed from: a */
    public final byte[] f43939a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f43940b;

    /* JADX INFO: renamed from: c */
    public int f43941c;

    /* JADX INFO: renamed from: d */
    public long f43942d;

    /* JADX INFO: renamed from: e */
    public int f43943e;

    /* JADX INFO: renamed from: f */
    public int f43944f;

    /* JADX INFO: renamed from: g */
    public int f43945g;

    /* JADX INFO: renamed from: a */
    public final void m13762a(n8a n8aVar, m8a m8aVar) {
        if (this.f43941c > 0) {
            n8aVar.mo2531a(this.f43942d, this.f43943e, this.f43944f, this.f43945g, m8aVar);
            this.f43941c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13763b(n8a n8aVar, long j, int i, int i2, int i3, m8a m8aVar) {
        bna.m3985y("TrueHD chunk samples must be contiguous in the sample queue.", this.f43945g <= i2 + i3);
        if (this.f43940b) {
            int i4 = this.f43941c;
            int i5 = i4 + 1;
            this.f43941c = i5;
            if (i4 == 0) {
                this.f43942d = j;
                this.f43943e = i;
                this.f43944f = 0;
            }
            this.f43944f += i2;
            this.f43945g = i3;
            if (i5 >= 16) {
                m13762a(n8aVar, m8aVar);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13764c(iy2 iy2Var) {
        if (this.f43940b) {
            return;
        }
        byte[] bArr = this.f43939a;
        int i = 0;
        iy2Var.mo13085o(bArr, 0, 10);
        iy2Var.mo13080i();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f43940b = true;
    }
}
