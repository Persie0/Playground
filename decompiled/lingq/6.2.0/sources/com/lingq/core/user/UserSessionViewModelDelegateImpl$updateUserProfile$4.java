package com.lingq.core.user;

import com.lingq.core.data.profile.C1267a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.km7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$updateUserProfile$4", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {142}, m4293m = "invokeSuspend", m4294v = 2)
final class UserSessionViewModelDelegateImpl$updateUserProfile$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24267a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1939a f24268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$updateUserProfile$4(C1939a c1939a, Continuation continuation) {
        super(2, continuation);
        this.f24268b = c1939a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserSessionViewModelDelegateImpl$updateUserProfile$4(this.f24268b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserSessionViewModelDelegateImpl$updateUserProfile$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24267a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            km7 km7Var = this.f24268b.f24289a;
            this.f24267a = 1;
            if (((C1267a) km7Var).m7074c(this) == coroutineSingletons) {
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
