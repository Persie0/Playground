package com.lingq.feature.collections.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.domain.BuyCollectionCourseUseCase", m4291f = "BuyCollectionCourseUseCase.kt", m4292l = {17, 19, 21}, m4293m = "invoke", m4294v = 2)
final class BuyCollectionCourseUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f25597a;

    /* JADX INFO: renamed from: b */
    public int f25598b;

    /* JADX INFO: renamed from: c */
    public boolean f25599c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f25600d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2035a f25601e;

    /* JADX INFO: renamed from: f */
    public int f25602f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyCollectionCourseUseCase$invoke$1(C2035a c2035a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25601e = c2035a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25600d = obj;
        this.f25602f |= Integer.MIN_VALUE;
        return this.f25601e.m8955a(0, 0, null, this);
    }
}
