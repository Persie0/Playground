package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.MilestoneRepositoryImpl", m4291f = "MilestoneRepositoryImpl.kt", m4292l = {66}, m4293m = "meetMilestone", m4294v = 2)
final class MilestoneRepositoryImpl$meetMilestone$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15828a;

    /* JADX INFO: renamed from: b */
    public String f15829b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15830c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1298n f15831d;

    /* JADX INFO: renamed from: e */
    public int f15832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestoneRepositoryImpl$meetMilestone$1(C1298n c1298n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15831d = c1298n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15830c = obj;
        this.f15832e |= Integer.MIN_VALUE;
        return this.f15831d.m7330a(null, null, null, this);
    }
}
