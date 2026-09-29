package com.lingq.core.user;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {286, 287, 289, 290}, m4293m = "checkTimezone", m4294v = 2)
final class UserSessionViewModelDelegateImpl$checkTimezone$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f24237a;

    /* JADX INFO: renamed from: b */
    public String f24238b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24239c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1939a f24240d;

    /* JADX INFO: renamed from: e */
    public int f24241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$checkTimezone$1(C1939a c1939a, Continuation continuation) {
        super(continuation);
        this.f24240d = c1939a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24239c = obj;
        this.f24241e |= Integer.MIN_VALUE;
        return this.f24240d.mo4579K(this);
    }
}
