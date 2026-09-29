package com.lingq.feature.search.search;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.ar8;
import p000.c32;
import p000.u91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$observeBlacklists$1", m4291f = "SearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$observeBlacklists$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f33028b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$observeBlacklists$1(C2779e c2779e, Continuation continuation) {
        super(2, continuation);
        this.f33028b = c2779e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchViewModel$observeBlacklists$1 searchViewModel$observeBlacklists$1 = new SearchViewModel$observeBlacklists$1(this.f33028b, continuation);
        searchViewModel$observeBlacklists$1.f33027a = obj;
        return searchViewModel$observeBlacklists$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SearchViewModel$observeBlacklists$1 searchViewModel$observeBlacklists$1 = (SearchViewModel$observeBlacklists$1) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        searchViewModel$observeBlacklists$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Pair pair = (Pair) this.f33027a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = (List) pair.f47623a;
        List list2 = (List) pair.f47624b;
        C3244l c3244l = this.f33028b.f33114v;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, ar8.m3015a((ar8) value, null, null, null, null, null, u91.m22620l1(list), u91.m22620l1(list2), false, false, false, false, 0, null, null, null, null, 65439)));
        return xfa.f68157a;
    }
}
