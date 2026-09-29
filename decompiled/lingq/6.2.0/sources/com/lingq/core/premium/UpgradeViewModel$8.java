package com.lingq.core.premium;

import com.android.billingclient.api.Purchase;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.wia;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.UpgradeViewModel$8", m4291f = "UpgradeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeViewModel$8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1853l f22406a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeViewModel$8(C1853l c1853l, Continuation continuation) {
        super(2, continuation);
        this.f22406a = c1853l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpgradeViewModel$8(this.f22406a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UpgradeViewModel$8 upgradeViewModel$8 = (UpgradeViewModel$8) create((Purchase) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        upgradeViewModel$8.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f22406a.f22544h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, null, null, false, null, null, null, true, false, false, null, false, 2064383)));
        return xfa.f68157a;
    }
}
