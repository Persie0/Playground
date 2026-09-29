package com.lingq.core.user;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {174, 175}, m4293m = "updateLanguages", m4294v = 2)
final class UserSessionViewModelDelegateImpl$updateLanguages$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24260a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1939a f24261b;

    /* JADX INFO: renamed from: c */
    public int f24262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$updateLanguages$1(C1939a c1939a, Continuation continuation) {
        super(continuation);
        this.f24261b = c1939a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24260a = obj;
        this.f24262c |= Integer.MIN_VALUE;
        return this.f24261b.mo4575D0(this);
    }
}
