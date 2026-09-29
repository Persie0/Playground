package com.lingq.core.premium.delegate;

import com.android.billingclient.api.Purchase;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.u91;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.premium.delegate.UpgradeDelegateImpl$2", m4291f = "UpgradeDelegate.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeDelegateImpl$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ProfileAccount f22435a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Purchase f22436b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1845b f22437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeDelegateImpl$2(C1845b c1845b, Continuation continuation) {
        super(3, continuation);
        this.f22437c = c1845b;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UpgradeDelegateImpl$2 upgradeDelegateImpl$2 = new UpgradeDelegateImpl$2(this.f22437c, (Continuation) obj3);
        upgradeDelegateImpl$2.f22435a = (ProfileAccount) obj;
        upgradeDelegateImpl$2.f22436b = (Purchase) obj2;
        return upgradeDelegateImpl$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProfileAccount profileAccount = this.f22435a;
        Purchase purchase = this.f22436b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        boolean zM8139b = profileAccount.m8139b();
        String str = purchase != null ? (String) u91.m22591I0(purchase.m5176a()) : null;
        if (!zM8139b) {
            return UpgradeTier.FREE;
        }
        if (str == null) {
            return UpgradeTier.PREMIUM_NOT_GOOGLE;
        }
        C1845b c1845b = this.f22437c;
        if (str.equals(c1845b.f22481f)) {
            return UpgradeTier.PREMIUM_1_MONTH;
        }
        if (str.equals(c1845b.f22482g)) {
            return UpgradeTier.PREMIUM_6_MONTH;
        }
        if (str.equals(c1845b.f22483h)) {
            return UpgradeTier.PREMIUM_YEAR;
        }
        if (str.equals(c1845b.f22484i)) {
            return UpgradeTier.PREMIUM_1_MONTH_PLUS;
        }
        return str.equals(c1845b.f22485j) ? UpgradeTier.PREMIUM_YEAR_PLUS : UpgradeTier.PREMIUM_NOT_GOOGLE;
    }
}
