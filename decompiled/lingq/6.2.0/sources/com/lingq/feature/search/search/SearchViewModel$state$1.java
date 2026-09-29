package com.lingq.feature.search.search;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.gt8;
import p000.it8;
import p000.jp8;
import p000.jt8;
import p000.xfa;
import p000.xs8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$state$1", m4291f = "SearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$state$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ jt8 f33060a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ it8 f33061b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SearchViewModel$state$1 searchViewModel$state$1 = new SearchViewModel$state$1(3, (Continuation) obj3);
        searchViewModel$state$1.f33060a = (jt8) obj;
        searchViewModel$state$1.f33061b = (it8) obj2;
        return searchViewModel$state$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        jt8 jt8Var = this.f33060a;
        it8 it8Var = this.f33061b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = jt8Var.f46130a;
        boolean z = jt8Var.f46131b;
        gt8 gt8Var = it8Var.f44535a;
        boolean z2 = gt8Var.f41302a;
        jp8 jp8Var = it8Var.f44536b;
        return new xs8(list, z, z2, gt8Var, jp8Var.f45966a, jp8Var.f45967b, jp8Var.f45968c, jt8Var.f46132c, jp8Var.f45969d, jp8Var.f45970e, jp8Var.f45971f, 1);
    }
}
