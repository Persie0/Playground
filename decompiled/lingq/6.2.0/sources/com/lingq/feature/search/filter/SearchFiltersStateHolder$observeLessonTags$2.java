package com.lingq.feature.search.filter;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.yu8;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.filter.SearchFiltersStateHolder$observeLessonTags$2", m4291f = "SearchFiltersStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchFiltersStateHolder$observeLessonTags$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2770a f32902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFiltersStateHolder$observeLessonTags$2(C2770a c2770a, Continuation continuation) {
        super(2, continuation);
        this.f32902b = c2770a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchFiltersStateHolder$observeLessonTags$2 searchFiltersStateHolder$observeLessonTags$2 = new SearchFiltersStateHolder$observeLessonTags$2(this.f32902b, continuation);
        searchFiltersStateHolder$observeLessonTags$2.f32901a = obj;
        return searchFiltersStateHolder$observeLessonTags$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SearchFiltersStateHolder$observeLessonTags$2 searchFiltersStateHolder$observeLessonTags$2 = (SearchFiltersStateHolder$observeLessonTags$2) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        searchFiltersStateHolder$observeLessonTags$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        yu8 yu8Var;
        List list = (List) this.f32901a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2770a c2770a = this.f32902b;
        C3244l c3244l = c2770a.f32916k;
        do {
            value = c3244l.getValue();
            yu8Var = (yu8) value;
        } while (!c3244l.m15570h(value, yu8.m25345a(yu8Var, null, !list.isEmpty() ? false : yu8Var.f70491b, false, null, list, 13)));
        c2770a.m9687d();
        return xfa.f68157a;
    }
}
