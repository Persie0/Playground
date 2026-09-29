package com.lingq.feature.reader.video;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeActiveSentenceTranslations$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeActiveSentenceTranslations$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31218a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$observeActiveSentenceTranslations$1(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31219b = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderVideoComposeViewModel$observeActiveSentenceTranslations$1 readerVideoComposeViewModel$observeActiveSentenceTranslations$1 = new ReaderVideoComposeViewModel$observeActiveSentenceTranslations$1(this.f31219b, continuation);
        readerVideoComposeViewModel$observeActiveSentenceTranslations$1.f31218a = obj;
        return readerVideoComposeViewModel$observeActiveSentenceTranslations$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderVideoComposeViewModel$observeActiveSentenceTranslations$1 readerVideoComposeViewModel$observeActiveSentenceTranslations$1 = (ReaderVideoComposeViewModel$observeActiveSentenceTranslations$1) create((Integer) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerVideoComposeViewModel$observeActiveSentenceTranslations$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num = (Integer) this.f31218a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (num != null) {
            C2583a c2583a = this.f31219b;
            if (!((yz4) ((C3244l) c2583a.f31371d.f27957w.f9311a).getValue()).f70674h.containsKey(num)) {
                c2583a.f31375h.m9274c(num.intValue());
            }
        }
        return xfa.f68157a;
    }
}
