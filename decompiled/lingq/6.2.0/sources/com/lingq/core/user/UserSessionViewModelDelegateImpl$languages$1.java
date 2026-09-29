package com.lingq.core.user;

import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$languages$1", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {180}, m4293m = "invokeSuspend", m4294v = 2)
final class UserSessionViewModelDelegateImpl$languages$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f24242a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f24243b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1939a f24244c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$languages$1(C1939a c1939a, Continuation continuation) {
        super(3, continuation);
        this.f24244c = c1939a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserSessionViewModelDelegateImpl$languages$1 userSessionViewModelDelegateImpl$languages$1 = new UserSessionViewModelDelegateImpl$languages$1(this.f24244c, (Continuation) obj3);
        userSessionViewModelDelegateImpl$languages$1.f24243b = (e83) obj;
        return userSessionViewModelDelegateImpl$languages$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f24243b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24242a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM7216m = ((C1293i) this.f24244c.f24290b).m7216m();
            this.f24243b = null;
            this.f24242a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7216m, this) == coroutineSingletons) {
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
