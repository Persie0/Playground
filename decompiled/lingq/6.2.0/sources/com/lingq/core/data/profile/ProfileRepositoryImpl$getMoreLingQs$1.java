package com.lingq.core.data.profile;

import com.lingq.core.domain.model.user.Profile;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {540, 549, 551, 553, 555, 558, 560}, m4293m = "getMoreLingQs", m4294v = 2)
final class ProfileRepositoryImpl$getMoreLingQs$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f14440a;

    /* JADX INFO: renamed from: b */
    public long f14441b;

    /* JADX INFO: renamed from: c */
    public Profile f14442c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14443d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1267a f14444e;

    /* JADX INFO: renamed from: f */
    public int f14445f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$getMoreLingQs$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14444e = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14443d = obj;
        this.f14445f |= Integer.MIN_VALUE;
        return this.f14444e.m7075d(0, 0L, this);
    }
}
