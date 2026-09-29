package com.lingq.core.player.tts;

import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl", m4291f = "TtsController.kt", m4292l = {387, 416}, m4293m = "fetchUtterance", m4294v = 2)
final class TtsControllerImpl$fetchUtterance$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22041a;

    /* JADX INFO: renamed from: b */
    public TextToSpeechAppVoice f22042b;

    /* JADX INFO: renamed from: c */
    public float f22043c;

    /* JADX INFO: renamed from: d */
    public boolean f22044d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22045e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1819c f22046f;

    /* JADX INFO: renamed from: g */
    public int f22047g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$fetchUtterance$1(C1819c c1819c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22046f = c1819c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22045e = obj;
        this.f22047g |= Integer.MIN_VALUE;
        return C1819c.m8477b(this.f22046f, null, null, 0.0f, false, this);
    }
}
