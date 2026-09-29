package com.lingq.feature.search.fastsearch;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.e83;
import p000.vz2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$observeCourses$1", m4291f = "FastSearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchViewModel$observeCourses$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2768b f32855a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$observeCourses$1(C2768b c2768b, Continuation continuation) {
        super(2, continuation);
        this.f32855a = c2768b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FastSearchViewModel$observeCourses$1(this.f32855a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FastSearchViewModel$observeCourses$1 fastSearchViewModel$observeCourses$1 = (FastSearchViewModel$observeCourses$1) create((e83) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fastSearchViewModel$observeCourses$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f32855a.f32892p;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, vz2.m23657a((vz2) value, null, true, false, null, null, null, null, null, null, 509)));
        return xfa.f68157a;
    }
}
