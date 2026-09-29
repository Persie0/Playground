package com.lingq.feature.onboarding.p014v2.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.domain.ValidateRegistrationFieldsUseCase", m4291f = "ValidateRegistrationFieldsUseCase.kt", m4292l = {61}, m4293m = "validateUsername", m4294v = 2)
final class ValidateRegistrationFieldsUseCase$validateUsername$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2226g f27463b;

    /* JADX INFO: renamed from: c */
    public int f27464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateRegistrationFieldsUseCase$validateUsername$1(C2226g c2226g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27463b = c2226g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27462a = obj;
        this.f27464c |= Integer.MIN_VALUE;
        return this.f27463b.m9180b(null, this);
    }
}
