package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {162}, m4293m = "fetchPreferredVoiceName", m4294v = 2)
final class TtsRepositoryImpl$fetchPreferredVoiceName$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16219a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16220b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1307w f16221c;

    /* JADX INFO: renamed from: d */
    public int f16222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$fetchPreferredVoiceName$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16221c = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16220b = obj;
        this.f16222d |= Integer.MIN_VALUE;
        return this.f16221c.m7390e(null, this);
    }
}
