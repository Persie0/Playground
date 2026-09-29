package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {153}, m4293m = "register", m4294v = 2)
final class ProfileRepositoryImpl$register$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14476a;

    /* JADX INFO: renamed from: b */
    public String f14477b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14478c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1267a f14479d;

    /* JADX INFO: renamed from: e */
    public int f14480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$register$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14479d = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14478c = obj;
        this.f14480e |= Integer.MIN_VALUE;
        return this.f14479d.m7086o(null, null, null, null, null, null, null, null, null, null, null, null, this);
    }
}
