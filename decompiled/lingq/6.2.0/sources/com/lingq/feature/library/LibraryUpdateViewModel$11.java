package com.lingq.feature.library;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.ja5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$11", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$11 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26473a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26474b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$11(C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26474b = c2146e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LibraryUpdateViewModel$11 libraryUpdateViewModel$11 = new LibraryUpdateViewModel$11(this.f26474b, continuation);
        libraryUpdateViewModel$11.f26473a = obj;
        return libraryUpdateViewModel$11;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LibraryUpdateViewModel$11 libraryUpdateViewModel$11 = (LibraryUpdateViewModel$11) create((ja5) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        libraryUpdateViewModel$11.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        ja5 ja5Var = (ja5) this.f26473a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f26474b.f26658G;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, ja5Var));
        return xfa.f68157a;
    }
}
