package com.lingq.feature.more;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.v26;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.more.MoreViewModel$updateNotifications$1", m4291f = "MoreViewModel.kt", m4292l = {43}, m4293m = "invokeSuspend", m4294v = 2)
final class MoreViewModel$updateNotifications$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v26 f26832b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreViewModel$updateNotifications$1(v26 v26Var, Continuation continuation) {
        super(2, continuation);
        this.f26832b = v26Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoreViewModel$updateNotifications$1(this.f26832b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreViewModel$updateNotifications$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26831a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f26831a = 1;
            if (this.f26832b.f64734c.mo7007X0(this) == coroutineSingletons) {
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
