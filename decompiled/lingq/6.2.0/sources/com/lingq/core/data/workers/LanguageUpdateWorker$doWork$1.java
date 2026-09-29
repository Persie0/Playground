package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LanguageUpdateWorker", m4291f = "LanguageUpdateWorker.kt", m4292l = {32}, m4293m = "doWork", m4294v = 2)
final class LanguageUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16703a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LanguageUpdateWorker f16704b;

    /* JADX INFO: renamed from: c */
    public int f16705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageUpdateWorker$doWork$1(LanguageUpdateWorker languageUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16704b = languageUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16703a = obj;
        this.f16705c |= Integer.MIN_VALUE;
        return this.f16704b.mo2213d(this);
    }
}
