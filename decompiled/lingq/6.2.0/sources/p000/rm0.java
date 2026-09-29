package p000;

import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.glance.appwidget.components.AbstractC0655b;
import com.lingq.core.designsystem.R$drawable;
import com.lingq.core.domain.model.library.LibraryTab;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.sync.C3248a;
import kotlinx.coroutines.sync.C3249b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rm0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f59523b;

    public /* synthetic */ rm0(int i, Object obj, Object obj2) {
        this.f59522a = i;
        this.f59523b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0626  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = this.f59522a;
        ci0 ci0Var = ci0.f10109a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f59523b;
        switch (i) {
            case 0:
                ((fy4) obj4).invoke((Throwable) obj);
                return xfaVar;
            case 1:
                cn1 cn1Var = (cn1) obj4;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue = cn1Var.f10311Q.mo13407j(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = cn1Var.f10311Q.mo13407j(iIntValue2);
                }
                if (cn1Var.f10309O) {
                    long j = cn1Var.f10307M.f65991b;
                    int i2 = cx9.f34693c;
                    if (iIntValue == ((int) (j >> 32)) && iIntValue2 == ((int) (j & 4294967295L))) {
                        z = false;
                    } else if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > cn1Var.f10307M.f65990a.f54604b.length()) {
                        C0205f c0205f = cn1Var.f10312R;
                        c0205f.m1120u(false);
                        c0205f.m1117r(HandleState.None);
                        z = false;
                    } else {
                        if (zBooleanValue || iIntValue == iIntValue2) {
                            z2 = true;
                            C0205f c0205f2 = cn1Var.f10312R;
                            c0205f2.m1120u(false);
                            c0205f2.m1117r(HandleState.None);
                        } else {
                            z2 = true;
                            cn1Var.f10312R.m1107h(true);
                        }
                        cn1Var.f10308N.f70590v.invoke(new vv9(cn1Var.f10307M.f65990a, eh0.m11127g(iIntValue, iIntValue2), (cx9) null));
                        z = z2;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                ((vi3) obj4).invoke(new gq6(((kg7) obj2).f47237c));
                return xfaVar;
            case 3:
                ye1 ye1Var = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((uj8) obj).getClass();
                AbstractC0655b.m2219a(new C0850ck(R$drawable.ic_lingq), "", (tg9) obj4, null, false, null, ((vn2) ((tj3) ye1Var).m22128k(yf1.f69766e)).f65636e, ye1Var, 196656, 24);
                return xfaVar;
            case 4:
                ((Integer) obj3).getClass();
                tj3 tj3Var = (tj3) ((ye1) obj2);
                tj3Var.m22111b0(-353972293);
                ((w34) obj4).getClass();
                tj3Var.m22111b0(1257603829);
                gr7 gr7Var = gr7.f41239d;
                tj3Var.m22139q(false);
                boolean zM22120g = tj3Var.m22120g(gr7Var);
                Object objM22097O = tj3Var.m22097O();
                if (zM22120g || objM22097O == we1.f66679a) {
                    objM22097O = new t34();
                    tj3Var.m22131l0(objM22097O);
                }
                t34 t34Var = (t34) objM22097O;
                tj3Var.m22139q(false);
                return t34Var;
            case 5:
                d85 d85Var = (d85) obj4;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    b16 b16Var = b16.f7762a;
                    e16 e16VarMo3161g = d32.m10007D(c99.m4411d(b16Var, 1.0f), p58.m18900f(tj3Var2).f55874r, ss5.f61356d).mo3161g(b16Var);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarMo3161g);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                    vi3 vi3Var = C0352b.f4305h;
                    oha.m18000f(tj3Var2, vi3Var);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                    String str = d85Var.f35149b;
                    e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                    p58 p58Var = hl1.f42564a;
                    ss5.m21702b(str, null, e16VarM4411d, null, p58Var, tj3Var2, 1573296, 4024);
                    e16 e16VarM4410c = c99.m4410c(c99.m4426s(b16Var, 120.0f), 1.0f);
                    gc0 gc0Var = nj0.f52814i;
                    qh0.m19963a(d32.m10006C(ci0Var.mo3727a(e16VarM4410c, gc0Var), ui0.m22745a(vi0.Companion, vz1.m23605K(new aa1(aa1.m198b(0.3f, aa1.f403b)), new aa1(aa1.f411j)), 0.0f, 0.0f, 14)), tj3Var2, 0);
                    ss5.m21702b(d85Var.f35150c, null, AbstractC3584sr.m21607T(ci0Var.mo3727a(wq1.m24108d(tj3Var2, b16Var, 40.0f), nj0.f52810e), ge9.m12515a(tj3Var2).f38952a), null, p58Var, tj3Var2, 1572912, 4024);
                    e16 e16VarMo3727a = ci0Var.mo3727a(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var2).f38952a, 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38952a, 6), gc0Var);
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var2).f38955d, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarMo3727a);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                    pb1.m19032b(null, d85Var.f35151d, cx2.m9917a(tj3Var2).m4209b(), tj3Var2, 0);
                    pb1.m19032b(null, d85Var.f35152e, cx2.m9917a(tj3Var2).m4212e(), tj3Var2, 0);
                    tj3Var2.m22139q(true);
                    tj3Var2.m22139q(true);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 6:
                LibraryTab libraryTab = (LibraryTab) obj4;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String str2 = libraryTab.f19501a;
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(str2, null, ((ms5) tj3Var3.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var3.m22128k(vh9Var)).f51800b.f71407k, 0L, 0L, libraryTab.f19504d ? bc3.f8324j : bc3.f8321g, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var3, 0, 0, 131066);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 7:
                z85 z85Var = (z85) obj4;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    tj3Var4.m22102U();
                    return xfaVar;
                }
                b16 b16Var2 = b16.f7762a;
                e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var2, 1.0f), p58.m18900f(tj3Var4).f55874r, ss5.f61356d);
                gc0 gc0Var2 = nj0.f52808c;
                ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var2, false);
                int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                l77 l77VarM22132m3 = tj3Var4.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM10007D);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var4.m22119f0();
                if (tj3Var4.f62384S) {
                    tj3Var4.m22130l(ui3Var2);
                } else {
                    tj3Var4.m22137o0();
                }
                zi3 zi3Var5 = C0352b.f4303f;
                oha.m18001g(tj3Var4, zi3Var5, ht5VarM19966d2);
                zi3 zi3Var6 = C0352b.f4302e;
                oha.m18001g(tj3Var4, zi3Var6, l77VarM22132m3);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                zi3 zi3Var7 = C0352b.f4304g;
                oha.m18001g(tj3Var4, zi3Var7, numValueOf2);
                vi3 vi3Var2 = C0352b.f4305h;
                oha.m18000f(tj3Var4, vi3Var2);
                zi3 zi3Var8 = C0352b.f4301d;
                oha.m18001g(tj3Var4, zi3Var8, e16VarM1322c3);
                e16 e16VarM4411d2 = c99.m4411d(b16Var2, 1.0f);
                z85Var.getClass();
                ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var2, false);
                int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                l77 l77VarM22132m4 = tj3Var4.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, e16VarM4411d2);
                tj3Var4.m22119f0();
                if (tj3Var4.f62384S) {
                    tj3Var4.m22130l(ui3Var2);
                } else {
                    tj3Var4.m22137o0();
                }
                oha.m18001g(tj3Var4, zi3Var5, ht5VarM19966d3);
                oha.m18001g(tj3Var4, zi3Var6, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var4, zi3Var7, tj3Var4, vi3Var2);
                oha.m18001g(tj3Var4, zi3Var8, e16VarM1322c4);
                String str3 = z85Var.f71073b;
                String str4 = z85Var.f71078g;
                e16 e16VarM4411d3 = c99.m4411d(b16Var2, 1.0f);
                p58 p58Var2 = hl1.f42564a;
                ss5.m21702b(str3, str4, e16VarM4411d3, null, p58Var2, tj3Var4, 1573248, 4024);
                e16 e16VarM4410c2 = c99.m4410c(c99.m4426s(b16Var2, 120.0f), 1.0f);
                gc0 gc0Var3 = nj0.f52814i;
                qh0.m19963a(d32.m10006C(ci0Var.mo3727a(e16VarM4410c2, gc0Var3), ui0.m22745a(vi0.Companion, vz1.m23605K(new aa1(aa1.m198b(0.3f, aa1.f403b)), new aa1(aa1.f411j)), 0.0f, 0.0f, 14)), tj3Var4, 0);
                ss5.m21702b(z85Var.f71074c, z85Var.f71079h, pb1.m19045o(AbstractC3584sr.m21607T(ci0Var.mo3727a(wq1.m24108d(tj3Var4, b16Var2, 40.0f), nj0.f52810e), ge9.m12515a(tj3Var4).f38952a), ui8.f63972a), null, p58Var2, tj3Var4, 1572864, 4024);
                e16 e16VarMo3727a2 = ci0Var.mo3727a(AbstractC3584sr.m21611X(b16Var2, ge9.m12515a(tj3Var4).f38952a, 0.0f, 0.0f, ge9.m12515a(tj3Var4).f38952a, 6), gc0Var3);
                bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var4).f38955d, true, new gm5(28)), nj0.f52791J, tj3Var4, 0);
                int iHashCode5 = Long.hashCode(tj3Var4.f62385T);
                l77 l77VarM22132m5 = tj3Var4.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var4, e16VarMo3727a2);
                tj3Var4.m22119f0();
                if (tj3Var4.f62384S) {
                    tj3Var4.m22130l(ui3Var2);
                } else {
                    tj3Var4.m22137o0();
                }
                oha.m18001g(tj3Var4, zi3Var5, bb1VarM230a2);
                oha.m18001g(tj3Var4, zi3Var6, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var4, zi3Var7, tj3Var4, vi3Var2);
                oha.m18001g(tj3Var4, zi3Var8, e16VarM1322c5);
                pb1.m19032b(null, z85Var.f71075d, cx2.m9917a(tj3Var4).m4209b(), tj3Var4, 0);
                pb1.m19032b(null, z85Var.f71076e, cx2.m9917a(tj3Var4).m4212e(), tj3Var4, 0);
                tj3Var4.m22139q(true);
                tj3Var4.m22139q(true);
                tj3Var4.m22111b0(2115594218);
                tj3Var4.m22139q(false);
                tj3Var4.m22139q(true);
                return xfaVar;
            case 8:
                aj3 aj3Var = (aj3) obj4;
                db1 db1Var = (db1) obj;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                db1Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((tj3) ye1Var5).m22120g(db1Var) ? 4 : 2;
                }
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    aj3Var.invoke(db1Var, tj3Var5, Integer.valueOf(iIntValue6 & 14));
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 9:
                ye1 ye1Var6 = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((InterfaceC0067f) obj).getClass();
                ho9.m13414a(c99.m4411d(b16.f7762a, 1.0f), null, ((bx2) ((tj3) ye1Var6).m22128k(cx2.f34676a)).m4211d(), 0L, 0.0f, 0.0f, null, ci8.m4703P(1912135994, new C3441oz((String) obj4, 21), ye1Var6), ye1Var6, 12582918, 122);
                return xfaVar;
            case 10:
                C3248a c3248a = (C3248a) obj4;
                C3248a.f48177j.set(c3248a, null);
                c3248a.mo4387b(null);
                return xfaVar;
            case 11:
                zi3 zi3Var9 = (zi3) obj4;
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                tj3 tj3Var6 = (tj3) ye1Var7;
                if (tj3Var6.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    zi3Var9.invoke(tj3Var6, 0);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 12:
                ((C3249b) obj4).m15600f();
                return xfaVar;
            default:
                jt5 jt5Var = (jt5) obj;
                ct5 ct5Var = (ct5) obj2;
                bk1 bk1Var = (bk1) obj3;
                float f = ((xj2) ((ui3) obj4).mo0a()).f68285a;
                l87 l87VarMo1514r = ct5Var.mo1514r(bk1.m3794b(0, 0, dk1.m10428f(xj2.m24560b(f, Float.NaN) ? 0 : jt5Var.mo916w0(f), bk1Var.f8631a), 0, 11, bk1Var.f8631a));
                return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 12));
        }
    }

    public /* synthetic */ rm0(Object obj, int i) {
        this.f59522a = i;
        this.f59523b = obj;
    }
}
