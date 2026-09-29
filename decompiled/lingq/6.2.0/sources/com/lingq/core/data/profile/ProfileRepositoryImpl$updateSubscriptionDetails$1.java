package com.lingq.core.data.profile;

import com.lingq.core.domain.model.user.SubscriptionDetails;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {907, 910}, m4293m = "updateSubscriptionDetails", m4294v = 2)
final class ProfileRepositoryImpl$updateSubscriptionDetails$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public SubscriptionDetails f14551a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14552b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14553c;

    /* JADX INFO: renamed from: d */
    public int f14554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateSubscriptionDetails$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14553c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14552b = obj;
        this.f14554d |= Integer.MIN_VALUE;
        return this.f14553c.m7065F(this);
    }
}
