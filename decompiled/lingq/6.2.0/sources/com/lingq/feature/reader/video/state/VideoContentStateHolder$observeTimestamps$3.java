package com.lingq.feature.reader.video.state;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$observeTimestamps$3", m4291f = "VideoContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoContentStateHolder$observeTimestamps$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2595a f31481b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentStateHolder$observeTimestamps$3(C2595a c2595a, Continuation continuation) {
        super(2, continuation);
        this.f31481b = c2595a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VideoContentStateHolder$observeTimestamps$3 videoContentStateHolder$observeTimestamps$3 = new VideoContentStateHolder$observeTimestamps$3(this.f31481b, continuation);
        videoContentStateHolder$observeTimestamps$3.f31480a = obj;
        return videoContentStateHolder$observeTimestamps$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        VideoContentStateHolder$observeTimestamps$3 videoContentStateHolder$observeTimestamps$3 = (VideoContentStateHolder$observeTimestamps$3) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        videoContentStateHolder$observeTimestamps$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f31480a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f31481b.f31536m.m15571i(list);
        return xfa.f68157a;
    }
}
