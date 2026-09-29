package com.lingq.feature.reader.old;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o08;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$18$invokeSuspend$$inlined$filterNot$2$2", m4291f = "ReaderViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28844a;

    /* JADX INFO: renamed from: b */
    public int f28845b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o08 f28846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1(o08 o08Var, Continuation continuation) {
        super(continuation);
        this.f28846c = o08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28844a = obj;
        this.f28845b |= Integer.MIN_VALUE;
        return this.f28846c.emit(null, this);
    }
}
