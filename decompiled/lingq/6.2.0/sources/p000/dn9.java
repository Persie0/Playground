package p000;

import androidx.media3.common.C0713b;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class dn9 implements n8a {

    /* JADX INFO: renamed from: a */
    public final n8a f35902a;

    /* JADX INFO: renamed from: b */
    public final bn9 f35903b;

    /* JADX INFO: renamed from: g */
    public cn9 f35908g;

    /* JADX INFO: renamed from: h */
    public C0713b f35909h;

    /* JADX INFO: renamed from: i */
    public boolean f35910i;

    /* JADX INFO: renamed from: d */
    public int f35905d = 0;

    /* JADX INFO: renamed from: e */
    public int f35906e = 0;

    /* JADX INFO: renamed from: f */
    public byte[] f35907f = uma.f64081b;

    /* JADX INFO: renamed from: c */
    public final k47 f35904c = new k47();

    public dn9(n8a n8aVar, bn9 bn9Var) {
        this.f35902a = n8aVar;
        this.f35903b = bn9Var;
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: a */
    public final void mo2531a(long j, int i, int i2, int i3, m8a m8aVar) {
        if (this.f35908g == null) {
            this.f35902a.mo2531a(j, i, i2, i3, m8aVar);
            return;
        }
        bna.m3967p("DRM on subtitles is not supported", m8aVar == null);
        int i4 = (this.f35906e - i3) - i2;
        try {
            this.f35908g.mo4902C(this.f35907f, i4, i2, new i52(this, j, i));
        } catch (RuntimeException e) {
            if (!this.f35910i) {
                throw e;
            }
            ss5.m21709e0("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.f35905d = i5;
        if (i5 == this.f35906e) {
            this.f35905d = 0;
            this.f35906e = 0;
        }
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: b */
    public final void mo2532b(k47 k47Var, int i, int i2) {
        if (this.f35908g == null) {
            this.f35902a.mo2532b(k47Var, i, i2);
            return;
        }
        m10499h(i);
        k47Var.m14827k(this.f35907f, this.f35906e, i);
        this.f35906e += i;
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: f */
    public final int mo2536f(h02 h02Var, int i, boolean z) throws EOFException {
        if (this.f35908g == null) {
            return this.f35902a.mo2536f(h02Var, i, z);
        }
        m10499h(i);
        int i2 = h02Var.read(this.f35907f, this.f35906e, i);
        if (i2 != -1) {
            this.f35906e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: g */
    public final void mo2537g(C0713b c0713b) {
        c0713b.f6406o.getClass();
        String str = c0713b.f6406o;
        bna.m3969q(ez5.m11397g(str) == 3);
        boolean zEquals = c0713b.equals(this.f35909h);
        bn9 bn9Var = this.f35903b;
        if (!zEquals) {
            this.f35909h = c0713b;
            this.f35908g = bn9Var.mo89i(c0713b) ? bn9Var.mo85e(c0713b) : null;
        }
        cn9 cn9Var = this.f35908g;
        n8a n8aVar = this.f35902a;
        if (cn9Var == null) {
            n8aVar.mo2537g(c0713b);
            return;
        }
        lc3 lc3VarM2520a = c0713b.m2520a();
        lc3VarM2520a.f49453n = ez5.m11402l("application/x-media3-cues");
        lc3VarM2520a.f49449j = str;
        lc3VarM2520a.f49458s = Long.MAX_VALUE;
        lc3VarM2520a.f49436L = bn9Var.mo82b(c0713b);
        n8aVar.mo2537g(new C0713b(lc3VarM2520a));
    }

    /* JADX INFO: renamed from: h */
    public final void m10499h(int i) {
        int length = this.f35907f.length;
        int i2 = this.f35906e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f35905d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f35907f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f35905d, bArr2, 0, i3);
        this.f35905d = 0;
        this.f35906e = i3;
        this.f35907f = bArr2;
    }
}
