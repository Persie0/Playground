package com.lingq.core.domain.language;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.language.SetDailyStreakTargetUseCase", m4291f = "SetDailyStreakTargetUseCase.kt", m4292l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m4293m = "invoke", m4294v = 2)
final class SetDailyStreakTargetUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1378b f18641b;

    /* JADX INFO: renamed from: c */
    public int f18642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetDailyStreakTargetUseCase$invoke$1(C1378b c1378b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18641b = c1378b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18640a = obj;
        this.f18642c |= Integer.MIN_VALUE;
        return this.f18641b.m7985b(null, null, this);
    }
}
