package p000;

import android.content.Context;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.animation.core.C0059a;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import com.lingq.core.achievements.AbstractC1234a;
import com.lingq.core.domain.model.FeedTopic;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.domain.model.notification.Notice;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.p012ui.highlightedtext.AbstractC1932c;
import com.lingq.core.p012ui.sheet.LanguageProgressInputType;
import com.lingq.feature.library.R$string;
import com.lingq.feature.onboarding.p014v2.OnboardingSelections;
import com.lingq.feature.onboarding.p014v2.pages.AbstractC2228a;
import com.lingq.feature.reader.old.C2401c;
import com.lingq.feature.reader.old.ReaderPageFragment;
import com.lingq.feature.reader.reader.AbstractC2500f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import p000.lda;
import p000.vx7;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.xz7;
import p000.y7d;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hn0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42643a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42644b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42645c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f42646d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f42647e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f42648f;

    public /* synthetic */ hn0(vi3 vi3Var, t66 t66Var, C0127b c0127b, fo6 fo6Var, vi3 vi3Var2) {
        this.f42643a = 10;
        this.f42648f = vi3Var;
        this.f42644b = t66Var;
        this.f42645c = c0127b;
        this.f42646d = fo6Var;
        this.f42647e = vi3Var2;
    }

    /* JADX INFO: renamed from: d */
    private final Object m13339d(Object obj, Object obj2, Object obj3) {
        ko4 ko4Var = (ko4) this.f42644b;
        vi3 vi3Var = (vi3) this.f42648f;
        vi3 vi3Var2 = (vi3) this.f42645c;
        zi3 zi3Var = (zi3) this.f42646d;
        vi3 vi3Var3 = (vi3) this.f42647e;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            bid.m3746b(t17Var, ko4Var, vi3Var, vi3Var2, zi3Var, vi3Var3, tj3Var, iIntValue & 14);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    private final Object m13340g(Object obj, Object obj2, Object obj3) {
        Notice notice = (Notice) this.f42644b;
        final un1 un1Var = (un1) this.f42645c;
        final C0269z c0269z = (C0269z) this.f42646d;
        final ui3 ui3Var = (ui3) this.f42647e;
        List<String> list = (List) this.f42648f;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            float f = ge9.m12515a(tj3Var).f38960i;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, f);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
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
            lw9.m16554b(notice.f19540b, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 131070);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.notice_join_monthly_challenge), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131070);
            tj3 tj3Var2 = tj3Var;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var2).f38960i, 1);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var2).f38960i, true, new gm5(28)), nj0.f52817l, tj3Var2, 0);
            int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m2 = tj3Var2.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
            tj3Var2.m22111b0(1028617007);
            for (String str : list) {
                e16 e16VarM17728c = AbstractC3393o1.m17728c(1.0f, c99.m4414g(b16Var, 110.0f), true);
                vh9 vh9Var = ps5.f56764b;
                tj3 tj3Var3 = tj3Var2;
                ss5.m21702b(str, null, r46.m20387m(pb1.m19045o(e16VarM17728c, ((ms5) tj3Var2.m22128k(vh9Var)).f51801c.f64856b), 1.0f, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55816A, ((ms5) tj3Var2.m22128k(vh9Var)).f51801c.f64856b), null, null, tj3Var3, 48, 4088);
                tj3Var2 = tj3Var3;
            }
            tj3Var2.m22139q(false);
            tj3Var2.m22139q(true);
            e16 e16VarM21609V2 = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), 0.0f, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38960i, 1);
            boolean zM22124i = tj3Var2.m22124i(un1Var) | tj3Var2.m22120g(c0269z) | tj3Var2.m22120g(ui3Var);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ui3() { // from class: com.lingq.feature.library.components.dialogs.a
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        wfb.m23926u(un1Var, null, null, new C2140xb6e134a4(c0269z, null), 3);
                        ui3Var.mo0a();
                        return xfa.f68157a;
                    }
                };
                tj3Var2.m22131l0(objM22097O);
            }
            tj3 tj3Var4 = tj3Var2;
            ss5.m21710f(e16VarM21609V2, null, null, false, (ui3) objM22097O, i1c.f43358a, tj3Var4, 196608, 14);
            tj3Var4.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m13341j(Object obj, Object obj2, Object obj3) {
        vi3 vi3Var = (vi3) this.f42648f;
        t66 t66Var = (t66) this.f42644b;
        C0127b c0127b = (C0127b) this.f42645c;
        fo6 fo6Var = (fo6) this.f42646d;
        vi3 vi3Var2 = (vi3) this.f42647e;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16.f7762a, 1.0f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55872p, ss5.f61356d);
            gc0 gc0Var = nj0.f52815j;
            boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
            boolean zM22120g = tj3Var.m22120g(vi3Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new az0(vi3Var, t66Var, 4);
                tj3Var.m22131l0(objM22097O);
            }
            lp7.m16424b(zBooleanValue, (ui3) objM22097O, e16VarM10007D, null, gc0Var, null, false, 0.0f, ci8.m4703P(-228215060, new hn0((Object) t17Var, (Object) c0127b, (Object) fo6Var, vi3Var, (Object) vi3Var2, 11), tj3Var), tj3Var, 100687872, 232);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m13342k(Object obj, Object obj2, Object obj3) {
        t17 t17Var = (t17) this.f42644b;
        C0127b c0127b = (C0127b) this.f42645c;
        fo6 fo6Var = (fo6) this.f42646d;
        vi3 vi3Var = (vi3) this.f42648f;
        vi3 vi3Var2 = (vi3) this.f42647e;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bi0) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4411d, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 10);
            ec0 ec0Var = nj0.f52792K;
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38964m, true, new gm5(28));
            x17 x17VarM21626g = AbstractC3584sr.m21626g(0.0f, t17Var.mo14021d(), 0.0f, t17Var.mo14018a(), 5);
            boolean zM22120g = tj3Var.m22120g(fo6Var) | tj3Var.m22120g(vi3Var) | tj3Var.m22120g(vi3Var2);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new C3485q5(fo6Var, vi3Var, vi3Var2, 29);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11642c(e16VarM21611X, c0127b, x17VarM21626g, c3661uu, ec0Var, null, false, null, (vi3) objM22097O, tj3Var, 196608, 456);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    private final Object m13343l(Object obj, Object obj2, Object obj3) {
        float f;
        boolean z;
        Object next;
        String str;
        boolean z2;
        String strM23620a0;
        C0059a c0059a = (C0059a) this.f42644b;
        sc9 sc9Var = (sc9) this.f42645c;
        OnboardingSelections onboardingSelections = (OnboardingSelections) this.f42646d;
        Context context = (Context) this.f42647e;
        sc9 sc9Var2 = (sc9) this.f42648f;
        db1 db1Var = (db1) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        db1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(db1Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            float f2 = ge9.m12515a(tj3Var).f38957f;
            b16 b16Var = b16.f7762a;
            thb.m22044c(tj3Var, c99.m4414g(b16Var, f2));
            e16 e16VarM4422o = c99.m4422o(b16Var, 200.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4422o);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            long j = p58.m18900f(tj3Var).f55842a;
            long j2 = p58.m18900f(tj3Var).f55874r;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            boolean zM22118f = tj3Var.m22118f(j2) | tj3Var.m22118f(j) | tj3Var.m22124i(c0059a);
            Object objM22097O = tj3Var.m22097O();
            if (zM22118f || objM22097O == we1.f66679a) {
                f = 1.0f;
                objM22097O = new a87(j2, j, c0059a);
                tj3Var.m22131l0(objM22097O);
            } else {
                f = 1.0f;
            }
            eh0.m11124d(e16VarM4411d, (vi3) objM22097O, tj3Var, 6);
            lw9.m16554b(AbstractC3393o1.m17732g(sc9Var.m21222h(), "%"), null, p58.m18900f(tj3Var).f55842a, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var).f71398b, 0L, d32.m10018P(48), bc3.f8324j, null, null, 0L, null, null, 0, 0L, null, 16777209), tj3Var, 0, 0, 131066);
            tj3Var.m22139q(true);
            e16 e16VarM22984g = ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38957f, tj3Var, b16Var, f);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38963l, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM22984g);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            String strM23620a1 = vz1.m23620a0(tj3Var, com.lingq.feature.onboarding.R$string.onboarding_v2_personalizing_language);
            String str2 = onboardingSelections.f27289a;
            if (str2.length() == 0) {
                str2 = null;
            }
            String strM17093L = str2 != null ? AbstractC3352my.m17093L(context, str2) : null;
            if (strM17093L == null) {
                tj3Var.m22111b0(-486130350);
                strM17093L = vz1.m23620a0(tj3Var, com.lingq.feature.onboarding.R$string.onboarding_v2_personalizing_loading);
                z = false;
            } else {
                z = false;
                tj3Var.m22111b0(-486133853);
            }
            tj3Var.m22139q(z);
            AbstractC2228a.m9182b(strM23620a1, strM17093L, sc9Var2.m21222h() >= 1, null, tj3Var, 0);
            String strM23620a2 = vz1.m23620a0(tj3Var, com.lingq.feature.onboarding.R$string.onboarding_v2_personalizing_level);
            String str3 = onboardingSelections.f27292d;
            Iterator<E> it = LearningLevel.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fa4.m11650l(((LearningLevel) next).getServerName(), str3));
            LearningLevel learningLevel = (LearningLevel) next;
            if (learningLevel == null) {
                learningLevel = LearningLevel.Intermediate1;
            }
            AbstractC2228a.m9182b(strM23620a2, AbstractC3423or.m18230O(learningLevel, context), sc9Var2.m21222h() >= 2, null, tj3Var, 0);
            AbstractC2228a.m9182b(vz1.m23620a0(tj3Var, com.lingq.feature.onboarding.R$string.onboarding_v2_personalizing_commitment), vz1.m23618Z(com.lingq.core.achievements.R$string.onboarding_daily_goal_min_desc, new Object[]{Integer.valueOf(onboardingSelections.f27298j)}, tj3Var), sc9Var2.m21222h() >= 3, null, tj3Var, 0);
            String strM23620a3 = vz1.m23620a0(tj3Var, com.lingq.feature.onboarding.R$string.onboarding_v2_personalizing_topics);
            List listM22622n1 = u91.m22622n1(onboardingSelections.f27295g);
            tj3Var.m22111b0(1126726861);
            String strM23620a4 = vz1.m23620a0(tj3Var, com.lingq.feature.onboarding.R$string.onboarding_v2_personalizing_loading);
            if (listM22622n1.isEmpty()) {
                z2 = false;
                tj3Var.m22139q(false);
                str = strM23620a4;
            } else {
                List listM22615g1 = u91.m22615g1(listM22622n1, 3);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listM22615g1.iterator();
                while (it2.hasNext()) {
                    FeedTopic feedTopicM15201I = AbstractC3184kh.m15201I((String) it2.next());
                    if (feedTopicM15201I == null) {
                        tj3Var.m22111b0(346699804);
                        tj3Var.m22139q(false);
                        strM23620a0 = null;
                    } else {
                        tj3Var.m22111b0(346699805);
                        strM23620a0 = vz1.m23620a0(tj3Var, fbd.m11760j(feedTopicM15201I));
                        tj3Var.m22139q(false);
                    }
                    if (strM23620a0 != null) {
                        arrayList.add(strM23620a0);
                    }
                }
                if (arrayList.isEmpty()) {
                    tj3Var.m22139q(false);
                    str = strM23620a4;
                    z2 = false;
                } else {
                    String strM22596N0 = u91.m22596N0(arrayList, ", ", null, null, null, 62);
                    strM23620a4 = listM22622n1.size() > 3 ? strM22596N0.concat(", ...") : strM22596N0;
                    z2 = false;
                    tj3Var.m22139q(false);
                    str = strM23620a4;
                }
            }
            AbstractC2228a.m9182b(strM23620a3, str, sc9Var2.m21222h() >= 4 ? true : z2, null, tj3Var, 0);
            tj3Var.m22139q(true);
            thb.m22044c(tj3Var, db1Var.m10266b(b16Var, true));
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m13344m(Object obj, Object obj2, Object obj3) {
        fe9 fe9Var = (fe9) this.f42644b;
        vi3 vi3Var = (vi3) this.f42648f;
        t66 t66Var = (t66) this.f42645c;
        t66 t66Var2 = (t66) this.f42646d;
        t66 t66Var3 = (t66) this.f42647e;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(fe9Var.f38952a, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16.f7762a);
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
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            as4 as4Var = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean zM22120g = tj3Var.m22120g(vi3Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new wy0(vi3Var, t66Var, t66Var2, 3);
                tj3Var.m22131l0(objM22097O);
            }
            ss5.m21710f(as4Var, null, null, false, (ui3) objM22097O, ci8.m4703P(-304912224, new oo1(2, t66Var), tj3Var), tj3Var, 196608, 14);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            e16 e16VarM4414g = c99.m4414g(new as4(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 48.0f);
            x17 x17Var = wj0.f66899a;
            vj0 vj0VarM23996a = wj0.m23996a(aa1.m198b(((Boolean) t66Var3.getValue()).booleanValue() ? 1.0f : 0.5f, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55852f), 0L, 0L, tj3Var, 14);
            boolean zM22120g2 = tj3Var.m22120g(vi3Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var) {
                objM22097O2 = new et6(vi3Var, 29);
                tj3Var.m22131l0(objM22097O2);
            }
            ss5.m21708e(1572864, 26, vj0VarM23996a, tj3Var, (ui3) objM22097O2, cgc.f10040f, e16VarM4414g, null, null, false);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m13345n(Object obj, Object obj2, Object obj3) {
        final ReaderPageFragment readerPageFragment = (ReaderPageFragment) this.f42644b;
        final dh9 dh9Var = (dh9) this.f42645c;
        dh9 dh9Var2 = (dh9) this.f42646d;
        dh9 dh9Var3 = (dh9) this.f42647e;
        dh9 dh9Var4 = (dh9) this.f42648f;
        ye1 ye1Var = (ye1) obj2;
        ((Integer) obj3).getClass();
        vx7 vx7Var = ReaderPageFragment.Companion;
        ((InterfaceC0067f) obj).getClass();
        vs3 vs3Var = (vs3) dh9Var2.getValue();
        List list = (List) dh9Var3.getValue();
        Boolean bool = (Boolean) readerPageFragment.m9298W0().f29327W1.getValue();
        final int i = 0;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) dh9Var4.getValue();
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        tj3 tj3Var = (tj3) ye1Var;
        boolean zM22124i = tj3Var.m22124i(readerPageFragment) | tj3Var.m22120g(dh9Var);
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (zM22124i || objM22097O == p84Var) {
            objM22097O = new sx7(0, readerPageFragment, dh9Var);
            tj3Var.m22131l0(objM22097O);
        }
        vi3 vi3Var = (vi3) objM22097O;
        boolean zM22124i2 = tj3Var.m22124i(readerPageFragment);
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22124i2 || objM22097O2 == p84Var) {
            objM22097O2 = new zi3() { // from class: com.lingq.feature.reader.old.j
                @Override // p000.zi3
                public final Object invoke(Object obj4, Object obj5) {
                    int i2 = i;
                    xfa xfaVar = xfa.f68157a;
                    ReaderPageFragment readerPageFragment2 = readerPageFragment;
                    String str = (String) obj4;
                    switch (i2) {
                        case 0:
                            String str2 = (String) obj5;
                            vx7 vx7Var2 = ReaderPageFragment.Companion;
                            str.getClass();
                            str2.getClass();
                            if (str2.equals(WordStatus.Known.getValue())) {
                                C2411m c2411mM9299X0 = readerPageFragment2.m9299X0();
                                int iM9332l3 = readerPageFragment2.m9298W0().m9332l3();
                                c2411mM9299X0.getClass();
                                wfb.m23926u(lda.m16103C(c2411mM9299X0), null, null, new ReaderPageViewModel$onKnown$1(iM9332l3, c2411mM9299X0, str, null), 3);
                            } else if (str2.equals(WordStatus.Ignored.getValue())) {
                                C2411m c2411mM9299X1 = readerPageFragment2.m9299X0();
                                int iM9332l4 = readerPageFragment2.m9298W0().m9332l3();
                                c2411mM9299X1.getClass();
                                wfb.m23926u(lda.m16103C(c2411mM9299X1), null, null, new ReaderPageViewModel$onIgnore$1(iM9332l4, c2411mM9299X1, str, null), 3);
                            }
                            break;
                        default:
                            TokenStatus tokenStatus = (TokenStatus) obj5;
                            vx7 vx7Var3 = ReaderPageFragment.Companion;
                            str.getClass();
                            tokenStatus.getClass();
                            C2411m c2411mM9299X2 = readerPageFragment2.m9299X0();
                            int iM24986e = y7d.m24986e(tokenStatus);
                            c2411mM9299X2.getClass();
                            wfb.m23926u(lda.m16103C(c2411mM9299X2), null, null, new ReaderPageViewModel$onCardUpdateStatus$1(iM24986e, c2411mM9299X2, str, null), 3);
                            break;
                    }
                    return xfaVar;
                }
            };
            tj3Var.m22131l0(objM22097O2);
        }
        zi3 zi3Var = (zi3) objM22097O2;
        boolean zM22120g = tj3Var.m22120g(dh9Var) | tj3Var.m22124i(readerPageFragment);
        Object objM22097O3 = tj3Var.m22097O();
        if (zM22120g || objM22097O3 == p84Var) {
            objM22097O3 = new vi3() { // from class: com.lingq.feature.reader.old.k
                @Override // p000.vi3
                public final Object invoke(Object obj4) {
                    LessonWord lessonWord = (LessonWord) obj4;
                    vx7 vx7Var2 = ReaderPageFragment.Companion;
                    lessonWord.getClass();
                    boolean zBooleanValue3 = ((Boolean) dh9Var.getValue()).booleanValue();
                    ReaderPageFragment readerPageFragment2 = readerPageFragment;
                    if (zBooleanValue3) {
                        xz7 xz7VarM9305Z2 = readerPageFragment2.m9299X0().m9305Z2(lessonWord.f19314a);
                        C2411m c2411mM9299X0 = readerPageFragment2.m9299X0();
                        int iM9332l3 = readerPageFragment2.m9298W0().m9332l3();
                        String str = readerPageFragment2.m9298W0().m9324e3(readerPageFragment2.m9298W0().m9323d3(), xz7VarM9305Z2 != null ? vz1.m23604J(xz7VarM9305Z2) : EmptyList.f47638a).f23315a;
                        c2411mM9299X0.getClass();
                        str.getClass();
                        wfb.m23926u(lda.m16103C(c2411mM9299X0), null, null, new ReaderPageViewModel$onAddMeaning$1(c2411mM9299X0, lessonWord, iM9332l3, str, null), 3);
                    } else {
                        readerPageFragment2.m9298W0().mo3737M1(UpgradeReason.LIMIT_WORDS);
                    }
                    return xfa.f68157a;
                }
            };
            tj3Var.m22131l0(objM22097O3);
        }
        vi3 vi3Var2 = (vi3) objM22097O3;
        boolean zM22124i3 = tj3Var.m22124i(readerPageFragment);
        Object objM22097O4 = tj3Var.m22097O();
        final int i2 = 1;
        if (zM22124i3 || objM22097O4 == p84Var) {
            objM22097O4 = new zi3() { // from class: com.lingq.feature.reader.old.j
                @Override // p000.zi3
                public final Object invoke(Object obj4, Object obj5) {
                    int i3 = i2;
                    xfa xfaVar = xfa.f68157a;
                    ReaderPageFragment readerPageFragment2 = readerPageFragment;
                    String str = (String) obj4;
                    switch (i3) {
                        case 0:
                            String str2 = (String) obj5;
                            vx7 vx7Var2 = ReaderPageFragment.Companion;
                            str.getClass();
                            str2.getClass();
                            if (str2.equals(WordStatus.Known.getValue())) {
                                C2411m c2411mM9299X0 = readerPageFragment2.m9299X0();
                                int iM9332l3 = readerPageFragment2.m9298W0().m9332l3();
                                c2411mM9299X0.getClass();
                                wfb.m23926u(lda.m16103C(c2411mM9299X0), null, null, new ReaderPageViewModel$onKnown$1(iM9332l3, c2411mM9299X0, str, null), 3);
                            } else if (str2.equals(WordStatus.Ignored.getValue())) {
                                C2411m c2411mM9299X1 = readerPageFragment2.m9299X0();
                                int iM9332l4 = readerPageFragment2.m9298W0().m9332l3();
                                c2411mM9299X1.getClass();
                                wfb.m23926u(lda.m16103C(c2411mM9299X1), null, null, new ReaderPageViewModel$onIgnore$1(iM9332l4, c2411mM9299X1, str, null), 3);
                            }
                            break;
                        default:
                            TokenStatus tokenStatus = (TokenStatus) obj5;
                            vx7 vx7Var3 = ReaderPageFragment.Companion;
                            str.getClass();
                            tokenStatus.getClass();
                            C2411m c2411mM9299X2 = readerPageFragment2.m9299X0();
                            int iM24986e = y7d.m24986e(tokenStatus);
                            c2411mM9299X2.getClass();
                            wfb.m23926u(lda.m16103C(c2411mM9299X2), null, null, new ReaderPageViewModel$onCardUpdateStatus$1(iM24986e, c2411mM9299X2, str, null), 3);
                            break;
                    }
                    return xfaVar;
                }
            };
            tj3Var.m22131l0(objM22097O4);
        }
        zi3 zi3Var2 = (zi3) objM22097O4;
        boolean zM22124i4 = tj3Var.m22124i(readerPageFragment);
        Object objM22097O5 = tj3Var.m22097O();
        if (zM22124i4 || objM22097O5 == p84Var) {
            objM22097O5 = new C2401c(i2, readerPageFragment);
            tj3Var.m22131l0(objM22097O5);
        }
        q2d.m19626b(vs3Var, list, zBooleanValue, zBooleanValue2, vi3Var, zi3Var, vi3Var2, zi3Var2, (vi3) objM22097O5, null, tj3Var, 0, 512);
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: o */
    private final Object m13346o(Object obj, Object obj2, Object obj3) {
        h24 h24Var = (h24) this.f42644b;
        Context context = (Context) this.f42645c;
        String str = (String) this.f42646d;
        ui3 ui3Var = (ui3) this.f42647e;
        ui3 ui3Var2 = (ui3) this.f42648f;
        ye1 ye1Var = (ye1) obj2;
        ((Integer) obj3).getClass();
        ((InterfaceC0067f) obj).getClass();
        int i = 0;
        if (h24Var == null) {
            tj3 tj3Var = (tj3) ye1Var;
            tj3Var.m22111b0(-365333327);
            tj3Var.m22139q(false);
        } else {
            Object obj4 = h24Var.f41699e;
            tj3 tj3Var2 = (tj3) ye1Var;
            tj3Var2.m22111b0(-365333326);
            int i2 = AbstractC2500f.f30284d[h24Var.f41695a.ordinal()];
            int i3 = 1;
            p84 p84Var = we1.f66679a;
            if (i2 == 1 || i2 == 2) {
                tj3Var2.m22111b0(1558942329);
                obj4.getClass();
                ty1 ty1Var = (ty1) obj4;
                boolean zM22124i = tj3Var2.m22124i(context) | tj3Var2.m22124i(ty1Var) | tj3Var2.m22120g(str);
                Object objM22097O = tj3Var2.m22097O();
                if (zM22124i || objM22097O == p84Var) {
                    objM22097O = new az7(context, ty1Var, str, i);
                    tj3Var2.m22131l0(objM22097O);
                }
                vi3 vi3Var = (vi3) objM22097O;
                Object objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O2);
                }
                AbstractC1234a.m6998a(null, ty1Var, vi3Var, (ui3) objM22097O2, ui3Var, ui3Var2, tj3Var2, 3072);
                tj3Var2 = tj3Var2;
                tj3Var2.m22139q(false);
            } else if (i2 != 3) {
                tj3Var2.m22111b0(1560353945);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(1559783204);
                obj4.getClass();
                Milestone milestone = (Milestone) obj4;
                boolean zM22124i2 = tj3Var2.m22124i(context) | tj3Var2.m22124i(milestone);
                Object objM22097O3 = tj3Var2.m22097O();
                if (zM22124i2 || objM22097O3 == p84Var) {
                    objM22097O3 = new an6(i3, context, milestone);
                    tj3Var2.m22131l0(objM22097O3);
                }
                AbstractC1234a.m7000c(null, milestone, (vi3) objM22097O3, ui3Var, ui3Var2, tj3Var2, 0);
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(false);
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: p */
    private final Object m13347p(Object obj, Object obj2, Object obj3) {
        e16 e16Var = (e16) this.f42644b;
        t66 t66Var = (t66) this.f42645c;
        ArrayList arrayList = (ArrayList) this.f42646d;
        u19 u19Var = (u19) this.f42647e;
        vi3 vi3Var = (vi3) this.f42648f;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new un7(11, t66Var);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16Var, 15);
            zf1 zf1Var = ge9.f40637a;
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(e16VarM815b, 16.0f, 0.0f, 2), 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 1);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
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
            lw9.m16554b((String) arrayList.get(u19Var.f63253b), new as4(1.0f, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, 0, 0, 131068);
            ty3.m22351a(pvc.m19521q(), null, null, 0L, tj3Var, 48, 12);
            tj3Var.m22139q(true);
            e16 e16VarM21609V2 = AbstractC3584sr.m21609V(c99.m4412e(b16.f7762a, 0.9f), ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 0.0f, 2);
            boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new un7(12, t66Var);
                tj3Var.m22131l0(objM22097O2);
            }
            AbstractC3003fj.m11885a(zBooleanValue, (ui3) objM22097O2, e16VarM21609V2, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(940367911, new C3357n2((Object) arrayList, vi3Var, (Object) u19Var, (Object) t66Var, 16), tj3Var), tj3Var, 48, 2040);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x02cb  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        vx9 vx9Var;
        t66 t66Var;
        boolean z;
        boolean z2;
        b16 b16Var;
        float f;
        boolean z3;
        int i = this.f42643a;
        b16 b16Var2 = b16.f7762a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f42647e;
        Object obj5 = this.f42648f;
        Object obj6 = this.f42646d;
        Object obj7 = this.f42645c;
        Object obj8 = this.f42644b;
        switch (i) {
            case 0:
                e37 e37Var = (e37) obj8;
                nz9 nz9Var = (nz9) obj7;
                wz7 wz7Var = (wz7) obj6;
                vs3 vs3Var = (vs3) obj4;
                vi3 vi3Var = (vi3) obj5;
                ei0 ei0Var = (ei0) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ei0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(ei0Var) ? 4 : 2;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    vx9 vx9Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j;
                    boolean zM22120g = tj3Var.m22120g(vx9Var2);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = vx9.m23584b(vx9Var2, aa1.f406e, 0L, bc3.f8322h, null, null, 0L, null, null, 0, 0L, null, 16777210);
                        tj3Var.m22131l0(objM22097O);
                    }
                    vx9 vx9Var3 = (vx9) objM22097O;
                    float fMo912g0 = ((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo912g0(ei0Var.m11159b());
                    yw9 yw9VarM17106Y = AbstractC3352my.m17106Y(tj3Var);
                    String str2 = e37Var.f36653b;
                    String str3 = e37Var.f36653b;
                    boolean zM22120g2 = tj3Var.m22120g(str2) | tj3Var.m22116e(nz9Var.f53455a) | tj3Var.m22114d(fMo912g0) | tj3Var.m22120g(vx9Var3);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        int i2 = nz9Var.f53455a;
                        if (fMo912g0 <= 0.0f || vk9.m23391n0(str3)) {
                            str = str3;
                            vx9Var = vx9Var3;
                        } else {
                            while (true) {
                                if (i2 > 12) {
                                    vx9 vx9Var4 = vx9Var3;
                                    vx9Var = vx9Var4;
                                    String str4 = str3;
                                    str = str4;
                                    if (yw9.m25367a(yw9VarM17106Y, str4, vx9.m23584b(vx9Var4, 0L, d32.m10018P(i2), null, null, null, 0L, null, null, 0, 0L, null, 16777213), dk1.m10424b(0, (int) fMo912g0, 0, 0, 13), 988).f59976b.f66381f > 3) {
                                        i2--;
                                        vx9Var3 = vx9Var;
                                        str3 = str;
                                    }
                                } else {
                                    str = str3;
                                    vx9Var = vx9Var3;
                                }
                            }
                        }
                        objM22097O2 = Integer.valueOf(i2);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        str = str3;
                        vx9Var = vx9Var3;
                    }
                    jt3 jt3Var = new jt3(e37Var.f36652a, str, e37Var.f36655d, e37Var.f36656e, null, false, nz9Var.f53462h, vs3Var, wz7Var.f67566c, wz7Var.f67567d, true, ((Number) objM22097O2).intValue(), nz9Var.f53456b, nz9Var.f53458d, wz7Var.f67571h, wz7Var.f67572i, false, null, false, wz7Var.f67568e, wz7Var.f67569f, null, 0.0f, 12779568);
                    boolean zM22120g3 = tj3Var.m22120g(vi3Var) | tj3Var.m22120g(e37Var);
                    Object objM22097O3 = tj3Var.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new in0(0, vi3Var, e37Var);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    bj3 bj3Var = (bj3) objM22097O3;
                    boolean zM22120g4 = tj3Var.m22120g(e37Var) | tj3Var.m22120g(vi3Var);
                    Object objM22097O4 = tj3Var.m22097O();
                    if (zM22120g4 || objM22097O4 == p84Var) {
                        objM22097O4 = new jn0(0, vi3Var, e37Var);
                        tj3Var.m22131l0(objM22097O4);
                    }
                    aj3 aj3Var = (aj3) objM22097O4;
                    boolean zM22120g5 = tj3Var.m22120g(vi3Var);
                    Object objM22097O5 = tj3Var.m22097O();
                    if (zM22120g5 || objM22097O5 == p84Var) {
                        objM22097O5 = new C3353mz(vi3Var, 5);
                        tj3Var.m22131l0(objM22097O5);
                    }
                    ui3 ui3Var = (ui3) objM22097O5;
                    boolean zM22120g6 = tj3Var.m22120g(vi3Var);
                    Object objM22097O6 = tj3Var.m22097O();
                    if (zM22120g6 || objM22097O6 == p84Var) {
                        objM22097O6 = new te0(vi3Var, 1);
                        tj3Var.m22131l0(objM22097O6);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O6;
                    Object objM22097O7 = tj3Var.m22097O();
                    if (objM22097O7 == p84Var) {
                        objM22097O7 = new C3013ft(4);
                        tj3Var.m22131l0(objM22097O7);
                    }
                    vi3 vi3Var3 = (vi3) objM22097O7;
                    Object objM22097O8 = tj3Var.m22097O();
                    if (objM22097O8 == p84Var) {
                        objM22097O8 = new C3288l7(7);
                        tj3Var.m22131l0(objM22097O8);
                    }
                    AbstractC1932c.m8799a(jt3Var, vx9Var, null, bj3Var, aj3Var, ui3Var, vi3Var2, vi3Var3, (ui3) objM22097O8, null, tj3Var, 113246216, 516);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                tx0 tx0Var = (tx0) obj8;
                t66 t66Var2 = (t66) obj7;
                jv0 jv0Var = (jv0) obj6;
                dh9 dh9Var = (dh9) obj4;
                t66 t66Var3 = (t66) obj5;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var2);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    thb.m22044c(tj3Var2, c99.m4414g(b16Var2, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38958g));
                    List list = (List) t66Var3.getValue();
                    boolean z4 = tx0Var.f63038c;
                    boolean zM22120g7 = tj3Var2.m22120g(t66Var2) | tj3Var2.m22124i(jv0Var) | tj3Var2.m22124i(tx0Var);
                    Object objM22097O9 = tj3Var2.m22097O();
                    if (zM22120g7 || objM22097O9 == p84Var) {
                        objM22097O9 = new C3485q5(jv0Var, tx0Var, t66Var2, 7);
                        tj3Var2.m22131l0(objM22097O9);
                    }
                    vi3 vi3Var4 = (vi3) objM22097O9;
                    boolean zM22120g8 = tj3Var2.m22120g(t66Var2) | tj3Var2.m22124i(jv0Var);
                    Object objM22097O10 = tj3Var2.m22097O();
                    if (zM22120g8 || objM22097O10 == p84Var) {
                        objM22097O10 = new hy0(jv0Var, t66Var2, 0);
                        tj3Var2.m22131l0(objM22097O10);
                    }
                    ui3 ui3Var3 = (ui3) objM22097O10;
                    boolean zM22120g9 = tj3Var2.m22120g(dh9Var);
                    Object objM22097O11 = tj3Var2.m22097O();
                    if (zM22120g9 || objM22097O11 == p84Var) {
                        objM22097O11 = new iy0(dh9Var, 0);
                        tj3Var2.m22131l0(objM22097O11);
                    }
                    b7d.m3410a(0, tj3Var2, ui3Var3, vi3Var4, AbstractC0309d.m1406a(b16Var2, (vi3) objM22097O11), list, z4);
                    tj3Var2.m22139q(true);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                q91 q91Var = (q91) obj8;
                C0127b c0127b = (C0127b) obj7;
                t17 t17Var = (t17) obj6;
                vi3 vi3Var5 = (vi3) obj5;
                vi3 vi3Var6 = (vi3) obj4;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((bi0) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c8d.m4402a(new p71(q91Var.f57440b, c0127b, t17Var), vi3Var5, vi3Var6, tj3Var3, 0);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                jp2 jp2Var = (jp2) obj8;
                vi3 vi3Var7 = (vi3) obj5;
                ld9 ld9Var = (ld9) obj7;
                t66 t66Var4 = (t66) obj6;
                t66 t66Var5 = (t66) obj4;
                t17 t17Var2 = (t17) obj;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t17Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((tj3) ye1Var4).m22120g(t17Var2) ? 4 : 2;
                }
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4411d(b16Var2, 1.0f), t17Var2);
                    gc0 gc0Var = nj0.f52808c;
                    ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                    int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m2 = tj3Var4.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, e16VarM21606S);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var4);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var4, zi3Var, ht5VarM19966d);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var4, zi3Var3, numValueOf);
                    vi3 vi3Var8 = C0352b.f4305h;
                    oha.m18000f(tj3Var4, vi3Var8);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c2);
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var2, 1.0f), ge9.m12515a(tj3Var4).f38960i, 0.0f, 2);
                    bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var4, 0);
                    int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m3 = tj3Var4.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM21609V);
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var4);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, zi3Var, bb1VarM230a2);
                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m3);
                    AbstractC3393o1.m17747v(iHashCode3, tj3Var4, zi3Var3, tj3Var4, vi3Var8);
                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c3);
                    thb.m22044c(tj3Var4, c99.m4414g(b16Var2, ge9.m12515a(tj3Var4).f38956e));
                    lw9.m16554b(vz1.m23620a0(tj3Var4, com.lingq.feature.onboarding.R$string.login_send_magic_link), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                    thb.m22044c(tj3Var4, c99.m4414g(b16Var2, ge9.m12515a(tj3Var4).f38952a));
                    String str5 = (String) t66Var4.getValue();
                    boolean zBooleanValue = ((Boolean) t66Var5.getValue()).booleanValue();
                    hj4 hj4Var = new hj4(6, 7, null, 115);
                    e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
                    Object objM22097O12 = tj3Var4.m22097O();
                    if (objM22097O12 == p84Var) {
                        t66Var = t66Var5;
                        objM22097O12 = new n20(t66Var4, t66Var, 3);
                        tj3Var4.m22131l0(objM22097O12);
                    } else {
                        t66Var = t66Var5;
                    }
                    bna.m3942c(str5, (vi3) objM22097O12, e16VarM4412e, false, null, spb.f61211c, null, null, null, null, ci8.m4703P(-1020056155, new C0812bj(4, t66Var), tj3Var4), zBooleanValue, null, hj4Var, null, true, 0, 0, null, null, tj3Var4, 1573296, 12779904, 8212408);
                    e16 e16VarM22984g = ux5.m22984g(b16Var2, ge9.m12515a(tj3Var4).f38952a, tj3Var4, b16Var2, 1.0f);
                    boolean z5 = !((Boolean) t66Var.getValue()).booleanValue() && ((String) t66Var4.getValue()).length() > 0;
                    boolean zM22120g10 = tj3Var4.m22120g(vi3Var7) | tj3Var4.m22120g(ld9Var);
                    Object objM22097O13 = tj3Var4.m22097O();
                    if (zM22120g10 || objM22097O13 == p84Var) {
                        objM22097O13 = new zg0(vi3Var7, ld9Var, t66Var4, 8);
                        tj3Var4.m22131l0(objM22097O13);
                    }
                    ss5.m21710f(e16VarM22984g, null, null, z5, (ui3) objM22097O13, spb.f61212d, tj3Var4, 196614, 6);
                    tj3Var4.m22139q(true);
                    if (jp2Var.f45953b) {
                        tj3Var4.m22111b0(243577527);
                        e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var2, 1.0f), aa1.m198b(0.5f, p58.m18900f(tj3Var4).f55868n), ss5.f61356d);
                        ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                        int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m4 = tj3Var4.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, e16VarM10007D);
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var4);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, zi3Var, ht5VarM19966d2);
                        oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m4);
                        AbstractC3393o1.m17747v(iHashCode4, tj3Var4, zi3Var3, tj3Var4, vi3Var8);
                        oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c4);
                        dn7.m10492a(ci0.f10109a.mo3727a(b16Var2, nj0.f52812g), p58.m18900f(tj3Var4).f55860j, 0.0f, 0L, 0, 0.0f, tj3Var4, 0, 60);
                        z = true;
                        tj3Var4.m22139q(true);
                        tj3Var4.m22139q(false);
                    } else {
                        z = true;
                        tj3Var4.m22111b0(244010938);
                        tj3Var4.m22139q(false);
                    }
                    tj3Var4.m22139q(z);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 4:
                a03 a03Var = (a03) obj8;
                e04 e04Var = (e04) obj7;
                vi3 vi3Var9 = (vi3) obj5;
                vi3 vi3Var10 = (vi3) obj6;
                t66 t66Var6 = (t66) obj4;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    tj3Var5.m22102U();
                    return xfaVar;
                }
                b16 b16Var3 = b16.f7762a;
                e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var3, 1.0f), ge9.m12515a(tj3Var5).f38952a);
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var5).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var5, 0);
                int iHashCode5 = Long.hashCode(tj3Var5.f62385T);
                l77 l77VarM22132m5 = tj3Var5.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var5, e16VarM21607T);
                se1.f60731q.getClass();
                ui3 ui3Var5 = C0352b.f4299b;
                tj3Var5.m22119f0();
                if (tj3Var5.f62384S) {
                    tj3Var5.m22130l(ui3Var5);
                } else {
                    tj3Var5.m22137o0();
                }
                zi3 zi3Var5 = C0352b.f4303f;
                oha.m18001g(tj3Var5, zi3Var5, sj8VarM20003a);
                zi3 zi3Var6 = C0352b.f4302e;
                oha.m18001g(tj3Var5, zi3Var6, l77VarM22132m5);
                Integer numValueOf2 = Integer.valueOf(iHashCode5);
                zi3 zi3Var7 = C0352b.f4304g;
                oha.m18001g(tj3Var5, zi3Var7, numValueOf2);
                vi3 vi3Var11 = C0352b.f4305h;
                oha.m18000f(tj3Var5, vi3Var11);
                zi3 zi3Var8 = C0352b.f4301d;
                oha.m18001g(tj3Var5, zi3Var8, e16VarM1322c5);
                LibraryItem libraryItem = a03Var.f17a;
                LibraryItemCounter libraryItemCounter = a03Var.f18b;
                String str6 = libraryItem.f19433e;
                ss5.m21702b(e04Var, str6, pb1.m19045o(c99.m4422o(b16Var3, 68.0f), p58.m18901i(tj3Var5).f64857c), null, hl1.f42564a, tj3Var5, 1572864, 4024);
                as4 as4Var = new as4(1.0f, true);
                bb1 bb1VarM230a3 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var5, 0);
                int iHashCode6 = Long.hashCode(tj3Var5.f62385T);
                l77 l77VarM22132m6 = tj3Var5.m22132m();
                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var5, as4Var);
                tj3Var5.m22119f0();
                if (tj3Var5.f62384S) {
                    tj3Var5.m22130l(ui3Var5);
                } else {
                    tj3Var5.m22137o0();
                }
                oha.m18001g(tj3Var5, zi3Var5, bb1VarM230a3);
                oha.m18001g(tj3Var5, zi3Var6, l77VarM22132m6);
                AbstractC3393o1.m17747v(iHashCode6, tj3Var5, zi3Var7, tj3Var5, vi3Var11);
                oha.m18001g(tj3Var5, zi3Var8, e16VarM1322c6);
                lw9.m16554b(str6 == null ? "" : str6, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, p58.m18902j(tj3Var5).f71405i, tj3Var5, 0, 24960, 110590);
                String str7 = libraryItem.f19442n;
                if (str7 == null) {
                    str7 = "";
                }
                if (vk9.m23391n0(str7)) {
                    tj3Var5.m22111b0(1279244326);
                    lw9.m16554b(vz1.m23620a0(tj3Var5, com.lingq.core.p012ui.R$string.lingq_lesson), null, p58.m18900f(tj3Var5).f55875s, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var5).f71408l, tj3Var5, 0, 24960, 110586);
                    z2 = false;
                    tj3Var5.m22139q(false);
                } else {
                    tj3Var5.m22111b0(1278838226);
                    lw9.m16554b(AbstractC3393o1.m17735j(vz1.m23620a0(tj3Var5, com.lingq.core.p012ui.R$string.lingq_lesson), " • ", str7), null, p58.m18900f(tj3Var5).f55875s, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var5).f71408l, tj3Var5, 0, 24960, 110586);
                    z2 = false;
                    tj3Var5.m22139q(false);
                }
                tj3Var5.m22139q(true);
                ht5 ht5VarM19966d3 = qh0.m19966d(nj0.f52808c, z2);
                int iHashCode7 = Long.hashCode(tj3Var5.f62385T);
                l77 l77VarM22132m7 = tj3Var5.m22132m();
                e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var5, b16Var3);
                tj3Var5.m22119f0();
                if (tj3Var5.f62384S) {
                    tj3Var5.m22130l(ui3Var5);
                } else {
                    tj3Var5.m22137o0();
                }
                oha.m18001g(tj3Var5, zi3Var5, ht5VarM19966d3);
                oha.m18001g(tj3Var5, zi3Var6, l77VarM22132m7);
                AbstractC3393o1.m17747v(iHashCode7, tj3Var5, zi3Var7, tj3Var5, vi3Var11);
                oha.m18001g(tj3Var5, zi3Var8, e16VarM1322c7);
                Object objM22097O14 = tj3Var5.m22097O();
                if (objM22097O14 == p84Var) {
                    objM22097O14 = new C3799yk(16, t66Var6);
                    tj3Var5.m22131l0(objM22097O14);
                }
                e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var3, 0.0f, 0.0f, ge9.m12515a(tj3Var5).f38954c, 0.0f, 11);
                vf0 vf0VarM4714a = ci8.m4714a(1.0f, p58.m18900f(tj3Var5).f55816A);
                omd.m18141c((ui3) objM22097O14, c99.m4422o(r46.m20388n(e16VarM21611X, vf0VarM4714a.f65300a, vf0VarM4714a.f65301b, ui8.f63972a), 24.0f), false, null, null, xpb.f68508a, tj3Var5, 1572870, 60);
                if (((Boolean) t66Var6.getValue()).booleanValue()) {
                    tj3Var5.m22111b0(-1636115351);
                    String str8 = str6 == null ? "" : str6;
                    Object objM22097O15 = tj3Var5.m22097O();
                    if (objM22097O15 == p84Var) {
                        objM22097O15 = new C3799yk(17, t66Var6);
                        tj3Var5.m22131l0(objM22097O15);
                    }
                    ui3 ui3Var6 = (ui3) objM22097O15;
                    d05 d05Var = new d05((libraryItemCounter != null && libraryItemCounter.f19456b) || fa4.m11650l(libraryItem.f19451w, Boolean.TRUE), libraryItem.m8090e(), libraryItemCounter != null && libraryItemCounter.f19460f, false, false, 480);
                    boolean zM22120g11 = tj3Var5.m22120g(vi3Var9) | tj3Var5.m22124i(a03Var) | tj3Var5.m22120g(vi3Var10);
                    Object objM22097O16 = tj3Var5.m22097O();
                    if (zM22120g11 || objM22097O16 == p84Var) {
                        C3445p2 c3445p2 = new C3445p2(vi3Var9, (Object) a03Var, vi3Var10, t66Var6, 10);
                        tj3Var5.m22131l0(c3445p2);
                        objM22097O16 = c3445p2;
                    }
                    rid.m20672a(str8, ui3Var6, d05Var, (vi3) objM22097O16, tj3Var5, 48);
                    tj3Var5.m22139q(false);
                } else {
                    tj3Var5.m22111b0(-1633188145);
                    tj3Var5.m22139q(false);
                }
                tj3Var5.m22139q(true);
                tj3Var5.m22139q(true);
                return xfaVar;
            case 5:
                a13 a13Var = (a13) obj8;
                vi3 vi3Var12 = (vi3) obj5;
                t66 t66Var7 = (t66) obj7;
                uc9 uc9Var = (uc9) obj6;
                vi3 vi3Var13 = (vi3) obj4;
                t17 t17Var3 = (t17) obj;
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                t17Var3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((tj3) ye1Var6).m22120g(t17Var3) ? 4 : 2;
                }
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    boolean z6 = a13Var.f59c || ((Boolean) t66Var7.getValue()).booleanValue();
                    boolean zM22124i = tj3Var6.m22124i(a13Var) | tj3Var6.m22120g(vi3Var12);
                    Object objM22097O17 = tj3Var6.m22097O();
                    if (zM22124i || objM22097O17 == p84Var) {
                        g91 g91Var = new g91((Object) a13Var, (Object) vi3Var12, (Object) t66Var7, (Object) uc9Var, 1);
                        tj3Var6.m22131l0(g91Var);
                        objM22097O17 = g91Var;
                    }
                    lp7.m16424b(z6, (ui3) objM22097O17, null, null, null, null, false, 0.0f, ci8.m4703P(578553716, new C3357n2((Object) a13Var, (Object) t17Var3, vi3Var12, (Object) vi3Var13, 7), tj3Var6), tj3Var6, 100663296, 252);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 6:
                ArrayList arrayList = (ArrayList) obj8;
                Context context = (Context) obj7;
                String str9 = (String) obj6;
                vi3 vi3Var14 = (vi3) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                db1 db1Var = (db1) obj;
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                db1Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((tj3) ye1Var7).m22120g(db1Var) ? 4 : 2;
                }
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    e16 e16VarM10266b = db1Var.m10266b(b16Var2, true);
                    zf1 zf1Var = ge9.f40637a;
                    x17 x17VarM21622e = AbstractC3584sr.m21622e(0.0f, ((fe9) tj3Var7.m22128k(zf1Var)).f38955d, 1);
                    C3661uu c3661uu = new C3661uu(((fe9) tj3Var7.m22128k(zf1Var)).f38963l, true, new gm5(28));
                    boolean zM22124i2 = tj3Var7.m22124i(arrayList) | tj3Var7.m22124i(context) | tj3Var7.m22120g(str9) | tj3Var7.m22120g(vi3Var14) | tj3Var7.m22124i(arrayList2);
                    Object objM22097O18 = tj3Var7.m22097O();
                    if (zM22124i2 || objM22097O18 == p84Var) {
                        C3537ri c3537ri = new C3537ri(arrayList, arrayList2, context, str9, vi3Var14, 4);
                        tj3Var7.m22131l0(c3537ri);
                        objM22097O18 = c3537ri;
                    }
                    fa4.m11642c(e16VarM10266b, null, x17VarM21622e, c3661uu, null, null, false, null, (vi3) objM22097O18, tj3Var7, 0, 490);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 7:
                fe9 fe9Var = (fe9) obj8;
                jm4 jm4Var = (jm4) obj7;
                vi3 vi3Var15 = (vi3) obj5;
                t66 t66Var8 = (t66) obj6;
                t66 t66Var9 = (t66) obj4;
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    e16 e16VarM4412e2 = c99.m4412e(b16Var2, 1.0f);
                    float f2 = fe9Var.f38960i;
                    float f3 = fe9Var.f38952a;
                    e16 e16VarM21611X2 = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(e16VarM4412e2, f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, fe9Var.f38960i, 7);
                    bb1 bb1VarM230a4 = ab1.m230a(new C3661uu(f3, true, new gm5(28)), nj0.f52791J, tj3Var8, 0);
                    int iHashCode8 = Long.hashCode(tj3Var8.f62385T);
                    l77 l77VarM22132m8 = tj3Var8.m22132m();
                    e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var8, e16VarM21611X2);
                    se1.f60731q.getClass();
                    ui3 ui3Var7 = C0352b.f4299b;
                    tj3Var8.m22119f0();
                    if (tj3Var8.f62384S) {
                        tj3Var8.m22130l(ui3Var7);
                    } else {
                        tj3Var8.m22137o0();
                    }
                    oha.m18001g(tj3Var8, C0352b.f4303f, bb1VarM230a4);
                    oha.m18001g(tj3Var8, C0352b.f4302e, l77VarM22132m8);
                    oha.m18001g(tj3Var8, C0352b.f4304g, Integer.valueOf(iHashCode8));
                    oha.m18000f(tj3Var8, C0352b.f4305h);
                    oha.m18001g(tj3Var8, C0352b.f4301d, e16VarM1322c8);
                    String str10 = jm4Var.f45823a;
                    LanguageProgressInputType languageProgressInputType = jm4Var.f45824b;
                    lw9.m16554b(str10, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51800b.f71403g, tj3Var8, 0, 0, 131070);
                    int[] iArr = km4.f47511a;
                    int i3 = iArr[languageProgressInputType.ordinal()];
                    if (i3 == 1) {
                        tj3Var8.m22111b0(1138040721);
                        String str11 = (String) t66Var8.getValue();
                        e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                        hj4 hj4Var2 = new hj4(3, 0, null, 123);
                        Object objM22097O19 = tj3Var8.m22097O();
                        if (objM22097O19 == p84Var) {
                            b16Var = b16Var2;
                            objM22097O19 = new C0023al(18, t66Var8);
                            tj3Var8.m22131l0(objM22097O19);
                        }
                        b16Var = b16Var2;
                        bna.m3942c(str11, (vi3) objM22097O19, e16VarM4412e3, false, null, mrb.f51781a, null, null, null, null, null, false, null, hj4Var2, null, true, 0, 0, null, null, tj3Var8, 1573296, 12779520, 8224696);
                        String str12 = (String) t66Var9.getValue();
                        e16 e16VarM4412e4 = c99.m4412e(b16Var, 1.0f);
                        hj4 hj4Var3 = new hj4(3, 0, null, 123);
                        Object objM22097O20 = tj3Var8.m22097O();
                        if (objM22097O20 == p84Var) {
                            objM22097O20 = new C0023al(19, t66Var9);
                            tj3Var8.m22131l0(objM22097O20);
                        }
                        bna.m3942c(str12, (vi3) objM22097O20, e16VarM4412e4, false, null, mrb.f51782b, null, null, null, null, null, false, null, hj4Var3, null, true, 0, 0, null, null, tj3Var8, 1573296, 12779520, 8224696);
                        tj3Var8.m22139q(false);
                    } else {
                        if (i3 != 2) {
                            throw ux5.m23001x(tj3Var8, -2041501006, false);
                        }
                        tj3Var8.m22111b0(1139161216);
                        String str13 = (String) t66Var8.getValue();
                        e16 e16VarM4412e5 = c99.m4412e(b16Var, 1.0f);
                        hj4 hj4Var4 = new hj4(3, 0, null, 123);
                        Object objM22097O21 = tj3Var8.m22097O();
                        if (objM22097O21 == p84Var) {
                            b16Var = b16Var2;
                            objM22097O21 = new C0023al(20, t66Var8);
                            tj3Var8.m22131l0(objM22097O21);
                        }
                        b16Var = b16Var2;
                        bna.m3942c(str13, (vi3) objM22097O21, e16VarM4412e5, false, null, mrb.f51783c, null, null, null, null, null, false, null, hj4Var4, null, true, 0, 0, null, null, tj3Var8, 1573296, 12779520, 8224696);
                        tj3Var8.m22139q(false);
                    }
                    thb.m22044c(tj3Var8, c99.m4414g(b16Var, f3));
                    int i4 = iArr[languageProgressInputType.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            gm5.m12750e();
                            return null;
                        }
                        if (((String) t66Var8.getValue()).length() > 0) {
                            f = 1.0f;
                            z3 = true;
                        } else {
                            f = 1.0f;
                            z3 = false;
                        }
                    } else if (((String) t66Var8.getValue()).length() <= 0 || ((String) t66Var9.getValue()).length() <= 0) {
                        f = 1.0f;
                        z3 = false;
                    } else {
                        f = 1.0f;
                        z3 = true;
                    }
                    e16 e16VarM4412e6 = c99.m4412e(b16Var, f);
                    boolean zM22120g12 = tj3Var8.m22120g(jm4Var) | tj3Var8.m22120g(vi3Var15);
                    Object objM22097O22 = tj3Var8.m22097O();
                    if (zM22120g12 || objM22097O22 == p84Var) {
                        objM22097O22 = new g91((Object) jm4Var, (Object) vi3Var15, (Object) t66Var8, (Object) t66Var9, 7);
                        tj3Var8.m22131l0(objM22097O22);
                    }
                    ss5.m21710f(e16VarM4412e6, null, null, z3, (ui3) objM22097O22, mrb.f51784d, tj3Var8, 196614, 6);
                    WeakHashMap weakHashMap = l6b.f49204w;
                    thb.m22044c(tj3Var8, pvc.m19502J(ho5.m13397r(tj3Var8).f49209e));
                    tj3Var8.m22139q(true);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 8:
                return m13339d(obj, obj2, obj3);
            case 9:
                return m13340g(obj, obj2, obj3);
            case 10:
                return m13341j(obj, obj2, obj3);
            case 11:
                return m13342k(obj, obj2, obj3);
            case 12:
                return m13343l(obj, obj2, obj3);
            case 13:
                return m13344m(obj, obj2, obj3);
            case 14:
                return m13345n(obj, obj2, obj3);
            case 15:
                return m13346o(obj, obj2, obj3);
            case 16:
                return m13347p(obj, obj2, obj3);
            default:
                xs8 xs8Var = (xs8) obj8;
                C0127b c0127b2 = (C0127b) obj7;
                t17 t17Var4 = (t17) obj6;
                vi3 vi3Var16 = (vi3) obj5;
                vi3 vi3Var17 = (vi3) obj4;
                ye1 ye1Var9 = (ye1) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((bi0) obj).getClass();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    r0d.m20235e(new zq8(xs8Var.f68653b, c0127b2, t17Var4), vi3Var16, vi3Var17, tj3Var9, 0);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
        }
    }

    public /* synthetic */ hn0(int i, vi3 vi3Var, t66 t66Var, Object obj, Object obj2, Object obj3) {
        this.f42643a = i;
        this.f42644b = obj;
        this.f42645c = obj2;
        this.f42648f = vi3Var;
        this.f42646d = obj3;
        this.f42647e = t66Var;
    }

    public /* synthetic */ hn0(Object obj, vi3 vi3Var, Object obj2, Object obj3, Object obj4, int i) {
        this.f42643a = i;
        this.f42644b = obj;
        this.f42648f = vi3Var;
        this.f42645c = obj2;
        this.f42646d = obj3;
        this.f42647e = obj4;
    }

    public /* synthetic */ hn0(Object obj, Object obj2, Object obj3, vi3 vi3Var, Object obj4, int i) {
        this.f42643a = i;
        this.f42644b = obj;
        this.f42645c = obj2;
        this.f42646d = obj3;
        this.f42648f = vi3Var;
        this.f42647e = obj4;
    }

    public /* synthetic */ hn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f42643a = i;
        this.f42644b = obj;
        this.f42645c = obj2;
        this.f42646d = obj3;
        this.f42647e = obj4;
        this.f42648f = obj5;
    }
}
