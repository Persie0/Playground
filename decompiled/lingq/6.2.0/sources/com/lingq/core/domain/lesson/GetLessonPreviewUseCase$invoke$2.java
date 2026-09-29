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
@c32(m4290c = "com.lingq.core.domain.lesson.GetLessonPreviewUseCase$invoke$2", m4291f = "GetLessonPreviewUseCase.kt", m4292l = {18}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLessonPreviewUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f18688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1380b f18689b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f18690c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f18691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLessonPreviewUseCase$invoke$2(C1380b c1380b, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.f18689b = c1380b;
        this.f18690c = str;
        this.f18691d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetLessonPreviewUseCase$invoke$2(this.f18689b, this.f18690c, this.f18691d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetLessonPreviewUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18688a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            d65 d65Var = this.f18689b.f18723b;
            this.f18688a = 1;
            if (((C1295k) d65Var).m7279h0(this.f18691d, this.f18690c, this) == coroutineSingletons) {
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
