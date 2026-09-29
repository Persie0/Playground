package com.lingq.core.domain.library;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;
import p000.xo1;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetCourseUseCase$invoke$2", m4291f = "GetCourseUseCase.kt", m4292l = {28}, m4293m = "invokeSuspend", m4294v = 2)
final class GetCourseUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f18746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1388c f18747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f18748c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f18749d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCourseUseCase$invoke$2(C1388c c1388c, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.f18747b = c1388c;
        this.f18748c = str;
        this.f18749d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetCourseUseCase$invoke$2(this.f18747b, this.f18748c, this.f18749d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetCourseUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18746a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            xo1 xo1Var = this.f18747b.f18833b;
            this.f18746a = 1;
            if (((C1290f) xo1Var).m7179c(this.f18749d, this.f18748c, this) == coroutineSingletons) {
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
