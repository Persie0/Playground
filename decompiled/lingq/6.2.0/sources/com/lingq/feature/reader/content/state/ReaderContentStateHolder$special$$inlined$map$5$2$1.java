package com.lingq.feature.reader.content.state;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wv7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$special$$inlined$map$5$2", m4291f = "ReaderContentStateHolder.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderContentStateHolder$special$$inlined$map$5$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28048a;

    /* JADX INFO: renamed from: b */
    public int f28049b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wv7 f28050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$special$$inlined$map$5$2$1(wv7 wv7Var, Continuation continuation) {
        super(continuation);
        this.f28050c = wv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28048a = obj;
        this.f28049b |= Integer.MIN_VALUE;
        return this.f28050c.emit(null, this);
    }
}
