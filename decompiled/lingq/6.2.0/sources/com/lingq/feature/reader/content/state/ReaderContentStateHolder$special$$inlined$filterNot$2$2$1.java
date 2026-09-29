package com.lingq.feature.reader.content.state;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zd7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$special$$inlined$filterNot$2$2", m4291f = "ReaderContentStateHolder.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderContentStateHolder$special$$inlined$filterNot$2$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28019a;

    /* JADX INFO: renamed from: b */
    public int f28020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zd7 f28021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$special$$inlined$filterNot$2$2$1(zd7 zd7Var, Continuation continuation) {
        super(continuation);
        this.f28021c = zd7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28019a = obj;
        this.f28020b |= Integer.MIN_VALUE;
        return this.f28021c.emit(null, this);
    }
}
