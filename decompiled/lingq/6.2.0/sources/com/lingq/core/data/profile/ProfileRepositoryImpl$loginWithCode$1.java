package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {96, 99, 100}, m4293m = "loginWithCode", m4294v = 2)
final class ProfileRepositoryImpl$loginWithCode$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1267a f14456b;

    /* JADX INFO: renamed from: c */
    public int f14457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$loginWithCode$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14456b = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14455a = obj;
        this.f14457c |= Integer.MIN_VALUE;
        return this.f14456b.m7079h(null, this);
    }
}
