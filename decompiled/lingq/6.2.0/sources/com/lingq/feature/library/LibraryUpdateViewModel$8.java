package com.lingq.feature.library;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$8", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$8(C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26486b = c2146e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LibraryUpdateViewModel$8 libraryUpdateViewModel$8 = new LibraryUpdateViewModel$8(this.f26486b, continuation);
        libraryUpdateViewModel$8.f26485a = obj;
        return libraryUpdateViewModel$8;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LibraryUpdateViewModel$8 libraryUpdateViewModel$8 = (LibraryUpdateViewModel$8) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        libraryUpdateViewModel$8.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f26485a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f26486b.f26666O.m15571i(list);
        return xfa.f68157a;
    }
}
