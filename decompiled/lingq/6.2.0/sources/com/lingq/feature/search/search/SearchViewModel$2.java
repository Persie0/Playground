package com.lingq.feature.search.search;

import java.util.Map;
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
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$2", m4291f = "SearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32995a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f32996b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$2(C2779e c2779e, Continuation continuation) {
        super(2, continuation);
        this.f32996b = c2779e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchViewModel$2 searchViewModel$2 = new SearchViewModel$2(this.f32996b, continuation);
        searchViewModel$2.f32995a = obj;
        return searchViewModel$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SearchViewModel$2 searchViewModel$2 = (SearchViewModel$2) create((Map) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        searchViewModel$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Map map = (Map) this.f32995a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f32996b.f33114v;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, ar8.m3015a((ar8) value, null, null, null, null, map, null, null, false, false, false, false, 0, null, null, null, null, 65519)));
        return xfa.f68157a;
    }
}
