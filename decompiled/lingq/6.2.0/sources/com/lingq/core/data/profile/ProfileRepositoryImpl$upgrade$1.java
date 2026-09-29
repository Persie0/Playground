package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.v18;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {400, 412, 414}, m4293m = "upgrade", m4294v = 2)
final class ProfileRepositoryImpl$upgrade$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public v18 f14564a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14565b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14566c;

    /* JADX INFO: renamed from: d */
    public int f14567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$upgrade$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14566c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14565b = obj;
        this.f14567d |= Integer.MIN_VALUE;
        return this.f14566c.m7068I(null, this);
    }
}
