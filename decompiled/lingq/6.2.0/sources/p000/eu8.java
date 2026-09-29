package p000;

import androidx.media3.common.C0713b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eu8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37869a;

    /* JADX INFO: renamed from: b */
    public final List f37870b;

    /* JADX INFO: renamed from: c */
    public final n8a[] f37871c;

    /* JADX INFO: renamed from: d */
    public final g68 f37872d;

    public eu8(int i, List list) {
        this.f37869a = i;
        switch (i) {
            case 1:
                this.f37870b = list;
                this.f37871c = new n8a[list.size()];
                g68 g68Var = new g68(new dw6(this, 18));
                this.f37872d = g68Var;
                g68Var.m12384c(3);
                break;
            default:
                this.f37870b = list;
                this.f37871c = new n8a[list.size()];
                this.f37872d = new g68(new dw6(this, 8));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m11344a(long j, k47 k47Var) {
        if (k47Var.m14820a() < 9) {
            return;
        }
        int iM14829m = k47Var.m14829m();
        int iM14829m2 = k47Var.m14829m();
        int iM14842z = k47Var.m14842z();
        if (iM14829m == 434 && iM14829m2 == 1195456820 && iM14842z == 3) {
            this.f37872d.m12382a(j, k47Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11345b(jy2 jy2Var, mca mcaVar) {
        int i = this.f37869a;
        List list = this.f37870b;
        n8a[] n8aVarArr = this.f37871c;
        switch (i) {
            case 0:
                for (int i2 = 0; i2 < n8aVarArr.length; i2++) {
                    mcaVar.m16767a();
                    mcaVar.m16768b();
                    n8a n8aVarMo2555n = jy2Var.mo2555n(mcaVar.f51086d, 3);
                    C0713b c0713b = (C0713b) list.get(i2);
                    String str = c0713b.f6406o;
                    bna.m3971r("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                    String str2 = c0713b.f6392a;
                    if (str2 == null) {
                        mcaVar.m16768b();
                        str2 = mcaVar.f51087e;
                    }
                    lc3 lc3Var = new lc3();
                    lc3Var.f49440a = str2;
                    lc3Var.f49452m = ez5.m11402l("video/mp2t");
                    lc3Var.f49453n = ez5.m11402l(str);
                    lc3Var.f49444e = c0713b.f6396e;
                    lc3Var.f49443d = c0713b.f6395d;
                    lc3Var.f49435K = c0713b.f6386L;
                    lc3Var.f49456q = c0713b.f6409r;
                    n8aVarMo2555n.mo2537g(new C0713b(lc3Var));
                    n8aVarArr[i2] = n8aVarMo2555n;
                }
                break;
            default:
                for (int i3 = 0; i3 < n8aVarArr.length; i3++) {
                    mcaVar.m16767a();
                    mcaVar.m16768b();
                    n8a n8aVarMo2555n2 = jy2Var.mo2555n(mcaVar.f51086d, 3);
                    C0713b c0713b2 = (C0713b) list.get(i3);
                    String str3 = c0713b2.f6406o;
                    bna.m3971r("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                    lc3 lc3Var2 = new lc3();
                    mcaVar.m16768b();
                    lc3Var2.f49440a = mcaVar.f51087e;
                    lc3Var2.f49452m = ez5.m11402l("video/mp2t");
                    lc3Var2.f49453n = ez5.m11402l(str3);
                    lc3Var2.f49444e = c0713b2.f6396e;
                    lc3Var2.f49443d = c0713b2.f6395d;
                    lc3Var2.f49435K = c0713b2.f6386L;
                    lc3Var2.f49456q = c0713b2.f6409r;
                    n8aVarMo2555n2.mo2537g(new C0713b(lc3Var2));
                    n8aVarArr[i3] = n8aVarMo2555n2;
                }
                break;
        }
    }
}
