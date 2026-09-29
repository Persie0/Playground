package com.lingq.feature.reader.content;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder$loadLesson$7", m4291f = "LessonContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonContentStateHolder$loadLesson$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27887a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2260a f27888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonContentStateHolder$loadLesson$7(C2260a c2260a, Continuation continuation) {
        super(2, continuation);
        this.f27888b = c2260a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LessonContentStateHolder$loadLesson$7 lessonContentStateHolder$loadLesson$7 = new LessonContentStateHolder$loadLesson$7(this.f27888b, continuation);
        lessonContentStateHolder$loadLesson$7.f27887a = obj;
        return lessonContentStateHolder$loadLesson$7;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LessonContentStateHolder$loadLesson$7 lessonContentStateHolder$loadLesson$7 = (LessonContentStateHolder$loadLesson$7) create((String) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lessonContentStateHolder$loadLesson$7.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        String str = (String) this.f27887a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f27888b.f27949o;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, str, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388575)));
        return xfa.f68157a;
    }
}
