package com.lingq.core.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.CupRepositoryImpl$observeCupSummary$$inlined$map$1$2", m4291f = "CupRepositoryImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class CupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15100a;

    /* JADX INFO: renamed from: b */
    public int f15101b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f15102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f15102c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15100a = obj;
        this.f15101b |= Integer.MIN_VALUE;
        return this.f15102c.emit(null, this);
    }
}
