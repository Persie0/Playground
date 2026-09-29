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
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$onSubscribeCourse$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {1151}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$onSubscribeCourse$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26556a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$onSubscribeCourse$1(C2146e c2146e, int i, Continuation continuation) {
        super(2, continuation);
        this.f26557b = c2146e;
        this.f26558c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$onSubscribeCourse$1(this.f26557b, this.f26558c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$onSubscribeCourse$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26556a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2146e c2146e = this.f26557b;
            String strMo4589b2 = c2146e.f26677b.mo4589b2();
            this.f26556a = 1;
            Object objM7187k = ((C1290f) c2146e.f26686k.f26650b).m7187k(this.f26558c, strMo4589b2, this);
            if (objM7187k != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM7187k = xfaVar;
            }
            if (objM7187k == coroutineSingletons) {
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
