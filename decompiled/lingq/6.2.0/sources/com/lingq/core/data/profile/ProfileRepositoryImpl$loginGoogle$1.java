package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {128, 131, 132}, m4293m = "loginGoogle", m4294v = 2)
final class ProfileRepositoryImpl$loginGoogle$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14452a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1267a f14453b;

    /* JADX INFO: renamed from: c */
    public int f14454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$loginGoogle$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14453b = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14452a = obj;
        this.f14454c |= Integer.MIN_VALUE;
        return this.f14453b.m7078g(null, this);
    }
}
