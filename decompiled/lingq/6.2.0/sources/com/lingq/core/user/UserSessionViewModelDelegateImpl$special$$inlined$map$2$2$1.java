package com.lingq.core.user;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.l5a;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$special$$inlined$map$2$2", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {223}, m4293m = "emit", m4294v = 2)
public final class UserSessionViewModelDelegateImpl$special$$inlined$map$2$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24251a;

    /* JADX INFO: renamed from: b */
    public int f24252b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l5a f24253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$special$$inlined$map$2$2$1(l5a l5aVar, Continuation continuation) {
        super(continuation);
        this.f24253c = l5aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24251a = obj;
        this.f24252b |= Integer.MIN_VALUE;
        return this.f24253c.emit(null, this);
    }
}
