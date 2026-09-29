package com.lingq.core.user;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$_canCreateLingQs$1", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UserSessionViewModelDelegateImpl$_canCreateLingQs$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f24197a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserSessionViewModelDelegateImpl$_canCreateLingQs$1 userSessionViewModelDelegateImpl$_canCreateLingQs$1 = new UserSessionViewModelDelegateImpl$_canCreateLingQs$1(2, continuation);
        userSessionViewModelDelegateImpl$_canCreateLingQs$1.f24197a = ((Boolean) obj).booleanValue();
        return userSessionViewModelDelegateImpl$_canCreateLingQs$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((UserSessionViewModelDelegateImpl$_canCreateLingQs$1) create(bool, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f24197a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf(z);
    }
}
