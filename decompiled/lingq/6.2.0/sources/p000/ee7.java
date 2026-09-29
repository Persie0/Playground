package p000;

import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.dragdrop.C1919b;
import com.lingq.core.player.data.PlayerType;
import com.lingq.feature.playlist.AbstractC2253c;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ee7 implements aj3 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ t66 f37112H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ t66 f37113I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ t66 f37114J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ t66 f37115K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f37116L;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37117a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1919b f37118b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ un1 f37119c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f37120d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fe9 f37121e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0127b f37122f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ vi3 f37123g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ze7 f37124h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ tb7 f37125i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ fb2 f37126j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ t66 f37127k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ sc9 f37128l;

    public /* synthetic */ ee7(vi3 vi3Var, t66 t66Var, C1919b c1919b, un1 un1Var, fe9 fe9Var, C0127b c0127b, vi3 vi3Var2, ze7 ze7Var, tb7 tb7Var, fb2 fb2Var, t66 t66Var2, sc9 sc9Var, t66 t66Var3, t66 t66Var4, t66 t66Var5, t66 t66Var6) {
        this.f37120d = vi3Var;
        this.f37127k = t66Var;
        this.f37118b = c1919b;
        this.f37119c = un1Var;
        this.f37121e = fe9Var;
        this.f37122f = c0127b;
        this.f37123g = vi3Var2;
        this.f37124h = ze7Var;
        this.f37125i = tb7Var;
        this.f37126j = fb2Var;
        this.f37112H = t66Var2;
        this.f37128l = sc9Var;
        this.f37113I = t66Var3;
        this.f37114J = t66Var4;
        this.f37115K = t66Var5;
        this.f37116L = t66Var6;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e16 e16VarM16957a;
        Object obj4;
        vi3 vi3Var;
        t66 t66Var;
        int i = this.f37117a;
        xfa xfaVar = xfa.f68157a;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        Object obj5 = this.f37116L;
        switch (i) {
            case 0:
                t66 t66Var2 = (t66) obj5;
                t17 t17Var = (t17) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var, 1.0f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55872p, ss5.f61356d);
                    gc0 gc0Var = nj0.f52815j;
                    t66 t66Var3 = this.f37127k;
                    boolean zBooleanValue = ((Boolean) t66Var3.getValue()).booleanValue();
                    vi3 vi3Var2 = this.f37120d;
                    boolean zM22120g = tj3Var.m22120g(vi3Var2);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new az0(vi3Var2, t66Var3, 5);
                        tj3Var.m22131l0(objM22097O);
                    }
                    lp7.m16424b(zBooleanValue, (ui3) objM22097O, e16VarM10007D, null, gc0Var, null, false, 0.0f, ci8.m4703P(-1590958233, new ee7(this.f37118b, this.f37119c, vi3Var2, this.f37121e, t17Var, this.f37122f, this.f37123g, this.f37124h, this.f37125i, this.f37126j, this.f37112H, this.f37128l, this.f37113I, this.f37114J, this.f37115K, t66Var2), tj3Var), tj3Var, 100687872, 232);
                }
                break;
            default:
                t17 t17Var2 = (t17) obj5;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bi0) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4411d, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, 0.0f, 10);
                    final t66 t66Var4 = this.f37127k;
                    boolean zBooleanValue2 = ((Boolean) t66Var4.getValue()).booleanValue();
                    final C1919b c1919b = this.f37118b;
                    final vi3 vi3Var3 = this.f37120d;
                    if (zBooleanValue2) {
                        tj3Var2.m22111b0(-1272232252);
                        int iM21222h = this.f37128l.m21222h();
                        boolean zM22120g2 = tj3Var2.m22120g(vi3Var3);
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O2 == p84Var) {
                            objM22097O2 = new i75(vi3Var3, 24);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        vi3 vi3Var4 = (vi3) objM22097O2;
                        c1919b.getClass();
                        un1 un1Var = this.f37119c;
                        un1Var.getClass();
                        vi3Var4.getClass();
                        e16VarM16957a = mo9.m16957a(b16Var, c1919b, new gk2(vi3Var4, c1919b, iM21222h, un1Var));
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(-1271863941);
                        tj3Var2.m22139q(false);
                        e16VarM16957a = b16Var;
                    }
                    e16 e16VarMo3161g = e16VarM21611X.mo3161g(e16VarM16957a);
                    ec0 ec0Var = nj0.f52792K;
                    final fe9 fe9Var = this.f37121e;
                    C3661uu c3661uu = new C3661uu(fe9Var.f38964m, true, new gm5(28));
                    x17 x17VarM21626g = AbstractC3584sr.m21626g(0.0f, t17Var2.mo14021d(), 0.0f, t17Var2.mo14018a(), 5);
                    boolean zM22124i = tj3Var2.m22124i(fe9Var);
                    final vi3 vi3Var5 = this.f37123g;
                    boolean zM22120g3 = zM22124i | tj3Var2.m22120g(vi3Var5);
                    final ze7 ze7Var = this.f37124h;
                    boolean zM22124i2 = zM22120g3 | tj3Var2.m22124i(ze7Var) | tj3Var2.m22124i(c1919b);
                    final tb7 tb7Var = this.f37125i;
                    boolean zM22124i3 = zM22124i2 | tj3Var2.m22124i(tb7Var) | tj3Var2.m22120g(vi3Var3);
                    Object objM22097O3 = tj3Var2.m22097O();
                    final t66 t66Var5 = this.f37113I;
                    final t66 t66Var6 = this.f37115K;
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        final t66 t66Var7 = this.f37112H;
                        final t66 t66Var8 = this.f37114J;
                        obj4 = new vi3() { // from class: ke7
                            @Override // p000.vi3
                            public final Object invoke(Object obj6) {
                                vu4 vu4Var = (vu4) obj6;
                                vu4Var.getClass();
                                fe9 fe9Var2 = fe9Var;
                                vi3 vi3Var6 = vi3Var5;
                                t66 t66Var9 = t66Var7;
                                t66 t66Var10 = t66Var5;
                                vu4.m23545g(vu4Var, null, new C0282a(-1029081540, true, new hn0((Object) fe9Var2, vi3Var6, (Object) t66Var9, (Object) t66Var10, (Object) t66Var8, 13)), 3);
                                ze7 ze7Var2 = ze7Var;
                                if (ze7Var2 instanceof we7) {
                                    vu4.m23545g(vu4Var, null, cgc.f10041g, 3);
                                } else if (fa4.m11650l(ze7Var2, xe7.f68130a)) {
                                    vu4.m23545g(vu4Var, null, cgc.f10042h, 3);
                                } else {
                                    if (!(ze7Var2 instanceof ye7)) {
                                        gm5.m12750e();
                                        return null;
                                    }
                                    ye7 ye7Var = (ye7) ze7Var2;
                                    List list = ye7Var.f69743n;
                                    vu4Var.m23547h(list.size(), null, new C3520r2(25, list), new C0282a(2039820996, true, new qe7(list, c1919b, tb7Var, vi3Var3, t66Var4, t66Var10)));
                                    if (ye7Var.f69736g) {
                                        vu4.m23545g(vu4Var, null, new C0282a(-2006735529, true, new oo1(1, t66Var6)), 3);
                                    }
                                }
                                return xfa.f68157a;
                            }
                        };
                        vi3Var = vi3Var5;
                        t66Var = t66Var6;
                        tj3Var2.m22131l0(obj4);
                    } else {
                        obj4 = objM22097O3;
                        t66Var = t66Var6;
                        vi3Var = vi3Var5;
                    }
                    fa4.m11642c(e16VarMo3161g, this.f37122f, x17VarM21626g, c3661uu, ec0Var, null, false, null, (vi3) obj4, tj3Var2, 196608, 456);
                    if (ze7Var instanceof ye7) {
                        ye7 ye7Var = (ye7) ze7Var;
                        if (ye7Var.f69736g) {
                            tj3Var2.m22111b0(-1262597669);
                            e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var2.m22128k(zf1Var)).f38957f, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e);
                            fb2 fb2Var = this.f37126j;
                            boolean zM22120g4 = tj3Var2.m22120g(fb2Var);
                            Object objM22097O4 = tj3Var2.m22097O();
                            if (zM22120g4 || objM22097O4 == p84Var) {
                                objM22097O4 = new no1(fb2Var, t66Var, 1);
                                tj3Var2.m22131l0(objM22097O4);
                            }
                            e16 e16VarM18138a0 = omd.m18138a0(e16VarM21608U, (vi3) objM22097O4);
                            hc7 hc7Var = ye7Var.f69742m;
                            int i2 = hc7Var.f42177e;
                            int i3 = (int) hc7Var.f42176d;
                            boolean z = ye7Var.f69730a;
                            ac7 ac7Var = hc7Var.f42181i;
                            PlayerType playerType = hc7Var.f42173a;
                            pbb pbbVar = (pbb) r16.getValue();
                            String str = ye7Var.f69737h;
                            String strM17131l0 = str != null ? AbstractC3352my.m17131l0(str) : null;
                            boolean z2 = ye7Var.f69738i;
                            String str2 = ye7Var.f69739j;
                            Object objM22097O5 = tj3Var2.m22097O();
                            if (objM22097O5 == p84Var) {
                                objM22097O5 = new dt6(8, t66Var5);
                                tj3Var2.m22131l0(objM22097O5);
                            }
                            AbstractC2253c.m9221g(e16VarM18138a0, i2, i3, z, z2, ac7Var, playerType, pbbVar, (vi3) objM22097O5, strM17131l0, str2, vi3Var, tj3Var2, 100663296, 0, 0);
                            tj3Var2.m22139q(false);
                        }
                    }
                    tj3Var2.m22111b0(-1261538213);
                    tj3Var2.m22139q(false);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ee7(C1919b c1919b, un1 un1Var, vi3 vi3Var, fe9 fe9Var, t17 t17Var, C0127b c0127b, vi3 vi3Var2, ze7 ze7Var, tb7 tb7Var, fb2 fb2Var, t66 t66Var, sc9 sc9Var, t66 t66Var2, t66 t66Var3, t66 t66Var4, t66 t66Var5) {
        this.f37118b = c1919b;
        this.f37119c = un1Var;
        this.f37120d = vi3Var;
        this.f37121e = fe9Var;
        this.f37116L = t17Var;
        this.f37122f = c0127b;
        this.f37123g = vi3Var2;
        this.f37124h = ze7Var;
        this.f37125i = tb7Var;
        this.f37126j = fb2Var;
        this.f37127k = t66Var;
        this.f37128l = sc9Var;
        this.f37112H = t66Var2;
        this.f37113I = t66Var3;
        this.f37114J = t66Var4;
        this.f37115K = t66Var5;
    }
}
