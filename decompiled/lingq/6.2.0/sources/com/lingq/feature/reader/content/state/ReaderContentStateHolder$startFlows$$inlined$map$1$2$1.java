package com.lingq.feature.reader.content.state;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3602t8;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$startFlows$$inlined$map$1$2", m4291f = "ReaderContentStateHolder.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderContentStateHolder$startFlows$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28051a;

    /* JADX INFO: renamed from: b */
    public int f28052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3602t8 f28053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$startFlows$$inlined$map$1$2$1(C3602t8 c3602t8, Continuation continuation) {
        super(continuation);
        this.f28053c = c3602t8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28051a = obj;
        this.f28052b |= Integer.MIN_VALUE;
        return this.f28053c.emit(null, this);
    }
}
