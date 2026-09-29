package com.lingq.feature.search.search;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$special$$inlined$map$1$2", m4291f = "SearchViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class SearchViewModel$special$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33057a;

    /* JADX INFO: renamed from: b */
    public int f33058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2778d f33059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$special$$inlined$map$1$2$1(C2778d c2778d, Continuation continuation) {
        super(continuation);
        this.f33059c = c2778d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33057a = obj;
        this.f33058b |= Integer.MIN_VALUE;
        return this.f33059c.emit(null, this);
    }
}
