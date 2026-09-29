package com.lingq.core.domain.token;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.FlagMeaningUseCase", m4291f = "FlagMeaningUseCase.kt", m4292l = {17}, m4293m = "invoke-yxL6bBk", m4294v = 2)
final class FlagMeaningUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20009a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1534b f20010b;

    /* JADX INFO: renamed from: c */
    public int f20011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagMeaningUseCase$invoke$1(C1534b c1534b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20010b = c1534b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20009a = obj;
        this.f20011c |= Integer.MIN_VALUE;
        Object objM8213b = this.f20010b.m8213b(null, null, null, null, this);
        return objM8213b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8213b : new Result(objM8213b);
    }
}
