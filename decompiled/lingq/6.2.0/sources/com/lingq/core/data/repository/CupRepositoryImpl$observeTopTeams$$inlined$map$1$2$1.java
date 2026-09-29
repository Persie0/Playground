package com.lingq.core.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CupRepositoryImpl$observeTopTeams$$inlined$map$1$2", m4291f = "CupRepositoryImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class CupRepositoryImpl$observeTopTeams$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15105a;

    /* JADX INFO: renamed from: b */
    public int f15106b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f15107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupRepositoryImpl$observeTopTeams$$inlined$map$1$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f15107c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15105a = obj;
        this.f15106b |= Integer.MIN_VALUE;
        return this.f15107c.emit(null, this);
    }
}
