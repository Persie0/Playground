package com.lingq.feature.collections;

import android.app.Activity;
import android.content.Context;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.f51;
import p000.mbd;
import p000.q91;
import p000.t66;
import p000.ud6;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionScreenKt$CollectionRoute$1$1", m4291f = "CollectionScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionScreenKt$CollectionRoute$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f25335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ud6 f25336b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2034d f25337c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f25338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionScreenKt$CollectionRoute$1$1(Context context, ud6 ud6Var, C2034d c2034d, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f25335a = context;
        this.f25336b = ud6Var;
        this.f25337c = c2034d;
        this.f25338d = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionScreenKt$CollectionRoute$1$1(this.f25335a, this.f25336b, this.f25337c, this.f25338d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        CollectionScreenKt$CollectionRoute$1$1 collectionScreenKt$CollectionRoute$1$1 = (CollectionScreenKt$CollectionRoute$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        collectionScreenKt$CollectionRoute$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = ((q91) this.f25338d.getValue()).f57444f;
        xfa xfaVar = xfa.f68157a;
        if (str == null) {
            return xfaVar;
        }
        Context context = this.f25335a;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            mbd.m16755c(activity, str, null, 26);
        }
        this.f25337c.m8945Z2(f51.f38427a);
        return xfaVar;
    }
}
