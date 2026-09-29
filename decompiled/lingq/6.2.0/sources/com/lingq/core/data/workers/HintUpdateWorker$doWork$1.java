package com.lingq.core.data.workers;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.HintUpdateWorker", m4291f = "HintUpdateWorker.kt", m4292l = {33, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class HintUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f16668a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16669b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ HintUpdateWorker f16670c;

    /* JADX INFO: renamed from: d */
    public int f16671d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HintUpdateWorker$doWork$1(HintUpdateWorker hintUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16670c = hintUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16669b = obj;
        this.f16671d |= Integer.MIN_VALUE;
        return this.f16670c.mo2213d(this);
    }
}
