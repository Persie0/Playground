package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {216, 225}, m4293m = "registerGoogle", m4294v = 2)
final class ProfileRepositoryImpl$registerGoogle$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14484a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1267a f14485b;

    /* JADX INFO: renamed from: c */
    public int f14486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$registerGoogle$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14485b = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14484a = obj;
        this.f14486c |= Integer.MIN_VALUE;
        return this.f14485b.m7088q(null, null, null, null, null, this);
    }
}
