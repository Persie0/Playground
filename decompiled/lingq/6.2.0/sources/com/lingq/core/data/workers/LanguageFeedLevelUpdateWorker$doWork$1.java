package com.lingq.core.data.workers;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LanguageFeedLevelUpdateWorker", m4291f = "LanguageFeedLevelUpdateWorker.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class LanguageFeedLevelUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LanguageFeedLevelUpdateWorker f16680b;

    /* JADX INFO: renamed from: c */
    public int f16681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageFeedLevelUpdateWorker$doWork$1(LanguageFeedLevelUpdateWorker languageFeedLevelUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16680b = languageFeedLevelUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16679a = obj;
        this.f16681c |= Integer.MIN_VALUE;
        return this.f16680b.mo2213d(this);
    }
}
