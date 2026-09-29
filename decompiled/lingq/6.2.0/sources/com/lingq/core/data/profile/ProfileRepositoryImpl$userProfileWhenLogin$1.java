package com.lingq.core.data.profile;

import com.lingq.core.domain.model.user.Profile;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {299, 307}, m4293m = "userProfileWhenLogin", m4294v = 2)
final class ProfileRepositoryImpl$userProfileWhenLogin$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Profile f14572a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14573b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14574c;

    /* JADX INFO: renamed from: d */
    public int f14575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$userProfileWhenLogin$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14574c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14573b = obj;
        this.f14575d |= Integer.MIN_VALUE;
        return this.f14574c.m7070K(this);
    }
}
