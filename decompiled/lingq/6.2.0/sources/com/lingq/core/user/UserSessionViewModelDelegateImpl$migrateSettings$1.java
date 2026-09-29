package com.lingq.core.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {167, 169}, m4293m = "migrateSettings", m4294v = 2)
final class UserSessionViewModelDelegateImpl$migrateSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24245a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1939a f24246b;

    /* JADX INFO: renamed from: c */
    public int f24247c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$migrateSettings$1(C1939a c1939a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24246b = c1939a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24245a = obj;
        this.f24247c |= Integer.MIN_VALUE;
        return C1939a.m8804a(this.f24246b, this);
    }
}
