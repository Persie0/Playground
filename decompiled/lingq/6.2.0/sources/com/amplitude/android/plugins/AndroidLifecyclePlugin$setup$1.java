package com.amplitude.android.plugins;

import android.app.Application;
import com.amplitude.android.C0879a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.fa4;
import p000.t50;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.plugins.AndroidLifecyclePlugin$setup$1", m4291f = "AndroidLifecyclePlugin.kt", m4292l = {88}, m4293m = "invokeSuspend")
final class AndroidLifecyclePlugin$setup$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10936a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0895b f10937b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Application f10938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLifecyclePlugin$setup$1(C0895b c0895b, Application application, Continuation continuation) {
        super(2, continuation);
        this.f10937b = c0895b;
        this.f10938c = application;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidLifecyclePlugin$setup$1(this.f10937b, this.f10938c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidLifecyclePlugin$setup$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10936a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0895b c0895b = this.f10937b;
            C0879a c0879a = c0895b.f10960e;
            if (c0879a == null) {
                fa4.m11636J("androidAmplitude");
                throw null;
            }
            c18 c18Var = ((t50) c0879a.f10785r.getValue()).f61871d;
            C0894a c0894a = new C0894a(c0895b, this.f10938c);
            this.f10936a = 1;
            if (((C3244l) c18Var.f9311a).collect(c0894a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }
}
