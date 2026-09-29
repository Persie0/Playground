package com.lingq.core.premium.delegate;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.fa4;
import p000.h0a;
import p000.rm5;
import p000.rn7;
import p000.sm5;
import p000.sn7;
import p000.up6;
import p000.ux5;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.premium.delegate.PromoBannerDelegateImpl$1", m4291f = "PromoBannerDelegate.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PromoBannerDelegateImpl$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f22422a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ UpgradeTier f22423b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ up6 f22424c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f22425d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        PromoBannerDelegateImpl$1 promoBannerDelegateImpl$1 = new PromoBannerDelegateImpl$1(5, (Continuation) obj5);
        promoBannerDelegateImpl$1.f22422a = (Map) obj;
        promoBannerDelegateImpl$1.f22423b = (UpgradeTier) obj2;
        promoBannerDelegateImpl$1.f22424c = (up6) obj3;
        promoBannerDelegateImpl$1.f22425d = (String) obj4;
        return promoBannerDelegateImpl$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f22422a;
        UpgradeTier upgradeTier = this.f22423b;
        up6 up6Var = this.f22424c;
        String str = this.f22425d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String strM22854b = up6Var != null ? up6Var.m22854b() : "";
        boolean z = up6Var != null;
        boolean zM11650l = fa4.m11650l(map.get(strM22854b), Boolean.TRUE);
        boolean z2 = !z ? upgradeTier != UpgradeTier.FREE : zM11650l;
        boolean z3 = upgradeTier != UpgradeTier.FREE;
        rm5 rm5Var = sm5.Companion;
        StringBuilder sb = new StringBuilder("[Offers] PromoBanner userTier=");
        sb.append(upgradeTier);
        sb.append(" hasOffer=");
        sb.append(z);
        sb.append(" promoCode=");
        ux5.m22976C(strM22854b, " dismissed=", " → canShowBanner=", sb, zM11650l);
        sb.append(z2);
        sb.append(" canShowClose=");
        sb.append(z3);
        String string = sb.toString();
        rm5Var.getClass();
        h0a.f41641a.mo11430a(string, new Object[0]);
        return new rn7(z2, z3, new sn7(z2, up6Var, str));
    }
}
