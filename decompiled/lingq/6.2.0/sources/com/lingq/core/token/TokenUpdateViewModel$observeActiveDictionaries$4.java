package com.lingq.core.token;

import com.lingq.core.data.repository.C1292h;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.h23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$observeActiveDictionaries$4", m4291f = "TokenUpdateViewModel.kt", m4292l = {741}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$observeActiveDictionaries$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23636b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$observeActiveDictionaries$4(C1909e c1909e, String str, Continuation continuation) {
        super(2, continuation);
        this.f23636b = c1909e;
        this.f23637c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$observeActiveDictionaries$4(this.f23636b, this.f23637c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$observeActiveDictionaries$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23635a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                h23 h23Var = this.f23636b.f23896j;
                String str = this.f23637c;
                this.f23635a = 1;
                Object objM7199e = ((C1292h) h23Var.f41694a).m7199e(str, this);
                if (objM7199e != coroutineSingletons) {
                    objM7199e = xfaVar;
                }
                if (objM7199e == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfaVar;
    }
}
