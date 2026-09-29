package com.lingq.feature.reader.playback;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$startObservingAudioWave$4", m4291f = "PlayerStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerStateHolder$startObservingAudioWave$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29763a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2465a f29764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStateHolder$startObservingAudioWave$4(C2465a c2465a, Continuation continuation) {
        super(2, continuation);
        this.f29764b = c2465a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlayerStateHolder$startObservingAudioWave$4 playerStateHolder$startObservingAudioWave$4 = new PlayerStateHolder$startObservingAudioWave$4(this.f29764b, continuation);
        playerStateHolder$startObservingAudioWave$4.f29763a = obj;
        return playerStateHolder$startObservingAudioWave$4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PlayerStateHolder$startObservingAudioWave$4 playerStateHolder$startObservingAudioWave$4 = (PlayerStateHolder$startObservingAudioWave$4) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        playerStateHolder$startObservingAudioWave$4.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f29763a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f29764b.m9366i(list);
        return xfa.f68157a;
    }
}
