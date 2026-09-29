package com.lingq.feature.library;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$special$$inlined$map$2$2", m4291f = "LibraryUpdateViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class LibraryUpdateViewModel$special$$inlined$map$2$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26606a;

    /* JADX INFO: renamed from: b */
    public int f26607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f26608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$special$$inlined$map$2$2$1(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f26608c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26606a = obj;
        this.f26607b |= Integer.MIN_VALUE;
        return this.f26608c.emit(null, this);
    }
}
