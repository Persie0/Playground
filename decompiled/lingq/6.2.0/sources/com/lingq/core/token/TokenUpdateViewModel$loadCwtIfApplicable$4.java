package com.lingq.core.token;

import com.lingq.core.domain.model.token.TokenCwt;
import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.f5a;
import p000.pg9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$loadCwtIfApplicable$4", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$loadCwtIfApplicable$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$loadCwtIfApplicable$4(C1909e c1909e, String str, Continuation continuation) {
        super(2, continuation);
        this.f23624b = c1909e;
        this.f23625c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$loadCwtIfApplicable$4 tokenUpdateViewModel$loadCwtIfApplicable$4 = new TokenUpdateViewModel$loadCwtIfApplicable$4(this.f23624b, this.f23625c, continuation);
        tokenUpdateViewModel$loadCwtIfApplicable$4.f23623a = obj;
        return tokenUpdateViewModel$loadCwtIfApplicable$4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$loadCwtIfApplicable$4 tokenUpdateViewModel$loadCwtIfApplicable$4 = (TokenUpdateViewModel$loadCwtIfApplicable$4) create((TokenCwt) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$loadCwtIfApplicable$4.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        String str;
        String str2;
        Object value2;
        TokenCwt tokenCwt = (TokenCwt) this.f23623a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (tokenCwt != null) {
            C1909e c1909e = this.f23624b;
            pg9 pg9Var = c1909e.f23884V;
            if (pg9Var != null) {
                pg9Var.mo4537a(null);
            }
            C3244l c3244l = c1909e.f23881S;
            do {
                value = c3244l.getValue();
                str = tokenCwt.f19587e;
                str2 = this.f23625c;
            } while (!c3244l.m15570h(value, new TokenMeaning(-33, str2, str, 0, false, str2, false, 0, 136)));
            C3244l c3244l2 = c1909e.f23885W;
            do {
                value2 = c3244l2.getValue();
            } while (!c3244l2.m15570h(value2, f5a.m11558a((f5a) value2, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097127)));
        }
        return xfa.f68157a;
    }
}
