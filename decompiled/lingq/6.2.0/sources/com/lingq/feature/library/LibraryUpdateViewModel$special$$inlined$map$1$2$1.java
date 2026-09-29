package com.lingq.feature.library;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$special$$inlined$map$1$2", m4291f = "LibraryUpdateViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class LibraryUpdateViewModel$special$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26603a;

    /* JADX INFO: renamed from: b */
    public int f26604b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f26605c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$special$$inlined$map$1$2$1(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f26605c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26603a = obj;
        this.f26604b |= Integer.MIN_VALUE;
        return this.f26605c.emit(null, this);
    }
}
