package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CupRepositoryImpl", m4291f = "CupRepositoryImpl.kt", m4292l = {56, 58}, m4293m = "fetchTopTeams", m4294v = 2)
final class CupRepositoryImpl$fetchTopTeams$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1291g f15090b;

    /* JADX INFO: renamed from: c */
    public int f15091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupRepositoryImpl$fetchTopTeams$1(C1291g c1291g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15090b = c1291g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15089a = obj;
        this.f15091c |= Integer.MIN_VALUE;
        return this.f15090b.m7192e(this);
    }
}
