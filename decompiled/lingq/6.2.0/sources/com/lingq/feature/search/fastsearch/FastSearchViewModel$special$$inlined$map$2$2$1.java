package com.lingq.feature.search.fastsearch;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$special$$inlined$map$2$2", m4291f = "FastSearchViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class FastSearchViewModel$special$$inlined$map$2$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32871a;

    /* JADX INFO: renamed from: b */
    public int f32872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f32873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$special$$inlined$map$2$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f32873c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32871a = obj;
        this.f32872b |= Integer.MIN_VALUE;
        return this.f32873c.emit(null, this);
    }
}
