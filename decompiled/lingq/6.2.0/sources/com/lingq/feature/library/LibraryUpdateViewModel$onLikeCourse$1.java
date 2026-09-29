package com.lingq.feature.library;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$onLikeCourse$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {1142}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$onLikeCourse$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26529a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26530b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$onLikeCourse$1(C2146e c2146e, int i, Continuation continuation) {
        super(2, continuation);
        this.f26530b = c2146e;
        this.f26531c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$onLikeCourse$1(this.f26530b, this.f26531c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$onLikeCourse$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26529a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2146e c2146e = this.f26530b;
            String strMo4589b2 = c2146e.f26677b.mo4589b2();
            this.f26529a = 1;
            Object objM7186j = ((C1290f) c2146e.f26686k.f26650b).m7186j(this.f26531c, strMo4589b2, this);
            if (objM7186j != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM7186j = xfaVar;
            }
            if (objM7186j == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
