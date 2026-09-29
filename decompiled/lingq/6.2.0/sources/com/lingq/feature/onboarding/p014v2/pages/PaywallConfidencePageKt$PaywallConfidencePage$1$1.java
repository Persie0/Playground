package com.lingq.feature.onboarding.p014v2.pages;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.qc9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.pages.PaywallConfidencePageKt$PaywallConfidencePage$1$1", m4291f = "PaywallConfidencePage.kt", m4292l = {62}, m4293m = "invokeSuspend", m4294v = 2)
final class PaywallConfidencePageKt$PaywallConfidencePage$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qc9 f27489b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallConfidencePageKt$PaywallConfidencePage$1$1(qc9 qc9Var, Continuation continuation) {
        super(2, continuation);
        this.f27489b = qc9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaywallConfidencePageKt$PaywallConfidencePage$1$1(this.f27489b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PaywallConfidencePageKt$PaywallConfidencePage$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27488a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f27488a = 1;
            if (AbstractC3208a.m15437d(300L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f27489b.m19862i(1.0f);
        return xfa.f68157a;
    }
}
