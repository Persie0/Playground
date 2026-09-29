package com.lingq.feature.search.search;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.ar8;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$observeCounters$1", m4291f = "SearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$observeCounters$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f33030b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$observeCounters$1(C2779e c2779e, Continuation continuation) {
        super(2, continuation);
        this.f33030b = c2779e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchViewModel$observeCounters$1 searchViewModel$observeCounters$1 = new SearchViewModel$observeCounters$1(this.f33030b, continuation);
        searchViewModel$observeCounters$1.f33029a = obj;
        return searchViewModel$observeCounters$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SearchViewModel$observeCounters$1 searchViewModel$observeCounters$1 = (SearchViewModel$observeCounters$1) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        searchViewModel$observeCounters$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        List list = (List) this.f33029a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (!list.isEmpty()) {
            C3244l c3244l = this.f33030b.f33114v;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, ar8.m3015a((ar8) value, null, list, null, null, null, null, null, false, false, false, false, 0, null, null, null, null, 65533)));
        }
        return xfa.f68157a;
    }
}
