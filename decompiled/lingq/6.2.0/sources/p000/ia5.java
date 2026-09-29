package p000;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.foundation.text.C0179g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import androidx.glance.AbstractC0640a;
import androidx.glance.layout.AbstractC0686a;
import androidx.glance.text.AbstractC0704a;
import com.lingq.feature.challenges.R$string;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia5 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f43859c;

    public /* synthetic */ ia5(int i, Object obj, Object obj2) {
        this.f43857a = i;
        this.f43858b = obj;
        this.f43859c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01a5  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        tj3 tj3Var;
        Typeface typeface;
        int i = this.f43857a;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        int i2 = 16;
        int i3 = 0;
        Object obj4 = this.f43859c;
        Object obj5 = this.f43858b;
        switch (i) {
            case 0:
                f95 f95Var = (f95) obj5;
                n4b n4bVar = (n4b) obj4;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var;
                if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                    vi3 vi3Var = C0352b.f4305h;
                    oha.m18000f(tj3Var2, vi3Var);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37241g, nj0.f52789H, tj3Var2, 54);
                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM21608U);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                    if (f95Var.f38674h) {
                        tj3Var2.m22111b0(-400796315);
                        AbstractC3584sr.m21618c(null, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                        z2 = true;
                    } else {
                        tj3Var2.m22111b0(-400698262);
                        boolean zM12247b = fy9.m12247b(n4bVar);
                        vj8 vj8Var = vj8.f65508a;
                        if (zM12247b) {
                            tj3Var2.m22111b0(-400661682);
                            z2 = true;
                            z = false;
                            AbstractC3584sr.m21630i(f95Var, vj8Var.mo12420a(1.0f, c99.m4412e(b16Var, 1.0f), true), tj3Var2, 0);
                            AbstractC3584sr.m21633k(f95Var, vj8Var.mo12420a(1.0f, c99.m4412e(b16Var, 1.0f), true), tj3Var2, 0);
                            tj3Var2.m22139q(false);
                        } else {
                            z = false;
                            z2 = true;
                            tj3Var2.m22111b0(-400278863);
                            AbstractC3584sr.m21630i(f95Var, vj8Var.mo12420a(1.0f, c99.m4412e(b16Var, 1.0f), true), tj3Var2, 0);
                            AbstractC3584sr.m21633k(f95Var, vj8Var.mo12420a(1.0f, c99.m4412e(b16Var, 1.0f), true), tj3Var2, 0);
                            AbstractC3584sr.m21634l(f95Var, vj8Var.mo12420a(1.0f, c99.m4412e(b16Var, 1.0f), true), tj3Var2, 0);
                            AbstractC3584sr.m21632j(f95Var, vj8Var.mo12420a(1.0f, c99.m4412e(b16Var, 1.0f), true), tj3Var2, 0);
                            tj3Var2.m22139q(false);
                        }
                        tj3Var2.m22139q(z);
                    }
                    tj3Var2.m22139q(z2);
                    tj3Var2.m22139q(z2);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 1:
                ja5 ja5Var = (ja5) obj5;
                b85 b85Var = (b85) obj4;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var2;
                if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    if (ja5Var.f45346k) {
                        tj3Var3.m22111b0(1432970411);
                        String strM23620a0 = vz1.m23620a0(tj3Var3, R$string.challenges_cup_banner_title);
                        boolean zM22124i = tj3Var3.m22124i(b85Var);
                        Object objM22097O = tj3Var3.m22097O();
                        if (zM22124i || objM22097O == p84Var) {
                            objM22097O = new ma5(b85Var, 12);
                            tj3Var3.m22131l0(objM22097O);
                        }
                        omd.m18141c((ui3) objM22097O, null, false, null, null, ci8.m4703P(819986196, new C3186kj(strM23620a0, 11), tj3Var3), tj3Var3, 1572864, 62);
                        tj3Var3.m22139q(false);
                    } else {
                        tj3Var3.m22111b0(1433581607);
                        tj3Var3.m22139q(false);
                    }
                    boolean zM22124i2 = tj3Var3.m22124i(b85Var);
                    Object objM22097O2 = tj3Var3.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new ma5(b85Var, 13);
                        tj3Var3.m22131l0(objM22097O2);
                    }
                    omd.m18141c((ui3) objM22097O2, null, false, null, null, wfb.f66765a, tj3Var3, 1572864, 62);
                    boolean zM22124i3 = tj3Var3.m22124i(b85Var);
                    Object objM22097O3 = tj3Var3.m22097O();
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        objM22097O3 = new ma5(b85Var, 14);
                        tj3Var3.m22131l0(objM22097O3);
                    }
                    omd.m18141c((ui3) objM22097O3, null, false, null, null, wfb.f66766b, tj3Var3, 1572864, 62);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 2:
                Integer num = (Integer) obj5;
                String str = (String) obj4;
                ye1 ye1Var3 = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((uj8) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var3;
                int iM24559a = xj2.m24559a(bk2.m3805a(((bk2) tj3Var4.m22128k(yf1.f69762a)).f8632a), 180.0f);
                mn3 mn3Var = mn3.f51554a;
                if (iM24559a >= 0) {
                    tj3Var4.m22111b0(2029712489);
                    if (num == null) {
                        tj3Var4.m22111b0(-1503422280);
                        tj3Var4.m22139q(false);
                        tj3Var = tj3Var4;
                    } else {
                        tj3Var4.m22111b0(-1503422279);
                        AbstractC0640a.m2210a(new C0850ck(num.intValue()), null, null, 0, new ea1(new j1a(((vn2) tj3Var4.m22128k(yf1.f69766e)).f65636e)), tj3Var4, 32816, 12);
                        tj3Var = tj3Var4;
                        AbstractC0686a.m2488d(ci8.m4694G(mn3Var, 8.0f), tj3Var, 0);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(false);
                } else {
                    tj3Var = tj3Var4;
                    tj3Var.m22111b0(-1503062431);
                    tj3Var.m22139q(false);
                }
                AbstractC0686a.m2488d(ci8.m4717b0(mn3Var, 8.0f), ye1Var3, 0);
                AbstractC0704a.m2506a(str, null, new ux9(((vn2) tj3Var.m22128k(yf1.f69766e)).f65651t, new zx9(d32.m10018P(16)), new ac3(500), 120), 0, ye1Var3, 0, 10);
                return xfaVar;
            case 3:
                AbstractC0150d abstractC0150d = (AbstractC0150d) obj5;
                LayoutDirection layoutDirection = (LayoutDirection) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                boolean zM19022J = pb1.m19022J(abstractC0150d, fFloatValue);
                if (abstractC0150d.m1038m().f52223e != Orientation.Vertical && layoutDirection != LayoutDirection.Ltr) {
                    zM19022J = !zM19022J;
                }
                int i4 = abstractC0150d.m1038m().f52220b;
                float fM19050t = i4 == 0 ? 0.0f : pb1.m19050t(abstractC0150d) / i4;
                float f = fM19050t - ((int) fM19050t);
                if (Math.abs(fFloatValue) >= abstractC0150d.f2684n.mo912g0(400.0f)) {
                    i3 = fFloatValue > 0.0f ? 1 : 2;
                }
                if (i3 == 0) {
                    if (Math.abs(f) <= 0.5f) {
                        float fAbs = Math.abs(fM19050t);
                        fb2 fb2Var = abstractC0150d.f2684n;
                        u27 u27Var = v27.f64740a;
                        if (fAbs < Math.abs(Math.min(fb2Var.mo912g0(56.0f), abstractC0150d.m1040o() / 2.0f) / abstractC0150d.m1040o()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zM19022J) {
                            fFloatValue2 = fFloatValue3;
                        }
                    } else if (zM19022J) {
                        fFloatValue2 = fFloatValue3;
                    }
                } else if (i3 == 1) {
                    fFloatValue2 = fFloatValue3;
                } else if (i3 != 2) {
                    fFloatValue2 = 0.0f;
                }
                return Float.valueOf(fFloatValue2);
            case 4:
                Spannable spannable = (Spannable) obj5;
                C3411oj c3411oj = (C3411oj) obj4;
                he9 he9Var = (he9) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int iIntValue4 = ((Integer) obj3).intValue();
                xa3 xa3Var = he9Var.f42269f;
                bc3 bc3Var = he9Var.f42266c;
                if (bc3Var == null) {
                    bc3Var = bc3.f8321g;
                }
                wb3 wb3Var = he9Var.f42267d;
                i3 = wb3Var != null ? wb3Var.f66583a : 0;
                xb3 xb3Var = he9Var.f42268e;
                int i5 = xb3Var != null ? xb3Var.f68021a : 65535;
                C3462pj c3462pj = (C3462pj) c3411oj.f54387b;
                wda wdaVarM25018b = ((ya3) c3462pj.f56288e).m25018b(xa3Var, bc3Var, i3, i5);
                if (wdaVarM25018b instanceof vda) {
                    Object obj6 = ((vda) wdaVarM25018b).f65260a;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    sq5 sq5Var = new sq5(wdaVarM25018b, c3462pj.f56293j);
                    c3462pj.f56293j = sq5Var;
                    Object obj7 = sq5Var.f61250d;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new ab3(typeface, 1), iIntValue3, iIntValue4, 33);
                return xfaVar;
            default:
                f86 f86Var = (f86) obj5;
                v56 v56Var = (v56) obj4;
                ((Integer) obj3).getClass();
                tj3 tj3Var5 = (tj3) ((ye1) obj2);
                tj3Var5.m22111b0(-102778667);
                Object objM22097O4 = tj3Var5.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = d32.m10013K(tj3Var5);
                    tj3Var5.m22131l0(objM22097O4);
                }
                un1 un1Var = (un1) objM22097O4;
                Object objM22097O5 = tj3Var5.m22097O();
                if (objM22097O5 == p84Var) {
                    objM22097O5 = AbstractC0278f.m1260j(null);
                    tj3Var5.m22131l0(objM22097O5);
                }
                t66 t66Var = (t66) objM22097O5;
                t66 t66VarM1263m = AbstractC0278f.m1263m(f86Var, tj3Var5);
                boolean zM22120g = tj3Var5.m22120g(v56Var);
                Object objM22097O6 = tj3Var5.m22097O();
                if (zM22120g || objM22097O6 == p84Var) {
                    objM22097O6 = new ui5(i2, t66Var, v56Var);
                    tj3Var5.m22131l0(objM22097O6);
                }
                d32.m10041h(v56Var, (vi3) objM22097O6, tj3Var5);
                boolean zM22124i4 = tj3Var5.m22124i(un1Var) | tj3Var5.m22120g(v56Var) | tj3Var5.m22120g(t66VarM1263m);
                Object objM22097O7 = tj3Var5.m22097O();
                if (zM22124i4 || objM22097O7 == p84Var) {
                    objM22097O7 = new C0179g(un1Var, t66Var, v56Var, t66VarM1263m);
                    tj3Var5.m22131l0(objM22097O7);
                }
                e16 e16VarM16957a = mo9.m16957a(b16Var, v56Var, (PointerInputEventHandler) objM22097O7);
                tj3Var5.m22139q(false);
                return e16VarM16957a;
        }
    }
}
