package com.lingq.core.domain.lesson;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.w05;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.GetLessonDownloadStateUseCase$invoke$2", m4291f = "GetLessonDownloadStateUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLessonDownloadStateUseCase$invoke$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f18677a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f18678b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        GetLessonDownloadStateUseCase$invoke$2 getLessonDownloadStateUseCase$invoke$2 = new GetLessonDownloadStateUseCase$invoke$2(3, (Continuation) obj3);
        getLessonDownloadStateUseCase$invoke$2.f18677a = zBooleanValue;
        getLessonDownloadStateUseCase$invoke$2.f18678b = zBooleanValue2;
        return getLessonDownloadStateUseCase$invoke$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f18677a;
        boolean z2 = this.f18678b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new w05(z, z2);
    }
}
