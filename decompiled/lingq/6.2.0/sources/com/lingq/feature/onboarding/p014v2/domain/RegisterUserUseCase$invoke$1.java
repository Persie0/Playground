package com.lingq.feature.onboarding.p014v2.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.domain.RegisterUserUseCase", m4291f = "RegisterUserUseCase.kt", m4292l = {73, 92}, m4293m = "invoke", m4294v = 2)
final class RegisterUserUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f27447a;

    /* JADX INFO: renamed from: b */
    public String f27448b;

    /* JADX INFO: renamed from: c */
    public String f27449c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f27450d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2225f f27451e;

    /* JADX INFO: renamed from: f */
    public int f27452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterUserUseCase$invoke$1(C2225f c2225f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27451e = c2225f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27450d = obj;
        this.f27452f |= Integer.MIN_VALUE;
        return this.f27451e.m9174a(null, null, null, null, null, null, null, null, this);
    }
}
