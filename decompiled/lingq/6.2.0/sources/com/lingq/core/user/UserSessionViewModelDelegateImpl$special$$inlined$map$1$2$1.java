package com.lingq.core.user;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$special$$inlined$map$1$2", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {223}, m4293m = "emit", m4294v = 2)
public final class UserSessionViewModelDelegateImpl$special$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24248a;

    /* JADX INFO: renamed from: b */
    public int f24249b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f24250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$special$$inlined$map$1$2$1(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f24250c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24248a = obj;
        this.f24249b |= Integer.MIN_VALUE;
        return this.f24250c.emit(null, this);
    }
}
