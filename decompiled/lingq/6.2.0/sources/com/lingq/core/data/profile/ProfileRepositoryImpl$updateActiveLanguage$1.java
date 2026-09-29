package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {425, 427, 429, 435}, m4293m = "updateActiveLanguage", m4294v = 2)
final class ProfileRepositoryImpl$updateActiveLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14499a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14500b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14501c;

    /* JADX INFO: renamed from: d */
    public int f14502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateActiveLanguage$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14501c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14500b = obj;
        this.f14502d |= Integer.MIN_VALUE;
        return this.f14501c.m7092v(null, this);
    }
}
