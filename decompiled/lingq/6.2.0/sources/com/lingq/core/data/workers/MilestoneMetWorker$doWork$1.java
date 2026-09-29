package com.lingq.core.data.workers;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.MilestoneMetWorker", m4291f = "MilestoneMetWorker.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class MilestoneMetWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16763a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MilestoneMetWorker f16764b;

    /* JADX INFO: renamed from: c */
    public int f16765c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestoneMetWorker$doWork$1(MilestoneMetWorker milestoneMetWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16764b = milestoneMetWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16763a = obj;
        this.f16765c |= Integer.MIN_VALUE;
        return this.f16764b.mo2213d(this);
    }
}
