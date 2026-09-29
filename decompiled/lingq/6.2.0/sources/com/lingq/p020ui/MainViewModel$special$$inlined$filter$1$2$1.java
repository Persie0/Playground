package com.lingq.p020ui;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ep5;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$special$$inlined$filter$1$2", m4291f = "MainViewModel.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class MainViewModel$special$$inlined$filter$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34142a;

    /* JADX INFO: renamed from: b */
    public int f34143b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ep5 f34144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$special$$inlined$filter$1$2$1(ep5 ep5Var, Continuation continuation) {
        super(continuation);
        this.f34144c = ep5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34142a = obj;
        this.f34143b |= Integer.MIN_VALUE;
        return this.f34144c.emit(null, this);
    }
}
