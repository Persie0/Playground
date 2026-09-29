package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {502, 504}, m4293m = "updateTimezone", m4294v = 2)
final class ProfileRepositoryImpl$updateTimezone$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14555a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14556b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14557c;

    /* JADX INFO: renamed from: d */
    public int f14558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateTimezone$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14557c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14556b = obj;
        this.f14558d |= Integer.MIN_VALUE;
        return this.f14557c.m7066G(null, this);
    }
}
