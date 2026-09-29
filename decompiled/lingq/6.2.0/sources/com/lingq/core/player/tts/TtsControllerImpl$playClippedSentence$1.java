package com.lingq.core.player.tts;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl", m4291f = "TtsController.kt", m4292l = {530}, m4293m = "playClippedSentence", m4294v = 2)
final class TtsControllerImpl$playClippedSentence$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1819c f22091b;

    /* JADX INFO: renamed from: c */
    public int f22092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$playClippedSentence$1(C1819c c1819c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22091b = c1819c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22090a = obj;
        this.f22092c |= Integer.MIN_VALUE;
        return C1819c.m8480f(this.f22091b, null, 0.0d, null, 0, 0.0f, null, this);
    }
}
