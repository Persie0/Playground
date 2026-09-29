package com.lingq.feature.search.search;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.ar8;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$observeLibraryItems$1", m4291f = "SearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$observeLibraryItems$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2779e f33052a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$observeLibraryItems$1(C2779e c2779e, Continuation continuation) {
        super(2, continuation);
        this.f33052a = c2779e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchViewModel$observeLibraryItems$1(this.f33052a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SearchViewModel$observeLibraryItems$1 searchViewModel$observeLibraryItems$1 = (SearchViewModel$observeLibraryItems$1) create((e83) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        searchViewModel$observeLibraryItems$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f33052a.f33114v;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, ar8.m3015a((ar8) value, null, null, null, null, null, null, null, true, false, false, false, 0, null, null, null, null, 65407)));
        return xfa.f68157a;
    }
}
