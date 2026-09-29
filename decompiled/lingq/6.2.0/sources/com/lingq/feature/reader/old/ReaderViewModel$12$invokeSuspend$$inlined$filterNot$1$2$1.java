package com.lingq.feature.reader.old;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o08;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$12$invokeSuspend$$inlined$filterNot$1$2", m4291f = "ReaderViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28808a;

    /* JADX INFO: renamed from: b */
    public int f28809b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o08 f28810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1(o08 o08Var, Continuation continuation) {
        super(continuation);
        this.f28810c = o08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28808a = obj;
        this.f28809b |= Integer.MIN_VALUE;
        return this.f28810c.emit(null, this);
    }
}
