package com.lingq.core.data.repository;

import com.lingq.core.domain.model.token.TextToSpeechVoice;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {84, 86, 90, 95, 98, 104, 114, 115}, m4293m = "fetchPriorityVoice", m4294v = 2)
final class TtsRepositoryImpl$fetchPriorityVoice$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16223a;

    /* JADX INFO: renamed from: b */
    public String f16224b;

    /* JADX INFO: renamed from: c */
    public Ref$BooleanRef f16225c;

    /* JADX INFO: renamed from: d */
    public TextToSpeechVoice f16226d;

    /* JADX INFO: renamed from: e */
    public String f16227e;

    /* JADX INFO: renamed from: f */
    public TextToSpeechVoice f16228f;

    /* JADX INFO: renamed from: g */
    public TextToSpeechVoice f16229g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f16230h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1307w f16231i;

    /* JADX INFO: renamed from: j */
    public int f16232j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$fetchPriorityVoice$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16231i = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16230h = obj;
        this.f16232j |= Integer.MIN_VALUE;
        return this.f16231i.m7391f(null, this);
    }
}
