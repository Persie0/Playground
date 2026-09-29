package com.lingq.p020ui;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ep5;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$special$$inlined$filter$2$2", m4291f = "MainViewModel.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class MainViewModel$special$$inlined$filter$2$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34145a;

    /* JADX INFO: renamed from: b */
    public int f34146b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ep5 f34147c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$special$$inlined$filter$2$2$1(ep5 ep5Var, Continuation continuation) {
        super(continuation);
        this.f34147c = ep5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34145a = obj;
        this.f34146b |= Integer.MIN_VALUE;
        return this.f34147c.emit(null, this);
    }
}
