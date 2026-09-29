package com.lingq.p020ui;

import com.lingq.R$string;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$ValueOnOrNot;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.user.Profile;
import java.util.Arrays;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.RunnableC3470pr;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.fa4;
import p000.fr5;
import p000.hm5;
import p000.iw7;
import p000.lda;
import p000.r43;
import p000.tp1;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xu3;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$2", m4291f = "HomeFragment.kt", m4292l = {250}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeFragment$onViewCreated$5$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33909a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HomeFragment f33910b;

    /* JADX INFO: renamed from: com.lingq.ui.HomeFragment$onViewCreated$5$2$1 */
    @c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$2$1", m4291f = "HomeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28731 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33911a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeFragment f33912b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28731(HomeFragment homeFragment, Continuation continuation) {
            super(2, continuation);
            this.f33912b = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28731 c28731 = new C28731(this.f33912b, continuation);
            c28731.f33911a = obj;
            return c28731;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28731 c28731 = (C28731) create((Profile) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28731.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Profile profile = (Profile) this.f33911a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int i = profile.f19652a;
            if (i != 0) {
                HomeFragment homeFragment = this.f33912b;
                hm5 hm5Var = homeFragment.f33893I0;
                if (hm5Var == null) {
                    fa4.m11636J("analytics");
                    throw null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                ((C1240a) hm5Var).m7026g(sb.toString());
                hm5 hm5Var2 = homeFragment.f33893I0;
                if (hm5Var2 == null) {
                    fa4.m11636J("analytics");
                    throw null;
                }
                ((C1240a) hm5Var2).m7027h("app", "LingQ");
                hm5 hm5Var3 = homeFragment.f33893I0;
                if (hm5Var3 == null) {
                    fa4.m11636J("analytics");
                    throw null;
                }
                ((C1240a) hm5Var3).m7027h("is_premium", (homeFragment.m9798k0().f34167b.mo4593p0() ? LqAnalyticsValues$ValueOnOrNot.Yes : LqAnalyticsValues$ValueOnOrNot.No).getValue());
                C2888d c2888dM9798k0 = homeFragment.m9798k0();
                c2888dM9798k0.getClass();
                wfb.m23926u(lda.m16103C(c2888dM9798k0), null, null, new HomeViewModel$setHighlightingColorUserProperty$1(c2888dM9798k0, null), 3);
                if (fa4.m11650l(profile.f19667p, profile.f19666o)) {
                    int i2 = 0;
                    if (!homeFragment.m9796i0().f58118b.getBoolean("checked_for_dictionary_3", false) && !homeFragment.f33892H0) {
                        if (homeFragment.m9798k0().mo8744P0(TooltipStep.Finished)) {
                            fr5 fr5Var = new fr5(homeFragment.m2090R());
                            fr5Var.m12027j(homeFragment.m2111m(R$string.card_check_dictionary));
                            Locale locale = Locale.getDefault();
                            String strM2111m = homeFragment.m2111m(R$string.texts_learning_matches_dictionary);
                            strM2111m.getClass();
                            fr5Var.m12021d(String.format(locale, strM2111m, Arrays.copyOf(new Object[]{AbstractC3352my.m17093L(homeFragment.m2090R(), profile.f19666o)}, 1)));
                            fr5Var.m12026i(homeFragment.m2111m(com.lingq.core.p012ui.R$string.ui_yes), new xu3(homeFragment, profile, i2));
                            fr5Var.m12023f(homeFragment.m2111m(com.lingq.core.p012ui.R$string.ui_no), new iw7(5, homeFragment));
                            fr5Var.m25557a();
                        }
                        homeFragment.f33892H0 = true;
                    }
                }
                r43 r43VarM20289a = r43.m20289a();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                String string = sb2.toString();
                tp1 tp1Var = r43VarM20289a.f58599a;
                tp1Var.f62668o.f13668a.m9855a(new RunnableC3470pr(10, tp1Var, string));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$5$2(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f33910b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$onViewCreated$5$2(this.f33910b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeFragment$onViewCreated$5$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33909a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = HomeFragment.f33886N0;
            HomeFragment homeFragment = this.f33910b;
            c83 c83VarMo4574C1 = homeFragment.m9798k0().f34167b.mo4574C1();
            C28731 c28731 = new C28731(homeFragment, null);
            this.f33909a = 1;
            if (AbstractC3224d.m15529h(c83VarMo4574C1, c28731, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
