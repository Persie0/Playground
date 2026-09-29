package com.lingq.feature.search.search;

import com.lingq.feature.search.filter.C2770a;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.ar8;
import p000.c32;
import p000.cg7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$observeLevels$1", m4291f = "SearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$observeLevels$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33049a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f33050b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$observeLevels$1(C2779e c2779e, String str, Continuation continuation) {
        super(2, continuation);
        this.f33050b = c2779e;
        this.f33051c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchViewModel$observeLevels$1 searchViewModel$observeLevels$1 = new SearchViewModel$observeLevels$1(this.f33050b, this.f33051c, continuation);
        searchViewModel$observeLevels$1.f33049a = obj;
        return searchViewModel$observeLevels$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SearchViewModel$observeLevels$1 searchViewModel$observeLevels$1 = (SearchViewModel$observeLevels$1) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        searchViewModel$observeLevels$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f33049a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2779e c2779e = this.f33050b;
        C3244l c3244l = c2779e.f33114v;
        while (true) {
            Object value = c3244l.getValue();
            C3244l c3244l2 = c3244l;
            C2779e c2779e2 = c2779e;
            ar8 ar8VarM3015a = ar8.m3015a((ar8) value, null, null, null, null, null, null, null, false, false, false, false, 0, null, null, pair, null, 49151);
            Pair pair2 = pair;
            if (c3244l2.m15570h(value, ar8VarM3015a)) {
                C2770a c2770a = c2779e2.f33107o;
                String strM9710a3 = c2779e2.m9710a3(this.f33051c);
                c2770a.getClass();
                pair2.getClass();
                c2770a.m9690g(strM9710a3, new cg7(pair2, 15));
                c2779e2.m9709Z2();
                return xfa.f68157a;
            }
            c3244l = c3244l2;
            pair = pair2;
            c2779e = c2779e2;
        }
    }
}
