package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.DictionaryAddWorker", m4291f = "DictionaryAddWorker.kt", m4292l = {32}, m4293m = "doWork", m4294v = 2)
final class DictionaryAddWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DictionaryAddWorker f16654b;

    /* JADX INFO: renamed from: c */
    public int f16655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryAddWorker$doWork$1(DictionaryAddWorker dictionaryAddWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16654b = dictionaryAddWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16653a = obj;
        this.f16655c |= Integer.MIN_VALUE;
        return this.f16654b.mo2213d(this);
    }
}
