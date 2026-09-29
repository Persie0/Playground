package com.lingq.feature.reader.video.components;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.components.LandscapeVideoScreenKt$LandscapeVideoScreen$scheduleToolbarHide$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.components.LandscapeVideoScreenKt$LandscapeVideoScreen$scheduleToolbarHide$1", m4291f = "LandscapeVideoScreen.kt", m4292l = {80}, m4293m = "invokeSuspend", m4294v = 2)
final class C2586x9fb16e2a extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31419a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f31420b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2586x9fb16e2a(t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f31420b = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2586x9fb16e2a(this.f31420b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2586x9fb16e2a) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31419a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f31419a = 1;
            if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f31420b.setValue(Boolean.FALSE);
        return xfa.f68157a;
    }
}
