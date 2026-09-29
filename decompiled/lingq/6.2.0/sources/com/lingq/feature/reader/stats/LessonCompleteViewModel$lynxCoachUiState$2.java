package com.lingq.feature.reader.stats;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cma;
import p000.dj3;
import p000.in5;
import p000.jn5;
import p000.mn5;
import p000.xfa;
import p000.zx4;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$lynxCoachUiState$2", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$lynxCoachUiState$2 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ zx4 f30606a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ jn5 f30607b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f30608c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ in5 f30609d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Integer f30610e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2535j f30611f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$lynxCoachUiState$2(C2535j c2535j, Continuation continuation) {
        super(6, continuation);
        this.f30611f = c2535j;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        LessonCompleteViewModel$lynxCoachUiState$2 lessonCompleteViewModel$lynxCoachUiState$2 = new LessonCompleteViewModel$lynxCoachUiState$2(this.f30611f, (Continuation) obj6);
        lessonCompleteViewModel$lynxCoachUiState$2.f30606a = (zx4) obj;
        lessonCompleteViewModel$lynxCoachUiState$2.f30607b = (jn5) obj2;
        lessonCompleteViewModel$lynxCoachUiState$2.f30608c = zBooleanValue;
        lessonCompleteViewModel$lynxCoachUiState$2.f30609d = (in5) obj4;
        lessonCompleteViewModel$lynxCoachUiState$2.f30610e = (Integer) obj5;
        return lessonCompleteViewModel$lynxCoachUiState$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        cma cmaVar = this.f30611f.f30818b;
        zx4 zx4Var = this.f30606a;
        jn5 jn5Var = this.f30607b;
        boolean z = this.f30608c;
        in5 in5Var = this.f30609d;
        Integer num = this.f30610e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = jn5Var.f45867c;
        if (str != null) {
            return new mn5(true, true, false, false, str, null, false, 0, 0, cmaVar.mo4589b2(), null, null, null, null, in5Var.f44307d, 31704);
        }
        if (zx4Var != null) {
            return new mn5(true, false, jn5Var.f45868d, jn5Var.f45866b, zx4Var.f72339c, zx4Var.f72340d, z, zx4Var.f72337a, zx4Var.f72338b, cmaVar.mo4589b2(), in5Var.f44304a, in5Var.f44305b, in5Var.f44306c, num, in5Var.f44307d, 4);
        }
        if (jn5Var.f45865a) {
            return new mn5(false, false, false, false, null, null, false, 0, 0, null, null, null, null, null, null, 65534);
        }
        return jn5Var.f45866b ? new mn5(true, false, false, true, null, null, false, 0, 0, null, null, null, null, null, null, 65518) : new mn5(true, true, false, false, null, null, false, 0, 0, null, null, null, null, null, null, 65532);
    }
}
