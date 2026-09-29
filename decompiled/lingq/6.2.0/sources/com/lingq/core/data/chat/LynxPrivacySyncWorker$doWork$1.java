package com.lingq.core.data.chat;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.chat.LynxPrivacySyncWorker", m4291f = "LynxPrivacySyncWorker.kt", m4292l = {DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class LynxPrivacySyncWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14404a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LynxPrivacySyncWorker f14405b;

    /* JADX INFO: renamed from: c */
    public int f14406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxPrivacySyncWorker$doWork$1(LynxPrivacySyncWorker lynxPrivacySyncWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14405b = lynxPrivacySyncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14404a = obj;
        this.f14406c |= Integer.MIN_VALUE;
        return this.f14405b.mo2213d(this);
    }
}
