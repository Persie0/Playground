package com.lingq.core.token;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.f5a;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$fetchTranslation$3$timeoutJob$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {862}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$fetchTranslation$3$timeoutJob$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$fetchTranslation$3$timeoutJob$1(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23599b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$fetchTranslation$3$timeoutJob$1(this.f23599b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$fetchTranslation$3$timeoutJob$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        C1909e c1909e = this.f23599b;
        C3244l c3244l = c1909e.f23885W;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23598a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f23598a = 1;
            if (AbstractC3208a.m15437d(4000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        if (((f5a) c3244l.getValue()).f38452J) {
            C3244l c3244l2 = c1909e.f23881S;
            do {
                value = c3244l2.getValue();
            } while (!c3244l2.m15570h(value, null));
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, f5a.m11558a((f5a) value2, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, true, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097127)));
        }
        return xfa.f68157a;
    }
}
