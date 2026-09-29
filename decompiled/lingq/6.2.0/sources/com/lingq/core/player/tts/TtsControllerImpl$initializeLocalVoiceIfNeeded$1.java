package com.lingq.core.player.tts;

import com.lingq.core.domain.model.token.LocalTextToSpeechVoice;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl", m4291f = "TtsController.kt", m4292l = {689, 691, 693, 695}, m4293m = "initializeLocalVoiceIfNeeded", m4294v = 2)
final class TtsControllerImpl$initializeLocalVoiceIfNeeded$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22058a;

    /* JADX INFO: renamed from: b */
    public LocalTextToSpeechVoice f22059b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22060c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1819c f22061d;

    /* JADX INFO: renamed from: e */
    public int f22062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$initializeLocalVoiceIfNeeded$1(C1819c c1819c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22061d = c1819c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22060c = obj;
        this.f22062e |= Integer.MIN_VALUE;
        return C1819c.m8478c(this.f22061d, this);
    }
}
