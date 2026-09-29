package com.lingq.feature.edit;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$buildPageStateFlow$1", m4291f = "LessonEditViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$buildPageStateFlow$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Throwable f25899a;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        LessonEditViewModel$buildPageStateFlow$1 lessonEditViewModel$buildPageStateFlow$1 = new LessonEditViewModel$buildPageStateFlow$1(3, (Continuation) obj3);
        lessonEditViewModel$buildPageStateFlow$1.f25899a = (Throwable) obj2;
        xfa xfaVar = xfa.f68157a;
        lessonEditViewModel$buildPageStateFlow$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = this.f25899a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        th.printStackTrace();
        return xfa.f68157a;
    }
}
