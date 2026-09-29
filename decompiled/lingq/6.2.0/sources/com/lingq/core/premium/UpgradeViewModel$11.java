package com.lingq.core.premium;

import com.lingq.core.premium.delegate.UpgradeTier;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.aja;
import p000.c32;
import p000.wia;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.UpgradeViewModel$11", m4291f = "UpgradeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeViewModel$11 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1853l f22390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeViewModel$11(C1853l c1853l, Continuation continuation) {
        super(2, continuation);
        this.f22390b = c1853l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeViewModel$11 upgradeViewModel$11 = new UpgradeViewModel$11(this.f22390b, continuation);
        upgradeViewModel$11.f22389a = obj;
        return upgradeViewModel$11;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UpgradeViewModel$11 upgradeViewModel$11 = (UpgradeViewModel$11) create((UpgradeTier) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        upgradeViewModel$11.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        UpgradeUserType upgradeUserType;
        Object value;
        UpgradeTier upgradeTier = (UpgradeTier) this.f22389a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        int i = aja.f732a[upgradeTier.ordinal()];
        C1853l c1853l = this.f22390b;
        if (i == 1 || i == 2 || i == 3) {
            upgradeUserType = UpgradeUserType.Premium;
        } else if (i == 4 || i == 5) {
            upgradeUserType = UpgradeUserType.Downgrade;
        } else {
            upgradeUserType = (c1853l.f22548l && c1853l.mo8550F2(null)) ? UpgradeUserType.FreeTrial : UpgradeUserType.Free;
        }
        UpgradeUserType upgradeUserType2 = upgradeUserType;
        C3244l c3244l = c1853l.f22544h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, null, null, false, upgradeUserType2, null, null, false, false, false, null, false, 2096895)));
        return xfa.f68157a;
    }
}
