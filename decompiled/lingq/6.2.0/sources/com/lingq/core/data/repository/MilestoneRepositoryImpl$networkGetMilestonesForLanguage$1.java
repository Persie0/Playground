package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultMilestones;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.MilestoneRepositoryImpl", m4291f = "MilestoneRepositoryImpl.kt", m4292l = {77, 79, 81}, m4293m = "networkGetMilestonesForLanguage", m4294v = 2)
final class MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15833a;

    /* JADX INFO: renamed from: b */
    public ResultMilestones f15834b;

    /* JADX INFO: renamed from: c */
    public int f15835c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15836d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1298n f15837e;

    /* JADX INFO: renamed from: f */
    public int f15838f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1(C1298n c1298n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15837e = c1298n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15836d = obj;
        this.f15838f |= Integer.MIN_VALUE;
        return this.f15837e.m7331b(null, this);
    }
}
