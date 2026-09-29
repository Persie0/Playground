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
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$onReportSubmitted$2", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$onReportSubmitted$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2146e f26545a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LibraryItem f26546b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26547c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f26548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$onReportSubmitted$2(C2146e c2146e, LibraryItem libraryItem, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f26545a = c2146e;
        this.f26546b = libraryItem;
        this.f26547c = str;
        this.f26548d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$onReportSubmitted$2(this.f26545a, this.f26546b, this.f26547c, this.f26548d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LibraryUpdateViewModel$onReportSubmitted$2 libraryUpdateViewModel$onReportSubmitted$2 = (LibraryUpdateViewModel$onReportSubmitted$2) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        libraryUpdateViewModel$onReportSubmitted$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2146e c2146e = this.f26545a;
        c2146e.mo8954p(c2146e.f26677b.mo4589b2(), this.f26546b.f19426a, this.f26547c, this.f26548d);
        return xfa.f68157a;
    }
}
