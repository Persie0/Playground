package com.lingq.feature.onboarding.p014v2.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.domain.ValidateRegistrationFieldsUseCase", m4291f = "ValidateRegistrationFieldsUseCase.kt", m4292l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m4293m = "validateEmail", m4294v = 2)
final class ValidateRegistrationFieldsUseCase$validateEmail$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27459a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2226g f27460b;

    /* JADX INFO: renamed from: c */
    public int f27461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateRegistrationFieldsUseCase$validateEmail$1(C2226g c2226g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27460b = c2226g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27459a = obj;
        this.f27461c |= Integer.MIN_VALUE;
        return this.f27460b.m9179a(null, this);
    }
}
