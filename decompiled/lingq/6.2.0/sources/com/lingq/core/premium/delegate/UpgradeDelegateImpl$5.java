package com.lingq.core.premium.delegate;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.premium.delegate.UpgradeDelegateImpl$5", m4291f = "UpgradeDelegate.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeDelegateImpl$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22446a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1845b f22447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeDelegateImpl$5(C1845b c1845b, Continuation continuation) {
        super(2, continuation);
        this.f22447b = c1845b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeDelegateImpl$5 upgradeDelegateImpl$5 = new UpgradeDelegateImpl$5(this.f22447b, continuation);
        upgradeDelegateImpl$5.f22446a = obj;
        return upgradeDelegateImpl$5;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UpgradeDelegateImpl$5 upgradeDelegateImpl$5 = (UpgradeDelegateImpl$5) create((String) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        upgradeDelegateImpl$5.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        String str = (String) this.f22446a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1845b c1845b = this.f22447b;
        C3244l c3244l = c1845b.f22470J;
        do {
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.valueOf(vk9.m23380c0(str, "-tr", false) || vk9.m23380c0(str, "lq-basetrial", false))));
        C3244l c3244l2 = c1845b.f22488m;
        do {
            value2 = c3244l2.getValue();
        } while (!c3244l2.m15570h(value2, str));
        return xfa.f68157a;
    }
}
