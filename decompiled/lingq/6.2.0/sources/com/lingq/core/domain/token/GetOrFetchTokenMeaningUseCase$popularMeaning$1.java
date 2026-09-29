package com.lingq.core.domain.token;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetOrFetchTokenMeaningUseCase", m4291f = "GetOrFetchTokenMeaningUseCase.kt", m4292l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER, 43}, m4293m = "popularMeaning", m4294v = 2)
final class GetOrFetchTokenMeaningUseCase$popularMeaning$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f20064a;

    /* JADX INFO: renamed from: b */
    public String f20065b;

    /* JADX INFO: renamed from: c */
    public String f20066c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f20067d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1536d f20068e;

    /* JADX INFO: renamed from: f */
    public int f20069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrFetchTokenMeaningUseCase$popularMeaning$1(C1536d c1536d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20068e = c1536d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20067d = obj;
        this.f20069f |= Integer.MIN_VALUE;
        return this.f20068e.m8221e(null, null, null, this);
    }
}
