package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.WordUpdateIgnoreStatusWorker", m4291f = "WordUpdateIgnoreStatusWorker.kt", m4292l = {30}, m4293m = "doWork", m4294v = 2)
final class WordUpdateIgnoreStatusWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WordUpdateIgnoreStatusWorker f16811b;

    /* JADX INFO: renamed from: c */
    public int f16812c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordUpdateIgnoreStatusWorker$doWork$1(WordUpdateIgnoreStatusWorker wordUpdateIgnoreStatusWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16811b = wordUpdateIgnoreStatusWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16810a = obj;
        this.f16812c |= Integer.MIN_VALUE;
        return this.f16811b.mo2213d(this);
    }
}
