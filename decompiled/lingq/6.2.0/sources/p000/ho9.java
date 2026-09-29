package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0262s;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ho9 {

    /* JADX INFO: renamed from: a */
    public static final zf1 f42717a = new zf1(new b98(20));

    /* JADX INFO: renamed from: a */
    public static final void m13414a(e16 e16Var, o39 o39Var, long j, long j2, float f, float f2, vf0 vf0Var, final zi3 zi3Var, ye1 ye1Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            e16Var = b16.f7762a;
        }
        if ((i2 & 2) != 0) {
            o39Var = ss5.f61356d;
        }
        if ((i2 & 4) != 0) {
            j = ((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51799a.f55872p;
        }
        if ((i2 & 8) != 0) {
            j2 = ra1.m20489b(j, ye1Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            vf0Var = null;
        }
        tj3 tj3Var = (tj3) ye1Var;
        zf1 zf1Var = f42717a;
        final float f3 = f + ((xj2) tj3Var.m22128k(zf1Var)).f68285a;
        a02[] a02VarArr = {AbstractC3393o1.m17727b(j2, sk1.f60948a), zf1Var.mo1265a(new xj2(f3))};
        final long j3 = j;
        final o39 o39Var2 = o39Var;
        final vf0 vf0Var2 = vf0Var;
        final float f4 = f2;
        final e16 e16Var2 = e16Var;
        pvc.m19508d(a02VarArr, ci8.m4703P(421772006, new zi3() { // from class: fo9
            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                boolean zM22099R = tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2);
                xfa xfaVar = xfa.f68157a;
                if (!zM22099R) {
                    tj3Var2.m22102U();
                    return xfaVar;
                }
                e16 e16VarM13416c = ho9.m13416c(e16Var2, o39Var2, ho9.m13417d(j3, f3, tj3Var2), vf0Var2, ((fb2) tj3Var2.m22128k(AbstractC0402n.f4816h)).mo912g0(f4));
                Object objM22097O = tj3Var2.m22097O();
                p84 p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = new wx8(2);
                    tj3Var2.m22131l0(objM22097O);
                }
                e16 e16VarM17643c = nv8.m17643c(e16VarM13416c, false, (vi3) objM22097O);
                Object objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = b82.f8088d;
                    tj3Var2.m22131l0(objM22097O2);
                }
                e16 e16VarM16957a = mo9.m16957a(e16VarM17643c, xfaVar, (PointerInputEventHandler) objM22097O2);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, true);
                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m = tj3Var2.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM16957a);
                se1.f60731q.getClass();
                ui3 ui3Var = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var2, C0352b.f4305h);
                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                zi3Var.invoke(tj3Var2, 0);
                tj3Var2.m22139q(true);
                return xfaVar;
            }
        }, tj3Var), tj3Var, 56);
    }

    /* JADX INFO: renamed from: b */
    public static final void m13415b(final ui3 ui3Var, final e16 e16Var, boolean z, final o39 o39Var, final long j, long j2, float f, float f2, vf0 vf0Var, v56 v56Var, final C0282a c0282a, ye1 ye1Var, int i, int i2) {
        final boolean z2 = (i2 & 4) != 0 ? true : z;
        long jM20489b = (i2 & 32) != 0 ? ra1.m20489b(j, ye1Var) : j2;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        final float f4 = (i2 & 128) != 0 ? 0.0f : f2;
        final vf0 vf0Var2 = (i2 & 256) != 0 ? null : vf0Var;
        v56 v56Var2 = (i2 & 512) == 0 ? v56Var : null;
        tj3 tj3Var = (tj3) ye1Var;
        if (v56Var2 == null) {
            tj3Var.m22111b0(-1701074900);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC3393o1.m17729d(tj3Var);
            }
            v56Var2 = (v56) objM22097O;
        } else {
            tj3Var.m22111b0(2023335947);
        }
        tj3Var.m22139q(false);
        final v56 v56Var3 = v56Var2;
        tj3 tj3Var2 = (tj3) ye1Var;
        zf1 zf1Var = f42717a;
        final float f5 = ((xj2) tj3Var2.m22128k(zf1Var)).f68285a + f3;
        pvc.m19508d(new a02[]{AbstractC3393o1.m17727b(jM20489b, sk1.f60948a), zf1Var.mo1265a(new xj2(f5))}, ci8.m4703P(849208527, new zi3() { // from class: go9
            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var2;
                if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    iv3 iv3Var = AbstractC0262s.f3627a;
                    e16 e16VarMo3161g = e16Var.mo3161g(c06.f9271b);
                    zf1 zf1Var2 = gh8.f40823a;
                    sh8 sh8Var = ((th8) tj3Var3.m22128k(zf1Var2)).f62294a;
                    e16 e16VarMo3161g2 = e16VarMo3161g.mo3161g(b16.f7762a);
                    long jM13417d = ho9.m13417d(j, f5, tj3Var3);
                    float fMo912g0 = ((fb2) tj3Var3.m22128k(AbstractC0402n.f4816h)).mo912g0(f4);
                    o39 o39Var2 = o39Var;
                    e16 e16VarM13416c = ho9.m13416c(e16VarMo3161g2, o39Var2, jM13417d, vf0Var2, fMo912g0);
                    sh8 sh8Var2 = ((th8) tj3Var3.m22128k(zf1Var2)).f62294a;
                    e16 e16VarM24777o = xwc.m24777o(AbstractC0080f.m814a(e16VarM13416c, v56Var3, gh8.m12656a(false, 0.0f, 0L, o39Var2, 215), z2, null, ui3Var, 24));
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, true);
                    int iHashCode = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m = tj3Var3.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM24777o);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var2);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                    wq1.m24128x(0, c0282a, tj3Var3, true);
                } else {
                    tj3Var3.m22102U();
                }
                return xfa.f68157a;
            }
        }, tj3Var2), tj3Var2, 56);
    }

    /* JADX INFO: renamed from: c */
    public static final e16 m13416c(e16 e16Var, o39 o39Var, long j, vf0 vf0Var, float f) {
        e16 e16VarM20388n = b16.f7762a;
        e16 e16VarMo3161g = e16Var.mo3161g(f > 0.0f ? AbstractC0309d.m1407b(e16VarM20388n, 0.0f, 0.0f, 0.0f, f, 0.0f, 0L, o39Var, false, 1042399) : e16VarM20388n);
        if (vf0Var != null) {
            e16VarM20388n = r46.m20388n(e16VarM20388n, vf0Var.f65300a, vf0Var.f65301b, o39Var);
        }
        return pb1.m19045o(d32.m10007D(e16VarMo3161g.mo3161g(e16VarM20388n), j, o39Var), o39Var);
    }

    /* JADX INFO: renamed from: d */
    public static final long m13417d(long j, float f, tj3 tj3Var) {
        pa1 pa1Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a;
        boolean zBooleanValue = ((Boolean) tj3Var.m22128k(ra1.f58959a)).booleanValue();
        long j2 = pa1Var.f55872p;
        if (aa1.m199c(j, j2) && zBooleanValue) {
            return xj2.m24560b(f, 0.0f) ? j2 : d32.m10012J(aa1.m198b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, pa1Var.f55876t), j2);
        }
        return j;
    }
}
