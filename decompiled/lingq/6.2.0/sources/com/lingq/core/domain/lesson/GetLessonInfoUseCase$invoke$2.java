package com.lingq.core.domain.lesson;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.GetLessonInfoUseCase$invoke$2", m4291f = "GetLessonInfoUseCase.kt", m4292l = {30}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLessonInfoUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f18684a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1383e f18685b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f18686c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f18687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLessonInfoUseCase$invoke$2(C1383e c1383e, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.f18685b = c1383e;
        this.f18686c = str;
        this.f18687d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetLessonInfoUseCase$invoke$2(this.f18685b, this.f18686c, this.f18687d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetLessonInfoUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18684a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            d65 d65Var = this.f18685b.f18729a;
            this.f18684a = 1;
            if (((C1295k) d65Var).m7296q(this.f18687d, this.f18686c, this) == coroutineSingletons) {
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
