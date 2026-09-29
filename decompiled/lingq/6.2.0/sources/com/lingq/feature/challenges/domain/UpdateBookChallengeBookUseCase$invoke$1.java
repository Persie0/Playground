package com.lingq.feature.challenges.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.domain.UpdateBookChallengeBookUseCase", m4291f = "UpdateBookChallengeBookUseCase.kt", m4292l = {19, 24, 28, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 42}, m4293m = "invoke", m4294v = 2)
final class UpdateBookChallengeBookUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f24749a;

    /* JADX INFO: renamed from: b */
    public String f24750b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24751c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1984c f24752d;

    /* JADX INFO: renamed from: e */
    public int f24753e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateBookChallengeBookUseCase$invoke$1(C1984c c1984c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24752d = c1984c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24751c = obj;
        this.f24753e |= Integer.MIN_VALUE;
        return this.f24752d.m8848a(null, null, null, this);
    }
}
