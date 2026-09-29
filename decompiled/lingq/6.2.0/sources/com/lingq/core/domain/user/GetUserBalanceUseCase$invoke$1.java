package com.lingq.core.domain.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.user.GetUserBalanceUseCase", m4291f = "GetUserBalanceUseCase.kt", m4292l = {17}, m4293m = "invoke", m4294v = 2)
final class GetUserBalanceUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20105a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1539a f20106b;

    /* JADX INFO: renamed from: c */
    public int f20107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserBalanceUseCase$invoke$1(C1539a c1539a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20106b = c1539a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20105a = obj;
        this.f20107c |= Integer.MIN_VALUE;
        return this.f20106b.m8225a(this);
    }
}
