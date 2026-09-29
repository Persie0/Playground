package com.lingq.feature.collections;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$handleAction$20", m4291f = "CollectionViewModel.kt", m4292l = {281}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$handleAction$20 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25383a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25384b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$handleAction$20(C2034d c2034d, Continuation continuation) {
        super(2, continuation);
        this.f25384b = c2034d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$handleAction$20(this.f25384b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$handleAction$20) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25383a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f25383a = 1;
            if (this.f25384b.f25569b.mo4597w0(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
