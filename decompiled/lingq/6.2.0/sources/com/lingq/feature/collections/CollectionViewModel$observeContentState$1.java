package com.lingq.feature.collections;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.ye0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeContentState$1", m4291f = "CollectionViewModel.kt", m4292l = {176}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeContentState$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25410a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25411b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeContentState$1(C2034d c2034d, Continuation continuation) {
        super(2, continuation);
        this.f25411b = c2034d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$observeContentState$1(this.f25411b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$observeContentState$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25410a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25411b;
            c18 c18Var = c2034d.f25560S;
            ye0 ye0Var = new ye0(c2034d, 3);
            this.f25410a = 1;
            if (((C3244l) c18Var.f9311a).collect(ye0Var, this) == coroutineSingletons) {
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
