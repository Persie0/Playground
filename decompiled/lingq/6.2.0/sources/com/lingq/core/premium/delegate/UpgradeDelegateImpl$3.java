package com.lingq.core.premium.delegate;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.premium.delegate.UpgradeDelegateImpl$3", m4291f = "UpgradeDelegate.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeDelegateImpl$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22438a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1845b f22439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeDelegateImpl$3(C1845b c1845b, Continuation continuation) {
        super(2, continuation);
        this.f22439b = c1845b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeDelegateImpl$3 upgradeDelegateImpl$3 = new UpgradeDelegateImpl$3(this.f22439b, continuation);
        upgradeDelegateImpl$3.f22438a = obj;
        return upgradeDelegateImpl$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UpgradeDelegateImpl$3 upgradeDelegateImpl$3 = (UpgradeDelegateImpl$3) create((UpgradeTier) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        upgradeDelegateImpl$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        UpgradeTier upgradeTier = (UpgradeTier) this.f22438a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f22439b.f22474N;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, upgradeTier));
        return xfa.f68157a;
    }
}
