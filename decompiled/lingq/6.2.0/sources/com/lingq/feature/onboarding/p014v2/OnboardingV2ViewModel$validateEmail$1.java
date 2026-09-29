package com.lingq.feature.onboarding.p014v2;

import com.lingq.feature.onboarding.p014v2.domain.C2226g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.gm5;
import p000.i48;
import p000.rna;
import p000.sna;
import p000.tna;
import p000.um5;
import p000.un1;
import p000.una;
import p000.xfa;
import p000.xm5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.OnboardingV2ViewModel$validateEmail$1", m4291f = "OnboardingV2ViewModel.kt", m4292l = {321, 322}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingV2ViewModel$validateEmail$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27350a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2216d f27351b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27352c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingV2ViewModel$validateEmail$1(C2216d c2216d, String str, Continuation continuation) {
        super(2, continuation);
        this.f27351b = c2216d;
        this.f27352c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingV2ViewModel$validateEmail$1(this.f27351b, this.f27352c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingV2ViewModel$validateEmail$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r9 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27350a;
        C2216d c2216d = this.f27351b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f27350a = 1;
            if (AbstractC3208a.m15437d(500L, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        una unaVar = (una) obj;
        boolean z = unaVar instanceof tna;
        xfa xfaVar = xfa.f68157a;
        if (z) {
            C3244l c3244l = c2216d.f27397v;
            xm5 xm5Var = new xm5(xfaVar);
            c3244l.getClass();
            c3244l.m15572j(null, xm5Var);
            return xfaVar;
        }
        if (!(unaVar instanceof rna)) {
            if (unaVar instanceof sna) {
                return xfaVar;
            }
            gm5.m12750e();
            return null;
        }
        C3244l c3244l2 = c2216d.f27397v;
        um5 um5Var = new um5(new i48(0, ((rna) unaVar).f59597a, 1));
        c3244l2.getClass();
        c3244l2.m15572j(null, um5Var);
        return xfaVar;
        C2226g c2226g = c2216d.f27380e;
        this.f27350a = 2;
        obj = c2226g.m9179a(this.f27352c, this);
    }
}
