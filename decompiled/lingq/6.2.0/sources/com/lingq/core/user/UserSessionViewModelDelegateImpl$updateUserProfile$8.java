package com.lingq.core.user;

import com.lingq.core.data.repository.C1307w;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$updateUserProfile$8", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {161, 162}, m4293m = "invokeSuspend", m4294v = 2)
final class UserSessionViewModelDelegateImpl$updateUserProfile$8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1939a f24276b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$updateUserProfile$8(C1939a c1939a, Continuation continuation) {
        super(2, continuation);
        this.f24276b = c1939a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserSessionViewModelDelegateImpl$updateUserProfile$8(this.f24276b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserSessionViewModelDelegateImpl$updateUserProfile$8) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1307w c1307w = this.f24276b.f24296h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24275a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f24275a = 1;
            Object objM7386a = c1307w.m7386a(this);
            if (objM7386a != coroutineSingletons) {
                objM7386a = xfaVar;
            }
            if (objM7386a != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        this.f24275a = 2;
        return c1307w.m7397l(this) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
