package com.lingq.feature.reader.playback;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$startObservingAudioWave$$inlined$map$1$2", m4291f = "PlayerStateHolder.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class PlayerStateHolder$startObservingAudioWave$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29757a;

    /* JADX INFO: renamed from: b */
    public int f29758b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f29759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStateHolder$startObservingAudioWave$$inlined$map$1$2$1(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f29759c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29757a = obj;
        this.f29758b |= Integer.MIN_VALUE;
        return this.f29759c.emit(null, this);
    }
}
