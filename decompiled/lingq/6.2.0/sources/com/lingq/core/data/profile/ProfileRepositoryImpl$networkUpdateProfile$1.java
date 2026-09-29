package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {364, 378, 379}, m4293m = "networkUpdateProfile", m4294v = 2)
final class ProfileRepositoryImpl$networkUpdateProfile$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f14469a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14470b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14471c;

    /* JADX INFO: renamed from: d */
    public int f14472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$networkUpdateProfile$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14471c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14470b = obj;
        this.f14472d |= Integer.MIN_VALUE;
        return this.f14471c.m7084m(this);
    }
}
