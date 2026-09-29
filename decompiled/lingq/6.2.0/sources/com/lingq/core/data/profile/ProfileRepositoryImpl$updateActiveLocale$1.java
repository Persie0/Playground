package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {460, 462}, m4293m = "updateActiveLocale", m4294v = 2)
final class ProfileRepositoryImpl$updateActiveLocale$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14503a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14504b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14505c;

    /* JADX INFO: renamed from: d */
    public int f14506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateActiveLocale$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14505c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14504b = obj;
        this.f14506d |= Integer.MIN_VALUE;
        return this.f14505c.m7093w(null, this);
    }
}
