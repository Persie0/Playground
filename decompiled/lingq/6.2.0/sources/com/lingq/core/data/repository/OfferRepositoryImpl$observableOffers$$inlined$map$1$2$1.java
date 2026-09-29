package com.lingq.core.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.OfferRepositoryImpl$observableOffers$$inlined$map$1$2", m4291f = "OfferRepositoryImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class OfferRepositoryImpl$observableOffers$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15868a;

    /* JADX INFO: renamed from: b */
    public int f15869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f15870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferRepositoryImpl$observableOffers$$inlined$map$1$2$1(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f15870c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15868a = obj;
        this.f15869b |= Integer.MIN_VALUE;
        return this.f15870c.emit(null, this);
    }
}
