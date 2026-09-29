package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {186, 195}, m4293m = "registerFacebook", m4294v = 2)
final class ProfileRepositoryImpl$registerFacebook$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1267a f14482b;

    /* JADX INFO: renamed from: c */
    public int f14483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$registerFacebook$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14482b = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14481a = obj;
        this.f14483c |= Integer.MIN_VALUE;
        return this.f14482b.m7087p(null, null, null, null, null, this);
    }
}
