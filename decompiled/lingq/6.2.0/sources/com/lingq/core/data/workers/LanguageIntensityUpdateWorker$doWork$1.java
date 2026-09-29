package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LanguageIntensityUpdateWorker", m4291f = "LanguageIntensityUpdateWorker.kt", m4292l = {28}, m4293m = "doWork", m4294v = 2)
final class LanguageIntensityUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LanguageIntensityUpdateWorker f16684b;

    /* JADX INFO: renamed from: c */
    public int f16685c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageIntensityUpdateWorker$doWork$1(LanguageIntensityUpdateWorker languageIntensityUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16684b = languageIntensityUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16683a = obj;
        this.f16685c |= Integer.MIN_VALUE;
        return this.f16684b.mo2213d(this);
    }
}
