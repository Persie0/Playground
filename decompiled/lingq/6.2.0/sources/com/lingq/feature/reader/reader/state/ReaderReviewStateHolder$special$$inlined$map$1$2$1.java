package com.lingq.feature.reader.reader.state;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wv7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.state.ReaderReviewStateHolder$special$$inlined$map$1$2", m4291f = "ReaderReviewStateHolder.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderReviewStateHolder$special$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30294a;

    /* JADX INFO: renamed from: b */
    public int f30295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wv7 f30296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderReviewStateHolder$special$$inlined$map$1$2$1(wv7 wv7Var, Continuation continuation) {
        super(continuation);
        this.f30296c = wv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30294a = obj;
        this.f30295b |= Integer.MIN_VALUE;
        return this.f30296c.emit(null, this);
    }
}
