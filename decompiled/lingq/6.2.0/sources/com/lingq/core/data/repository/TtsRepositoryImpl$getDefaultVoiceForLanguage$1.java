package com.lingq.core.data.repository;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {296, 306, 312}, m4293m = "getDefaultVoiceForLanguage", m4294v = 2)
final class TtsRepositoryImpl$getDefaultVoiceForLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16260a;

    /* JADX INFO: renamed from: b */
    public Iterator f16261b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16262c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1307w f16263d;

    /* JADX INFO: renamed from: e */
    public int f16264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$getDefaultVoiceForLanguage$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16263d = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16262c = obj;
        this.f16264e |= Integer.MIN_VALUE;
        return this.f16263d.m7395j(null, this);
    }
}
