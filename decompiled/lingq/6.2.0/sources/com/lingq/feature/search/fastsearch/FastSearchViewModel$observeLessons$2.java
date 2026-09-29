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
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$observeLessons$2", m4291f = "FastSearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchViewModel$observeLessons$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32863a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2768b f32864b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$observeLessons$2(C2768b c2768b, Continuation continuation) {
        super(2, continuation);
        this.f32864b = c2768b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FastSearchViewModel$observeLessons$2 fastSearchViewModel$observeLessons$2 = new FastSearchViewModel$observeLessons$2(this.f32864b, continuation);
        fastSearchViewModel$observeLessons$2.f32863a = obj;
        return fastSearchViewModel$observeLessons$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FastSearchViewModel$observeLessons$2 fastSearchViewModel$observeLessons$2 = (FastSearchViewModel$observeLessons$2) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fastSearchViewModel$observeLessons$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        vz2 vz2Var;
        List list = (List) this.f32863a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f32864b.f32892p;
        do {
            value = c3244l.getValue();
            vz2Var = (vz2) value;
        } while (!c3244l.m15570h(value, vz2.m23657a(vz2Var, null, list.isEmpty(), !list.isEmpty() ? false : vz2Var.f66120c, list, null, null, null, null, null, 497)));
        return xfa.f68157a;
    }
}
