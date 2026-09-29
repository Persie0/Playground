package com.lingq.feature.collections;

import android.os.SystemClock;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.q91;
import p000.t66;
import p000.uc9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionScreenKt$CollectionScreen$1$1", m4291f = "CollectionScreen.kt", m4292l = {510}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionScreenKt$CollectionScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25339a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q91 f25340b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f25341c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uc9 f25342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionScreenKt$CollectionScreen$1$1(q91 q91Var, t66 t66Var, uc9 uc9Var, Continuation continuation) {
        super(2, continuation);
        this.f25340b = q91Var;
        this.f25341c = t66Var;
        this.f25342d = uc9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionScreenKt$CollectionScreen$1$1(this.f25340b, this.f25341c, this.f25342d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionScreenKt$CollectionScreen$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25339a;
        t66 t66Var = this.f25341c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (((Boolean) t66Var.getValue()).booleanValue() && !this.f25340b.f57441c) {
                long jElapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.f25342d.m22673h());
                if (jElapsedRealtime < 0) {
                    jElapsedRealtime = 0;
                }
                this.f25339a = 1;
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
