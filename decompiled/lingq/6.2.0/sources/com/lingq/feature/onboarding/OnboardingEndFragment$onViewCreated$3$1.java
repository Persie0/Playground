package com.lingq.feature.onboarding;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LanguageLevels;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import com.lingq.core.domain.model.LearningLevel;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.C3386nv;
import p000.C3509qs;
import p000.ac6;
import p000.b34;
import p000.c18;
import p000.c32;
import p000.cx6;
import p000.fa4;
import p000.hm5;
import p000.hy3;
import p000.jfa;
import p000.pa6;
import p000.qt6;
import p000.u91;
import p000.ud6;
import p000.un1;
import p000.w41;
import p000.wfb;
import p000.wm5;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zb6;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndFragment$onViewCreated$3$1", m4291f = "OnboardingEndFragment.kt", m4292l = {130}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndFragment$onViewCreated$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OnboardingEndFragment f26921b;

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.OnboardingEndFragment$onViewCreated$3$1$1 */
    @c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndFragment$onViewCreated$3$1$1", m4291f = "OnboardingEndFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21711 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26922a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OnboardingEndFragment f26923b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21711(OnboardingEndFragment onboardingEndFragment, Continuation continuation) {
            super(2, continuation);
            this.f26923b = onboardingEndFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21711 c21711 = new C21711(this.f26923b, continuation);
            c21711.f26922a = obj;
            return c21711;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21711 c21711 = (C21711) create((ym5) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21711.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            String value2;
            OnboardingEndFragment onboardingEndFragment = this.f26923b;
            w41 w41Var = onboardingEndFragment.f26908C0;
            ym5 ym5Var = (ym5) this.f26922a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (ym5Var instanceof xm5) {
                C3244l c3244l = ((C2197b) w41Var.getValue()).f27176q;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, wm5.f67054a));
                C2197b c2197b = (C2197b) w41Var.getValue();
                String str = cx6.f34682a;
                String str2 = cx6.f34684c;
                str2.getClass();
                wfb.m23926u(c2197b.f27173n, null, null, new OnboardingEndViewModel$updateLanguageIntensity$1(c2197b, str, str2, null), 3);
                if (!cx6.f34685d.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("topics", u91.m22596N0(cx6.f34685d, null, null, null, null, 63));
                    hm5 hm5Var = onboardingEndFragment.f26910E0;
                    if (hm5Var == null) {
                        fa4.m11636J("analytics");
                        throw null;
                    }
                    ((C1240a) hm5Var).m7025f("Topics Chosen", bundle);
                    C2197b c2197b2 = (C2197b) w41Var.getValue();
                    String str3 = cx6.f34682a;
                    Set set = cx6.f34685d;
                    set.getClass();
                    wfb.m23926u(c2197b2.f27173n, null, null, new OnboardingEndViewModel$updateTopics$1(c2197b2, str3, set, null), 3);
                }
                C2197b c2197b3 = (C2197b) w41Var.getValue();
                wfb.m23926u(c2197b3.f27173n, null, null, new OnboardingEndViewModel$setUserId$1(c2197b3, null), 3);
                C3509qs c3509qs = onboardingEndFragment.f26911F0;
                if (c3509qs == null) {
                    fa4.m11636J("appSettings");
                    throw null;
                }
                String string = c3509qs.f58118b.getString("registerData2", "");
                if (string == null) {
                    string = "";
                }
                if (string.length() > 0) {
                    C2197b c2197b4 = (C2197b) w41Var.getValue();
                    C3509qs c3509qs2 = onboardingEndFragment.f26911F0;
                    if (c3509qs2 == null) {
                        fa4.m11636J("appSettings");
                        throw null;
                    }
                    String string2 = c3509qs2.f58118b.getString("registerData2", "");
                    if (string2 == null) {
                        string2 = "";
                    }
                    hm5 hm5Var2 = c2197b4.f27172m;
                    Bundle bundle2 = new Bundle();
                    String str4 = cx6.f34682a;
                    bundle2.putString("Registration client", "android");
                    bundle2.putString("Registration date", hy3.f43148E.m14766a(new DateTime()));
                    bundle2.putString("Registration language", str4);
                    bundle2.putString("Registration method", string2);
                    bundle2.putString("Referral code", cx6.f34686e);
                    String str5 = cx6.f34683b;
                    if (fa4.m11650l(str5, LearningLevel.Beginner1.getServerName())) {
                        value2 = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                    } else if (fa4.m11650l(str5, LearningLevel.Intermediate1.getServerName())) {
                        value2 = LqAnalyticsValues$LanguageLevels.Intermediate1.getValue();
                    } else {
                        value2 = fa4.m11650l(str5, LearningLevel.Advanced1.getServerName()) ? LqAnalyticsValues$LanguageLevels.Advanced1.getValue() : LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                    }
                    bundle2.putString("Registration level", value2);
                    C1240a c1240a = (C1240a) hm5Var2;
                    c1240a.m7025f("Registration confirmed", bundle2);
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("Registration method", string2);
                    c1240a.m7025f("registration account created", bundle3);
                    C3509qs c3509qs3 = onboardingEndFragment.f26911F0;
                    if (c3509qs3 == null) {
                        fa4.m11636J("appSettings");
                        throw null;
                    }
                    c3509qs3.m20138l("");
                }
                C2197b c2197b5 = (C2197b) w41Var.getValue();
                wfb.m23926u(c2197b5.f27169j, null, null, new OnboardingEndViewModel$initLibrary$1(c2197b5, null), 3);
                if (((C2197b) w41Var.getValue()).f27161b.mo4598w2()) {
                    ud6 ud6VarM3244j = b34.m3244j(onboardingEndFragment);
                    qt6.Companion.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j, zb6.m25538a(), null);
                } else {
                    w41 w41Var2 = onboardingEndFragment.f26912G0;
                    if (w41Var2 == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    w41Var2.m23737z(new pa6(LqAnalyticsValues$UpgradePopupSource.Registration.getValue(), 14, null));
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEndFragment$onViewCreated$3$1(OnboardingEndFragment onboardingEndFragment, Continuation continuation) {
        super(2, continuation);
        this.f26921b = onboardingEndFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingEndFragment$onViewCreated$3$1(this.f26921b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingEndFragment$onViewCreated$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26920a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            OnboardingEndFragment onboardingEndFragment = this.f26921b;
            c18 c18Var = ((C2197b) onboardingEndFragment.f26908C0.getValue()).f27177r;
            C21711 c21711 = new C21711(onboardingEndFragment, null);
            c18Var.getClass();
            this.f26920a = 1;
            if (AbstractC3224d.m15529h(c18Var, c21711, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
