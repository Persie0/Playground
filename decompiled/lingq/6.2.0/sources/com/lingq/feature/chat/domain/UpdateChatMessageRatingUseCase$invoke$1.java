package com.lingq.feature.chat.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.UpdateChatMessageRatingUseCase", m4291f = "UpdateChatMessageRatingUseCase.kt", m4292l = {20, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m4293m = "invoke", m4294v = 2)
final class UpdateChatMessageRatingUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1999d f25206b;

    /* JADX INFO: renamed from: c */
    public int f25207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateChatMessageRatingUseCase$invoke$1(C1999d c1999d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25206b = c1999d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25205a = obj;
        this.f25207c |= Integer.MIN_VALUE;
        return this.f25206b.m8864b(null, 0, 0, null, null, this);
    }
}
