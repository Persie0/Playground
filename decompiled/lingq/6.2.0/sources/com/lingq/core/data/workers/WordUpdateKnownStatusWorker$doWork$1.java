package com.lingq.core.data.workers;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.WordUpdateKnownStatusWorker", m4291f = "WordUpdateKnownStatusWorker.kt", m4292l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class WordUpdateKnownStatusWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WordUpdateKnownStatusWorker f16815b;

    /* JADX INFO: renamed from: c */
    public int f16816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordUpdateKnownStatusWorker$doWork$1(WordUpdateKnownStatusWorker wordUpdateKnownStatusWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16815b = wordUpdateKnownStatusWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16814a = obj;
        this.f16816c |= Integer.MIN_VALUE;
        return this.f16815b.mo2213d(this);
    }
}
