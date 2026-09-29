package com.lingq.feature.widget.streak;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.widget.streak.StreakDataUpdateWorker", m4291f = "StreakDataUpdateWorker.kt", m4292l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class StreakDataUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ StreakDataUpdateWorker f33866b;

    /* JADX INFO: renamed from: c */
    public int f33867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakDataUpdateWorker$doWork$1(StreakDataUpdateWorker streakDataUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33866b = streakDataUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33865a = obj;
        this.f33867c |= Integer.MIN_VALUE;
        return this.f33866b.mo2213d(this);
    }
}
