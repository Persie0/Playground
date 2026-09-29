package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public abstract class qh0 {

    /* JADX INFO: renamed from: a */
    public static final n66 f57775a = m19965c(true);

    /* JADX INFO: renamed from: b */
    public static final n66 f57776b = m19965c(false);

    /* JADX INFO: renamed from: c */
    public static final C3580sn f57777c = C3580sn.f61037d;

    /* JADX INFO: renamed from: a */
    public static final void m19963a(e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-211209833);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            l77 l77VarM22132m = tj3Var.m22132m();
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, f57777c);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3574sh(e16Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19964b(AbstractC0343j abstractC0343j, l87 l87Var, ct5 ct5Var, LayoutDirection layoutDirection, int i, int i2, InterfaceC3571se interfaceC3571se) {
        gc0 gc0Var;
        Object objMo1509A = ct5Var.mo1509A();
        mh0 mh0Var = objMo1509A instanceof mh0 ? (mh0) objMo1509A : null;
        AbstractC0343j.m1520i(abstractC0343j, l87Var, ((mh0Var == null || (gc0Var = mh0Var.f51318J) == null) ? interfaceC3571se : gc0Var).mo10276a((((long) l87Var.f49301a) << 32) | (((long) l87Var.f49302b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), layoutDirection));
    }

    /* JADX INFO: renamed from: c */
    public static final n66 m19965c(boolean z) {
        n66 n66Var = new n66(9);
        gc0 gc0Var = nj0.f52808c;
        n66Var.m17261m(gc0Var, new sh0(gc0Var, z));
        gc0 gc0Var2 = nj0.f52809d;
        n66Var.m17261m(gc0Var2, new sh0(gc0Var2, z));
        gc0 gc0Var3 = nj0.f52810e;
        n66Var.m17261m(gc0Var3, new sh0(gc0Var3, z));
        gc0 gc0Var4 = nj0.f52811f;
        n66Var.m17261m(gc0Var4, new sh0(gc0Var4, z));
        gc0 gc0Var5 = nj0.f52812g;
        n66Var.m17261m(gc0Var5, new sh0(gc0Var5, z));
        gc0 gc0Var6 = nj0.f52813h;
        n66Var.m17261m(gc0Var6, new sh0(gc0Var6, z));
        gc0 gc0Var7 = nj0.f52814i;
        n66Var.m17261m(gc0Var7, new sh0(gc0Var7, z));
        gc0 gc0Var8 = nj0.f52815j;
        n66Var.m17261m(gc0Var8, new sh0(gc0Var8, z));
        gc0 gc0Var9 = nj0.f52816k;
        n66Var.m17261m(gc0Var9, new sh0(gc0Var9, z));
        return n66Var;
    }

    /* JADX INFO: renamed from: d */
    public static final ht5 m19966d(InterfaceC3571se interfaceC3571se, boolean z) {
        ht5 ht5Var = (ht5) (z ? f57775a : f57776b).m17255g(interfaceC3571se);
        return ht5Var == null ? new sh0(interfaceC3571se, z) : ht5Var;
    }
}
