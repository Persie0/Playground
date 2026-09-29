package com.lingq.feature.search.search;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.gt8;
import p000.it8;
import p000.jp8;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$dialogScreenData$1", m4291f = "SearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$dialogScreenData$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ gt8 f33001a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ jp8 f33002b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SearchViewModel$dialogScreenData$1 searchViewModel$dialogScreenData$1 = new SearchViewModel$dialogScreenData$1(3, (Continuation) obj3);
        searchViewModel$dialogScreenData$1.f33001a = (gt8) obj;
        searchViewModel$dialogScreenData$1.f33002b = (jp8) obj2;
        return searchViewModel$dialogScreenData$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        gt8 gt8Var = this.f33001a;
        jp8 jp8Var = this.f33002b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new it8(gt8Var, jp8Var);
    }
}
