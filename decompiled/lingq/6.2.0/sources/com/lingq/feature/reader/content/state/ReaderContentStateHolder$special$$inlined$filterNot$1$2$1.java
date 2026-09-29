package com.lingq.feature.reader.content.state;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zd7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$special$$inlined$filterNot$1$2", m4291f = "ReaderContentStateHolder.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderContentStateHolder$special$$inlined$filterNot$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28016a;

    /* JADX INFO: renamed from: b */
    public int f28017b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zd7 f28018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$special$$inlined$filterNot$1$2$1(zd7 zd7Var, Continuation continuation) {
        super(continuation);
        this.f28018c = zd7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28016a = obj;
        this.f28017b |= Integer.MIN_VALUE;
        return this.f28018c.emit(null, this);
    }
}
