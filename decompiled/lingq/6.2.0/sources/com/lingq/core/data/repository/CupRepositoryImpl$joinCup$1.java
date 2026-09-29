package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.worldcup.ResultCupJoin;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CupRepositoryImpl", m4291f = "CupRepositoryImpl.kt", m4292l = {116, 123}, m4293m = "joinCup", m4294v = 2)
final class CupRepositoryImpl$joinCup$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ResultCupJoin f15092a;

    /* JADX INFO: renamed from: b */
    public boolean f15093b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15094c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1291g f15095d;

    /* JADX INFO: renamed from: e */
    public int f15096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupRepositoryImpl$joinCup$1(C1291g c1291g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15095d = c1291g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15094c = obj;
        this.f15096e |= Integer.MIN_VALUE;
        return this.f15095d.m7193f(null, false, this);
    }
}
