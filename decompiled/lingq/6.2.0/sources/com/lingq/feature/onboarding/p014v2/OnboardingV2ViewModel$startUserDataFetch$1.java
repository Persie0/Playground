package com.lingq.feature.onboarding.p014v2;

import android.content.SharedPreferences;
import com.lingq.feature.onboarding.domain.C2207a;
import com.lingq.feature.onboarding.p014v2.domain.C2220a;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3509qs;
import p000.c32;
import p000.cx6;
import p000.fs6;
import p000.st6;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.OnboardingV2ViewModel$startUserDataFetch$1", m4291f = "OnboardingV2ViewModel.kt", m4292l = {463}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingV2ViewModel$startUserDataFetch$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27334a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2216d f27335b;

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.OnboardingV2ViewModel$startUserDataFetch$1$1 */
    @c32(m4290c = "com.lingq.feature.onboarding.v2.OnboardingV2ViewModel$startUserDataFetch$1$1", m4291f = "OnboardingV2ViewModel.kt", m4292l = {472, 480}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22121 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f27336a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2216d f27337b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f27338c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ OnboardingSelections f27339d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22121(C2216d c2216d, List list, OnboardingSelections onboardingSelections, Continuation continuation) {
            super(2, continuation);
            this.f27337b = c2216d;
            this.f27338c = list;
            this.f27339d = onboardingSelections;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C22121(this.f27337b, this.f27338c, this.f27339d, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C22121) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r12.m12088A(r13, r11.f27339d, r11) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C22121 c22121;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f27336a;
            C2216d c2216d = this.f27337b;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    c22121 = this;
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            C2220a c2220a = c2216d.f27382g;
            String str = cx6.f34682a;
            String str2 = cx6.f34683b;
            String str3 = cx6.f34686e;
            String str4 = cx6.f34684c;
            Set set = cx6.f34685d;
            this.f27336a = 1;
            c22121 = this;
            if (c2220a.m9170a(str, str2, str3, str4, set, this.f27338c, c22121) != coroutineSingletons) {
            }
            return coroutineSingletons;
            fs6 fs6Var = c2216d.f27383h;
            String str5 = cx6.f34682a;
            c22121.f27336a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingV2ViewModel$startUserDataFetch$1(C2216d c2216d, Continuation continuation) {
        super(2, continuation);
        this.f27335b = c2216d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingV2ViewModel$startUserDataFetch$1(this.f27335b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingV2ViewModel$startUserDataFetch$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27334a;
        C2216d c2216d = this.f27335b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = c2216d.f27398w;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            C3244l c3244l2 = c2216d.f27399x;
            Boolean bool2 = Boolean.FALSE;
            c3244l2.getClass();
            c3244l2.m15572j(null, bool2);
            C2207a c2207a = c2216d.f27384i;
            this.f27334a = 1;
            obj = c2207a.m9136a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3244l c3244l3 = c2216d.f27398w;
        C3244l c3244l4 = c2216d.f27392q;
        Boolean bool3 = Boolean.FALSE;
        c3244l3.getClass();
        c3244l3.m15572j(null, bool3);
        if (((ym5) obj) instanceof xm5) {
            C3244l c3244l5 = c2216d.f27399x;
            Boolean bool4 = Boolean.TRUE;
            c3244l5.getClass();
            c3244l5.m15572j(null, bool4);
            OnboardingSelections onboardingSelections = (OnboardingSelections) c2216d.f27393r.getValue();
            wfb.m23926u(c2216d.f27391p, null, null, new C22121(c2216d, onboardingSelections.f27305q, onboardingSelections, null), 3);
            c2216d.f27385j.m9173a();
        } else {
            Integer num = new Integer(OnboardingPage.SIGN_UP.getIndex());
            c3244l4.getClass();
            c3244l4.m15572j(null, num);
            fs6 fs6Var = c2216d.f27381f;
            int iIntValue = ((Number) c3244l4.getValue()).intValue();
            SharedPreferences.Editor editorEdit = ((C3509qs) fs6Var.f39590b).f58118b.edit();
            editorEdit.getClass();
            editorEdit.putInt("onboarding_v2_current_page", iIntValue);
            editorEdit.apply();
            C3244l c3244l6 = c2216d.f27396u;
            st6 st6Var = new st6();
            c3244l6.getClass();
            c3244l6.m15572j(null, st6Var);
        }
        return xfa.f68157a;
    }
}
