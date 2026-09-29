package com.lingq.core.data.repository;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {268}, m4293m = "publishMissingVoicesToApi", m4294v = 2)
final class TtsRepositoryImpl$publishMissingVoicesToApi$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Iterator f16279a;

    /* JADX INFO: renamed from: b */
    public int f16280b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16281c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1307w f16282d;

    /* JADX INFO: renamed from: e */
    public int f16283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$publishMissingVoicesToApi$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16282d = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16281c = obj;
        this.f16283e |= Integer.MIN_VALUE;
        return this.f16282d.m7399n(null, this);
    }
}
