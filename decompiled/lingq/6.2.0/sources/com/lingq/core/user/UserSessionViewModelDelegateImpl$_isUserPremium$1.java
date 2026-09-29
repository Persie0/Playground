package com.lingq.core.user;

import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$_isUserPremium$1", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {70}, m4293m = "invokeSuspend", m4294v = 2)
final class UserSessionViewModelDelegateImpl$_isUserPremium$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f24228a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f24229b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ProfileAccount f24230c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserSessionViewModelDelegateImpl$_isUserPremium$1 userSessionViewModelDelegateImpl$_isUserPremium$1 = new UserSessionViewModelDelegateImpl$_isUserPremium$1(3, (Continuation) obj3);
        userSessionViewModelDelegateImpl$_isUserPremium$1.f24229b = (e83) obj;
        userSessionViewModelDelegateImpl$_isUserPremium$1.f24230c = (ProfileAccount) obj2;
        return userSessionViewModelDelegateImpl$_isUserPremium$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f24229b;
        ProfileAccount profileAccount = this.f24230c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24228a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Boolean boolValueOf = Boolean.valueOf(profileAccount.m8139b());
            this.f24229b = null;
            this.f24230c = null;
            this.f24228a = 1;
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
