package p000;

import android.content.Context;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.domain.model.chat.ChatStats;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.language.LanguageStatValue;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.p012ui.LessonInfoSource;
import com.lingq.feature.challenges.AbstractC1985e;
import com.lingq.feature.challenges.R$drawable;
import com.lingq.feature.challenges.R$string;
import com.lingq.feature.challenges.cup.AbstractC1976c;
import com.lingq.feature.challenges.cup.data.CupPhase;
import com.lingq.feature.chat.AbstractC2005i;
import com.lingq.feature.chat.AbstractC2008l;
import com.lingq.feature.collections.C2034d;
import com.lingq.feature.dictionary.AbstractC2059d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ik0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44212a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f44213b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f44214c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f44215d;

    public /* synthetic */ ik0(bh9 bh9Var, String str, LanguageProgressPeriod languageProgressPeriod) {
        this.f44212a = 26;
        this.f44213b = bh9Var;
        this.f44214c = str;
        this.f44215d = languageProgressPeriod;
    }

    /* JADX INFO: renamed from: d */
    private final Object m13971d(Object obj, Object obj2, Object obj3) {
        int i;
        ru1 ru1Var = (ru1) this.f44213b;
        Integer num = (Integer) this.f44214c;
        String str = (String) this.f44215d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.cup_results_you_earned);
            vh9 vh9Var = ps5.f56764b;
            vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h;
            long j = xs1.f68629v;
            lw9.m16554b(strM23620a0, null, j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 384, 0, 131066);
            int i2 = ru1Var.f59821j;
            if (i2 >= 5) {
                i = R$drawable.im_cup_mvp;
            } else if (i2 == 4) {
                i = R$drawable.im_cup_relentless;
            } else if (i2 == 3) {
                i = R$drawable.im_cup_devoted;
            } else {
                i = i2 == 2 ? R$drawable.im_cup_regular : R$drawable.im_cup_joined;
            }
            bq1.m4042R(AbstractC3423or.m18236U(i, tj3Var, 0), null, c99.m4422o(b16.f7762a, 120.0f), null, null, 0.0f, null, tj3Var, 440, 120);
            if (num != null) {
                tj3Var.m22111b0(-2034524002);
                lw9.m16554b(vz1.m23618Z(R$string.cup_results_top_percent, new Object[]{num}, tj3Var), null, j, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71403g, tj3Var, 1573248, 0, 131002);
                lw9.m16554b(vz1.m23618Z(R$string.cup_results_learners, new Object[]{str}, tj3Var), null, xs1.f68630w, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 384, 0, 130042);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-2033975364);
                lw9.m16554b(vz1.m23620a0(tj3Var, R$string.cup_results_thanks), null, j, null, 0L, null, bc3.f8323i, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 1573248, 0, 129978);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    private final Object m13972g(Object obj, Object obj2, Object obj3) {
        lv1 lv1Var = (lv1) this.f44213b;
        C0282a c0282a = (C0282a) this.f44215d;
        ui3 ui3Var = (ui3) this.f44214c;
        db1 db1Var = (db1) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        db1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(db1Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            rv1.m20857b(lv1Var.f50172c, lv1Var.f50170a, null, tj3Var, 0);
            c0282a.invoke(db1Var, tj3Var, Integer.valueOf((iIntValue & 14) | 48));
            rv1.m20862g(0, tj3Var, ui3Var, null);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m13973j(Object obj, Object obj2, Object obj3) {
        fz1 fz1Var = (fz1) this.f44213b;
        vi3 vi3Var = (vi3) this.f44214c;
        vi3 vi3Var2 = (vi3) this.f44215d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((vv4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zM22120g = tj3Var.m22120g(vi3Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new hv1(vi3Var, 4);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var = (ui3) objM22097O;
            boolean zM22120g2 = tj3Var.m22120g(vi3Var2);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var) {
                objM22097O2 = new hv1(vi3Var2, 5);
                tj3Var.m22131l0(objM22097O2);
            }
            fad.m11680c(fz1Var, ui3Var, (ui3) objM22097O2, null, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m13974k(Object obj, Object obj2, Object obj3) {
        ru1 ru1Var = (ru1) this.f44213b;
        lv1 lv1Var = (lv1) this.f44214c;
        vi3 vi3Var = (vi3) this.f44215d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((vv4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            List list = lv1Var.f50175f;
            boolean zM22120g = tj3Var.m22120g(vi3Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new hv1(vi3Var, 13);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var = (ui3) objM22097O;
            boolean zM22120g2 = tj3Var.m22120g(vi3Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var) {
                objM22097O2 = new hv1(vi3Var, 14);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3 ui3Var2 = (ui3) objM22097O2;
            boolean zM22120g3 = tj3Var.m22120g(vi3Var);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g3 || objM22097O3 == p84Var) {
                objM22097O3 = new te0(vi3Var, 12);
                tj3Var.m22131l0(objM22097O3);
            }
            qu1.m20164a(ru1Var, list, ui3Var, ui3Var2, (vi3) objM22097O3, null, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    private final Object m13975l(Object obj, Object obj2, Object obj3) {
        lv1 lv1Var = (lv1) this.f44213b;
        vi3 vi3Var = (vi3) this.f44214c;
        vi3 vi3Var2 = (vi3) this.f44215d;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        boolean zM22099R = tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18);
        xfa xfaVar = xfa.f68157a;
        if (!zM22099R) {
            tj3Var.m22102U();
            return xfaVar;
        }
        CupPhase cupPhase = lv1Var.f50170a;
        CupPhase cupPhase2 = CupPhase.Loading;
        b16 b16Var = b16.f7762a;
        if (cupPhase != cupPhase2) {
            tj3Var.m22111b0(-654265990);
            tj3Var.m22139q(false);
            AbstractC1976c.m8819b(lv1Var, vi3Var, vi3Var2, AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var), tj3Var, 0);
            return xfaVar;
        }
        tj3Var.m22111b0(-654551407);
        e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var);
        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
        int iHashCode = Long.hashCode(tj3Var.f62385T);
        l77 l77VarM22132m = tj3Var.m22132m();
        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21606S);
        se1.f60731q.getClass();
        ui3 ui3Var = C0352b.f4299b;
        tj3Var.m22119f0();
        if (tj3Var.f62384S) {
            tj3Var.m22130l(ui3Var);
        } else {
            tj3Var.m22137o0();
        }
        oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
        oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
        oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
        oha.m18000f(tj3Var, C0352b.f4305h);
        oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
        dn7.m10492a(null, 0L, 0.0f, 0L, 0, 0.0f, tj3Var, 0, 63);
        tj3Var.m22139q(true);
        tj3Var.m22139q(false);
        return xfaVar;
    }

    /* JADX INFO: renamed from: m */
    private final Object m13976m(Object obj, Object obj2, Object obj3) {
        vv1 vv1Var = (vv1) this.f44213b;
        vi3 vi3Var = (vi3) this.f44214c;
        Context context = (Context) this.f44215d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (wv1 wv1Var : vv1Var.f65969h) {
                C0282a c0282aM4703P = ci8.m4703P(-66434551, new C3598t4(28, context, wv1Var), tj3Var);
                boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22120g(wv1Var);
                Object objM22097O = tj3Var.m22097O();
                if (zM22120g || objM22097O == we1.f66679a) {
                    objM22097O = new C3577sk(11, vi3Var, wv1Var);
                    tj3Var.m22131l0(objM22097O);
                }
                AbstractC3003fj.m11886b(c0282aM4703P, (ui3) objM22097O, null, ci8.m4703P(385654348, new C3368nd(wv1Var, 22), tj3Var), null, false, null, null, tj3Var, 3078, 500);
            }
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m13977n(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f44213b;
        tw1 tw1Var = (tw1) this.f44214c;
        vi3 vi3Var = (vi3) this.f44215d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            Integer num = tw1Var.f62980d;
            int i = tw1Var.f62981e;
            boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22120g(str);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new pw1(vi3Var, str, 0);
                tj3Var.m22131l0(objM22097O);
            }
            w9d.m23821b(str, num, i, (ui3) objM22097O, null, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: o */
    private final Object m13978o(Object obj, Object obj2, Object obj3) {
        tw1 tw1Var = (tw1) this.f44213b;
        vi3 vi3Var = (vi3) this.f44214c;
        vi3 vi3Var2 = (vi3) this.f44215d;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52809d, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21606S);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            e16 e16VarM18559e = ox1.m18559e(c99.m4410c(b16Var, 1.0f));
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM18559e, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 2);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28));
            boolean zM22124i = tj3Var.m22124i(tw1Var) | tj3Var.m22120g(vi3Var) | tj3Var.m22120g(vi3Var2);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new C3485q5(tw1Var, vi3Var, vi3Var2, 11);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11642c(e16VarM21609V, null, null, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 494);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: p */
    private final Object m13979p(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f44213b;
        Context context = (Context) this.f44214c;
        t66 t66Var = (t66) this.f44215d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            lw9.m16554b(str != null ? AbstractC3352my.m17093L(context, str) : "", null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
            if (((Boolean) t66Var.getValue()).booleanValue()) {
                tj3Var.m22111b0(1437326864);
                ty3.m22351a(jhd.m14483a(), null, null, 0L, tj3Var, 48, 12);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1437517421);
                ty3.m22351a(pvc.m19521q(), null, null, 0L, tj3Var, 48, 12);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: q */
    private final Object m13980q(Object obj, Object obj2, Object obj3) {
        ui3 ui3Var = (ui3) this.f44214c;
        String str = (String) this.f44213b;
        ui3 ui3Var2 = (ui3) this.f44215d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38957f);
            int i = 28;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38957f, true, new gm5(i)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
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
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(i));
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            ty3.m22352b(AbstractC3423or.m18236U(com.lingq.core.p012ui.R$drawable.ic_link_s, tj3Var, 0), null, null, 0L, tj3Var, 56, 12);
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.feature.more.R$string.invite_friends_share_link), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 131070);
            tj3Var.m22139q(true);
            e16 e16VarM21607T2 = AbstractC3584sr.m21607T(d32.m10007D(b16Var, aa1.m198b(0.5f, p58.m18900f(tj3Var).f55864l), ui8.m22752a(50)), ge9.m12515a(tj3Var).f38956e);
            sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), fc0Var, tj3Var, 48);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            lw9.m16554b(str, e65.m10871c(tj3Var, e16VarM1322c3, zi3Var4, 1.0f, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, 0, 0, 131068);
            ty3.m22352b(AbstractC3423or.m18236U(com.lingq.core.p012ui.R$drawable.ic_copy, tj3Var, 0), vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_copy), AbstractC0080f.m815b(null, false, ui3Var2, b16Var, 15), 0L, tj3Var, 8, 8);
            tj3Var.m22139q(true);
            ss5.m21710f(c99.m4412e(b16Var, 1.0f), null, null, false, ui3Var, xqb.f68555c, tj3Var, 196614, 14);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: r */
    private final Object m13981r(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f44213b;
        String str2 = (String) this.f44215d;
        ui3 ui3Var = (ui3) this.f44214c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4411d(b16Var, 1.0f), ge9.m12515a(tj3Var).f38960i);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.feature.library.R$string.beta_language_title), null, p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71403g, tj3Var, 0, 0, 131066);
            lw9.m16554b(str, AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var).f38954c, 0.0f, 0.0f, 13), cx2.m9917a(tj3Var).m4209b(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71403g, tj3Var, 0, 0, 131064);
            lw9.m16554b(vz1.m23618Z(com.lingq.feature.library.R$string.beta_language_desc, new Object[]{str, str}, tj3Var), AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131068);
            ss5.m21702b(str2, str.concat(" image"), pb1.m19045o(AbstractC3584sr.m21611X(c99.m4414g(c99.m4412e(b16Var, 1.0f), 200.0f), 0.0f, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 13), p58.m18901i(tj3Var).f64857c), null, hl1.f42564a, tj3Var, 1572864, 4024);
            lw9.m16554b(vz1.m23618Z(com.lingq.feature.library.R$string.beta_language_banner, new Object[]{str}, tj3Var), AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 13), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131064);
            boolean zM22120g = tj3Var.m22120g(ui3Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new xa0(5, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0231g.m1148a((ui3) objM22097O, AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 13), false, null, null, null, null, null, hrb.f42849a, tj3Var, 805306368, 508);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: s */
    private final Object m13982s(Object obj, Object obj2, Object obj3) {
        an4 an4Var = (an4) this.f44213b;
        vi3 vi3Var = (vi3) this.f44214c;
        vi3 vi3Var2 = (vi3) this.f44215d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 0.0f, 2);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
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
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.feature.languages.R$string.lingq_change_language), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71401e, tj3Var, 0, 0, 131070);
            boolean zM22120g = tj3Var.m22120g(vi3Var2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new fl4(vi3Var2, 6);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0231g.m1153f(805306368, 510, null, tj3Var, (ui3) objM22097O, csb.f34499b, null, null, null, false);
            tj3Var.m22139q(true);
            pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, AbstractC3584sr.m21611X(b16Var, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38955d, 0.0f, 0.0f, 13));
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            x17 x17VarM21626g = AbstractC3584sr.m21626g(0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38957f, 5);
            boolean zM22124i = tj3Var.m22124i(an4Var) | tj3Var.m22120g(vi3Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new ke2(11, an4Var, vi3Var);
                tj3Var.m22131l0(objM22097O2);
            }
            fa4.m11642c(e16VarM4412e2, null, x17VarM21626g, null, null, null, false, null, (vi3) objM22097O2, tj3Var, 6, 506);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX INFO: renamed from: t */
    private final Object m13983t(Object obj, Object obj2, Object obj3) {
        LanguageStatValue languageStatValue;
        LanguageProgressMetric languageProgressMetric;
        String strValueOf;
        String strValueOf2;
        ?? r5;
        long jM4215h;
        bh9 bh9Var = (bh9) this.f44213b;
        String str = (String) this.f44214c;
        LanguageProgressPeriod languageProgressPeriod = (LanguageProgressPeriod) this.f44215d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            LanguageStatValue languageStatValue2 = bh9Var.f8549c;
            LanguageProgressMetric languageProgressMetric2 = bh9Var.f8547a;
            float f = ge9.m12515a(tj3Var).f38957f;
            float f2 = ge9.m12515a(tj3Var).f38957f;
            b16 b16Var = b16.f7762a;
            e16 e16VarM4429v = c99.m4429v(c99.m4412e(AbstractC3584sr.m21608U(b16Var, f, f2), 1.0f));
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4429v);
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
            vj8 vj8Var = vj8.f65508a;
            lw9.m16554b(str, vj8Var.mo12420a(0.55f, b16Var, true), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 24960, 110584);
            e16 e16VarMo12420a = vj8Var.mo12420a(0.25f, b16Var, true);
            if (languageProgressMetric2 == null || shd.m21391a(languageProgressMetric2)) {
                languageStatValue = languageStatValue2;
                languageProgressMetric = languageProgressMetric2;
                strValueOf = String.valueOf((int) languageStatValue.f19076a);
            } else {
                languageProgressMetric = languageProgressMetric2;
                if (languageProgressMetric == LanguageProgressMetric.StudyTime) {
                    languageStatValue = languageStatValue2;
                    strValueOf = yhd.m25151g(languageStatValue.f19076a);
                } else {
                    languageStatValue = languageStatValue2;
                    strValueOf = String.valueOf(nob.m17572a(2, languageStatValue.f19076a));
                }
            }
            lw9.m16554b(strValueOf, e16VarMo12420a, p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 130040);
            if (languageProgressPeriod != LanguageProgressPeriod.AllTime) {
                tj3Var.m22111b0(-80898231);
                e16 e16VarMo12420a2 = vj8Var.mo12420a(0.15f, b16Var, true);
                double d = languageStatValue.f19077b;
                String str2 = d > 0.0d ? "+" : "";
                if (languageProgressMetric == null || shd.m21391a(languageProgressMetric)) {
                    strValueOf2 = String.valueOf((int) d);
                } else {
                    strValueOf2 = languageProgressMetric == LanguageProgressMetric.StudyTime ? yhd.m25151g(d) : String.valueOf(nob.m17572a(2, d));
                }
                String strM22990m = ux5.m22990m(str2, strValueOf2);
                vx9 vx9Var = p58.m18902j(tj3Var).f71410n;
                if (d > 0.0d) {
                    tj3Var.m22111b0(-80116938);
                    jM4215h = cx2.m9917a(tj3Var).m4212e();
                    r5 = 0;
                    tj3Var.m22139q(false);
                } else {
                    r5 = 0;
                    r5 = 0;
                    if (d < 0.0d) {
                        tj3Var.m22111b0(-79991016);
                        jM4215h = cx2.m9917a(tj3Var).m4215h();
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-79900806);
                        jM4215h = p58.m18900f(tj3Var).f55873q;
                        tj3Var.m22139q(false);
                    }
                }
                g4d.m12360a(strM22990m, e16VarMo12420a2, jM4215h, new ks9(6), 0L, 0, false, 1, vx9Var, null, tj3Var, 12582912, 624);
                if (d > 0.0d) {
                    tj3Var.m22111b0(-79664121);
                    yhd.m25149e(AbstractC3584sr.m21611X(vj8Var.mo12420a(0.05f, b16Var, true), ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 0.0f, 14), tj3Var, r5);
                    tj3Var.m22139q(r5);
                } else if (d < 0.0d) {
                    tj3Var.m22111b0(-79396219);
                    yhd.m25148d(AbstractC3584sr.m21611X(vj8Var.mo12420a(0.05f, b16Var, true), ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 0.0f, 14), tj3Var, r5);
                    tj3Var.m22139q(r5);
                } else {
                    tj3Var.m22111b0(-79159286);
                    qh0.m19963a(AbstractC3584sr.m21611X(c99.m4414g(vj8Var.mo12420a(0.05f, b16Var, true), 12.0f), ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 0.0f, 14), tj3Var, r5);
                    tj3Var.m22139q(r5);
                }
                tj3Var.m22139q(r5);
            } else {
                tj3Var.m22111b0(-78895507);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: u */
    private final Object m13984u(Object obj, Object obj2, Object obj3) {
        zh9 zh9Var = (zh9) this.f44213b;
        zi3 zi3Var = (zi3) this.f44214c;
        vi3 vi3Var = (vi3) this.f44215d;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            yhd.m25147c(t17Var, zh9Var, zi3Var, vi3Var, tj3Var, iIntValue & 14);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: v */
    private final Object m13985v(Object obj, Object obj2, Object obj3) {
        t66 t66Var = (t66) this.f44213b;
        zh9 zh9Var = (zh9) this.f44214c;
        vi3 vi3Var = (vi3) this.f44215d;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        int i = 1;
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new C3799yk(25, t66Var);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0231g.m1153f(817889334, 380, null, tj3Var, (ui3) objM22097O, ci8.m4703P(-500902086, new se0(zh9Var, 13), tj3Var), c99.m4430w(b16Var, null, 3), AbstractC3584sr.m21622e(0.0f, 0.0f, 2), null, false);
            boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new C3799yk(26, t66Var);
                tj3Var.m22131l0(objM22097O2);
            }
            AbstractC3003fj.m11885a(zBooleanValue, (ui3) objM22097O2, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(279054290, new po1(vi3Var, t66Var, i), tj3Var), tj3Var, 48, 2044);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        boolean z;
        int i = this.f44212a;
        int i2 = 12;
        int i3 = 28;
        p84 p84Var = we1.f66679a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        Object obj5 = this.f44215d;
        Object obj6 = this.f44213b;
        Object obj7 = this.f44214c;
        switch (i) {
            case 0:
                yx4 yx4Var = (yx4) obj6;
                ui3 ui3Var = (ui3) obj7;
                ui3 ui3Var2 = (ui3) obj5;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC0054a.m727b(yx4Var, null, null, null, "lessonBuyInfo", null, ci8.m4703P(-193083240, new jk0(0, ui3Var, ui3Var2), tj3Var), tj3Var, 1597440, 46);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                ArrayList<String> arrayList = (ArrayList) obj6;
                vi3 vi3Var = (vi3) obj7;
                t66 t66Var = (t66) obj5;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (String str : arrayList) {
                        e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a);
                        boolean zM22120g = tj3Var2.m22120g(vi3Var) | tj3Var2.m22120g(str);
                        Object objM22097O = tj3Var2.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            obj4 = objM22097O;
                            zg0 zg0Var = new zg0(vi3Var, str, t66Var, 1);
                            tj3Var2.m22131l0(zg0Var);
                            obj4 = zg0Var;
                        }
                        e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) obj4, e16VarM21607T, 15);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var2, 0);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM815b);
                        se1.f60731q.getClass();
                        ui3 ui3Var3 = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var3);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
                        oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var2, C0352b.f4305h);
                        oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                        lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                        tj3Var2.m22139q(true);
                    }
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                final vi3 vi3Var2 = (vi3) obj6;
                final jr0 jr0Var = (jr0) obj7;
                final vi3 vi3Var3 = (vi3) obj5;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e16 e16VarM21607T2 = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38957f);
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var3).f38956e, true, new gm5(i3)), nj0.f52793L, tj3Var3, 48);
                    int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m2 = tj3Var3.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM21607T2);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var4);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                    vi3 vi3Var4 = C0352b.f4305h;
                    oha.m18000f(tj3Var3, vi3Var4);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var3).f38956e, true, new gm5(i3)), nj0.f52817l, tj3Var3, 0);
                    int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m3 = tj3Var3.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var4);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a2);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m3);
                    AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var3, tj3Var3, vi3Var4);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c3);
                    String str2 = jr0Var.f46028h;
                    double d = jr0Var.f46023c;
                    b6d.m3382b(null, str2, jr0Var.f46029i, 0.0f, tj3Var3, 384);
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                    int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m4 = tj3Var3.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e2);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var4);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, bb1VarM230a2);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m4);
                    AbstractC3393o1.m17747v(iHashCode4, tj3Var3, zi3Var3, tj3Var3, vi3Var4);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c4);
                    boolean zM22120g2 = tj3Var3.m22120g(vi3Var3) | tj3Var3.m22124i(jr0Var);
                    Object objM22097O2 = tj3Var3.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        z = false;
                        final boolean z2 = false ? 1 : 0;
                        objM22097O2 = new ui3() { // from class: es0
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i4 = z2;
                                xfa xfaVar2 = xfa.f68157a;
                                jr0 jr0Var2 = jr0Var;
                                vi3 vi3Var5 = vi3Var3;
                                switch (i4) {
                                    case 0:
                                        vi3Var5.invoke(Integer.valueOf(jr0Var2.f46027g));
                                        break;
                                    default:
                                        vi3Var5.invoke(Integer.valueOf(jr0Var2.f46027g));
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var3.m22131l0(objM22097O2);
                    } else {
                        z = false;
                    }
                    lw9.m16554b(jr0Var.f46021a, AbstractC0080f.m815b(null, z, (ui3) objM22097O2, b16Var, 15), 0L, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71404h, tj3Var3, 0, 0, 130044);
                    sj8 sj8VarM20003a3 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var3).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var3, 48);
                    int iHashCode5 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m5 = tj3Var3.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var4);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a3);
                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m5);
                    AbstractC3393o1.m17747v(iHashCode5, tj3Var3, zi3Var3, tj3Var3, vi3Var4);
                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c5);
                    lw9.m16554b(AbstractC3352my.m17082A(d), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                    e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                    float f = ge9.m12515a(tj3Var3).f38955d;
                    long j = d < 70.0d ? aa1.f407f : d < 95.0d ? aa1.f410i : aa1.f408g;
                    boolean zM22124i = tj3Var3.m22124i(jr0Var);
                    Object objM22097O3 = tj3Var3.m22097O();
                    if (zM22124i || objM22097O3 == p84Var) {
                        objM22097O3 = new C3539rk(jr0Var, 3);
                        tj3Var3.m22131l0(objM22097O3);
                    }
                    dn7.m10494c((ui3) objM22097O3, e16VarM4412e3, j, 0L, 0, f, null, tj3Var3, 48, 88);
                    final int i4 = 1;
                    tj3Var3.m22139q(true);
                    tj3Var3.m22139q(true);
                    tj3Var3.m22139q(true);
                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var2) | tj3Var3.m22124i(jr0Var);
                    Object objM22097O4 = tj3Var3.m22097O();
                    if (zM22120g3 || objM22097O4 == p84Var) {
                        objM22097O4 = new ui3() { // from class: es0
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i5 = i4;
                                xfa xfaVar2 = xfa.f68157a;
                                jr0 jr0Var2 = jr0Var;
                                vi3 vi3Var5 = vi3Var2;
                                switch (i5) {
                                    case 0:
                                        vi3Var5.invoke(Integer.valueOf(jr0Var2.f46027g));
                                        break;
                                    default:
                                        vi3Var5.invoke(Integer.valueOf(jr0Var2.f46027g));
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var3.m22131l0(objM22097O4);
                    }
                    lw9.m16554b(vz1.m23620a0(tj3Var3, d == 100.0d ? R$string.challenge_choose_next_book : R$string.challenge_change_book), AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15), cx2.m9917a(tj3Var3).m4208a(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262136);
                    tj3Var3.m22139q(true);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                ws1 ws1Var = (ws1) obj6;
                ui3 ui3Var5 = (ui3) obj7;
                ui3 ui3Var6 = (ui3) obj5;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC1985e.m8850b(ws1Var, ui3Var5, ui3Var6, null, tj3Var4, 0);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 4:
                List list = (List) obj6;
                nz9 nz9Var = (nz9) obj7;
                fw0 fw0Var = (fw0) obj5;
                t17 t17Var = (t17) obj;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((tj3) ye1Var5).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    e16 e16VarM10007D = d32.m10007D(AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var), ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51799a.f55868n, ss5.f61356d);
                    bb1 bb1VarM230a3 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var5, 0);
                    int iHashCode6 = Long.hashCode(tj3Var5.f62385T);
                    l77 l77VarM22132m6 = tj3Var5.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var5, e16VarM10007D);
                    se1.f60731q.getClass();
                    ui3 ui3Var7 = C0352b.f4299b;
                    tj3Var5.m22119f0();
                    if (tj3Var5.f62384S) {
                        tj3Var5.m22130l(ui3Var7);
                    } else {
                        tj3Var5.m22137o0();
                    }
                    oha.m18001g(tj3Var5, C0352b.f4303f, bb1VarM230a3);
                    oha.m18001g(tj3Var5, C0352b.f4302e, l77VarM22132m6);
                    oha.m18001g(tj3Var5, C0352b.f4304g, Integer.valueOf(iHashCode6));
                    oha.m18000f(tj3Var5, C0352b.f4305h);
                    oha.m18001g(tj3Var5, C0352b.f4301d, e16VarM1322c6);
                    AbstractC2008l.m8913d(new ChatStats(22.0d, i2, 11), tj3Var5, 0);
                    e16 e16VarM17728c = AbstractC3393o1.m17728c(1.0f, c99.m4412e(b16Var, 1.0f), true);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM17728c, ((fe9) tj3Var5.m22128k(zf1Var)).f38960i, 0.0f, 2);
                    x17 x17VarM21626g = AbstractC3584sr.m21626g(0.0f, ((fe9) tj3Var5.m22128k(zf1Var)).f38956e, 0.0f, ((fe9) tj3Var5.m22128k(zf1Var)).f38956e, 5);
                    boolean zM22124i2 = tj3Var5.m22124i(list) | tj3Var5.m22124i(nz9Var) | tj3Var5.m22120g(fw0Var);
                    Object objM22097O5 = tj3Var5.m22097O();
                    if (zM22124i2 || objM22097O5 == p84Var) {
                        objM22097O5 = new C3485q5(list, nz9Var, fw0Var, 5);
                        tj3Var5.m22131l0(objM22097O5);
                    }
                    fa4.m11642c(e16VarM21609V, null, x17VarM21626g, null, null, null, false, null, (vi3) objM22097O5, tj3Var5, 12582912, 378);
                    tj3Var5.m22139q(true);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 5:
                tz0 tz0Var = (tz0) obj6;
                t17 t17Var2 = (t17) obj7;
                jv0 jv0Var = (jv0) obj5;
                yx0 yx0Var = (yx0) obj;
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                yx0Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((tj3) ye1Var6).m22120g(yx0Var) ? 4 : 2;
                }
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    tj3Var6.m22102U();
                } else if (yx0Var.equals(xx0.f68916a)) {
                    tj3Var6.m22111b0(-2053357937);
                    c7d.m4397b(tz0Var.f63116d, t17Var2, jv0Var, tj3Var6, 0);
                    tj3Var6.m22139q(false);
                } else if (yx0Var.equals(ux0.f64483a)) {
                    tj3Var6.m22111b0(-2053019913);
                    tx0 tx0Var = tz0Var.f63116d;
                    kv0 kv0Var = tz0Var.f63119g;
                    AbstractC2008l.m8912c(tx0Var, kv0Var.f48450c, kv0Var.f48451d, t17Var2, jv0Var, tj3Var6, 0, 0);
                    tj3Var6.m22139q(false);
                } else if (yx0Var.equals(wx0.f67466a)) {
                    tj3Var6.m22111b0(-2052520720);
                    AbstractC2005i.m8902c(t17Var2, tj3Var6, 0);
                    tj3Var6.m22139q(false);
                } else {
                    if (!yx0Var.equals(vx0.f66039a)) {
                        throw ux5.m23001x(tj3Var6, -204786014, false);
                    }
                    tj3Var6.m22111b0(-2052382119);
                    u6d.m22516a(tz0Var.f63116d.f63046k, jv0Var, tj3Var6, 8);
                    tj3Var6.m22139q(false);
                }
                return xfaVar;
            case 6:
                vi3 vi3Var5 = (vi3) obj6;
                t66 t66Var2 = (t66) obj7;
                t66 t66Var3 = (t66) obj5;
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    e16 e16VarM21609V2 = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), 0.0f, ((fe9) tj3Var7.m22128k(ge9.f40637a)).f38952a, 1);
                    bb1 bb1VarM230a4 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var7, 0);
                    int iHashCode7 = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m7 = tj3Var7.m22132m();
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var7, e16VarM21609V2);
                    se1.f60731q.getClass();
                    ui3 ui3Var8 = C0352b.f4299b;
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var8);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    oha.m18001g(tj3Var7, C0352b.f4303f, bb1VarM230a4);
                    oha.m18001g(tj3Var7, C0352b.f4302e, l77VarM22132m7);
                    oha.m18001g(tj3Var7, C0352b.f4304g, Integer.valueOf(iHashCode7));
                    oha.m18000f(tj3Var7, C0352b.f4305h);
                    oha.m18001g(tj3Var7, C0352b.f4301d, e16VarM1322c7);
                    boolean zM22120g4 = tj3Var7.m22120g(vi3Var5);
                    Object objM22097O6 = tj3Var7.m22097O();
                    if (zM22120g4 || objM22097O6 == p84Var) {
                        objM22097O6 = new wy0(t66Var2, vi3Var5, t66Var3);
                        tj3Var7.m22131l0(objM22097O6);
                    }
                    e16 e16VarM815b2 = AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15);
                    int i5 = hf5.f42302a;
                    of5.m17959a(xnb.f68412f, e16VarM815b2, xnb.f68413g, hf5.m13217a(((ms5) tj3Var7.m22128k(ps5.f56764b)).f51799a.f55824I, tj3Var7), tj3Var7, 24582, 428);
                    tj3Var7.m22139q(true);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 7:
                t61 t61Var = (t61) obj6;
                vi3 vi3Var6 = (vi3) obj7;
                vi3 vi3Var7 = (vi3) obj5;
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(b16.f7762a, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var8.m22128k(ge9.f40637a)).f38956e, 7);
                    boolean zM22120g5 = tj3Var8.m22120g(t61Var) | tj3Var8.m22120g(vi3Var6) | tj3Var8.m22120g(vi3Var7);
                    Object objM22097O7 = tj3Var8.m22097O();
                    if (zM22120g5 || objM22097O7 == p84Var) {
                        objM22097O7 = new C3485q5(t61Var, vi3Var6, vi3Var7, 8);
                        tj3Var8.m22131l0(objM22097O7);
                    }
                    fa4.m11642c(e16VarM21611X, null, null, null, null, null, false, null, (vi3) objM22097O7, tj3Var8, 0, 510);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 8:
                w41 w41Var = (w41) obj7;
                LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = (LqAnalyticsValues$LessonPath) obj5;
                LibraryItem libraryItem = (LibraryItem) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                String str3 = (String) obj3;
                libraryItem.getClass();
                str3.getClass();
                ((C2034d) obj6).m8945Z2(s51.f60313a);
                if (lqAnalyticsValues$LessonPath == null) {
                    lqAnalyticsValues$LessonPath = LqAnalyticsValues$LessonPath.Unknown.f14315a;
                }
                LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath2 = lqAnalyticsValues$LessonPath;
                if (libraryItem.m8090e()) {
                    String str4 = libraryItem.f19447s;
                    String str5 = str4 == null ? "" : str4;
                    String str6 = libraryItem.f19448t;
                    String str7 = str6 == null ? "" : str6;
                    int i6 = libraryItem.f19426a;
                    String str8 = libraryItem.f19412M;
                    String str9 = str8 == null ? "" : str8;
                    List list2 = libraryItem.f19422W;
                    if (list2 == null) {
                        list2 = EmptyList.f47638a;
                    }
                    List list3 = list2;
                    boolean zM8089d = libraryItem.m8089d();
                    boolean zM8086a = libraryItem.m8086a();
                    Integer num = libraryItem.f19437i;
                    w41Var.m23737z(new ea6(str5, str7, i6, lqAnalyticsValues$LessonPath2, str3, str9, list3, zM8089d, zM8086a, num != null ? num.intValue() : 0));
                } else if (fa4.m11650l(libraryItem.f19418S, Boolean.TRUE) || zBooleanValue) {
                    int i7 = libraryItem.f19426a;
                    Integer num2 = libraryItem.f19441m;
                    int iIntValue9 = num2 != null ? num2.intValue() : 0;
                    String str10 = libraryItem.f19442n;
                    w41Var.m23737z(new ja6(i7, iIntValue9, str10 != null ? str10 : "", lqAnalyticsValues$LessonPath2));
                } else {
                    int i8 = libraryItem.f19426a;
                    String str11 = libraryItem.f19433e;
                    String str12 = str11 == null ? "" : str11;
                    String str13 = libraryItem.f19436h;
                    String str14 = str13 == null ? "" : str13;
                    String str15 = libraryItem.f19409J;
                    String str16 = (str15 == null && (str15 = libraryItem.f19402C) == null) ? "" : str15;
                    String str17 = libraryItem.f19434f;
                    w41Var.m23737z(new da6(i8, str12, str14, str16, str17 == null ? "" : str17, LessonInfoSource.Course, str3));
                }
                return xfaVar;
            case 9:
                String str18 = (String) obj6;
                vi3 vi3Var8 = (vi3) obj7;
                do1 do1Var = (do1) obj5;
                ye1 ye1Var9 = (ye1) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    int i9 = hf5.f42302a;
                    gf5 gf5VarM13217a = hf5.m13217a(aa1.f411j, tj3Var9);
                    e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16.f7762a, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var9.m22128k(ge9.f40637a)).f38956e, 7);
                    boolean zM22120g6 = tj3Var9.m22120g(str18) | tj3Var9.m22120g(vi3Var8) | tj3Var9.m22120g(gf5VarM13217a) | tj3Var9.m22120g(do1Var);
                    Object objM22097O8 = tj3Var9.m22097O();
                    if (zM22120g6 || objM22097O8 == p84Var) {
                        C3445p2 c3445p2 = new C3445p2((Object) do1Var, (Object) str18, vi3Var8, (Object) gf5VarM13217a, 8);
                        tj3Var9.m22131l0(c3445p2);
                        objM22097O8 = c3445p2;
                    }
                    fa4.m11642c(e16VarM21611X2, null, null, null, null, null, false, null, (vi3) objM22097O8, tj3Var9, 0, 510);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 10:
                t66 t66Var4 = (t66) obj6;
                CoursePlaylistSort coursePlaylistSort = (CoursePlaylistSort) obj7;
                vi3 vi3Var9 = (vi3) obj5;
                ye1 ye1Var10 = (ye1) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    e16 e16VarM4412e4 = c99.m4412e(b16Var, 1.0f);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52811f, false);
                    int iHashCode8 = Long.hashCode(tj3Var10.f62385T);
                    l77 l77VarM22132m8 = tj3Var10.m22132m();
                    e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var10, e16VarM4412e4);
                    se1.f60731q.getClass();
                    ui3 ui3Var9 = C0352b.f4299b;
                    tj3Var10.m22119f0();
                    if (tj3Var10.f62384S) {
                        tj3Var10.m22130l(ui3Var9);
                    } else {
                        tj3Var10.m22137o0();
                    }
                    oha.m18001g(tj3Var10, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var10, C0352b.f4302e, l77VarM22132m8);
                    oha.m18001g(tj3Var10, C0352b.f4304g, Integer.valueOf(iHashCode8));
                    oha.m18000f(tj3Var10, C0352b.f4305h);
                    oha.m18001g(tj3Var10, C0352b.f4301d, e16VarM1322c8);
                    Object objM22097O9 = tj3Var10.m22097O();
                    if (objM22097O9 == p84Var) {
                        objM22097O9 = new C3799yk(12, t66Var4);
                        tj3Var10.m22131l0(objM22097O9);
                    }
                    AbstractC0231g.m1153f(817889334, 380, null, tj3Var10, (ui3) objM22097O9, ci8.m4703P(-615088193, new se0(coursePlaylistSort, 6), tj3Var10), c99.m4430w(b16Var, null, 3), AbstractC3584sr.m21622e(0.0f, 0.0f, 2), null, false);
                    boolean zBooleanValue2 = ((Boolean) t66Var4.getValue()).booleanValue();
                    Object objM22097O10 = tj3Var10.m22097O();
                    if (objM22097O10 == p84Var) {
                        objM22097O10 = new C3799yk(13, t66Var4);
                        tj3Var10.m22131l0(objM22097O10);
                    }
                    AbstractC3003fj.m11885a(zBooleanValue2, (ui3) objM22097O10, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(610586663, new po1(vi3Var9, t66Var4, 0), tj3Var10), tj3Var10, 48, 2044);
                    tj3Var10.m22139q(true);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 11:
                String str19 = (String) obj6;
                Object obj8 = (Integer) obj7;
                Integer num3 = (Integer) obj5;
                ye1 ye1Var11 = (ye1) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    e16 e16VarM21607T3 = AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var11).f38956e);
                    bb1 bb1VarM230a5 = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var11).f38955d, true, new gm5(i3)), nj0.f52791J, tj3Var11, 0);
                    int iHashCode9 = Long.hashCode(tj3Var11.f62385T);
                    l77 l77VarM22132m9 = tj3Var11.m22132m();
                    e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var11, e16VarM21607T3);
                    se1.f60731q.getClass();
                    ui3 ui3Var10 = C0352b.f4299b;
                    tj3Var11.m22119f0();
                    if (tj3Var11.f62384S) {
                        tj3Var11.m22130l(ui3Var10);
                    } else {
                        tj3Var11.m22137o0();
                    }
                    oha.m18001g(tj3Var11, C0352b.f4303f, bb1VarM230a5);
                    oha.m18001g(tj3Var11, C0352b.f4302e, l77VarM22132m9);
                    oha.m18001g(tj3Var11, C0352b.f4304g, Integer.valueOf(iHashCode9));
                    oha.m18000f(tj3Var11, C0352b.f4305h);
                    oha.m18001g(tj3Var11, C0352b.f4301d, e16VarM1322c9);
                    Locale locale = Locale.ROOT;
                    String upperCase = str19.toUpperCase(locale);
                    upperCase.getClass();
                    lw9.m16554b(upperCase, null, p58.m18900f(tj3Var11).f55875s, null, 0L, null, null, qu1.f58210a, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var11).f71411o, tj3Var11, 100663296, 0, 130810);
                    if (obj8 == null) {
                        obj8 = "–";
                    }
                    lw9.m16554b(AbstractC3393o1.m17733h(obj8, "#"), null, xs1.f68608a, null, 0L, new wb3(1), bc3.f8326l, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var11).f71399c, tj3Var11, 1573248, 0, 130970);
                    if (num3 == null) {
                        tj3Var11.m22111b0(-802437364);
                        tj3Var11.m22139q(false);
                    } else {
                        tj3Var11.m22111b0(-802437363);
                        String upperCase2 = vz1.m23618Z(R$string.cup_results_of_contributors, new Object[]{String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(num3.intValue())}, 1))}, tj3Var11).toUpperCase(locale);
                        upperCase2.getClass();
                        lw9.m16554b(upperCase2, null, p58.m18900f(tj3Var11).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var11).f71411o, tj3Var11, 0, 0, 131066);
                        tj3Var11.m22139q(false);
                    }
                    tj3Var11.m22139q(true);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 12:
                return m13971d(obj, obj2, obj3);
            case 13:
                lv1 lv1Var = (lv1) obj6;
                ui3 ui3Var11 = (ui3) obj7;
                vi3 vi3Var10 = (vi3) obj5;
                ye1 ye1Var12 = (ye1) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (!tj3Var12.m22099R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    tj3Var12.m22102U();
                } else if (lv1Var.f50175f.isEmpty()) {
                    tj3Var12.m22111b0(-1335939358);
                    tj3Var12.m22139q(false);
                } else {
                    tj3Var12.m22111b0(-1336047951);
                    w9d.m23820a(lv1Var.f50175f, ui3Var11, vi3Var10, null, tj3Var12, 0);
                    tj3Var12.m22139q(false);
                }
                return xfaVar;
            case 14:
                return m13972g(obj, obj2, obj3);
            case 15:
                return m13973j(obj, obj2, obj3);
            case 16:
                return m13974k(obj, obj2, obj3);
            case 17:
                return m13975l(obj, obj2, obj3);
            case 18:
                return m13976m(obj, obj2, obj3);
            case 19:
                return m13977n(obj, obj2, obj3);
            case 20:
                return m13978o(obj, obj2, obj3);
            case 21:
                return m13979p(obj, obj2, obj3);
            case 22:
                String str20 = (String) obj6;
                zf2 zf2Var = (zf2) obj7;
                vi3 vi3Var11 = (vi3) obj5;
                ye1 ye1Var13 = (ye1) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                boolean z3 = (iIntValue14 & 17) != 16;
                int i10 = iIntValue14 & 1;
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (tj3Var13.m22099R(i10, z3)) {
                    AbstractC2059d.m8973i(str20, zf2Var, vi3Var11, null, tj3Var13, 0);
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return m13980q(obj, obj2, obj3);
            case 24:
                return m13981r(obj, obj2, obj3);
            case 25:
                return m13982s(obj, obj2, obj3);
            case 26:
                return m13983t(obj, obj2, obj3);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return m13984u(obj, obj2, obj3);
            case 28:
                return m13985v(obj, obj2, obj3);
            default:
                ui3 ui3Var12 = (ui3) obj7;
                d4b d4bVar = (d4b) obj6;
                zi3 zi3Var5 = (zi3) obj5;
                ye1 ye1Var14 = (ye1) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((vv4) obj).getClass();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (tj3Var14.m22099R(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    e16 e16VarM4412e5 = c99.m4412e(b16Var, 1.0f);
                    zf1 zf1Var2 = ge9.f40637a;
                    e16 e16VarM21611X3 = AbstractC3584sr.m21611X(e16VarM4412e5, 0.0f, ((fe9) tj3Var14.m22128k(zf1Var2)).f38956e, 0.0f, 0.0f, 13);
                    bb1 bb1VarM230a6 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var14, 0);
                    int iHashCode10 = Long.hashCode(tj3Var14.f62385T);
                    l77 l77VarM22132m10 = tj3Var14.m22132m();
                    e16 e16VarM1322c10 = AbstractC0287b.m1322c(tj3Var14, e16VarM21611X3);
                    se1.f60731q.getClass();
                    ui3 ui3Var13 = C0352b.f4299b;
                    tj3Var14.m22119f0();
                    if (tj3Var14.f62384S) {
                        tj3Var14.m22130l(ui3Var13);
                    } else {
                        tj3Var14.m22137o0();
                    }
                    oha.m18001g(tj3Var14, C0352b.f4303f, bb1VarM230a6);
                    oha.m18001g(tj3Var14, C0352b.f4302e, l77VarM22132m10);
                    oha.m18001g(tj3Var14, C0352b.f4304g, Integer.valueOf(iHashCode10));
                    oha.m18000f(tj3Var14, C0352b.f4305h);
                    oha.m18001g(tj3Var14, C0352b.f4301d, e16VarM1322c10);
                    cid.m4758i(vz1.m23620a0(tj3Var14, com.lingq.core.p012ui.R$string.stats_seven_day_activity), vz1.m23620a0(tj3Var14, com.lingq.core.p012ui.R$string.lingq_method), ui3Var12, tj3Var14, 0);
                    c4b c4bVar = (c4b) d4bVar;
                    cid.m4750a(LanguageProgressMetric.LingQsCreated, vz1.m23620a0(tj3Var14, com.lingq.core.p012ui.R$string.complete_lingqs_created), c4bVar.f9497g, c4bVar.f9498h, c4bVar.f9499i, zi3Var5, tj3Var14, 6);
                    thb.m22044c(tj3Var14, c99.m4414g(b16Var, ((fe9) tj3Var14.m22128k(zf1Var2)).f38963l));
                    cid.m4750a(LanguageProgressMetric.ListeningHours, vz1.m23620a0(tj3Var14, com.lingq.core.p012ui.R$string.stats_hours_listening), c4bVar.f9494d, c4bVar.f9495e, c4bVar.f9496f, zi3Var5, tj3Var14, 6);
                    thb.m22044c(tj3Var14, c99.m4414g(b16Var, ((fe9) tj3Var14.m22128k(zf1Var2)).f38963l));
                    cid.m4750a(LanguageProgressMetric.WordsOfReading, vz1.m23620a0(tj3Var14, com.lingq.core.p012ui.R$string.language_stats_words_read), c4bVar.f9491a, c4bVar.f9492b, c4bVar.f9493c, zi3Var5, tj3Var14, 6);
                    tj3Var14.m22139q(true);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
        }
    }

    public /* synthetic */ ik0(ui3 ui3Var, Object obj, xi3 xi3Var, int i) {
        this.f44212a = i;
        this.f44214c = ui3Var;
        this.f44213b = obj;
        this.f44215d = xi3Var;
    }

    public /* synthetic */ ik0(Object obj, Object obj2, ui3 ui3Var, int i) {
        this.f44212a = i;
        this.f44213b = obj;
        this.f44215d = obj2;
        this.f44214c = ui3Var;
    }

    public /* synthetic */ ik0(Object obj, Object obj2, Object obj3, int i) {
        this.f44212a = i;
        this.f44213b = obj;
        this.f44214c = obj2;
        this.f44215d = obj3;
    }
}
