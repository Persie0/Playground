package com.lingq.p020ui;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$special$$inlined$map$1$2", m4291f = "MainViewModel.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class MainViewModel$special$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34155a;

    /* JADX INFO: renamed from: b */
    public int f34156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f34157c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$special$$inlined$map$1$2$1(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f34157c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34155a = obj;
        this.f34156b |= Integer.MIN_VALUE;
        return this.f34157c.emit(null, this);
    }
}
