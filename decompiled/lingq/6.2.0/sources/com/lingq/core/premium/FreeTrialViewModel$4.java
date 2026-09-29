package com.lingq.core.premium;

import com.lingq.core.domain.model.offer.BannerType;
import com.lingq.core.domain.model.offer.OfferBanner;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.rn7;
import p000.up6;
import p000.wh3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.FreeTrialViewModel$4", m4291f = "FreeTrialViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FreeTrialViewModel$4 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ up6 f22334a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ rn7 f22335b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FreeTrialViewModel$4 freeTrialViewModel$4 = new FreeTrialViewModel$4(3, (Continuation) obj3);
        freeTrialViewModel$4.f22334a = (up6) obj;
        freeTrialViewModel$4.f22335b = (rn7) obj2;
        return freeTrialViewModel$4.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        OfferBanner offerBannerM22853a;
        up6 up6Var = this.f22334a;
        rn7 rn7Var = this.f22335b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = up6Var != null ? up6Var.f64190r : null;
        if (str == null) {
            str = "";
        }
        String str2 = (up6Var == null || (offerBannerM22853a = up6Var.m22853a(BannerType.TRIAL, rn7Var.f59593c.f61065c)) == null) ? null : offerBannerM22853a.f19546b;
        return new wh3(str2 != null ? str2 : "", str, str.equals("Unlock all Premium features and make real progress") ? Integer.valueOf(R$string.cup_promo_trial_header) : null);
    }
}
