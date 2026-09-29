package com.lingq.feature.library;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.m58;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$5", m4291f = "LibraryUpdateViewModel.kt", m4292l = {274}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26482b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$5(C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26482b = c2146e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$5(this.f26482b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26481a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            m58 m58Var = this.f26482b.f26701z;
            this.f26481a = 1;
            if (m58Var.m16644h(this) == coroutineSingletons) {
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
