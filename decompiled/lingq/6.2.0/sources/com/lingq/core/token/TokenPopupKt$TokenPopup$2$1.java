package com.lingq.core.token;

import android.app.Activity;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.f5a;
import p000.l2a;
import p000.mbd;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenPopupKt$TokenPopup$2$1", m4291f = "TokenPopup.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenPopupKt$TokenPopup$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f23479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f5a f23480b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f23481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenPopupKt$TokenPopup$2$1(Activity activity, f5a f5aVar, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f23479a = activity;
        this.f23480b = f5aVar;
        this.f23481c = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenPopupKt$TokenPopup$2$1(this.f23479a, this.f23480b, this.f23481c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenPopupKt$TokenPopup$2$1 tokenPopupKt$TokenPopup$2$1 = (TokenPopupKt$TokenPopup$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenPopupKt$TokenPopup$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Activity activity = this.f23479a;
        if (activity != null) {
            mbd.m16755c(activity, this.f23480b.f38459Q, null, 30);
        }
        this.f23481c.invoke(l2a.f48943a);
        return xfa.f68157a;
    }
}
