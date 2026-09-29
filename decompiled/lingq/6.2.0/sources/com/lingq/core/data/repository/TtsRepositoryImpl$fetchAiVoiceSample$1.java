package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {49}, m4293m = "fetchAiVoiceSample", m4294v = 2)
final class TtsRepositoryImpl$fetchAiVoiceSample$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1307w f16217b;

    /* JADX INFO: renamed from: c */
    public int f16218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$fetchAiVoiceSample$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16217b = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16216a = obj;
        this.f16218c |= Integer.MIN_VALUE;
        return this.f16217b.m7389d(null, this);
    }
}
