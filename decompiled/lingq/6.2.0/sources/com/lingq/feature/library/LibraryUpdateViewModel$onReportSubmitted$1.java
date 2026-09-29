package com.lingq.feature.library;

import com.lingq.core.domain.model.library.LibraryItem;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$onReportSubmitted$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$onReportSubmitted$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2146e f26541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LibraryItem f26542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26543c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f26544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$onReportSubmitted$1(C2146e c2146e, LibraryItem libraryItem, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f26541a = c2146e;
        this.f26542b = libraryItem;
        this.f26543c = str;
        this.f26544d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$onReportSubmitted$1(this.f26541a, this.f26542b, this.f26543c, this.f26544d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LibraryUpdateViewModel$onReportSubmitted$1 libraryUpdateViewModel$onReportSubmitted$1 = (LibraryUpdateViewModel$onReportSubmitted$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        libraryUpdateViewModel$onReportSubmitted$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2146e c2146e = this.f26541a;
        c2146e.mo8951f0(c2146e.f26677b.mo4589b2(), this.f26542b.f19426a, this.f26543c, this.f26544d);
        return xfa.f68157a;
    }
}
