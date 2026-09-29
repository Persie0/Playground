package com.lingq.core.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: renamed from: com.lingq.core.data.repository.LibraryRepositoryImpl$observableLibraryItemsSearch$$inlined$map$2$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl$observableLibraryItemsSearch$$inlined$map$2$2", m4291f = "LibraryRepositoryImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class C1280x78e3bf7d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15761a;

    /* JADX INFO: renamed from: b */
    public int f15762b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f15763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1280x78e3bf7d(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f15763c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15761a = obj;
        this.f15762b |= Integer.MIN_VALUE;
        return this.f15763c.emit(null, this);
    }
}
