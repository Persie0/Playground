package com.lingq.feature.reader.playback;

import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$startObservingAudioWave$2", m4291f = "PlayerStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerStateHolder$startObservingAudioWave$2 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f29760a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ AudioUnderlineMode f29761b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f29762c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        PlayerStateHolder$startObservingAudioWave$2 playerStateHolder$startObservingAudioWave$2 = new PlayerStateHolder$startObservingAudioWave$2(4, (Continuation) obj4);
        playerStateHolder$startObservingAudioWave$2.f29760a = (List) obj;
        playerStateHolder$startObservingAudioWave$2.f29761b = (AudioUnderlineMode) obj2;
        playerStateHolder$startObservingAudioWave$2.f29762c = zBooleanValue;
        return playerStateHolder$startObservingAudioWave$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f29760a;
        AudioUnderlineMode audioUnderlineMode = this.f29761b;
        boolean z = this.f29762c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Triple(list, audioUnderlineMode, Boolean.valueOf(z));
    }
}
