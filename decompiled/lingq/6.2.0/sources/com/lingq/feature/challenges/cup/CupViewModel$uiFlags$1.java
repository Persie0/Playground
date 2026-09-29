package com.lingq.feature.challenges.cup;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.ax1;
import p000.c32;
import p000.cj3;
import p000.hu1;
import p000.vv1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$uiFlags$1", m4291f = "CupViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CupViewModel$uiFlags$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ vv1 f24675a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f24676b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f24677c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ hu1 f24678d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        CupViewModel$uiFlags$1 cupViewModel$uiFlags$1 = new CupViewModel$uiFlags$1(5, (Continuation) obj5);
        cupViewModel$uiFlags$1.f24675a = (vv1) obj;
        cupViewModel$uiFlags$1.f24676b = zBooleanValue;
        cupViewModel$uiFlags$1.f24677c = zBooleanValue2;
        cupViewModel$uiFlags$1.f24678d = (hu1) obj4;
        return cupViewModel$uiFlags$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        vv1 vv1Var = this.f24675a;
        boolean z = this.f24676b;
        boolean z2 = this.f24677c;
        hu1 hu1Var = this.f24678d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new ax1(vv1Var, z, z2, hu1Var);
    }
}
