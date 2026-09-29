package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {84, 87, 88}, m4293m = "login", m4294v = 2)
final class ProfileRepositoryImpl$login$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14446a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1267a f14447b;

    /* JADX INFO: renamed from: c */
    public int f14448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$login$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14447b = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14446a = obj;
        this.f14448c |= Integer.MIN_VALUE;
        return this.f14447b.m7076e(null, null, this);
    }
}
