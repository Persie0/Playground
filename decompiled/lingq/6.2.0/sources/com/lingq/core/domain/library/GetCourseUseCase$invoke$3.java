package com.lingq.core.domain.library;

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
@c32(m4290c = "com.lingq.core.domain.library.GetCourseUseCase$invoke$3", m4291f = "GetCourseUseCase.kt", m4292l = {29}, m4293m = "invokeSuspend", m4294v = 2)
final class GetCourseUseCase$invoke$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f18750a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f18751b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetCourseUseCase$invoke$3 getCourseUseCase$invoke$3 = new GetCourseUseCase$invoke$3(3, (Continuation) obj3);
        getCourseUseCase$invoke$3.f18751b = (e83) obj;
        return getCourseUseCase$invoke$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f18751b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18750a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f18751b = null;
            this.f18750a = 1;
            if (e83Var.emit(null, this) == coroutineSingletons) {
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
