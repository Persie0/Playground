package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.network.api.result.ResultReferralStats;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ReferralRepositoryImpl", m4291f = "ReferralRepositoryImpl.kt", m4292l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 38, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m4293m = "networkGetReferralStats", m4294v = 2)
final class ReferralRepositoryImpl$networkGetReferralStats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ResultReferralStats f16085a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16086b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1304t f16087c;

    /* JADX INFO: renamed from: d */
    public int f16088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralRepositoryImpl$networkGetReferralStats$1(C1304t c1304t, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16087c = c1304t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16086b = obj;
        this.f16088d |= Integer.MIN_VALUE;
        return this.f16087c.m7368a(this);
    }
}
