package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LanguageProgressUpdateWorker", m4291f = "LanguageProgressUpdateWorker.kt", m4292l = {33}, m4293m = "doWork", m4294v = 2)
final class LanguageProgressUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16687a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LanguageProgressUpdateWorker f16688b;

    /* JADX INFO: renamed from: c */
    public int f16689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageProgressUpdateWorker$doWork$1(LanguageProgressUpdateWorker languageProgressUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16688b = languageProgressUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16687a = obj;
        this.f16689c |= Integer.MIN_VALUE;
        return this.f16688b.mo2213d(this);
    }
}
