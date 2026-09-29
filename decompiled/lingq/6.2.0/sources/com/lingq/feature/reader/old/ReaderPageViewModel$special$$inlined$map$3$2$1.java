package com.lingq.feature.reader.old;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wv7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$special$$inlined$map$3$2", m4291f = "ReaderPageViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderPageViewModel$special$$inlined$map$3$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28768a;

    /* JADX INFO: renamed from: b */
    public int f28769b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wv7 f28770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$special$$inlined$map$3$2$1(wv7 wv7Var, Continuation continuation) {
        super(continuation);
        this.f28770c = wv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28768a = obj;
        this.f28769b |= Integer.MIN_VALUE;
        return this.f28770c.emit(null, this);
    }
}
