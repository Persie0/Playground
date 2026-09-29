package p000;

import android.view.autofill.AutofillValue;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;

/* JADX INFO: loaded from: classes.dex */
public final class cn1 extends fa2 implements ov8 {

    /* JADX INFO: renamed from: L */
    public n9a f10306L;

    /* JADX INFO: renamed from: M */
    public vv9 f10307M;

    /* JADX INFO: renamed from: N */
    public yw4 f10308N;

    /* JADX INFO: renamed from: O */
    public boolean f10309O;

    /* JADX INFO: renamed from: P */
    public boolean f10310P;

    /* JADX INFO: renamed from: Q */
    public mq6 f10311Q;

    /* JADX INFO: renamed from: R */
    public C0205f f10312R;

    /* JADX INFO: renamed from: S */
    public w04 f10313S;

    /* JADX INFO: renamed from: T */
    public z93 f10314T;

    /* JADX INFO: renamed from: c1 */
    public static void m4882c1(yw4 yw4Var, String str, boolean z) {
        if (z) {
            hw9 hw9Var = yw4Var.f70573e;
            sm1 sm1Var = yw4Var.f70590v;
            if (hw9Var == null) {
                int length = str.length();
                sm1Var.invoke(new vv9(str, 4, eh0.m11127g(length, length)));
            } else {
                vv9 vv9VarM3856m = yw4Var.f70572d.m3856m(vz1.m23605K(new ua2(), new hb1(str, 1)));
                hw9Var.m13542a(null, vv9VarM3856m);
                sm1Var.invoke(vv9VarM3856m);
            }
        }
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        boolean z = this.f10310P;
        C3419on c3419on = this.f10307M.f65990a;
        bh4[] bh4VarArr = AbstractC0426f.f5022a;
        C0427g c0427g = AbstractC0424d.f4982F;
        bh4[] bh4VarArr2 = AbstractC0426f.f5022a;
        bh4 bh4Var = bh4VarArr2[18];
        tv8Var.mo3709d(c0427g, c3419on);
        C3419on c3419on2 = this.f10306L.f52522a;
        C0427g c0427g2 = AbstractC0424d.f4983G;
        bh4 bh4Var2 = bh4VarArr2[19];
        tv8Var.mo3709d(c0427g2, c3419on2);
        long j = this.f10307M.f65991b;
        C0427g c0427g3 = AbstractC0424d.f4984H;
        bh4 bh4Var3 = bh4VarArr2[20];
        tv8Var.mo3709d(c0427g3, new cx9(j));
        C3335mh c3335mh = e41.f36678c;
        C0427g c0427g4 = AbstractC0424d.f5012s;
        bh4 bh4Var4 = bh4VarArr2[9];
        tv8Var.mo3709d(c0427g4, c3335mh);
        C0848ci c0848ci = new C0848ci(AutofillValue.forText(l70.m15921L(this.f10307M.f65990a)));
        C0427g c0427g5 = AbstractC0424d.f5013t;
        bh4 bh4Var5 = bh4VarArr2[10];
        tv8Var.mo3709d(c0427g5, c0848ci);
        AbstractC0426f.m1859c(tv8Var, new bn1(this, 0));
        int i = this.f10313S.f66167d;
        if (i == 6) {
            ol1.f54526a.getClass();
            C3372nh c3372nh = nl1.f52906c;
            C0427g c0427g6 = AbstractC0424d.f5011r;
            bh4 bh4Var6 = bh4VarArr2[8];
            tv8Var.mo3709d(c0427g6, c3372nh);
        } else if (i == 7 || i == 8) {
            ol1.f54526a.getClass();
            C3372nh c3372nh2 = nl1.f52905b;
            C0427g c0427g7 = AbstractC0424d.f5011r;
            bh4 bh4Var7 = bh4VarArr2[8];
            tv8Var.mo3709d(c0427g7, c3372nh2);
        } else if (i == 4) {
            ol1.f54526a.getClass();
            C3372nh c3372nh3 = nl1.f52907d;
            C0427g c0427g8 = AbstractC0424d.f5011r;
            bh4 bh4Var8 = bh4VarArr2[8];
            tv8Var.mo3709d(c0427g8, c3372nh3);
        }
        boolean z2 = this.f10309O;
        xfa xfaVar = xfa.f68157a;
        if (!z2) {
            tv8Var.mo3709d(AbstractC0424d.f5003j, xfaVar);
        }
        if (z) {
            tv8Var.mo3709d(AbstractC0424d.f4988L, xfaVar);
        }
        boolean z3 = this.f10309O;
        C0427g c0427g9 = AbstractC0424d.f4991O;
        bh4 bh4Var9 = bh4VarArr2[28];
        tv8Var.mo3709d(c0427g9, Boolean.valueOf(z3));
        AbstractC0426f.m1858b(tv8Var, new bn1(this, 1));
        int i2 = 2;
        if (z3) {
            tv8Var.mo3709d(AbstractC0421a.f4955k, new C3024g3(null, new bn1(this, i2)));
            tv8Var.mo3709d(AbstractC0421a.f4959o, new C3024g3(null, new bn1(this, tv8Var)));
        }
        tv8Var.mo3709d(AbstractC0421a.f4954j, new C3024g3(null, new rm0(this, 1)));
        int i3 = this.f10313S.f66168e;
        an1 an1Var = new an1(this, 6);
        tv8Var.mo3709d(AbstractC0424d.f4985I, new v04(i3));
        tv8Var.mo3709d(AbstractC0421a.f4960p, new C3024g3(null, an1Var));
        tv8Var.mo3709d(AbstractC0421a.f4946b, new C3024g3(null, new an1(this, 7)));
        tv8Var.mo3709d(AbstractC0421a.f4947c, new C3024g3(null, new an1(this, 1)));
        if (!cx9.m9921c(this.f10307M.f65991b) && !z) {
            tv8Var.mo3709d(AbstractC0421a.f4961q, new C3024g3(null, new an1(this, 2)));
            if (this.f10309O) {
                tv8Var.mo3709d(AbstractC0421a.f4962r, new C3024g3(null, new an1(this, 3)));
            }
        }
        if (this.f10309O) {
            tv8Var.mo3709d(AbstractC0421a.f4963s, new C3024g3(null, new an1(this, 5)));
        }
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: I0 */
    public final boolean mo789I0() {
        return true;
    }
}
