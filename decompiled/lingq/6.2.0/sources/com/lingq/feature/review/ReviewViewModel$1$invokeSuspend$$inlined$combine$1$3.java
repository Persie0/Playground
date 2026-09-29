package com.lingq.feature.review;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$1$invokeSuspend$$inlined$combine$1$3", m4291f = "ReviewViewModel.kt", m4292l = {234}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReviewViewModel$1$invokeSuspend$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f31820a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f31821b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f31822c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReviewViewModel$1$invokeSuspend$$inlined$combine$1$3 reviewViewModel$1$invokeSuspend$$inlined$combine$1$3 = new ReviewViewModel$1$invokeSuspend$$inlined$combine$1$3(3, (Continuation) obj3);
        reviewViewModel$1$invokeSuspend$$inlined$combine$1$3.f31821b = (e83) obj;
        reviewViewModel$1$invokeSuspend$$inlined$combine$1$3.f31822c = (Object[]) obj2;
        return reviewViewModel$1$invokeSuspend$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f31821b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31820a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        this.f31821b = null;
        this.f31822c = null;
        this.f31820a = 1;
        return e83Var.emit(xfaVar, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
