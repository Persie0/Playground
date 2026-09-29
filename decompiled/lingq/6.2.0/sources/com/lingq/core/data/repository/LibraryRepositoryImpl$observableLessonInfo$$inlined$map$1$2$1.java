package com.lingq.core.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2", m4291f = "LibraryRepositoryImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class LibraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15755a;

    /* JADX INFO: renamed from: b */
    public int f15756b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f15757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f15757c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15755a = obj;
        this.f15756b |= Integer.MIN_VALUE;
        return this.f15757c.emit(null, this);
    }
}
