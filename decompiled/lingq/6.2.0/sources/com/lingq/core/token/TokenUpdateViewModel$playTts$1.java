package com.lingq.core.token;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.player.C1808b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.f5a;
import p000.n58;
import p000.oz8;
import p000.sca;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$playTts$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1125}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$playTts$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23652b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23653c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$playTts$1(C1909e c1909e, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f23652b = c1909e;
        this.f23653c = str;
        this.f23654d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$playTts$1(this.f23652b, this.f23653c, this.f23654d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$playTts$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1909e c1909e = this.f23652b;
        C1808b c1808b = c1909e.f23870H;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23651a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (c1808b.m8444G()) {
                oz8 oz8Var = c1909e.f23865C;
                this.f23651a = 1;
                obj = AbstractC3224d.m15541t(((C1368a) oz8Var.f55331a).f18365O0, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            n58 n58Var = c1909e.f23908v;
            TokenPopupData tokenPopupData = ((f5a) ((C3244l) c1909e.f23886X.f9311a).getValue()).f38475g;
            sca.m21224J0(c1909e.f23874L, n58.m17233j(n58Var, this.f23653c, this.f23654d, null, tokenPopupData != null ? tokenPopupData.f23455k : null, null, 20), false, 12);
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        if (((Boolean) obj).booleanValue()) {
            c1808b.m8447J();
        }
        n58 n58Var2 = c1909e.f23908v;
        TokenPopupData tokenPopupData2 = ((f5a) ((C3244l) c1909e.f23886X.f9311a).getValue()).f38475g;
        if (tokenPopupData2 != null) {
        }
        sca.m21224J0(c1909e.f23874L, n58.m17233j(n58Var2, this.f23653c, this.f23654d, null, tokenPopupData2 != null ? tokenPopupData2.f23455k : null, null, 20), false, 12);
        return xfa.f68157a;
    }
}
