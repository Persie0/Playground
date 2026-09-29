package com.lingq.feature.search.fastsearch;

import android.os.SystemClock;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.a13;
import p000.c32;
import p000.t66;
import p000.uc9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchScreenKt$FastSearchScreen$1$1", m4291f = "FastSearchScreen.kt", m4292l = {222}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchScreenKt$FastSearchScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32838a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a13 f32839b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f32840c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uc9 f32841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchScreenKt$FastSearchScreen$1$1(a13 a13Var, t66 t66Var, uc9 uc9Var, Continuation continuation) {
        super(2, continuation);
        this.f32839b = a13Var;
        this.f32840c = t66Var;
        this.f32841d = uc9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FastSearchScreenKt$FastSearchScreen$1$1(this.f32839b, this.f32840c, this.f32841d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FastSearchScreenKt$FastSearchScreen$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32838a;
        t66 t66Var = this.f32840c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (((Boolean) t66Var.getValue()).booleanValue() && !this.f32839b.f59c) {
                long jElapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.f32841d.m22673h());
                if (jElapsedRealtime < 0) {
                    jElapsedRealtime = 0;
                }
                this.f32838a = 1;
                if (AbstractC3208a.m15437d(jElapsedRealtime, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        t66Var.setValue(Boolean.FALSE);
        return xfa.f68157a;
    }
}
