package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LanguageTopicsUpdateWorker", m4291f = "LanguageTopicsUpdateWorker.kt", m4292l = {28}, m4293m = "doWork", m4294v = 2)
final class LanguageTopicsUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LanguageTopicsUpdateWorker f16700b;

    /* JADX INFO: renamed from: c */
    public int f16701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageTopicsUpdateWorker$doWork$1(LanguageTopicsUpdateWorker languageTopicsUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16700b = languageTopicsUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16699a = obj;
        this.f16701c |= Integer.MIN_VALUE;
        return this.f16700b.mo2213d(this);
    }
}
