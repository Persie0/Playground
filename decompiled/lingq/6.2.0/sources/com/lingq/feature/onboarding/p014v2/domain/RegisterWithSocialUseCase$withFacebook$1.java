package com.lingq.feature.onboarding.p014v2.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.domain.RegisterWithSocialUseCase", m4291f = "RegisterWithSocialUseCase.kt", m4292l = {78}, m4293m = "withFacebook", m4294v = 2)
final class RegisterWithSocialUseCase$withFacebook$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2225f f27454b;

    /* JADX INFO: renamed from: c */
    public int f27455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterWithSocialUseCase$withFacebook$1(C2225f c2225f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27454b = c2225f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27453a = obj;
        this.f27455c |= Integer.MIN_VALUE;
        return this.f27454b.m9177d(null, null, null, null, this);
    }
}
