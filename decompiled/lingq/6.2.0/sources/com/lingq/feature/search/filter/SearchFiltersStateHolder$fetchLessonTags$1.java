package com.lingq.feature.search.filter;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.qj2;
import p000.vi3;
import p000.xfa;
import p000.yu8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.filter.SearchFiltersStateHolder$fetchLessonTags$1", m4291f = "SearchFiltersStateHolder.kt", m4292l = {624}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchFiltersStateHolder$fetchLessonTags$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f32896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2770a f32897b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFiltersStateHolder$fetchLessonTags$1(C2770a c2770a, Continuation continuation) {
        super(1, continuation);
        this.f32897b = c2770a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SearchFiltersStateHolder$fetchLessonTags$1(this.f32897b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((SearchFiltersStateHolder$fetchLessonTags$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object failure;
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32896a;
        C2770a c2770a = this.f32897b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                qj2 qj2Var = c2770a.f32909d;
                String str = ((yu8) c2770a.f32916k.getValue()).f70490a;
                this.f32896a = 1;
                obj = ((C1295k) qj2Var.f57848a).m7301u(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            failure = new Integer(((Number) obj).intValue());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure) && ((Number) failure).intValue() == 0) {
            C3244l c3244l = c2770a.f32916k;
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, yu8.m25345a((yu8) value2, null, false, true, null, EmptyList.f47638a, 9)));
            c2770a.m9687d();
        }
        if (Result.m15355a(failure) != null) {
            C3244l c3244l2 = c2770a.f32916k;
            do {
                value = c3244l2.getValue();
            } while (!c3244l2.m15570h(value, yu8.m25345a((yu8) value, null, false, false, null, null, 29)));
            c2770a.m9687d();
        }
        return xfa.f68157a;
    }
}
