package com.lingq.feature.reader.video.state;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.vpa;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$paragraphs$3", m4291f = "VideoContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoContentStateHolder$paragraphs$3 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f31485a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f31486b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f31487c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        VideoContentStateHolder$paragraphs$3 videoContentStateHolder$paragraphs$3 = new VideoContentStateHolder$paragraphs$3(4, (Continuation) obj4);
        videoContentStateHolder$paragraphs$3.f31485a = (Map) obj;
        videoContentStateHolder$paragraphs$3.f31486b = (Map) obj2;
        videoContentStateHolder$paragraphs$3.f31487c = (Map) obj3;
        return videoContentStateHolder$paragraphs$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f31485a;
        Map map2 = this.f31486b;
        Map map3 = this.f31487c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new vpa(map, map2, map3);
    }
}
