package com.lingq.feature.reader.old;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.u08;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$phrases$2$invokeSuspend$$inlined$map$1$2", m4291f = "ReaderViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29012a;

    /* JADX INFO: renamed from: b */
    public int f29013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u08 f29014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1(u08 u08Var, Continuation continuation) {
        super(continuation);
        this.f29014c = u08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29012a = obj;
        this.f29013b |= Integer.MIN_VALUE;
        return this.f29014c.emit(null, this);
    }
}
