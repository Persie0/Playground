package com.lingq.feature.library;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$refreshProfileData$3", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$refreshProfileData$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2146e f26576a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Language f26577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$refreshProfileData$3(C2146e c2146e, Language language, Continuation continuation) {
        super(2, continuation);
        this.f26576a = c2146e;
        this.f26577b = language;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$refreshProfileData$3(this.f26576a, this.f26577b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LibraryUpdateViewModel$refreshProfileData$3 libraryUpdateViewModel$refreshProfileData$3 = (LibraryUpdateViewModel$refreshProfileData$3) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        libraryUpdateViewModel$refreshProfileData$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = this.f26577b.f19024a;
        wfb.m23926u(lda.m16103C(this.f26576a), null, null, new LibraryUpdateViewModel$updateTopics$1(2, null), 3);
        return xfa.f68157a;
    }
}
