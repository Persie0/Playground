package com.lingq.core.settings.domain;

import com.lingq.core.domain.model.token.LocalTextToSpeechVoice;
import com.lingq.core.domain.model.token.TextToSpeechVoice;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.InitTtsVoicesUseCase", m4291f = "InitTtsVoicesUseCase.kt", m4292l = {73, 77, 79, 80, 82, 82, 85, 87, 88, 89}, m4293m = "selectVoice", m4294v = 2)
final class InitTtsVoicesUseCase$selectVoice$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22779a;

    /* JADX INFO: renamed from: b */
    public String f22780b;

    /* JADX INFO: renamed from: c */
    public LocalTextToSpeechVoice f22781c;

    /* JADX INFO: renamed from: d */
    public TextToSpeechVoice f22782d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22783e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1863b f22784f;

    /* JADX INFO: renamed from: g */
    public int f22785g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitTtsVoicesUseCase$selectVoice$1(C1863b c1863b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22784f = c1863b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22783e = obj;
        this.f22785g |= Integer.MIN_VALUE;
        return this.f22784f.m8624g(null, null, this);
    }
}
