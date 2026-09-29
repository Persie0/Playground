package com.lingq.core.token.domain;

import com.lingq.core.domain.model.token.TokenControllerType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.ShouldAutoCreateLingqUseCase", m4291f = "ShouldAutoCreateLingqUseCase.kt", m4292l = {12}, m4293m = "invoke", m4294v = 2)
final class ShouldAutoCreateLingqUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public TokenControllerType f23834a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23835b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1908e f23836c;

    /* JADX INFO: renamed from: d */
    public int f23837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShouldAutoCreateLingqUseCase$invoke$1(C1908e c1908e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23836c = c1908e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23835b = obj;
        this.f23837d |= Integer.MIN_VALUE;
        return this.f23836c.m8729b(null, this);
    }
}
