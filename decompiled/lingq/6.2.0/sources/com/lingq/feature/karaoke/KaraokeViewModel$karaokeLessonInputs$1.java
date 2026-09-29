package com.lingq.feature.karaoke;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.InterfaceC3055gy;
import p000.bj3;
import p000.c32;
import p000.hh4;
import p000.u45;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$karaokeLessonInputs$1", m4291f = "KaraokeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeViewModel$karaokeLessonInputs$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ u45 f26265a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f26266b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ InterfaceC3055gy f26267c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        KaraokeViewModel$karaokeLessonInputs$1 karaokeViewModel$karaokeLessonInputs$1 = new KaraokeViewModel$karaokeLessonInputs$1(4, (Continuation) obj4);
        karaokeViewModel$karaokeLessonInputs$1.f26265a = (u45) obj;
        karaokeViewModel$karaokeLessonInputs$1.f26266b = iIntValue;
        karaokeViewModel$karaokeLessonInputs$1.f26267c = (InterfaceC3055gy) obj3;
        return karaokeViewModel$karaokeLessonInputs$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        u45 u45Var = this.f26265a;
        int i = this.f26266b;
        InterfaceC3055gy interfaceC3055gy = this.f26267c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new hh4(u45Var, i, interfaceC3055gy);
    }
}
