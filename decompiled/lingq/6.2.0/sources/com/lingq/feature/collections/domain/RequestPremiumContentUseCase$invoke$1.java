package com.lingq.feature.collections.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.domain.RequestPremiumContentUseCase", m4291f = "RequestPremiumContentUseCase.kt", m4292l = {15}, m4293m = "invoke", m4294v = 2)
final class RequestPremiumContentUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f25633a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25634b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2038d f25635c;

    /* JADX INFO: renamed from: d */
    public int f25636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPremiumContentUseCase$invoke$1(C2038d c2038d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25635c = c2038d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25634b = obj;
        this.f25636d |= Integer.MIN_VALUE;
        return this.f25635c.m8960a(0, this);
    }
}
