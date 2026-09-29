package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {451, 453, 454}, m4293m = "networkUpdateActiveLanguage", m4294v = 2)
final class ProfileRepositoryImpl$networkUpdateActiveLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14465a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14467c;

    /* JADX INFO: renamed from: d */
    public int f14468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$networkUpdateActiveLanguage$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14467c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14466b = obj;
        this.f14468d |= Integer.MIN_VALUE;
        return this.f14467c.m7083l(null, this);
    }
}
