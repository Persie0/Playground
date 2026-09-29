package com.lingq.core.premium;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.wia;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.UpgradeViewModel$12", m4291f = "UpgradeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeViewModel$12 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22391a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeViewModel$12 upgradeViewModel$12 = new UpgradeViewModel$12(2, continuation);
        upgradeViewModel$12.f22391a = obj;
        return upgradeViewModel$12;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeViewModel$12) create((wia) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        wia wiaVar = (wia) this.f22391a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf(wiaVar.f66893r);
    }
}
