package com.lingq.feature.reader.old;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o08;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$filter$1$2", m4291f = "ReaderViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderViewModel$special$$inlined$filter$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29094a;

    /* JADX INFO: renamed from: b */
    public int f29095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o08 f29096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$special$$inlined$filter$1$2$1(o08 o08Var, Continuation continuation) {
        super(continuation);
        this.f29096c = o08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29094a = obj;
        this.f29095b |= Integer.MIN_VALUE;
        return this.f29096c.emit(null, this);
    }
}
