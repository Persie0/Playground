package com.lingq.core.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o08;

/* JADX INFO: renamed from: com.lingq.core.data.repository.SearchRepositoryImpl$observableFastSearchExtraData$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.core.data.repository.SearchRepositoryImpl$observableFastSearchExtraData$$inlined$map$1$2", m4291f = "SearchRepositoryImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class C1282x6bbe854a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16146a;

    /* JADX INFO: renamed from: b */
    public int f16147b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o08 f16148c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1282x6bbe854a(o08 o08Var, Continuation continuation) {
        super(continuation);
        this.f16148c = o08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16146a = obj;
        this.f16147b |= Integer.MIN_VALUE;
        return this.f16148c.emit(null, this);
    }
}
