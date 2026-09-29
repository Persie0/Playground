package com.lingq.feature.reader.video.state;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.upa;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$paragraphs$2", m4291f = "VideoContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoContentStateHolder$paragraphs$2 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f31482a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f31483b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f31484c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        VideoContentStateHolder$paragraphs$2 videoContentStateHolder$paragraphs$2 = new VideoContentStateHolder$paragraphs$2(4, (Continuation) obj4);
        videoContentStateHolder$paragraphs$2.f31482a = (List) obj;
        videoContentStateHolder$paragraphs$2.f31483b = (List) obj2;
        videoContentStateHolder$paragraphs$2.f31484c = (List) obj3;
        return videoContentStateHolder$paragraphs$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f31482a;
        List list2 = this.f31483b;
        List list3 = this.f31484c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new upa(list, list2, list3);
    }
}
