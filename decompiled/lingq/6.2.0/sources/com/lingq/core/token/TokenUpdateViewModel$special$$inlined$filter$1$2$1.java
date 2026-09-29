package com.lingq.core.token;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o08;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$special$$inlined$filter$1$2", m4291f = "TokenUpdateViewModel.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class TokenUpdateViewModel$special$$inlined$filter$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23679a;

    /* JADX INFO: renamed from: b */
    public int f23680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o08 f23681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$special$$inlined$filter$1$2$1(o08 o08Var, Continuation continuation) {
        super(continuation);
        this.f23681c = o08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23679a = obj;
        this.f23680b |= Integer.MIN_VALUE;
        return this.f23681c.emit(null, this);
    }
}
