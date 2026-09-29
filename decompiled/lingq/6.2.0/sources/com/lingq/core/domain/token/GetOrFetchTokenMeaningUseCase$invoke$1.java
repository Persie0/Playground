package com.lingq.core.domain.token;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetOrFetchTokenMeaningUseCase", m4291f = "GetOrFetchTokenMeaningUseCase.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 29, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m4293m = "invoke", m4294v = 2)
final class GetOrFetchTokenMeaningUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f20058a;

    /* JADX INFO: renamed from: b */
    public String f20059b;

    /* JADX INFO: renamed from: c */
    public String f20060c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f20061d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1536d f20062e;

    /* JADX INFO: renamed from: f */
    public int f20063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrFetchTokenMeaningUseCase$invoke$1(C1536d c1536d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20062e = c1536d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20061d = obj;
        this.f20063f |= Integer.MIN_VALUE;
        return this.f20062e.m8220d(null, null, null, this);
    }
}
