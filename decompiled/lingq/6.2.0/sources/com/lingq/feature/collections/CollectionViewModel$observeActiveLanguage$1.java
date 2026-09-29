package com.lingq.feature.collections;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeActiveLanguage$1", m4291f = "CollectionViewModel.kt", m4292l = {151}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeActiveLanguage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25399a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeActiveLanguage$1(C2034d c2034d, Continuation continuation) {
        super(2, continuation);
        this.f25400b = c2034d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$observeActiveLanguage$1(this.f25400b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$observeActiveLanguage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25399a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25400b;
            eh9 eh9VarMo4572B0 = c2034d.f25569b.mo4572B0();
            C2032c c2032c = new C2032c(c2034d);
            this.f25399a = 1;
            if (eh9VarMo4572B0.collect(c2032c, this) == coroutineSingletons) {
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
