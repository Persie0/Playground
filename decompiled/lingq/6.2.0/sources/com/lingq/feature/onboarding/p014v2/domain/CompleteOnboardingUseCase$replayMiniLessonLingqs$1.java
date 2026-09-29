package com.lingq.feature.onboarding.p014v2.domain;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.domain.CompleteOnboardingUseCase", m4291f = "CompleteOnboardingUseCase.kt", m4292l = {76}, m4293m = "replayMiniLessonLingqs", m4294v = 2)
final class CompleteOnboardingUseCase$replayMiniLessonLingqs$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Iterator f27410a;

    /* JADX INFO: renamed from: b */
    public int f27411b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f27412c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2220a f27413d;

    /* JADX INFO: renamed from: e */
    public int f27414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteOnboardingUseCase$replayMiniLessonLingqs$1(C2220a c2220a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27413d = c2220a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27412c = obj;
        this.f27414e |= Integer.MIN_VALUE;
        return this.f27413d.m9171b(null, this);
    }
}
