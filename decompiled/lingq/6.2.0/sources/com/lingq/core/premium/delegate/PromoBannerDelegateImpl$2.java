package com.lingq.core.premium.delegate;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.rn7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.premium.delegate.PromoBannerDelegateImpl$2", m4291f = "PromoBannerDelegate.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PromoBannerDelegateImpl$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1844a f22427b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoBannerDelegateImpl$2(C1844a c1844a, Continuation continuation) {
        super(2, continuation);
        this.f22427b = c1844a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PromoBannerDelegateImpl$2 promoBannerDelegateImpl$2 = new PromoBannerDelegateImpl$2(this.f22427b, continuation);
        promoBannerDelegateImpl$2.f22426a = obj;
        return promoBannerDelegateImpl$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PromoBannerDelegateImpl$2 promoBannerDelegateImpl$2 = (PromoBannerDelegateImpl$2) create((rn7) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        promoBannerDelegateImpl$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        rn7 rn7Var = (rn7) this.f22426a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f22427b.f22459c;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, rn7Var));
        return xfa.f68157a;
    }
}
