package com.lingq.feature.library;

import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.fa5;
import p000.xfa;
import p000.xl7;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$loadShelfContent$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$loadShelfContent$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ fa5 f26494a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xl7 f26495b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Set f26496c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        LibraryUpdateViewModel$loadShelfContent$1 libraryUpdateViewModel$loadShelfContent$1 = new LibraryUpdateViewModel$loadShelfContent$1(4, (Continuation) obj4);
        libraryUpdateViewModel$loadShelfContent$1.f26494a = (fa5) obj;
        libraryUpdateViewModel$loadShelfContent$1.f26495b = (xl7) obj2;
        libraryUpdateViewModel$loadShelfContent$1.f26496c = (Set) obj3;
        return libraryUpdateViewModel$loadShelfContent$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        fa5 fa5Var = this.f26494a;
        xl7 xl7Var = this.f26495b;
        Set set = this.f26496c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Triple(fa5Var, xl7Var, set);
    }
}
