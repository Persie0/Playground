package com.lingq.feature.search.filter;

import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.yu8;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.filter.SearchFiltersStateHolder$observeSharedByUsers$1", m4291f = "SearchFiltersStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchFiltersStateHolder$observeSharedByUsers$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2770a f32903a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFiltersStateHolder$observeSharedByUsers$1(C2770a c2770a, Continuation continuation) {
        super(2, continuation);
        this.f32903a = c2770a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchFiltersStateHolder$observeSharedByUsers$1(this.f32903a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SearchFiltersStateHolder$observeSharedByUsers$1 searchFiltersStateHolder$observeSharedByUsers$1 = (SearchFiltersStateHolder$observeSharedByUsers$1) create((e83) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        searchFiltersStateHolder$observeSharedByUsers$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2770a c2770a = this.f32903a;
        C3244l c3244l = c2770a.f32916k;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, yu8.m25345a((yu8) value, null, true, false, EmptyList.f47638a, null, 17)));
        c2770a.m9687d();
        return xfa.f68157a;
    }
}
