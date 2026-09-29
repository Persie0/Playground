package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {108}, m4293m = "requestSignInWithEmail", m4294v = 2)
final class ProfileRepositoryImpl$requestSignInWithEmail$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14490a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14491b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14492c;

    /* JADX INFO: renamed from: d */
    public int f14493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$requestSignInWithEmail$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14492c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14491b = obj;
        this.f14493d |= Integer.MIN_VALUE;
        return this.f14492c.m7090s(null, this);
    }
}
