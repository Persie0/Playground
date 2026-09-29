package com.lingq.feature.onboarding.p014v2.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.domain.CompleteOnboardingUseCase", m4291f = "CompleteOnboardingUseCase.kt", m4292l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 51, 54, 64}, m4293m = "invoke", m4294v = 2)
final class CompleteOnboardingUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f27402a;

    /* JADX INFO: renamed from: b */
    public String f27403b;

    /* JADX INFO: renamed from: c */
    public String f27404c;

    /* JADX INFO: renamed from: d */
    public Set f27405d;

    /* JADX INFO: renamed from: e */
    public List f27406e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f27407f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2220a f27408g;

    /* JADX INFO: renamed from: h */
    public int f27409h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteOnboardingUseCase$invoke$1(C2220a c2220a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27408g = c2220a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27407f = obj;
        this.f27409h |= Integer.MIN_VALUE;
        return this.f27408g.m9170a(null, null, null, null, null, null, this);
    }
}
