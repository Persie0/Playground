package com.lingq.feature.reader.playback;

import com.lingq.core.domain.model.library.LessonInfo;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.InterfaceC3055gy;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$startObservingAudio$1", m4291f = "PlayerStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerStateHolder$startObservingAudio$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ LessonInfo f29743a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC3055gy f29744b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlayerStateHolder$startObservingAudio$1 playerStateHolder$startObservingAudio$1 = new PlayerStateHolder$startObservingAudio$1(3, (Continuation) obj3);
        playerStateHolder$startObservingAudio$1.f29743a = (LessonInfo) obj;
        playerStateHolder$startObservingAudio$1.f29744b = (InterfaceC3055gy) obj2;
        return playerStateHolder$startObservingAudio$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonInfo lessonInfo = this.f29743a;
        InterfaceC3055gy interfaceC3055gy = this.f29744b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(lessonInfo, interfaceC3055gy);
    }
}
