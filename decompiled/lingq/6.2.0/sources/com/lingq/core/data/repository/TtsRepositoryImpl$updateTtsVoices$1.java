package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {38, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m4293m = "updateTtsVoices", m4294v = 2)
final class TtsRepositoryImpl$updateTtsVoices$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16323a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16324b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1307w f16325c;

    /* JADX INFO: renamed from: d */
    public int f16326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$updateTtsVoices$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16325c = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16324b = obj;
        this.f16326d |= Integer.MIN_VALUE;
        return this.f16325c.m7407v(null, this);
    }
}
