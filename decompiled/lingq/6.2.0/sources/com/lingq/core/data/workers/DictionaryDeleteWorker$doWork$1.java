package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.DictionaryDeleteWorker", m4291f = "DictionaryDeleteWorker.kt", m4292l = {32}, m4293m = "doWork", m4294v = 2)
final class DictionaryDeleteWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16657a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DictionaryDeleteWorker f16658b;

    /* JADX INFO: renamed from: c */
    public int f16659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryDeleteWorker$doWork$1(DictionaryDeleteWorker dictionaryDeleteWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16658b = dictionaryDeleteWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16657a = obj;
        this.f16659c |= Integer.MIN_VALUE;
        return this.f16658b.mo2213d(this);
    }
}
