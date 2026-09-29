package com.lingq.feature.library;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$observeAndLoadBlacklists$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$observeAndLoadBlacklists$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26514a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26515b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$observeAndLoadBlacklists$1(C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26515b = c2146e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LibraryUpdateViewModel$observeAndLoadBlacklists$1 libraryUpdateViewModel$observeAndLoadBlacklists$1 = new LibraryUpdateViewModel$observeAndLoadBlacklists$1(this.f26515b, continuation);
        libraryUpdateViewModel$observeAndLoadBlacklists$1.f26514a = obj;
        return libraryUpdateViewModel$observeAndLoadBlacklists$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LibraryUpdateViewModel$observeAndLoadBlacklists$1 libraryUpdateViewModel$observeAndLoadBlacklists$1 = (LibraryUpdateViewModel$observeAndLoadBlacklists$1) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        libraryUpdateViewModel$observeAndLoadBlacklists$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Pair pair = (Pair) this.f26514a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f26515b.f26665N;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, pair));
        return xfa.f68157a;
    }
}
