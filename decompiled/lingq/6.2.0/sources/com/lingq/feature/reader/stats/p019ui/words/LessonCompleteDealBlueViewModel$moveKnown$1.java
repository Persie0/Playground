package com.lingq.feature.reader.stats.p019ui.words;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.words.LessonCompleteDealBlueViewModel$moveKnown$1", m4291f = "LessonCompleteDealBlueViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteDealBlueViewModel$moveKnown$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f31095a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LessonCompleteDealBlueViewModel$moveKnown$1 lessonCompleteDealBlueViewModel$moveKnown$1 = new LessonCompleteDealBlueViewModel$moveKnown$1(2, continuation);
        lessonCompleteDealBlueViewModel$moveKnown$1.f31095a = ((Boolean) obj).booleanValue();
        return lessonCompleteDealBlueViewModel$moveKnown$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((LessonCompleteDealBlueViewModel$moveKnown$1) create(bool, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f31095a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf(z);
    }
}
