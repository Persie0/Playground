package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {142, 144}, m4293m = "updateLocalVoiceName", m4294v = 2)
final class TtsRepositoryImpl$updateLocalVoiceName$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16318a;

    /* JADX INFO: renamed from: b */
    public String f16319b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16320c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1307w f16321d;

    /* JADX INFO: renamed from: e */
    public int f16322e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$updateLocalVoiceName$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16321d = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16320c = obj;
        this.f16322e |= Integer.MIN_VALUE;
        return this.f16321d.m7406u(null, null, this);
    }
}
