package com.lingq.core.token;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3393o1;
import p000.c32;
import p000.eh0;
import p000.f5a;
import p000.h2a;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.vk9;
import p000.vv9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenPopupContentKt$Content$3$1$6$1", m4291f = "TokenPopupContent.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenPopupContentKt$Content$3$1$6$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f5a f23431a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f23432b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f23433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenPopupContentKt$Content$3$1$6$1(f5a f5aVar, vi3 vi3Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f23431a = f5aVar;
        this.f23432b = vi3Var;
        this.f23433c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenPopupContentKt$Content$3$1$6$1(this.f23431a, this.f23432b, this.f23433c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenPopupContentKt$Content$3$1$6$1 tokenPopupContentKt$Content$3$1$6$1 = (TokenPopupContentKt$Content$3$1$6$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenPopupContentKt$Content$3$1$6$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String strM17735j = this.f23431a.f38467Y;
        if (strM17735j != null) {
            t66 t66Var = this.f23433c;
            if (!vk9.m23391n0(((vv9) t66Var.getValue()).f65990a.f54604b)) {
                strM17735j = vk9.m23380c0(((vv9) t66Var.getValue()).f65990a.f54604b, strM17735j, false) ? ((vv9) t66Var.getValue()).f65990a.f54604b : AbstractC3393o1.m17735j(vk9.m23377M0(((vv9) t66Var.getValue()).f65990a.f54604b).toString(), "\n\n", strM17735j);
            }
            int length = strM17735j.length();
            t66Var.setValue(new vv9(strM17735j, 4, eh0.m11127g(length, length)));
            this.f23432b.invoke(h2a.f41717a);
        }
        return xfa.f68157a;
    }
}
