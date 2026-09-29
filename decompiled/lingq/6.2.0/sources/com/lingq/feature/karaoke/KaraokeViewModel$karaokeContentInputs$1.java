package com.lingq.feature.karaoke;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.ch4;
import p000.dj3;
import p000.hc7;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$karaokeContentInputs$1", m4291f = "KaraokeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeViewModel$karaokeContentInputs$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f26260a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f26261b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f26262c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ hc7 f26263d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Double f26264e;

    public KaraokeViewModel$karaokeContentInputs$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        long jLongValue = ((Number) obj2).longValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        KaraokeViewModel$karaokeContentInputs$1 karaokeViewModel$karaokeContentInputs$1 = new KaraokeViewModel$karaokeContentInputs$1((Continuation) obj6);
        karaokeViewModel$karaokeContentInputs$1.f26260a = (List) obj;
        karaokeViewModel$karaokeContentInputs$1.f26261b = jLongValue;
        karaokeViewModel$karaokeContentInputs$1.f26262c = zBooleanValue;
        karaokeViewModel$karaokeContentInputs$1.f26263d = (hc7) obj4;
        karaokeViewModel$karaokeContentInputs$1.f26264e = (Double) obj5;
        return karaokeViewModel$karaokeContentInputs$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f26260a;
        long j = this.f26261b;
        boolean z = this.f26262c;
        hc7 hc7Var = this.f26263d;
        Double d = this.f26264e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new ch4(list, j, z, hc7Var, d);
    }
}
