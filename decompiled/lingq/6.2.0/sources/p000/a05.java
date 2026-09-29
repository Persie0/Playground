package p000;

import android.content.Context;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.material3.C0254m;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.playlists.C1830f;
import com.lingq.core.playlists.C1832h;
import com.lingq.core.premium.AbstractC1852k;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.core.tooltips.components.AbstractC1915b;
import com.lingq.feature.lessoninfo.AbstractC2131b;
import com.lingq.feature.search.R$string;
import com.lingq.feature.vocabulary.data.VocabularyContentFilter;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a05 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f24c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f25d;

    public /* synthetic */ a05(c7a c7aVar, String str, List list, ui3 ui3Var) {
        this.f22a = 19;
        this.f23b = c7aVar;
        this.f24c = str;
        this.f25d = list;
    }

    /* JADX INFO: renamed from: d */
    private final Object m5d(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f24c;
        boolean z = ((h68) this.f23b).f41845f;
        ui3 ui3Var = (ui3) this.f25d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            if (str == null) {
                str = "";
            }
            String str2 = str;
            vh9 vh9Var = ps5.f56764b;
            long j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55882z;
            vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j;
            float f = ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a;
            e16 e16VarM815b = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM815b, f);
            if (z) {
                tj3Var.m22111b0(-2083713170);
                boolean zM22120g = tj3Var.m22120g(ui3Var);
                Object objM22097O = tj3Var.m22097O();
                if (zM22120g || objM22097O == we1.f66679a) {
                    objM22097O = new zy7(2, ui3Var);
                    tj3Var.m22131l0(objM22097O);
                }
                e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM815b, 15);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2010998092);
                tj3Var.m22139q(false);
            }
            lw9.m16554b(str2, e16VarM21607T.mo3161g(e16VarM815b), j, null, 0L, null, null, 0L, z ? rt9.f59802c : rt9.f59801b, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 129528);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    private final Object m6g(Object obj, Object obj2, Object obj3) {
        ui3 ui3Var = (ui3) this.f23b;
        String str = (String) this.f24c;
        Context context = (Context) this.f25d;
        InterfaceC0067f interfaceC0067f = (InterfaceC0067f) obj;
        ((Integer) obj3).getClass();
        interfaceC0067f.getClass();
        e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
        tj3 tj3Var = (tj3) ((ye1) obj2);
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = AbstractC3393o1.m17729d(tj3Var);
        }
        v56 v56Var = (v56) objM22097O;
        boolean zM22120g = tj3Var.m22120g(ui3Var);
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22120g || objM22097O2 == p84Var) {
            objM22097O2 = new zy7(3, ui3Var);
            tj3Var.m22131l0(objM22097O2);
        }
        ho9.m13414a(AbstractC0080f.m814a(e16VarM4411d, v56Var, null, false, null, (ui3) objM22097O2, 28), null, ((bx2) tj3Var.m22128k(cx2.f34676a)).m4211d(), 0L, 0.0f, 0.0f, null, ci8.m4703P(-978521231, new C2919d9(interfaceC0067f, ui3Var, str, context), tj3Var), tj3Var, 12582912, 122);
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m7j(Object obj, Object obj2, Object obj3) {
        mo8 mo8Var = (mo8) this.f24c;
        vi3 vi3Var = (vi3) this.f23b;
        vi3 vi3Var2 = (vi3) this.f25d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            float f = ge9.m12515a(tj3Var).f38952a;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var3 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var3);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            lw9.m16554b(mo8Var.f51647a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71405i, tj3Var, 0, 0, 131070);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.course_removed), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131066);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38956e, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            boolean zM22120g = tj3Var.m22120g(mo8Var) | tj3Var.m22120g(vi3Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new a45(mo8Var, vi3Var, 20);
                tj3Var.m22131l0(objM22097O);
            }
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_undo), AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), p58.m18900f(tj3Var).f55842a, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71409m, tj3Var, 0, 0, 131064);
            boolean zM22120g2 = tj3Var.m22120g(vi3Var2);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var) {
                objM22097O2 = new nc8(vi3Var2, 15);
                tj3Var.m22131l0(objM22097O2);
            }
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.promoted_course_learn_more), AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), p58.m18900f(tj3Var).f55842a, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71409m, tj3Var, 0, 0, 131064);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m8k(Object obj, Object obj2, Object obj3) {
        xu8 xu8Var = (xu8) this.f24c;
        vi3 vi3Var = (vi3) this.f23b;
        zi3 zi3Var = (zi3) this.f25d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38960i);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28));
            boolean zM22124i = tj3Var.m22124i(xu8Var) | tj3Var.m22120g(vi3Var) | tj3Var.m22120g(zi3Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ws6(xu8Var, zi3Var, vi3Var, 11);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11642c(e16VarM21607T, null, null, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 494);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    private final Object m9l(Object obj, Object obj2, Object obj3) {
        AbstractC0150d abstractC0150d = (AbstractC0150d) this.f24c;
        yw8 yw8Var = (yw8) this.f23b;
        C0282a c0282a = (C0282a) this.f25d;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        int i = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            thb.m22042a(abstractC0150d, AbstractC3584sr.m21606S(c99.m4411d(b16.f7762a, 1.0f), t17Var), null, null, 0, null, null, false, yw8Var.f70596b, null, null, null, null, ci8.m4703P(-564638963, new pn4(c0282a, i), tj3Var), tj3Var, 0, 15868);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m10m(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f24c;
        nz9 nz9Var = (nz9) this.f23b;
        xa3 xa3Var = (xa3) this.f25d;
        ye1 ye1Var = (ye1) obj2;
        ((Integer) obj3).getClass();
        ((InterfaceC0067f) obj).getClass();
        if (str == null) {
            str = "";
        }
        vh9 vh9Var = ps5.f56764b;
        tj3 tj3Var = (tj3) ye1Var;
        lw9.m16554b(str, AbstractC3584sr.m21611X(b16.f7762a, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, d32.m10032c0(nz9Var.f53455a * 0.72f, 4294967296L), null, null, xa3Var, 0L, null, null, 0, 0L, null, 16777180), ye1Var, 0, 0, 131068);
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m11n(Object obj, Object obj2, Object obj3) {
        rv2 rv2Var = (rv2) this.f24c;
        ui3 ui3Var = (ui3) this.f23b;
        ui3 ui3Var2 = (ui3) this.f25d;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            C0254m c0254m = rv2Var.f59847e;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC0319c.m1450a(b16Var, c0254m, null), 0.0f, t17Var.mo14021d(), 0.0f, 0.0f, 13);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            bq1.m4039O(AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var).f38960i, 0.0f, 2), 0.0f, ge9.m12515a(tj3Var).f38964m, 0.0f, 0.0f, 13), p58.m18901i(tj3Var).f64858d, null, te1.m22000n(62, 0.0f), null, ci8.m4703P(-2023298160, new ze2(9, ui3Var), tj3Var), tj3Var, 196608, 20);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38964m));
            bq1.m4039O(AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var).f38960i, 0.0f, 2), 0.0f, ge9.m12515a(tj3Var).f38964m, 0.0f, 0.0f, 13), p58.m18901i(tj3Var).f64858d, null, te1.m22000n(62, 0.0f), null, ci8.m4703P(-253328697, new ze2(10, ui3Var2), tj3Var), tj3Var, 196608, 20);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: o */
    private final Object m12o(Object obj, Object obj2, Object obj3) {
        d39 d39Var = (d39) this.f24c;
        vi3 vi3Var = (vi3) this.f23b;
        rc2 rc2Var = (rc2) this.f25d;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            e16 e16VarM21606S = AbstractC3584sr.m21606S(b16.f7762a, t17Var);
            zf1 zf1Var = ge9.f40637a;
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM21606S, 16.0f, 0.0f, 2);
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            AbstractC1858a.m8606v(AbstractC3584sr.m21609V(e16VarM21609V, 0.0f, 16.0f, 1), d39Var, vi3Var, rc2Var, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: p */
    private final Object m13p(Object obj, Object obj2, Object obj3) {
        String string;
        vi3 vi3Var = (vi3) this.f23b;
        vs3 vs3Var = (vs3) this.f24c;
        Context context = (Context) this.f25d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        int i = 1;
        boolean z = false;
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (TokenStatus tokenStatus : TokenStatus.getEntries()) {
                b16 b16Var = b16.f7762a;
                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                zf1 zf1Var = ge9.f40637a;
                e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38955d);
                boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22116e(tokenStatus.ordinal());
                Object objM22097O = tj3Var.m22097O();
                p84 p84Var = we1.f66679a;
                if (zM22120g || objM22097O == p84Var) {
                    objM22097O = new pw4(vi3Var, tokenStatus, i);
                    tj3Var.m22131l0(objM22097O);
                }
                e16 e16VarM815b = AbstractC0080f.m815b(null, z, (ui3) objM22097O, e16VarM21607T, 15);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
                se1.f60731q.getClass();
                ui3 ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                e16 e16VarM4422o = c99.m4422o(b16Var, 28.0f);
                yd5 yd5Var = vs3Var.f65847c;
                boolean zM22120g2 = tj3Var.m22120g(vi3Var) | tj3Var.m22116e(tokenStatus.ordinal());
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22120g2 || objM22097O2 == p84Var) {
                    objM22097O2 = new pw4(vi3Var, tokenStatus, 2);
                    tj3Var.m22131l0(objM22097O2);
                }
                l4d.m15802b(e16VarM4422o, tokenStatus, yd5Var, false, (ui3) objM22097O2, tj3Var, 6, 8);
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38952a));
                context.getClass();
                switch (oi9.f54381a[tokenStatus.ordinal()]) {
                    case 1:
                        string = context.getString(com.lingq.core.p012ui.R$string.card_ignore_this_word);
                        string.getClass();
                        break;
                    case 2:
                        string = context.getString(com.lingq.core.p012ui.R$string.card_status_new);
                        string.getClass();
                        break;
                    case 3:
                        string = context.getString(com.lingq.core.p012ui.R$string.card_status_recognized);
                        string.getClass();
                        break;
                    case 4:
                        string = context.getString(com.lingq.core.p012ui.R$string.card_status_familiar);
                        string.getClass();
                        break;
                    case 5:
                        string = context.getString(com.lingq.core.p012ui.R$string.card_status_learned);
                        string.getClass();
                        break;
                    case 6:
                        string = context.getString(com.lingq.core.p012ui.R$string.card_status_known);
                        string.getClass();
                        break;
                    default:
                        gm5.m12750e();
                        return null;
                }
                String str = string;
                e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
                vh9 vh9Var = ps5.f56764b;
                tj3 tj3Var2 = tj3Var;
                lw9.m16554b(str, e16VarM4430w, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var2, 48, 0, 131064);
                tj3Var = tj3Var2;
                tj3Var.m22139q(true);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38955d));
                i = 1;
                z = false;
            }
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: q */
    private final Object m14q(Object obj, Object obj2, Object obj3) {
        c7a c7aVar = (c7a) this.f23b;
        String str = (String) this.f24c;
        List list = (List) this.f25d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, 16.0f, 8.0f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            c7aVar.getClass();
            tj3Var.m22111b0(307412620);
            tj3Var.m22139q(false);
            AbstractC1915b.m8788a(str, list, AbstractC3584sr.m21609V(b16Var, 0.0f, 8.0f, 1), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, 384);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: r */
    private final Object m15r(Object obj, Object obj2, Object obj3) {
        int i;
        wia wiaVar = (wia) this.f24c;
        List list = (List) this.f23b;
        sc9 sc9Var = (sc9) this.f25d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            int i2 = AbstractC1852k.f22535a[wiaVar.f66884i.ordinal()];
            if (i2 == 1) {
                i = com.lingq.core.premium.R$string.upgrade_unlock_premium;
            } else if (i2 == 2) {
                i = com.lingq.core.premium.R$string.upgrade_upgrade_now;
            } else if (i2 == 3) {
                i = com.lingq.core.p012ui.R$string.settings_upgrade_change_plan;
            } else {
                if (i2 != 4) {
                    gm5.m12750e();
                    return null;
                }
                i = ((aia) list.get(sc9Var.m21222h())).f708h ? com.lingq.core.premium.R$string.upgrade_start_trial : com.lingq.core.premium.R$string.upgrade_unlock_premium;
            }
            lw9.m16554b(vz1.m23620a0(tj3Var, i), null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55844b, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262138);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: s */
    private final Object m16s(Object obj, Object obj2, Object obj3) {
        wia wiaVar = (wia) this.f24c;
        ui3 ui3Var = (ui3) this.f23b;
        ui3 ui3Var2 = (ui3) this.f25d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            q3c.m19631a(wiaVar.f66893r, ui3Var, ui3Var2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: t */
    private final Object m17t(Object obj, Object obj2, Object obj3) {
        vi3 vi3Var = (vi3) this.f23b;
        zza zzaVar = (zza) this.f24c;
        t66 t66Var = (t66) this.f25d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (VocabularyContentFilter vocabularyContentFilter : VocabularyContentFilter.getEntries()) {
                C0282a c0282aM4703P = ci8.m4703P(871189389, new eq8(29, vocabularyContentFilter, zzaVar), tj3Var);
                boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22116e(vocabularyContentFilter.ordinal());
                Object objM22097O = tj3Var.m22097O();
                if (zM22120g || objM22097O == we1.f66679a) {
                    objM22097O = new u29(5, vi3Var, vocabularyContentFilter, t66Var);
                    tj3Var.m22131l0(objM22097O);
                }
                AbstractC3003fj.m11886b(c0282aM4703P, (ui3) objM22097O, null, null, null, false, null, null, tj3Var, 6, 508);
            }
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: u */
    private final Object m18u(Object obj, Object obj2, Object obj3) {
        tza tzaVar = (tza) this.f24c;
        vi3 vi3Var = (vi3) this.f23b;
        List list = (List) this.f25d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            tj3Var.m22102U();
        } else if (tzaVar.f63152a != null) {
            tj3Var.m22111b0(-1561604319);
            ebd.m11019d(tzaVar.f63152a, vi3Var, tj3Var, 0);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22111b0(-1561446746);
            ebd.m11018c(list, vi3Var, tj3Var, 0);
            tj3Var.m22139q(false);
        }
        return xfa.f68157a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.f22a;
        int i2 = 2;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f25d;
        Object obj5 = this.f23b;
        Object obj6 = this.f24c;
        boolean z2 = true;
        switch (i) {
            case 0:
                String str = (String) obj6;
                vi3 vi3Var = (vi3) obj5;
                d05 d05Var = (d05) obj4;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    int i3 = hf5.f42302a;
                    gf5 gf5VarM13217a = hf5.m13217a(aa1.f411j, tj3Var);
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(b16.f7762a, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 7);
                    boolean zM22120g = tj3Var.m22120g(str) | tj3Var.m22120g(vi3Var) | tj3Var.m22120g(d05Var) | tj3Var.m22120g(gf5VarM13217a);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new C3445p2((Object) d05Var, (Object) str, vi3Var, (Object) gf5VarM13217a, 14);
                        tj3Var.m22131l0(objM22097O);
                    }
                    fa4.m11642c(e16VarM21611X, null, null, null, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 510);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                w35 w35Var = (w35) obj6;
                vi3 vi3Var2 = (vi3) obj5;
                vi3 vi3Var3 = (vi3) obj4;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC2131b.m9044c(w35Var, vi3Var2, vi3Var3, tj3Var2, 0);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                eo5 eo5Var = (eo5) obj6;
                vi3 vi3Var4 = (vi3) obj5;
                ui3 ui3Var = (ui3) obj4;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                    int iHashCode = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m = tj3Var3.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var2);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                    vi3 vi3Var5 = C0352b.f4305h;
                    oha.m18000f(tj3Var3, vi3Var5);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38960i, ge9.m12515a(tj3Var3).f38952a);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                    int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m2 = tj3Var3.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var2);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var5);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                    lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.feature.chat.R$string.lynx_settings_title), new as4(1.0f, true), 0L, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71403g, tj3Var3, 1572864, 0, 131004);
                    omd.m18141c(ui3Var, null, false, null, null, jzb.f46441a, tj3Var3, 1572864, 62);
                    tj3Var3.m22139q(true);
                    pb1.m19031a(0.0f, 0, 7, 0L, tj3Var3, null);
                    String strM23620a0 = vz1.m23620a0(tj3Var3, com.lingq.feature.chat.R$string.lynx_settings_preferences);
                    Locale locale = Locale.ROOT;
                    String upperCase = strM23620a0.toUpperCase(locale);
                    upperCase.getClass();
                    lw9.m16554b(upperCase, AbstractC3584sr.m21610W(b16Var, ge9.m12515a(tj3Var3).f38960i, ge9.m12515a(tj3Var3).f38956e, ge9.m12515a(tj3Var3).f38960i, ge9.m12515a(tj3Var3).f38955d), p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71410n, tj3Var3, 0, 0, 131064);
                    p04 p04VarM17721b = jbd.f45390a;
                    if (p04VarM17721b == null) {
                        o04 o04Var = new o04("Rounded.VolumeUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = soa.f61116a;
                        pd9 pd9Var = new pd9(aa1.f403b);
                        f57 f57Var = new f57();
                        f57Var.m11553h(3.0f, 10.0f);
                        f57Var.m11557l(4.0f);
                        f57Var.m11548c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        f57Var.m11550e(3.0f);
                        f57Var.m11552g(3.29f, 3.29f);
                        f57Var.m11548c(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
                        f57Var.m11551f(12.0f, 6.41f);
                        f57Var.m11548c(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
                        f57Var.m11551f(7.0f, 9.0f);
                        f57Var.m11551f(4.0f, 9.0f);
                        f57Var.m11548c(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        f57Var.m11546a();
                        f57Var.m11553h(16.5f, 12.0f);
                        f57Var.m11548c(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
                        f57Var.m11557l(8.05f);
                        f57Var.m11548c(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
                        f57Var.m11546a();
                        f57Var.m11553h(14.0f, 4.45f);
                        f57Var.m11557l(0.2f);
                        f57Var.m11548c(0.0f, 0.38f, 0.25f, 0.71f, 0.6f, 0.85f);
                        f57Var.m11547b(17.18f, 6.53f, 19.0f, 9.06f, 19.0f, 12.0f);
                        f57Var.m11555j(-1.82f, 5.47f, -4.4f, 6.5f);
                        f57Var.m11548c(-0.36f, 0.14f, -0.6f, 0.47f, -0.6f, 0.85f);
                        f57Var.m11557l(0.2f);
                        f57Var.m11548c(0.0f, 0.63f, 0.63f, 1.07f, 1.21f, 0.85f);
                        f57Var.m11547b(18.6f, 19.11f, 21.0f, 15.84f, 21.0f, 12.0f);
                        f57Var.m11555j(-2.4f, -7.11f, -5.79f, -8.4f);
                        f57Var.m11548c(-0.58f, -0.23f, -1.21f, 0.22f, -1.21f, 0.85f);
                        f57Var.m11546a();
                        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
                        p04VarM17721b = o04Var.m17721b();
                        jbd.f45390a = p04VarM17721b;
                    }
                    p04 p04Var = p04VarM17721b;
                    int i5 = com.lingq.feature.chat.R$string.lynx_settings_autoplay_tts;
                    boolean z3 = eo5Var.f37608a;
                    boolean zM22120g2 = tj3Var3.m22120g(vi3Var4);
                    Object objM22097O2 = tj3Var3.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new i75(vi3Var4, 1);
                        tj3Var3.m22131l0(objM22097O2);
                    }
                    tnb.m22247a(p04Var, i5, z3, (vi3) objM22097O2, null, tj3Var3, 0, 16);
                    p04 p04VarM17861b = o8d.m17861b();
                    int i6 = com.lingq.feature.chat.R$string.lynx_settings_auto_open_translation;
                    boolean z4 = eo5Var.f37609b;
                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var4);
                    Object objM22097O3 = tj3Var3.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new i75(vi3Var4, 2);
                        tj3Var3.m22131l0(objM22097O3);
                    }
                    tnb.m22247a(p04VarM17861b, i6, z4, (vi3) objM22097O3, null, tj3Var3, 0, 16);
                    p04 p04VarM17721b2 = iad.f43876a;
                    if (p04VarM17721b2 == null) {
                        o04 o04Var2 = new o04("Rounded.DarkMode", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i7 = soa.f61116a;
                        pd9 pd9Var2 = new pd9(aa1.f403b);
                        f57 f57VarM17730e = AbstractC3393o1.m17730e(11.01f, 3.05f);
                        f57VarM17730e.m11547b(6.51f, 3.54f, 3.0f, 7.36f, 3.0f, 12.0f);
                        f57VarM17730e.m11548c(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
                        f57VarM17730e.m11548c(4.63f, 0.0f, 8.45f, -3.5f, 8.95f, -8.0f);
                        f57VarM17730e.m11548c(0.09f, -0.79f, -0.78f, -1.42f, -1.54f, -0.95f);
                        f57VarM17730e.m11548c(-0.84f, 0.54f, -1.84f, 0.85f, -2.91f, 0.85f);
                        f57VarM17730e.m11548c(-2.98f, 0.0f, -5.4f, -2.42f, -5.4f, -5.4f);
                        f57VarM17730e.m11548c(0.0f, -1.06f, 0.31f, -2.06f, 0.84f, -2.89f);
                        f57VarM17730e.m11547b(12.39f, 3.94f, 11.9f, 2.98f, 11.01f, 3.05f);
                        f57VarM17730e.m11546a();
                        o04.m17720a(o04Var2, f57VarM17730e.f38440a, pd9Var2);
                        p04VarM17721b2 = o04Var2.m17721b();
                        iad.f43876a = p04VarM17721b2;
                    }
                    p04 p04Var2 = p04VarM17721b2;
                    int i8 = com.lingq.feature.chat.R$string.lynx_settings_dark_mode;
                    int i9 = do5.f35951a[eo5Var.f37610c.ordinal()];
                    if (i9 == 1) {
                        tj3Var3.m22111b0(-2106032745);
                        tj3Var3.m22139q(false);
                        z = true;
                    } else if (i9 == 2) {
                        tj3Var3.m22111b0(-2106006916);
                        tj3Var3.m22139q(false);
                        z = false;
                    } else {
                        if (i9 != 3) {
                            throw ux5.m23001x(tj3Var3, -206484893, false);
                        }
                        tj3Var3.m22111b0(-206482167);
                        boolean zM18217B = AbstractC3423or.m18217B(tj3Var3);
                        tj3Var3.m22139q(false);
                        z = zM18217B;
                    }
                    boolean zM22120g4 = tj3Var3.m22120g(vi3Var4);
                    Object objM22097O4 = tj3Var3.m22097O();
                    if (zM22120g4 || objM22097O4 == p84Var) {
                        objM22097O4 = new i75(vi3Var4, 3);
                        tj3Var3.m22131l0(objM22097O4);
                    }
                    tnb.m22247a(p04Var2, i8, z, (vi3) objM22097O4, null, tj3Var3, 0, 16);
                    String upperCase2 = vz1.m23620a0(tj3Var3, com.lingq.feature.chat.R$string.lynx_settings_privacy).toUpperCase(locale);
                    upperCase2.getClass();
                    lw9.m16554b(upperCase2, AbstractC3584sr.m21610W(b16Var, ge9.m12515a(tj3Var3).f38960i, ge9.m12515a(tj3Var3).f38956e, ge9.m12515a(tj3Var3).f38960i, ge9.m12515a(tj3Var3).f38955d), p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71410n, tj3Var3, 0, 0, 131064);
                    p04 p04VarM3744a = bic.m3744a();
                    int i10 = com.lingq.feature.chat.R$string.lynx_settings_memory;
                    int i11 = com.lingq.feature.chat.R$string.lynx_settings_memory_description;
                    boolean z5 = eo5Var.f37611d;
                    boolean zM22120g5 = tj3Var3.m22120g(vi3Var4);
                    Object objM22097O5 = tj3Var3.m22097O();
                    if (zM22120g5 || objM22097O5 == p84Var) {
                        objM22097O5 = new i75(vi3Var4, 4);
                        tj3Var3.m22131l0(objM22097O5);
                    }
                    tnb.m22247a(p04VarM3744a, i10, z5, (vi3) objM22097O5, Integer.valueOf(i11), tj3Var3, 0, 0);
                    p04 p04VarM10096b = d4d.m10096b();
                    int i12 = com.lingq.feature.chat.R$string.lynx_settings_data_improvement;
                    int i13 = com.lingq.feature.chat.R$string.lynx_settings_data_improvement_description;
                    boolean z6 = eo5Var.f37612e;
                    boolean zM22120g6 = tj3Var3.m22120g(vi3Var4);
                    Object objM22097O6 = tj3Var3.m22097O();
                    if (zM22120g6 || objM22097O6 == p84Var) {
                        objM22097O6 = new i75(vi3Var4, 5);
                        tj3Var3.m22131l0(objM22097O6);
                    }
                    tnb.m22247a(p04VarM10096b, i12, z6, (vi3) objM22097O6, Integer.valueOf(i13), tj3Var3, 0, 0);
                    ux5.m23003z(b16Var, ge9.m12515a(tj3Var3).f38957f, tj3Var3, true);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                Context context = (Context) obj6;
                zy1 zy1Var = (zy1) obj5;
                fe9 fe9Var = (fe9) obj4;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    lw9.m16554b(vz1.m23618Z(com.lingq.feature.onboarding.R$string.onboarding_daily_goal_title, new Object[]{AbstractC3352my.m17093L(context, zy1Var.f72373a)}, tj3Var4), c99.m4412e(AbstractC3584sr.m21609V(b16Var, 0.0f, fe9Var.f38952a, 1), 1.0f), 0L, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 261116);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 4:
                fe9 fe9Var2 = (fe9) obj6;
                w75 w75Var = (w75) obj4;
                vi3 vi3Var6 = (vi3) obj5;
                t17 t17Var = (t17) obj;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((tj3) ye1Var5).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    e16 e16VarM21606S = AbstractC3584sr.m21606S(l70.m15962y(b16Var), t17Var);
                    ec0 ec0Var = nj0.f52792K;
                    C3661uu c3661uu = new C3661uu(fe9Var2.f38963l, true, new gm5(28));
                    float f = fe9Var2.f38960i;
                    x17 x17Var = new x17(f, f, f, f);
                    boolean zM22124i = tj3Var5.m22124i(fe9Var2) | tj3Var5.m22124i(w75Var) | tj3Var5.m22120g(vi3Var6);
                    Object objM22097O7 = tj3Var5.m22097O();
                    if (zM22124i || objM22097O7 == p84Var) {
                        objM22097O7 = new ws6(w75Var, fe9Var2, vi3Var6);
                        tj3Var5.m22131l0(objM22097O7);
                    }
                    fa4.m11642c(e16VarM21606S, null, x17Var, c3661uu, ec0Var, null, false, null, (vi3) objM22097O7, tj3Var5, 196608, 458);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 5:
                zu0 zu0Var = (zu0) obj6;
                float f2 = zu0Var.f72167a;
                hv0 hv0Var = (hv0) obj5;
                ev0 ev0Var = (ev0) obj4;
                ei0 ei0Var = (ei0) obj;
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ei0Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((tj3) ye1Var6).m22120g(ei0Var) ? 4 : 2;
                }
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    fb2 fb2Var = (fb2) tj3Var6.m22128k(AbstractC0402n.f4816h);
                    float fMo912g0 = fb2Var.mo912g0(ei0Var.m11159b());
                    fb2 fb2Var2 = ei0Var.f37274a;
                    long j = ei0Var.f37275b;
                    float fMo912g1 = fb2Var.mo912g0(bk1.m3796d(j) ? fb2Var2.mo905T(bk1.m3800h(j)) : Float.POSITIVE_INFINITY);
                    float fMo912g2 = fb2Var.mo912g0(16.0f);
                    float fMo912g3 = fb2Var.mo912g0(16.0f);
                    float fMo912g4 = fb2Var.mo912g0(24.0f);
                    float fMo912g5 = fb2Var.mo912g0(32.0f);
                    av0 av0Var = new av0(fMo912g0, fMo912g1, fMo912g2, fMo912g3, fMo912g4, fMo912g5, fb2Var.mo912g0(ev0Var.f37926e));
                    float fM15944g = l70.m15944g(f2, 0.0f, 1.0f);
                    float f3 = (((fMo912g0 - fMo912g2) - fMo912g3) * fM15944g) + fMo912g2;
                    float f4 = fMo912g1 - fMo912g5;
                    double d = fM15944g;
                    float fM3079a = f4 - ((av0Var.m3079a() * zu0Var.f72168b) * ((float) (1.0d - Math.exp((-3.5d) * d))));
                    float fM3079a2 = f4 - ((av0Var.m3079a() * zu0Var.f72169c) * ((float) (1.0d - Math.exp(d * (-2.5d)))));
                    e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                    boolean zM22120g7 = tj3Var6.m22120g(av0Var) | tj3Var6.m22120g(hv0Var) | tj3Var6.m22120g(zu0Var);
                    Object objM22097O8 = tj3Var6.m22097O();
                    Object obj7 = objM22097O8;
                    if (zM22120g7 || objM22097O8 == p84Var) {
                        ws6 ws6Var = new ws6(av0Var, hv0Var, zu0Var, 2);
                        tj3Var6.m22131l0(ws6Var);
                        obj7 = ws6Var;
                    }
                    eh0.m11124d(e16VarM4411d, (vi3) obj7, tj3Var6, 6);
                    if (f2 > 0.8f) {
                        tj3Var6.m22111b0(1335190420);
                        kxb.m15718d(ei0Var, av0Var, f3, fM3079a, fM3079a2, ev0Var, tj3Var6, iIntValue6 & 14);
                        tj3Var6.m22139q(false);
                    } else {
                        tj3Var6.m22111b0(1335422982);
                        tj3Var6.m22139q(false);
                    }
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 6:
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var7).f38952a);
                    sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var7, 48);
                    int iHashCode3 = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m3 = tj3Var7.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var7, e16VarM21607T);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var3);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    zi3 zi3Var5 = C0352b.f4303f;
                    oha.m18001g(tj3Var7, zi3Var5, sj8VarM20003a2);
                    zi3 zi3Var6 = C0352b.f4302e;
                    oha.m18001g(tj3Var7, zi3Var6, l77VarM22132m3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    zi3 zi3Var7 = C0352b.f4304g;
                    oha.m18001g(tj3Var7, zi3Var7, numValueOf2);
                    vi3 vi3Var7 = C0352b.f4305h;
                    oha.m18000f(tj3Var7, vi3Var7);
                    zi3 zi3Var8 = C0352b.f4301d;
                    oha.m18001g(tj3Var7, zi3Var8, e16VarM1322c3);
                    if (str2 != null) {
                        tj3Var7.m22111b0(-1970599137);
                        e16 e16VarM10007D = d32.m10007D(pb1.m19045o(c99.m4422o(b16Var, 40.0f), ui8.f63972a), p58.m18900f(tj3Var7).f55874r, ss5.f61356d);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                        int iHashCode4 = Long.hashCode(tj3Var7.f62385T);
                        l77 l77VarM22132m4 = tj3Var7.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var7, e16VarM10007D);
                        tj3Var7.m22119f0();
                        if (tj3Var7.f62384S) {
                            tj3Var7.m22130l(ui3Var3);
                        } else {
                            tj3Var7.m22137o0();
                        }
                        oha.m18001g(tj3Var7, zi3Var5, ht5VarM19966d);
                        oha.m18001g(tj3Var7, zi3Var6, l77VarM22132m4);
                        AbstractC3393o1.m17747v(iHashCode4, tj3Var7, zi3Var7, tj3Var7, vi3Var7);
                        oha.m18001g(tj3Var7, zi3Var8, e16VarM1322c4);
                        lw9.m16554b(str2, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var7).f71404h, tj3Var7, 0, 0, 131070);
                        tj3Var7.m22139q(true);
                        thb.m22044c(tj3Var7, c99.m4426s(b16Var, ge9.m12515a(tj3Var7).f38952a));
                        tj3Var7.m22139q(false);
                    } else {
                        tj3Var7.m22111b0(-1970056172);
                        tj3Var7.m22139q(false);
                    }
                    as4 as4Var = new as4(1.0f, true);
                    bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(2.0f, true, new gm5(28)), nj0.f52791J, tj3Var7, 6);
                    int iHashCode5 = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m5 = tj3Var7.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var7, as4Var);
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var3);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    oha.m18001g(tj3Var7, zi3Var5, bb1VarM230a2);
                    oha.m18001g(tj3Var7, zi3Var6, l77VarM22132m5);
                    AbstractC3393o1.m17747v(iHashCode5, tj3Var7, zi3Var7, tj3Var7, vi3Var7);
                    oha.m18001g(tj3Var7, zi3Var8, e16VarM1322c5);
                    lw9.m16554b(str3, null, p58.m18900f(tj3Var7).f55873q, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 2, false, 0, 0, null, p58.m18902j(tj3Var7).f71406j, tj3Var7, 1572864, 384, 126906);
                    lw9.m16554b(str4, null, p58.m18900f(tj3Var7).f55875s, null, 0L, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, p58.m18902j(tj3Var7).f71407k, tj3Var7, 0, 384, 126970);
                    tj3Var7.m22139q(true);
                    tj3Var7.m22139q(true);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 7:
                List<String> list = (List) obj6;
                ui3 ui3Var4 = (ui3) obj4;
                vi3 vi3Var8 = (vi3) obj5;
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    for (String str5 : list) {
                        e16 e16VarM21607T2 = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var8.m22128k(ge9.f40637a)).f38952a);
                        boolean zM22120g8 = tj3Var8.m22120g(ui3Var4) | tj3Var8.m22120g(vi3Var8) | tj3Var8.m22120g(str5);
                        Object objM22097O9 = tj3Var8.m22097O();
                        if (zM22120g8 || objM22097O9 == p84Var) {
                            objM22097O9 = new me7(ui3Var4, vi3Var8, str5);
                            tj3Var8.m22131l0(objM22097O9);
                        }
                        lw9.m16554b(str5, AbstractC0080f.m815b(null, false, (ui3) objM22097O9, e16VarM21607T2, 15), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var8, 0, 0, 262140);
                    }
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 8:
                ui3 ui3Var5 = (ui3) obj6;
                ui3 ui3Var6 = (ui3) obj5;
                t66 t66Var = (t66) obj4;
                ye1 ye1Var9 = (ye1) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    boolean zM22120g9 = tj3Var9.m22120g(ui3Var5);
                    Object objM22097O10 = tj3Var9.m22097O();
                    if (zM22120g9 || objM22097O10 == p84Var) {
                        objM22097O10 = new wy1(3, ui3Var5, t66Var);
                        tj3Var9.m22131l0(objM22097O10);
                    }
                    AbstractC3003fj.m11886b(igc.f44097c, (ui3) objM22097O10, null, null, null, false, null, null, tj3Var9, 6, 508);
                    boolean zM22120g10 = tj3Var9.m22120g(ui3Var6);
                    Object objM22097O11 = tj3Var9.m22097O();
                    if (zM22120g10 || objM22097O11 == p84Var) {
                        objM22097O11 = new wy1(4, ui3Var6, t66Var);
                        tj3Var9.m22131l0(objM22097O11);
                    }
                    AbstractC3003fj.m11886b(igc.f44098d, (ui3) objM22097O11, null, null, null, false, null, null, tj3Var9, 6, 508);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 9:
                oe7 oe7Var = (oe7) obj6;
                C1832h c1832h = (C1832h) obj5;
                dh9 dh9Var = (dh9) obj4;
                ye1 ye1Var10 = (ye1) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    tf7 tf7Var = (tf7) dh9Var.getValue();
                    boolean zM22124i2 = tj3Var10.m22124i(oe7Var) | tj3Var10.m22124i(c1832h);
                    Object objM22097O12 = tj3Var10.m22097O();
                    if (zM22124i2 || objM22097O12 == p84Var) {
                        objM22097O12 = new of7(oe7Var, c1832h);
                        tj3Var10.m22131l0(objM22097O12);
                    }
                    vi3 vi3Var9 = (vi3) objM22097O12;
                    boolean zM22124i3 = tj3Var10.m22124i(c1832h);
                    Object objM22097O13 = tj3Var10.m22097O();
                    if (zM22124i3 || objM22097O13 == p84Var) {
                        objM22097O13 = new pf7(c1832h, 1);
                        tj3Var10.m22131l0(objM22097O13);
                    }
                    vi3 vi3Var10 = (vi3) objM22097O13;
                    boolean zM22124i4 = tj3Var10.m22124i(c1832h);
                    Object objM22097O14 = tj3Var10.m22097O();
                    if (zM22124i4 || objM22097O14 == p84Var) {
                        objM22097O14 = new C1830f(c1832h, i2);
                        tj3Var10.m22131l0(objM22097O14);
                    }
                    vi3 vi3Var11 = (vi3) objM22097O14;
                    boolean zM22120g11 = tj3Var10.m22120g(dh9Var) | tj3Var10.m22124i(c1832h) | tj3Var10.m22124i(oe7Var);
                    Object objM22097O15 = tj3Var10.m22097O();
                    if (zM22120g11 || objM22097O15 == p84Var) {
                        objM22097O15 = new qf7(c1832h, oe7Var, dh9Var, z2 ? 1 : 0);
                        tj3Var10.m22131l0(objM22097O15);
                    }
                    k3c.m14790a(tf7Var, vi3Var9, vi3Var10, vi3Var11, (ui3) objM22097O15, tj3Var10, 0);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 10:
                return m5d(obj, obj2, obj3);
            case 11:
                return m6g(obj, obj2, obj3);
            case 12:
                return m7j(obj, obj2, obj3);
            case 13:
                return m8k(obj, obj2, obj3);
            case 14:
                return m9l(obj, obj2, obj3);
            case 15:
                return m10m(obj, obj2, obj3);
            case 16:
                return m11n(obj, obj2, obj3);
            case 17:
                return m12o(obj, obj2, obj3);
            case 18:
                return m13p(obj, obj2, obj3);
            case 19:
                return m14q(obj, obj2, obj3);
            case 20:
                return m15r(obj, obj2, obj3);
            case 21:
                return m16s(obj, obj2, obj3);
            case 22:
                return m17t(obj, obj2, obj3);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return m18u(obj, obj2, obj3);
            default:
                n1b n1bVar = (n1b) obj6;
                vi3 vi3Var12 = (vi3) obj5;
                vi3 vi3Var13 = (vi3) obj4;
                ye1 ye1Var11 = (ye1) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((bi0) obj).getClass();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    h0b h0bVar = n1bVar.f52193c;
                    zf1 zf1Var = ge9.f40637a;
                    x17 x17Var2 = new x17(((fe9) tj3Var11.m22128k(zf1Var)).f38960i, ((fe9) tj3Var11.m22128k(zf1Var)).f38960i, ((fe9) tj3Var11.m22128k(zf1Var)).f38960i, ((fe9) tj3Var11.m22128k(zf1Var)).f38962k + ((fe9) tj3Var11.m22128k(zf1Var)).f38958g);
                    boolean zM22120g12 = tj3Var11.m22120g(vi3Var12);
                    Object objM22097O16 = tj3Var11.m22097O();
                    if (zM22120g12 || objM22097O16 == p84Var) {
                        objM22097O16 = new v4a(vi3Var12, 19);
                        tj3Var11.m22131l0(objM22097O16);
                    }
                    vi3 vi3Var14 = (vi3) objM22097O16;
                    boolean zM22120g13 = tj3Var11.m22120g(vi3Var13);
                    Object objM22097O17 = tj3Var11.m22097O();
                    if (zM22120g13 || objM22097O17 == p84Var) {
                        objM22097O17 = new ww8(vi3Var13, 9);
                        tj3Var11.m22131l0(objM22097O17);
                    }
                    zi3 zi3Var9 = (zi3) objM22097O17;
                    boolean zM22120g14 = tj3Var11.m22120g(vi3Var13);
                    Object objM22097O18 = tj3Var11.m22097O();
                    if (zM22120g14 || objM22097O18 == p84Var) {
                        objM22097O18 = new v4a(vi3Var13, 20);
                        tj3Var11.m22131l0(objM22097O18);
                    }
                    fbd.m11753c(h0bVar, x17Var2, vi3Var14, zi3Var9, (vi3) objM22097O18, ci8.m4703P(-600294611, new y0b(n1bVar, vi3Var13, vi3Var12), tj3Var11), e16VarM4412e2, tj3Var11, 1769472);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
        }
    }

    public /* synthetic */ a05(xi3 xi3Var, Object obj, Object obj2, int i) {
        this.f22a = i;
        this.f23b = xi3Var;
        this.f24c = obj;
        this.f25d = obj2;
    }

    public /* synthetic */ a05(int i, vi3 vi3Var, Object obj, Object obj2) {
        this.f22a = i;
        this.f24c = obj;
        this.f25d = obj2;
        this.f23b = vi3Var;
    }

    public /* synthetic */ a05(Object obj, Object obj2, Object obj3, int i) {
        this.f22a = i;
        this.f24c = obj;
        this.f23b = obj2;
        this.f25d = obj3;
    }
}
