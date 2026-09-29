package p000;

import androidx.media3.common.C0713b;

/* JADX INFO: loaded from: classes2.dex */
public final class l46 implements yo2 {

    /* JADX INFO: renamed from: a */
    public final k47 f49024a;

    /* JADX INFO: renamed from: b */
    public final m46 f49025b;

    /* JADX INFO: renamed from: c */
    public final String f49026c;

    /* JADX INFO: renamed from: d */
    public final int f49027d;

    /* JADX INFO: renamed from: e */
    public final String f49028e;

    /* JADX INFO: renamed from: f */
    public n8a f49029f;

    /* JADX INFO: renamed from: g */
    public String f49030g;

    /* JADX INFO: renamed from: h */
    public int f49031h = 0;

    /* JADX INFO: renamed from: i */
    public int f49032i;

    /* JADX INFO: renamed from: j */
    public boolean f49033j;

    /* JADX INFO: renamed from: k */
    public boolean f49034k;

    /* JADX INFO: renamed from: l */
    public long f49035l;

    /* JADX INFO: renamed from: m */
    public int f49036m;

    /* JADX INFO: renamed from: n */
    public long f49037n;

    public l46(String str, int i, String str2) {
        k47 k47Var = new k47(4);
        this.f49024a = k47Var;
        k47Var.f46700a[0] = -1;
        this.f49025b = new m46();
        this.f49037n = -9223372036854775807L;
        this.f49026c = str;
        this.f49027d = i;
        this.f49028e = str2;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final void mo609b(k47 k47Var) {
        this.f49029f.getClass();
        while (k47Var.m14820a() > 0) {
            int i = this.f49031h;
            k47 k47Var2 = this.f49024a;
            if (i == 0) {
                byte[] bArr = k47Var.f46700a;
                int i2 = k47Var.f46701b;
                int i3 = k47Var.f46702c;
                while (true) {
                    if (i2 >= i3) {
                        k47Var.m14818M(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f49034k && (b & 224) == 224;
                    this.f49034k = z;
                    if (z2) {
                        k47Var.m14818M(i2 + 1);
                        this.f49034k = false;
                        k47Var2.f46700a[1] = bArr[i2];
                        this.f49032i = 2;
                        this.f49031h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(k47Var.m14820a(), 4 - this.f49032i);
                k47Var.m14827k(k47Var2.f46700a, this.f49032i, iMin);
                int i4 = this.f49032i + iMin;
                this.f49032i = i4;
                if (i4 >= 4) {
                    k47Var2.m14818M(0);
                    int iM14829m = k47Var2.m14829m();
                    m46 m46Var = this.f49025b;
                    if (m46Var.m16621a(iM14829m)) {
                        this.f49036m = m46Var.f50574b;
                        if (!this.f49033j) {
                            this.f49035l = (((long) m46Var.f50578f) * 1000000) / ((long) m46Var.f50575c);
                            lc3 lc3Var = new lc3();
                            lc3Var.f49440a = this.f49030g;
                            lc3Var.f49452m = ez5.m11402l(this.f49028e);
                            lc3Var.f49453n = ez5.m11402l((String) m46Var.f50579g);
                            lc3Var.f49454o = 4096;
                            lc3Var.f49430F = m46Var.f50576d;
                            lc3Var.f49431G = m46Var.f50575c;
                            lc3Var.f49443d = this.f49026c;
                            lc3Var.f49445f = this.f49027d;
                            this.f49029f.mo2537g(new C0713b(lc3Var));
                            this.f49033j = true;
                        }
                        k47Var2.m14818M(0);
                        this.f49029f.mo2535e(4, k47Var2);
                        this.f49031h = 2;
                    } else {
                        this.f49032i = 0;
                        this.f49031h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    uk9.m22770c();
                    return;
                }
                int iMin2 = Math.min(k47Var.m14820a(), this.f49036m - this.f49032i);
                this.f49029f.mo2535e(iMin2, k47Var);
                int i5 = this.f49032i + iMin2;
                this.f49032i = i5;
                if (i5 >= this.f49036m) {
                    bna.m3987z(this.f49037n != -9223372036854775807L);
                    this.f49029f.mo2531a(this.f49037n, 1, this.f49036m, 0, null);
                    this.f49037n += this.f49035l;
                    this.f49032i = 0;
                    this.f49031h = 0;
                }
            }
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final void mo611d() {
        this.f49031h = 0;
        this.f49032i = 0;
        this.f49034k = false;
        this.f49037n = -9223372036854775807L;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final void mo612e(boolean z) {
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final void mo613f(int i, long j) {
        this.f49037n = j;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: g */
    public final void mo614g(jy2 jy2Var, mca mcaVar) {
        mcaVar.m16767a();
        mcaVar.m16768b();
        this.f49030g = mcaVar.f51087e;
        mcaVar.m16768b();
        this.f49029f = jy2Var.mo2555n(mcaVar.f51086d, 1);
    }
}
