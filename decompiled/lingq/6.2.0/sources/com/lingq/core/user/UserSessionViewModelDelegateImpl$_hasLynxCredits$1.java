package com.lingq.core.user;

import com.lingq.core.domain.model.user.SubscriptionDetails;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.fa4;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$_hasLynxCredits$1", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {126}, m4293m = "invokeSuspend", m4294v = 2)
final class UserSessionViewModelDelegateImpl$_hasLynxCredits$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f24204a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f24205b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ SubscriptionDetails f24206c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserSessionViewModelDelegateImpl$_hasLynxCredits$1 userSessionViewModelDelegateImpl$_hasLynxCredits$1 = new UserSessionViewModelDelegateImpl$_hasLynxCredits$1(3, (Continuation) obj3);
        userSessionViewModelDelegateImpl$_hasLynxCredits$1.f24205b = (e83) obj;
        userSessionViewModelDelegateImpl$_hasLynxCredits$1.f24206c = (SubscriptionDetails) obj2;
        return userSessionViewModelDelegateImpl$_hasLynxCredits$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        e83 e83Var = this.f24205b;
        SubscriptionDetails subscriptionDetails = this.f24206c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24204a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (fa4.m11650l(subscriptionDetails.f19853u, Boolean.FALSE)) {
                Integer num = subscriptionDetails.f19851s;
                if ((num != null ? num.intValue() : 1) > 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            this.f24205b = null;
            this.f24206c = null;
            this.f24204a = 1;
            if (e83Var.emit(boolValueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
