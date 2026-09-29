package com.lingq.feature.onboarding.p014v2;

import android.content.SharedPreferences;
import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.common.util.LqAnalyticsVariant;
import com.lingq.core.data.repository.C1297m;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.feature.onboarding.domain.C2207a;
import com.lingq.feature.onboarding.p014v2.domain.C2220a;
import com.lingq.feature.onboarding.p014v2.domain.C2223d;
import com.lingq.feature.onboarding.p014v2.domain.C2224e;
import com.lingq.feature.onboarding.p014v2.domain.C2225f;
import com.lingq.feature.onboarding.p014v2.domain.C2226g;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3423or;
import p000.C3509qs;
import p000.c18;
import p000.c83;
import p000.cc4;
import p000.cma;
import p000.cx6;
import p000.df4;
import p000.eh9;
import p000.fa4;
import p000.fs6;
import p000.gm5;
import p000.hm5;
import p000.lda;
import p000.lm5;
import p000.lx6;
import p000.mx6;
import p000.nx6;
import p000.ob1;
import p000.pg9;
import p000.qm3;
import p000.qx6;
import p000.ru6;
import p000.thb;
import p000.u91;
import p000.un1;
import p000.wfb;
import p000.wm5;
import p000.wta;
import p000.ys2;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2216d extends wta implements cma {

    /* JADX INFO: renamed from: A */
    public final C3244l f27363A;

    /* JADX INFO: renamed from: B */
    public final C3244l f27364B;

    /* JADX INFO: renamed from: C */
    public final C3244l f27365C;

    /* JADX INFO: renamed from: D */
    public final C3244l f27366D;

    /* JADX INFO: renamed from: E */
    public final boolean f27367E;

    /* JADX INFO: renamed from: F */
    public final C3244l f27368F;

    /* JADX INFO: renamed from: G */
    public final C3244l f27369G;

    /* JADX INFO: renamed from: H */
    public pg9 f27370H;

    /* JADX INFO: renamed from: I */
    public pg9 f27371I;

    /* JADX INFO: renamed from: J */
    public final C3244l f27372J;

    /* JADX INFO: renamed from: K */
    public final C3244l f27373K;

    /* JADX INFO: renamed from: L */
    public final C3244l f27374L;

    /* JADX INFO: renamed from: M */
    public final C3244l f27375M;

    /* JADX INFO: renamed from: N */
    public final c18 f27376N;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f27377b;

    /* JADX INFO: renamed from: c */
    public final C2225f f27378c;

    /* JADX INFO: renamed from: d */
    public final C2225f f27379d;

    /* JADX INFO: renamed from: e */
    public final C2226g f27380e;

    /* JADX INFO: renamed from: f */
    public final fs6 f27381f;

    /* JADX INFO: renamed from: g */
    public final C2220a f27382g;

    /* JADX INFO: renamed from: h */
    public final fs6 f27383h;

    /* JADX INFO: renamed from: i */
    public final C2207a f27384i;

    /* JADX INFO: renamed from: j */
    public final C2224e f27385j;

    /* JADX INFO: renamed from: k */
    public final cc4 f27386k;

    /* JADX INFO: renamed from: l */
    public final fs6 f27387l;

    /* JADX INFO: renamed from: m */
    public final C2223d f27388m;

    /* JADX INFO: renamed from: n */
    public final C1297m f27389n;

    /* JADX INFO: renamed from: o */
    public final ob1 f27390o;

    /* JADX INFO: renamed from: p */
    public final un1 f27391p;

    /* JADX INFO: renamed from: q */
    public final C3244l f27392q;

    /* JADX INFO: renamed from: r */
    public final C3244l f27393r;

    /* JADX INFO: renamed from: s */
    public final C3244l f27394s;

    /* JADX INFO: renamed from: t */
    public final C3244l f27395t;

    /* JADX INFO: renamed from: u */
    public final C3244l f27396u;

    /* JADX INFO: renamed from: v */
    public final C3244l f27397v;

    /* JADX INFO: renamed from: w */
    public final C3244l f27398w;

    /* JADX INFO: renamed from: x */
    public final C3244l f27399x;

    /* JADX INFO: renamed from: y */
    public final C3244l f27400y;

    /* JADX INFO: renamed from: z */
    public final C3244l f27401z;

    public C2216d(C2225f c2225f, C2225f c2225f2, C2226g c2226g, fs6 fs6Var, C2220a c2220a, fs6 fs6Var2, C2207a c2207a, C2224e c2224e, cc4 cc4Var, fs6 fs6Var3, C2223d c2223d, C1297m c1297m, ob1 ob1Var, un1 un1Var, cma cmaVar) {
        LqAnalyticsVariant lqAnalyticsVariantM7021b;
        LqAnalyticsVariant lqAnalyticsVariantM7021b2;
        OnboardingSelections onboardingSelections;
        c1297m.getClass();
        ob1Var.getClass();
        un1Var.getClass();
        cmaVar.getClass();
        this.f27377b = cmaVar;
        this.f27378c = c2225f;
        this.f27379d = c2225f2;
        this.f27380e = c2226g;
        this.f27381f = fs6Var;
        this.f27382g = c2220a;
        this.f27383h = fs6Var2;
        this.f27384i = c2207a;
        this.f27385j = c2224e;
        this.f27386k = cc4Var;
        this.f27387l = fs6Var3;
        this.f27388m = c2223d;
        this.f27389n = c1297m;
        this.f27390o = ob1Var;
        this.f27391p = un1Var;
        this.f27392q = AbstractC3352my.m17114d(0);
        this.f27393r = AbstractC3352my.m17114d(new OnboardingSelections(null, null, null, 0, 131071));
        EmptyList emptyList = EmptyList.f47638a;
        this.f27394s = AbstractC3352my.m17114d(emptyList);
        Boolean bool = Boolean.FALSE;
        this.f27395t = AbstractC3352my.m17114d(bool);
        this.f27396u = AbstractC3352my.m17114d(null);
        this.f27397v = AbstractC3352my.m17114d(wm5.f67054a);
        this.f27398w = AbstractC3352my.m17114d(bool);
        this.f27399x = AbstractC3352my.m17114d(bool);
        this.f27400y = AbstractC3352my.m17114d(null);
        hm5 hm5Var = (hm5) fs6Var3.f39590b;
        C3509qs c3509qs = (C3509qs) fs6Var3.f39591c;
        SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putBoolean("active_onboarding_multipage_paywall_flow", true);
        editorEdit.apply();
        SharedPreferences sharedPreferences = c3509qs.f58118b;
        df4 df4Var = c3509qs.f58117a;
        String string = sharedPreferences.getString("onboarding_multipage_paywall_reminder_choice_variant", null);
        if (string == null) {
            lqAnalyticsVariantM7021b = null;
        } else {
            try {
                lqAnalyticsVariantM7021b = (LqAnalyticsVariant) df4Var.m10321a(string, LqAnalyticsVariant.Companion.serializer());
            } catch (Exception unused) {
                lqAnalyticsVariantM7021b = null;
            }
        }
        if (lqAnalyticsVariantM7021b == null || fa4.m11650l(lqAnalyticsVariantM7021b.f14398b, "not set")) {
            lqAnalyticsVariantM7021b = ((C1240a) hm5Var).m7021b(lm5.f49832a);
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.getClass();
            editorEdit2.putString("onboarding_multipage_paywall_reminder_choice_variant", df4Var.m10322b(thb.m22059r(LqAnalyticsVariant.Companion.serializer()), lqAnalyticsVariantM7021b));
            editorEdit2.apply();
        }
        boolean z = (lqAnalyticsVariantM7021b.f14399c || fa4.m11650l(lqAnalyticsVariantM7021b.f14398b, "not set")) ? false : true;
        SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
        editorEdit3.getClass();
        editorEdit3.putBoolean("active_onboarding_multipage_paywall_reminder_choice_flow", z);
        editorEdit3.apply();
        String string2 = sharedPreferences.getString("onboarding_trial_promotion_variant", null);
        if (string2 == null) {
            lqAnalyticsVariantM7021b2 = null;
        } else {
            try {
                lqAnalyticsVariantM7021b2 = (LqAnalyticsVariant) df4Var.m10321a(string2, LqAnalyticsVariant.Companion.serializer());
            } catch (Exception unused2) {
                lqAnalyticsVariantM7021b2 = null;
            }
        }
        if (lqAnalyticsVariantM7021b2 == null || fa4.m11650l(lqAnalyticsVariantM7021b2.f14398b, "not set")) {
            lqAnalyticsVariantM7021b2 = ((C1240a) hm5Var).m7021b(lm5.f49833b);
            c3509qs.m20137k(lqAnalyticsVariantM7021b2);
        }
        boolean z2 = lqAnalyticsVariantM7021b2.f14399c && !fa4.m11650l(lqAnalyticsVariantM7021b2.f14398b, "not set");
        SharedPreferences.Editor editorEdit4 = sharedPreferences.edit();
        editorEdit4.getClass();
        editorEdit4.putBoolean("active_onboarding_trial_promotion", z2);
        editorEdit4.apply();
        C3244l c3244lM17114d = AbstractC3352my.m17114d(Boolean.TRUE);
        this.f27401z = c3244lM17114d;
        Boolean bool2 = Boolean.FALSE;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(bool2);
        this.f27363A = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(null);
        this.f27364B = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(null);
        this.f27365C = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(bool2);
        this.f27366D = c3244lM17114d5;
        this.f27367E = this.f27390o.m17891d();
        this.f27368F = c3244lM17114d3;
        this.f27369G = c3244lM17114d4;
        this.f27372J = this.f27397v;
        this.f27373K = this.f27400y;
        this.f27374L = this.f27398w;
        this.f27375M = this.f27399x;
        this.f27376N = AbstractC3224d.m15520B(AbstractC3224d.m15531j(AbstractC3224d.m15530i(this.f27392q, this.f27393r, this.f27395t, this.f27396u, this.f27394s, new OnboardingV2ViewModel$uiState$1(null)), c3244lM17114d, c3244lM17114d2, c3244lM17114d5, new OnboardingV2ViewModel$uiState$2(this, null)), lda.m16103C(this), new C3243k(5000L, Long.MAX_VALUE), new lx6(0, u91.m22622n1(OnboardingPage.getEntries()), new OnboardingSelections(null, null, null, 0, 131071), false, false, null, emptyList, false, false));
        fs6 fs6Var4 = this.f27381f;
        C3509qs c3509qs2 = (C3509qs) fs6Var4.f39590b;
        String string3 = c3509qs2.f58118b.getString("onboarding_v2_selections", null);
        if (string3 == null) {
            onboardingSelections = new OnboardingSelections(null, null, null, 0, 131071);
        } else {
            try {
                df4 df4Var2 = (df4) fs6Var4.f39591c;
                df4Var2.getClass();
                onboardingSelections = (OnboardingSelections) df4Var2.m10321a(string3, OnboardingSelections.Companion.serializer());
            } catch (Exception unused3) {
                onboardingSelections = new OnboardingSelections(null, null, null, 0, 131071);
            }
        }
        c3509qs2.f58118b.getInt("onboarding_v2_current_page", 0);
        String str = cx6.f34682a;
        String str2 = onboardingSelections.f27289a;
        str2.getClass();
        cx6.f34682a = str2;
        String serverName = onboardingSelections.f27292d;
        serverName = serverName.length() == 0 ? LearningLevel.Beginner1.getServerName() : serverName;
        serverName.getClass();
        cx6.f34683b = serverName;
        cx6.f34685d = u91.m22626r1(onboardingSelections.f27295g);
        cx6.f34688g = onboardingSelections.f27296h;
        String str3 = onboardingSelections.f27290b;
        cx6.f34687f = str3.length() == 0 ? null : str3;
        C3244l c3244l = this.f27393r;
        c3244l.getClass();
        c3244l.m15572j(null, onboardingSelections);
        cx6.f34684c = m9164a3(onboardingSelections.f27298j);
        if (str2.length() > 0) {
            C3244l c3244l2 = this.f27364B;
            C2223d c2223d2 = this.f27388m;
            c2223d2.getClass();
            qm3 qm3Var = c2223d2.f27471a;
            MiniLessonTemplate miniLessonTemplateM20026a = qm3Var.m20026a(str2);
            c3244l2.m15571i(miniLessonTemplateM20026a == null ? qm3Var.m20026a("en") : miniLessonTemplateM20026a);
            wfb.m23926u(lda.m16103C(this), null, null, new OnboardingV2ViewModel$loadMiniLessonReaderStyle$1(this, str2, null), 3);
        }
        wfb.m23926u(lda.m16103C(this), null, null, new OnboardingV2ViewModel$loadDictionaryLocales$1(this, null), 3);
    }

    /* JADX INFO: renamed from: V2 */
    public static final void m9163V2(C2216d c2216d) {
        C3244l c3244l = c2216d.f27392q;
        Integer numValueOf = Integer.valueOf(OnboardingPage.PERSONALIZING.getIndex());
        c3244l.getClass();
        c3244l.m15572j(null, numValueOf);
        fs6 fs6Var = c2216d.f27381f;
        int iIntValue = ((Number) c3244l.getValue()).intValue();
        SharedPreferences.Editor editorEdit = ((C3509qs) fs6Var.f39590b).f58118b.edit();
        editorEdit.getClass();
        editorEdit.putInt("onboarding_v2_current_page", iIntValue);
        editorEdit.apply();
        if (((Boolean) c2216d.f27398w.getValue()).booleanValue() || ((Boolean) c2216d.f27399x.getValue()).booleanValue()) {
            return;
        }
        wfb.m23926u(lda.m16103C(c2216d), null, null, new OnboardingV2ViewModel$startUserDataFetch$1(c2216d, null), 3);
    }

    /* JADX INFO: renamed from: a3 */
    public static String m9164a3(int i) {
        Object next;
        Iterator<E> it = DailyGoal.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((DailyGoal) next).getMins() != i);
        DailyGoal dailyGoal = (DailyGoal) next;
        int i2 = dailyGoal == null ? -1 : qx6.f58337b[dailyGoal.ordinal()];
        if (i2 == -1) {
            return "";
        }
        if (i2 == 1) {
            return "casual";
        }
        if (i2 == 2) {
            return "steady";
        }
        if (i2 == 3) {
            return "intense";
        }
        if (i2 == 4) {
            return "insane";
        }
        gm5.m12750e();
        return null;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f27377b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f27377b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f27377b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f27377b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f27377b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f27377b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f27377b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f27377b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f27377b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f27377b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f27377b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f27377b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f27377b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f27377b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f27377b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f27377b.mo4586T0();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9165W2() {
        C3509qs c3509qs = (C3509qs) this.f27381f.f39590b;
        SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putString("onboarding_v2_selections", null);
        editorEdit.apply();
        SharedPreferences sharedPreferences = c3509qs.f58118b;
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.getClass();
        editorEdit2.putInt("onboarding_v2_current_page", 0);
        editorEdit2.apply();
        SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
        editorEdit3.getClass();
        editorEdit3.putBoolean("onboarding_v2_registration_completed", false);
        editorEdit3.apply();
        Object obj = !this.f27377b.mo4598w2() ? nx6.f53362a : mx6.f51997a;
        C3244l c3244l = this.f27400y;
        c3244l.getClass();
        c3244l.m15572j(null, obj);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f27377b.mo4587X();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX INFO: renamed from: X2 */
    public final ArrayList m9166X2(String str, String str2, boolean z, boolean z2) {
        ys2 entries = OnboardingPage.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            OnboardingPage onboardingPage = (OnboardingPage) obj;
            boolean zM18284x = false;
            if (onboardingPage == OnboardingPage.DICTIONARY) {
                if (str.length() > 0 && (z2 || str.equals(this.f27390o.m17893g()))) {
                    zM18284x = true;
                }
            } else if (onboardingPage == OnboardingPage.ACCENT) {
                zM18284x = AbstractC3423or.m18284x(str);
            } else if (onboardingPage != OnboardingPage.PAYWALL_CONFIDENCE ? onboardingPage != OnboardingPage.GOALS_LINE ? !onboardingPage.getPraktikaLongOnly() || (z2 && onboardingPage.matchesLevel(str2)) : !z2 : z && !z2) {
                zM18284x = true;
            }
            if (zM18284x) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Y2 */
    public final ArrayList m9167Y2() {
        C3244l c3244l = this.f27393r;
        return m9166X2(((OnboardingSelections) c3244l.getValue()).f27289a, ((OnboardingSelections) c3244l.getValue()).f27292d, ((Boolean) this.f27401z.getValue()).booleanValue(), ((Boolean) this.f27363A.getValue()).booleanValue());
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m9168Z2() {
        Boolean bool = Boolean.FALSE;
        C3244l c3244l = this.f27366D;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        ru6 ru6Var = OnboardingPage.Companion;
        C3244l c3244l2 = this.f27392q;
        int iIntValue = ((Number) c3244l2.getValue()).intValue();
        ru6Var.getClass();
        OnboardingPage onboardingPageM20820a = ru6.m20820a(iIntValue);
        this.f27386k.m4523y(onboardingPageM20820a, (OnboardingSelections) this.f27393r.getValue());
        ArrayList arrayListM9167Y2 = m9167Y2();
        int iIndexOf = arrayListM9167Y2.indexOf(onboardingPageM20820a);
        if (iIndexOf < arrayListM9167Y2.size() - 1) {
            Integer numValueOf = Integer.valueOf(((OnboardingPage) arrayListM9167Y2.get(iIndexOf + 1)).getIndex());
            c3244l2.getClass();
            c3244l2.m15572j(null, numValueOf);
            int iIntValue2 = ((Number) c3244l2.getValue()).intValue();
            SharedPreferences.Editor editorEdit = ((C3509qs) this.f27381f.f39590b).f58118b.edit();
            editorEdit.getClass();
            editorEdit.putInt("onboarding_v2_current_page", iIntValue2);
            editorEdit.apply();
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f27377b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f27377b.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m9169b3() {
        OnboardingSelections onboardingSelections = (OnboardingSelections) this.f27393r.getValue();
        fs6 fs6Var = this.f27381f;
        fs6Var.getClass();
        onboardingSelections.getClass();
        try {
            C3509qs c3509qs = (C3509qs) fs6Var.f39590b;
            df4 df4Var = (df4) fs6Var.f39591c;
            df4Var.getClass();
            String strM10322b = df4Var.m10322b(OnboardingSelections.Companion.serializer(), onboardingSelections);
            SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
            editorEdit.getClass();
            editorEdit.putString("onboarding_v2_selections", strM10322b);
            editorEdit.apply();
        } catch (Exception unused) {
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f27377b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f27377b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f27377b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f27377b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f27377b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f27377b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f27377b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f27377b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f27377b.mo4598w2();
    }
}
