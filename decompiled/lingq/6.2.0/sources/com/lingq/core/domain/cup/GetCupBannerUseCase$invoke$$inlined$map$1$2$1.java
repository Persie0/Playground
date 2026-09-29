package com.lingq.core.domain.cup;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3503qm;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.cup.GetCupBannerUseCase$invoke$$inlined$map$1$2", m4291f = "GetCupBannerUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetCupBannerUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18623a;

    /* JADX INFO: renamed from: b */
    public int f18624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3503qm f18625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCupBannerUseCase$invoke$$inlined$map$1$2$1(C3503qm c3503qm, Continuation continuation) {
        super(continuation);
        this.f18625c = c3503qm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18623a = obj;
        this.f18624b |= Integer.MIN_VALUE;
        return this.f18625c.emit(null, this);
    }
}
