package com.lingq.core.data.workers;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.CardReviewWorker", m4291f = "CardReviewWorker.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class CardReviewWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CardReviewWorker f16614b;

    /* JADX INFO: renamed from: c */
    public int f16615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardReviewWorker$doWork$1(CardReviewWorker cardReviewWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16614b = cardReviewWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16613a = obj;
        this.f16615c |= Integer.MIN_VALUE;
        return this.f16614b.mo2213d(this);
    }
}
