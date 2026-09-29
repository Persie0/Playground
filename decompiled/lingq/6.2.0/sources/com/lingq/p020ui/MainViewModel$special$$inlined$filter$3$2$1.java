package com.lingq.p020ui;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$special$$inlined$filter$3$2", m4291f = "MainViewModel.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class MainViewModel$special$$inlined$filter$3$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34148a;

    /* JADX INFO: renamed from: b */
    public int f34149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f34150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$special$$inlined$filter$3$2$1(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f34150c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34148a = obj;
        this.f34149b |= Integer.MIN_VALUE;
        return this.f34150c.emit(null, this);
    }
}
