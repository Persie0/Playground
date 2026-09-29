package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {197, 200, 205}, m4293m = "resolveVoiceByName", m4294v = 2)
final class TtsRepositoryImpl$resolveVoiceByName$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16299a;

    /* JADX INFO: renamed from: b */
    public String f16300b;

    /* JADX INFO: renamed from: c */
    public boolean f16301c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16302d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1307w f16303e;

    /* JADX INFO: renamed from: f */
    public int f16304f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$resolveVoiceByName$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16303e = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16302d = obj;
        this.f16304f |= Integer.MIN_VALUE;
        return this.f16303e.m7403r(null, null, false, this);
    }
}
