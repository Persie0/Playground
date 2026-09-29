package com.lingq.core.domain.lesson;

import com.lingq.core.data.repository.C1296l;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.vz1;
import p000.xfa;
import p000.y95;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.GetLessonCountersUseCase$invoke$2", m4291f = "GetLessonCountersUseCase.kt", m4292l = {25}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLessonCountersUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f18667a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1382d f18668b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f18669c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f18670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLessonCountersUseCase$invoke$2(C1382d c1382d, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.f18668b = c1382d;
        this.f18669c = str;
        this.f18670d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetLessonCountersUseCase$invoke$2(this.f18668b, this.f18669c, this.f18670d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetLessonCountersUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18667a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            y95 y95Var = (y95) this.f18668b.f18728a;
            List listM23604J = vz1.m23604J(new Integer(this.f18670d));
            this.f18667a = 1;
            if (((C1296l) y95Var).m7311f(this.f18669c, listM23604J, this) == coroutineSingletons) {
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
