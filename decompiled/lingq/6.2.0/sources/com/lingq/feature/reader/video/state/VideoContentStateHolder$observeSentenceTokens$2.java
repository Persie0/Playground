package com.lingq.feature.reader.video.state;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.lx8;
import p000.u91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$observeSentenceTokens$2", m4291f = "VideoContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoContentStateHolder$observeSentenceTokens$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2595a f31472b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentStateHolder$observeSentenceTokens$2(C2595a c2595a, Continuation continuation) {
        super(2, continuation);
        this.f31472b = c2595a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VideoContentStateHolder$observeSentenceTokens$2 videoContentStateHolder$observeSentenceTokens$2 = new VideoContentStateHolder$observeSentenceTokens$2(this.f31472b, continuation);
        videoContentStateHolder$observeSentenceTokens$2.f31471a = obj;
        return videoContentStateHolder$observeSentenceTokens$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        VideoContentStateHolder$observeSentenceTokens$2 videoContentStateHolder$observeSentenceTokens$2 = (VideoContentStateHolder$observeSentenceTokens$2) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        videoContentStateHolder$observeSentenceTokens$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f31471a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2595a c2595a = this.f31472b;
        c2595a.f31537n.m15571i(list);
        C3244l c3244l = c2595a.f31534k;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u91.m22630w0(((lx8) it.next()).f50257c, arrayList);
        }
        c3244l.getClass();
        c3244l.m15572j(null, arrayList);
        return xfa.f68157a;
    }
}
