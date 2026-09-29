package com.lingq.feature.reader.video;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.j13;
import p000.xfa;
import p000.yz4;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$lessonEditState$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$lessonEditState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ yz4 f31196a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Integer f31197b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2583a f31198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$lessonEditState$1(C2583a c2583a, Continuation continuation) {
        super(3, continuation);
        this.f31198c = c2583a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderVideoComposeViewModel$lessonEditState$1 readerVideoComposeViewModel$lessonEditState$1 = new ReaderVideoComposeViewModel$lessonEditState$1(this.f31198c, (Continuation) obj3);
        readerVideoComposeViewModel$lessonEditState$1.f31196a = (yz4) obj;
        readerVideoComposeViewModel$lessonEditState$1.f31197b = (Integer) obj2;
        return readerVideoComposeViewModel$lessonEditState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        yz4 yz4Var = this.f31196a;
        Integer num = this.f31197b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        j13 j13Var = this.f31198c.f31384q;
        Lesson lesson = yz4Var.f70667a;
        j13Var.getClass();
        return j13.m14252j(lesson, num);
    }
}
