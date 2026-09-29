package com.lingq.feature.reader.video;

import com.lingq.core.token.C1909e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.n2a;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoScreenKt$ReaderVideoRoute$4$1", m4291f = "ReaderVideoScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoScreenKt$ReaderVideoRoute$4$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1909e f31331a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f31332b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoScreenKt$ReaderVideoRoute$4$1(C1909e c1909e, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f31331a = c1909e;
        this.f31332b = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoScreenKt$ReaderVideoRoute$4$1(this.f31331a, this.f31332b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderVideoScreenKt$ReaderVideoRoute$4$1 readerVideoScreenKt$ReaderVideoRoute$4$1 = (ReaderVideoScreenKt$ReaderVideoRoute$4$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerVideoScreenKt$ReaderVideoRoute$4$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f31331a.m8760d3(n2a.f52243a);
        this.f31332b.setValue(VideoSidePanelContent.Vocabulary);
        return xfa.f68157a;
    }
}
