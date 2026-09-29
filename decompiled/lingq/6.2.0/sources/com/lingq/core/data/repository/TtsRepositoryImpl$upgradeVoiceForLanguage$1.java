package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {483, 484, 484}, m4293m = "upgradeVoiceForLanguage", m4294v = 2)
final class TtsRepositoryImpl$upgradeVoiceForLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16331a;

    /* JADX INFO: renamed from: b */
    public String f16332b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16333c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1307w f16334d;

    /* JADX INFO: renamed from: e */
    public int f16335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$upgradeVoiceForLanguage$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16334d = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16333c = obj;
        this.f16335e |= Integer.MIN_VALUE;
        return this.f16334d.m7408w(null, null, this);
    }
}
