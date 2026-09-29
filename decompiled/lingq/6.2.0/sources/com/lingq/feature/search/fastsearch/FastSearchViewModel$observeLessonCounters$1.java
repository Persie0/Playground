package com.lingq.feature.search.fastsearch;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.vz2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$observeLessonCounters$1", m4291f = "FastSearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchViewModel$observeLessonCounters$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2768b f32861b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$observeLessonCounters$1(C2768b c2768b, Continuation continuation) {
        super(2, continuation);
        this.f32861b = c2768b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FastSearchViewModel$observeLessonCounters$1 fastSearchViewModel$observeLessonCounters$1 = new FastSearchViewModel$observeLessonCounters$1(this.f32861b, continuation);
        fastSearchViewModel$observeLessonCounters$1.f32860a = obj;
        return fastSearchViewModel$observeLessonCounters$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FastSearchViewModel$observeLessonCounters$1 fastSearchViewModel$observeLessonCounters$1 = (FastSearchViewModel$observeLessonCounters$1) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fastSearchViewModel$observeLessonCounters$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        List list = (List) this.f32860a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f32861b.f32892p;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, vz2.m23657a((vz2) value, null, false, false, null, list, null, null, null, null, 495)));
        return xfa.f68157a;
    }
}
