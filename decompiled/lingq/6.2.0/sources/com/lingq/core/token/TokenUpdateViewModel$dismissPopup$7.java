package com.lingq.core.token;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$dismissPopup$7", m4291f = "TokenUpdateViewModel.kt", m4292l = {1598}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$dismissPopup$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23566a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TokenPopupData f23567b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1909e f23568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$dismissPopup$7(TokenPopupData tokenPopupData, C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23567b = tokenPopupData;
        this.f23568c = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$dismissPopup$7(this.f23567b, this.f23568c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$dismissPopup$7) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23566a;
        TokenPopupData tokenPopupData = this.f23567b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (tokenPopupData != null) {
                this.f23566a = 1;
                if (AbstractC3208a.m15437d(60L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        this.f23568c.f23879Q.m15571i(tokenPopupData);
        return xfa.f68157a;
    }
}
