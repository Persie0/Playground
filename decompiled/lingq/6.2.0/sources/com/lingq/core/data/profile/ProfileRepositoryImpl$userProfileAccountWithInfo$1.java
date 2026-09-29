package com.lingq.core.data.profile;

import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {339, 340, 343}, m4293m = "userProfileAccountWithInfo", m4294v = 2)
final class ProfileRepositoryImpl$userProfileAccountWithInfo$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ProfileAccount f14568a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14569b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14570c;

    /* JADX INFO: renamed from: d */
    public int f14571d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$userProfileAccountWithInfo$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14570c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14569b = obj;
        this.f14571d |= Integer.MIN_VALUE;
        return this.f14570c.m7069J(this);
    }
}
