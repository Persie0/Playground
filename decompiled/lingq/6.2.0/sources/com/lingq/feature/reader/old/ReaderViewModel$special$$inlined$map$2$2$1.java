package com.lingq.feature.reader.old;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.u08;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$map$2$2", m4291f = "ReaderViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderViewModel$special$$inlined$map$2$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29136a;

    /* JADX INFO: renamed from: b */
    public int f29137b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u08 f29138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$special$$inlined$map$2$2$1(u08 u08Var, Continuation continuation) {
        super(continuation);
        this.f29138c = u08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29136a = obj;
        this.f29137b |= Integer.MIN_VALUE;
        return this.f29138c.emit(null, this);
    }
}
