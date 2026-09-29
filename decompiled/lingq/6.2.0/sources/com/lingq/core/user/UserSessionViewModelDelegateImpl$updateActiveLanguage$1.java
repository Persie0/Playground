package com.lingq.core.user;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {263, 264, 271}, m4293m = "updateActiveLanguage", m4294v = 2)
final class UserSessionViewModelDelegateImpl$updateActiveLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f24254a;

    /* JADX INFO: renamed from: b */
    public int f24255b;

    /* JADX INFO: renamed from: c */
    public boolean f24256c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f24257d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1939a f24258e;

    /* JADX INFO: renamed from: f */
    public int f24259f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$updateActiveLanguage$1(C1939a c1939a, Continuation continuation) {
        super(continuation);
        this.f24258e = c1939a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24257d = obj;
        this.f24259f |= Integer.MIN_VALUE;
        return this.f24258e.mo4576F1(null, this);
    }
}
