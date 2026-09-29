package com.lingq.core.token;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.l5a;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$special$$inlined$filterNot$1$2", m4291f = "TokenUpdateViewModel.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class TokenUpdateViewModel$special$$inlined$filterNot$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23682a;

    /* JADX INFO: renamed from: b */
    public int f23683b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l5a f23684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$special$$inlined$filterNot$1$2$1(l5a l5aVar, Continuation continuation) {
        super(continuation);
        this.f23684c = l5aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23682a = obj;
        this.f23683b |= Integer.MIN_VALUE;
        return this.f23684c.emit(null, this);
    }
}
