package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ps5 {

    /* JADX INFO: renamed from: a */
    public static final vh9 f56763a = new vh9(new ri5(1));

    /* JADX INFO: renamed from: b */
    public static final vh9 f56764b = new vh9(new ri5(2));

    /* JADX INFO: renamed from: a */
    public static final void m19470a(pa1 pa1Var, q36 q36Var, v49 v49Var, zda zdaVar, C0282a c0282a, ye1 ye1Var, int i) {
        C0282a c0282a2;
        zda zdaVar2;
        v49 v49Var2;
        q36 q36Var2;
        pa1 pa1Var2;
        pa1 pa1Var3;
        q36 q36Var3;
        zda zdaVar3;
        v49 v49Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1317329884);
        int i2 = (tj3Var.m22120g(pa1Var) ? 4 : 2) | i | (tj3Var.m22120g(q36Var) ? 32 : 16) | (tj3Var.m22124i(c0282a) ? 16384 : 8192);
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            vh9 vh9Var = f56763a;
            if (((Boolean) tj3Var.m22128k(vh9Var)).booleanValue()) {
                tj3Var.m22111b0(1458663246);
                vh9 vh9Var2 = f56764b;
                if (pa1Var == null) {
                    tj3Var.m22111b0(-1061323065);
                    pa1Var3 = ((ms5) tj3Var.m22128k(vh9Var2)).f51799a;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-1061323964);
                    tj3Var.m22139q(false);
                    pa1Var3 = pa1Var;
                }
                if (q36Var == null) {
                    tj3Var.m22111b0(-1061320824);
                    q36Var3 = ((ms5) tj3Var.m22128k(vh9Var2)).f51802d;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-1061321754);
                    tj3Var.m22139q(false);
                    q36Var3 = q36Var;
                }
                if (zdaVar == null) {
                    tj3Var.m22111b0(-1061318682);
                    zdaVar3 = ((ms5) tj3Var.m22128k(vh9Var2)).f51800b;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-1061319550);
                    tj3Var.m22139q(false);
                    zdaVar3 = zdaVar;
                }
                if (v49Var == null) {
                    tj3Var.m22111b0(-1061316862);
                    v49Var3 = ((ms5) tj3Var.m22128k(vh9Var2)).f51801c;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-1061317606);
                    tj3Var.m22139q(false);
                    v49Var3 = v49Var;
                }
                m19471b(pa1Var3, q36Var3, v49Var3, zdaVar3, c0282a, tj3Var, i2 & 57344);
                c0282a2 = c0282a;
                tj3Var.m22139q(false);
                zdaVar2 = zdaVar;
                v49Var2 = v49Var;
                q36Var2 = q36Var;
                pa1Var2 = pa1Var;
            } else {
                c0282a2 = c0282a;
                tj3Var.m22111b0(1458990389);
                zdaVar2 = zdaVar;
                v49Var2 = v49Var;
                q36Var2 = q36Var;
                pa1Var2 = pa1Var;
                pvc.m19507c(vh9Var.mo1265a(Boolean.TRUE), ci8.m4703P(1535649272, new ns5(pa1Var2, q36Var2, v49Var2, zdaVar2, c0282a2), tj3Var), tj3Var, 56);
                tj3Var.m22139q(false);
            }
        } else {
            c0282a2 = c0282a;
            zdaVar2 = zdaVar;
            v49Var2 = v49Var;
            q36Var2 = q36Var;
            pa1Var2 = pa1Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ns5(pa1Var2, q36Var2, v49Var2, zdaVar2, c0282a2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19471b(pa1 pa1Var, q36 q36Var, v49 v49Var, zda zdaVar, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(904511636);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(pa1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(q36Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(v49Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22120g(zdaVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 16384 : 8192;
        }
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            ms5 ms5Var = new ms5(pa1Var, zdaVar, v49Var, q36Var);
            rh8 rh8VarM12656a = gh8.m12656a(false, 0.0f, 0L, null, 255);
            long j = pa1Var.f55842a;
            boolean zM22118f = tj3Var.m22118f(j);
            Object objM22097O = tj3Var.m22097O();
            if (zM22118f || objM22097O == we1.f66679a) {
                objM22097O = new mx9(j, aa1.m198b(0.4f, j));
                tj3Var.m22131l0(objM22097O);
            }
            pvc.m19508d(new a02[]{f56764b.mo1265a(ms5Var), s34.f60229a.mo1265a(rh8VarM12656a), nx9.f53367a.mo1265a((mx9) objM22097O)}, ci8.m4703P(-1750539308, new os5(zdaVar, c0282a, i3), tj3Var), tj3Var, 56);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3125iw(pa1Var, q36Var, v49Var, zdaVar, c0282a, i, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m19472c(pa1 pa1Var, v49 v49Var, zda zdaVar, C0282a c0282a, ye1 ye1Var, int i) {
        v49 v49Var2;
        zda zdaVar2;
        v49 v49Var3;
        zda zdaVar3;
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-449719819);
        int i3 = i | (tj3Var.m22120g(pa1Var) ? 4 : 2) | 144;
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            tj3Var.m22104W();
            int i4 = i & 1;
            vh9 vh9Var = f56764b;
            if (i4 == 0 || tj3Var.m22084B()) {
                v49Var3 = ((ms5) tj3Var.m22128k(vh9Var)).f51801c;
                zdaVar3 = ((ms5) tj3Var.m22128k(vh9Var)).f51800b;
                i2 = i3 & (-1009);
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-1009);
                v49Var3 = v49Var;
                zdaVar3 = zdaVar;
            }
            tj3Var.m22140r();
            zda zdaVar4 = zdaVar3;
            m19471b(pa1Var, ((ms5) tj3Var.m22128k(vh9Var)).f51802d, v49Var3, zdaVar4, c0282a, tj3Var, (i2 & 14) | 24576);
            v49Var2 = v49Var3;
            zdaVar2 = zdaVar4;
        } else {
            tj3Var.m22102U();
            v49Var2 = v49Var;
            zdaVar2 = zdaVar;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9((Object) pa1Var, (Object) v49Var2, (Object) zdaVar2, (Object) c0282a, i, 21);
        }
    }
}
