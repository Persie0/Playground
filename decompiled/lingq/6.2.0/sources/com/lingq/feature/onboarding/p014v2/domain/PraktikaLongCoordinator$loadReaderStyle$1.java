package com.lingq.feature.onboarding.p014v2.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.domain.PraktikaLongCoordinator", m4291f = "PraktikaLongCoordinator.kt", m4292l = {26}, m4293m = "loadReaderStyle", m4294v = 2)
final class PraktikaLongCoordinator$loadReaderStyle$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2223d f27427b;

    /* JADX INFO: renamed from: c */
    public int f27428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PraktikaLongCoordinator$loadReaderStyle$1(C2223d c2223d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27427b = c2223d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27426a = obj;
        this.f27428c |= Integer.MIN_VALUE;
        return this.f27427b.m9172a(null, this);
    }
}
