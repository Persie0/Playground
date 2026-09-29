package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$setLessonFontSize$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$setLessonFontSize$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2412n f29031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f29032b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$setLessonFontSize$1(C2412n c2412n, int i, Continuation continuation) {
        super(2, continuation);
        this.f29031a = c2412n;
        this.f29032b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$setLessonFontSize$1(this.f29031a, this.f29032b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderViewModel$setLessonFontSize$1 readerViewModel$setLessonFontSize$1 = (ReaderViewModel$setLessonFontSize$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerViewModel$setLessonFontSize$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f29031a.f29275F0;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, new Integer(this.f29032b)));
        return xfa.f68157a;
    }
}
