package p000;

import androidx.media3.common.C0713b;

/* JADX INFO: loaded from: classes2.dex */
public final class p89 implements hy2 {

    /* JADX INFO: renamed from: a */
    public final int f55761a;

    /* JADX INFO: renamed from: b */
    public final int f55762b;

    /* JADX INFO: renamed from: c */
    public final String f55763c;

    /* JADX INFO: renamed from: d */
    public int f55764d;

    /* JADX INFO: renamed from: e */
    public int f55765e;

    /* JADX INFO: renamed from: f */
    public jy2 f55766f;

    /* JADX INFO: renamed from: g */
    public n8a f55767g;

    public p89(int i, String str, int i2) {
        this.f55761a = i;
        this.f55762b = i2;
        this.f55763c = str;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) {
        int i = this.f55765e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            uk9.m22770c();
            return 0;
        }
        n8a n8aVar = this.f55767g;
        n8aVar.getClass();
        int iMo2533c = n8aVar.mo2533c(iy2Var, 1024, true);
        if (iMo2533c != -1) {
            this.f55764d += iMo2533c;
            return 0;
        }
        this.f55765e = 2;
        this.f55767g.mo2531a(0L, 1, this.f55764d, 0, null);
        this.f55764d = 0;
        return 0;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) {
        int i = this.f55762b;
        int i2 = this.f55761a;
        bna.m3987z((i2 == -1 || i == -1) ? false : true);
        k47 k47Var = new k47(i);
        ((h62) iy2Var).mo13076d(k47Var.f46700a, 0, i, false);
        return k47Var.m14812G() == i2;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        if (j == 0 || this.f55765e == 1) {
            this.f55765e = 1;
            this.f55764d = 0;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f55766f = jy2Var;
        n8a n8aVarMo2555n = jy2Var.mo2555n(1024, 4);
        this.f55767g = n8aVarMo2555n;
        lc3 lc3Var = new lc3();
        String str = this.f55763c;
        lc3Var.f49452m = ez5.m11402l(str);
        lc3Var.f49453n = ez5.m11402l(str);
        n8aVarMo2555n.mo2537g(new C0713b(lc3Var));
        this.f55766f.mo2551j();
        this.f55766f.mo2558q(new q89());
        this.f55765e = 1;
    }
}
